const {Logging} = require('@google-cloud/logging');

// Instantiates a client
const logging = new Logging({
  projectId: 'fadel-test-reactongcp',
});

// The name of the log to read
const logName = `appengine.googleapis.com%2Fstdout`;

// Selects the log to read
const log = logging.log(logName);

// Custom parameters to filter logs by service name
const serviceName = 'java-be';
const filter = `resource.type="gae_app" AND resource.labels.module_id="${serviceName}"`;

// Read the most recent 10 log entries
const options = {
  filter: filter,
  limit: 10,
  order: 'desc',
};

// Stream the logs to the console
log
  .read(options)
  .then(([entries]) => {
    console.log(`Logs for service ${serviceName}:`);
    entries.forEach(entry => {
      console.log(`[${entry.timestamp.toISOString()}] [${entry.severity}] ${entry.data}`);
    });
  })
  .catch(err => {
    console.error('ERROR:', err);
  });
