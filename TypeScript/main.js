"use strict";
exports.__esModule = true;
var Todo = /** @class */ (function () {
    function Todo() {
        this.todoList = new Array;
    }
    Todo.prototype.addNewTask = function (task) {
        this.todoList.push(task);
        console.log("=========== NEW TASK ===========");
        console.log("Task " + task + " inserted in the list");
        console.log("Number of items:" + this.todoList.length);
        return this.todoList;
    };
    Todo.prototype.removeTask = function (task) {
        for (var i = 0; i <= this.todoList.length - 1; i++) {
            if (this.todoList[i] === task)
                this.todoList.splice(i, 1);
        }
        console.log("=========== TASK REMOVED ===========");
        console.log("Task " + task + " removed from the list");
        console.log("Number of items:" + this.todoList.length);
        return this.todoList;
    };
    Todo.prototype.iterate = function () {
        console.log("=========== ITERATION ===========");
        for (var i = 0; i <= this.todoList.length - 1; i++) {
            console.log(this.todoList[i]);
        }
    };
    return Todo;
}());
var task1 = "run";
var task2 = "play";
var task3 = "swim";
var todoObject = new Todo;
console.log(todoObject.addNewTask(task1));
console.log(todoObject.addNewTask(task2));
console.log(todoObject.addNewTask(task3));
console.log(todoObject.removeTask("swim"));
console.log(todoObject.removeTask(task2));
console.log(todoObject.addNewTask(task2));
console.log(todoObject.addNewTask(task3));
console.log(todoObject.iterate());
