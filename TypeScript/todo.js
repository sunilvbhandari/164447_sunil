var todoList = new Array;
function addNewTask(task) {
    todoList.push(task);
    console.log("=========== NEW TASK ===========");
    console.log("Task " + task + " inserted in the list");
    console.log("Number of items:" + todoList.length);
    return todoList;
}
function removeTask(task) {
    for (var i = 0; i <= todoList.length - 1; i++) {
        if (todoList[i] === task)
            todoList.splice(i, 1);
    }
    console.log("=========== TASK REMOVED ===========");
    console.log("Task " + task + " removed from the list");
    console.log("Number of items:" + todoList.length);
    return todoList;
}
function iterate() {
    console.log("=========== ITERATION ===========");
    for (var i = 0; i <= todoList.length - 1; i++) {
        console.log(todoList[i]);
    }
}
var task1 = "run";
var task2 = "play";
var task3 = "swim";
console.log(addNewTask(task1));
console.log(addNewTask(task2));
console.log(addNewTask(task3));
console.log(removeTask("swim"));
console.log(removeTask(task2));
console.log(addNewTask(task2));
console.log(addNewTask(task3));
console.log(iterate());
