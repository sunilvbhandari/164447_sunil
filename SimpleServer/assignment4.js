var fs = require('fs');
'use strict';

fs.writeFileSync('writeMe2.txt',process.argv[2]);
console.log('Saved!');


