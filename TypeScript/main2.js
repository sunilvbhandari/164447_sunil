"use strict";
exports.__esModule = true;
var TodoItem = /** @class */ (function () {
    function TodoItem(title, updatedAt) {
        this.status = true;
        this.title = title;
        this.updatedAt = updatedAt;
    }
    TodoItem.prototype.toggleStatus = function () {
        if (this.status == true)
            this.status = false;
        else
            this.status = true;
        console.log(this.status);
        return this.status;
    };
    return TodoItem;
}());
var TodoList = /** @class */ (function () {
    function TodoList() {
        this.todoList = new Array;
    }
    TodoList.prototype.addNewTask = function (task) {
        this.todoList.push(task);
        console.log("=========== NEW TASK ===========");
        console.log("Task " + task + " inserted in the list");
        console.log("Number of items:" + this.todoList.length);
        return this.todoList;
    };
    TodoList.prototype.removeTask = function (task) {
        for (var i = 0; i <= this.todoList.length - 1; i++) {
            if (this.todoList[i] === task)
                this.todoList.splice(i, 1);
        }
        console.log("=========== TASK REMOVED ===========");
        console.log("Task " + task + " removed from the list");
        console.log("Number of items:" + this.todoList.length);
        return this.todoList;
    };
    TodoList.prototype.iterate = function () {
        console.log("=========== ITERATION ===========");
        for (var i = 0; i <= this.todoList.length - 1; i++) {
            console.log("TodoItem{\n title: " + this.todoList[i].title + ",\n updatedAt: " + this.todoList[i].updatedAt + "}");
        }
    };
    return TodoList;
}());
var TodoItem1 = new TodoItem('run', new Date());
var TodoItem2 = new TodoItem("play", new Date());
var TodoItem3 = new TodoItem("swim", new Date());
var TodoList1 = new TodoList();
TodoItem1.toggleStatus();
TodoList1.addNewTask(new TodoItem('run', new Date()));
TodoItem1.toggleStatus();
TodoItem2.toggleStatus();
TodoList1.addNewTask(TodoItem2);
TodoItem2.toggleStatus();
TodoItem3.toggleStatus();
TodoList1.addNewTask(TodoItem3);
TodoItem3.toggleStatus();
TodoList1.iterate();
TodoItem2.toggleStatus();
TodoList1.removeTask(TodoItem2);
TodoItem2.toggleStatus();
TodoList1.iterate();
