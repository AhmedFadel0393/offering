const express = require('express');
const { exec } = require('child_process');
const app = express();

app.get('/', (req, res) => {
  exec('gcloud app logs tail --project fadel-test-reactongcp -s java-be');
});

const PORT = process.env.PORT || 8080;
app.listen(PORT, () => {
  console.log(`Listening on port ${PORT}`);
});
