
var express = require('express');
 
var app = express();
 
var port=process.argv[2];
app.get('/home', function (req, res) {
    res.send('Hello World');
});
app.listen(port);
console.log('Listening on port ...%s',port);

    

