const express = require('express');
const { exec } = require('child_process');
const app = express();

app.get('/', (req, res) => {
  exec('gcloud app logs tail --project fadel-test-reactongcp -s java-be', (error, stdout, stderr) => {
    if (error) {
      console.error(`exec error: ${error}`);
      res.send(`Error: ${error}`);
      return;
    }
    console.log(`stdout: ${stdout}`);
    console.error(`stderr: ${stderr}`);
    res.send(`<pre>${stdout}</pre>`);
  });
});

const PORT = process.env.PORT || 8080;
app.listen(PORT, () => {
  console.log(`Listening on port ${PORT}`);
});
