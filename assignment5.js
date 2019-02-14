var fs=require('fs');
var find='hi';
var filename='readMe.txt';
var read=fs.readFile(filename,'utf8',function(err,data){
var strings=data.split(' ');
console.log(strings);
var count=0;
for( i=0;i<=strings.length;i++){
if(strings[i]==find)
count++;
}
console.log(count);
});

