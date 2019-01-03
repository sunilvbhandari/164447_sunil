var pi = 3.142;
var Circle = /** @class */ (function () {
    function Circle(color, radius) {
        this.color = color;
        this.radius = radius;
    }
    Circle.prototype.area = function () {
        return pi * this.radius * this.radius;
    };
    Circle.prototype.toString = function () {
        return "Circle  -" + this.area() + " - " + this.color + "  ";
    };
    return Circle;
}());
var Rectangle = /** @class */ (function () {
    function Rectangle(color, height, width) {
        this.color = color;
        this.height = height;
        this.width = width;
    }
    Rectangle.prototype.area = function () {
        return this.height * this.width;
    };
    Rectangle.prototype.toString = function () {
        return "Rectangle  -" + this.area() + " - " + this.color;
    };
    return Rectangle;
}());
var s1 = new Circle("red", 3);
console.log(s1.toString());
var s2 = new Rectangle("green", 3, 4);
console.log(s2.toString());
