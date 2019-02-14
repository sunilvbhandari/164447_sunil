var fs = require('fs');
'use strict';

fs.writeFileSync('writeMe2.txt',process.argv[2]);
console.log(process.argv[0]);
console.log(process.argv[1]);
console.log('Saved!');


