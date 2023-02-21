import asyncio
import websockets
from google.cloud import logging_v2


async def subscribe_to_logs():
    # Initialize the Logging API client
    client = logging_v2.LoggingServiceV2Client()

    # Set up the filter to only get logs from the java-be service
    filter_str = (
        f'logName="projects/fadel-test-reactongcp/logs/appengine.googleapis.com%2Fnginx.request" '
        f'AND resource.type="gae_app" AND resource.labels.module_id="java-be"'
    )

    # Create a streaming pull request to get the logs in real-time
    request = logging_v2.StreamingReadLogEntriesRequest(
        resource_names=['projects/fadel-test-reactongcp'],
        filter=filter_str,
    )

    # Connect to the WebSocket and send the logs as messages
    async with websockets.connect('ws://localhost:8765') as websocket:
        stream = client.streaming_read_log_entries(request=request)
        async for response in stream:
            for entry in response.entries:
                log_msg = entry.json_payload.get('message')
                if log_msg:
                    await websocket.send(log_msg)


async def main():
    # Start the log subscription task in the background
    asyncio.create_task(subscribe_to_logs())

    # Run the WebSocket server to broadcast the logs to clients
    async with websockets.serve(lambda _: None, 'localhost', 8765):
        await asyncio.Future()  # Keep the event loop running


if __name__ == '__main__':
    asyncio.run(main())
