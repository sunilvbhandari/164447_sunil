
const pi=3.142;


interface Shape{
    color:string;
    area();
    toString();
}


class Circle implements Shape{
    color:string;
    radius:number;
    constructor(color:string,radius:number){
this.color=color;
this.radius=radius;
    }
 
    area(){
        return pi*this.radius*this.radius;
    }
    toString(){
        return "Circle  -"+this.area()+" - "+this.color+"  ";
    }
}

class Rectangle implements Shape{
    color:string;
  height:number;
  width:number;
constructor(color:string,height:number,width:number){
this.color=color;
this.height=height;
this.width=width;
}
    area(){
        return this.height*this.width;
    }
    toString(){
        return "Rectangle  -"+this.area()+" - "+this.color;
    }
}
let s1=new Circle("red",3);

console.log(s1.toString());

let s2=new Rectangle("green",3,4);

console.log(s2.toString());