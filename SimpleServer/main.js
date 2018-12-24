var adder=require('./operations/adder');

var subtractor=require('./operations/subtractor');
var multiplier=require('./operations/multiplier');
var divider=require('./operations/divider');


console.log(adder.adder(3,7));

console.log(multiplier.multiplier(3,7));

console.log(subtractor.subtractor(3,7));

console.log(divider.divider(7,7));