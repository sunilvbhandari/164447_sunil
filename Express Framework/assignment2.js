var express = require('express');
 
var app = express();
 
app.get('/year', function(req, res) {
var age=req.query.age;
console.log(age);
    var date=new Date();
    var year=date.getFullYear();
  res.send({born:year-age});
});
 
app.listen(3000);
console.log('Listening on port 3000...')








