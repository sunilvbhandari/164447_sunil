

var fs=require('fs');

fs.readdir('./', function(err, items) {
    for (var i=0; i<items.length; i++) {
        stats =fs.lstatSync(items[i]);
        if(stats.isFile()){
            console.log('File:'+items[i]);
        }
        else if(stats.isDirectory()){
            console.log('Directory:'+items[i]);
        }
        else{
            console.log('error');
        }
    }
});

