import { TodoInterface } from "./todointerface";



class Todo implements TodoInterface{
todoList:string[]=new Array;
addNewTask(task:string){
   this.todoList.push(task);
    console.log("=========== NEW TASK ===========");
    console.log("Task "+task+" inserted in the list");
    console.log("Number of items:"+this.todoList.length);
    return this.todoList;
}
removeTask(task:string){
    var length=this.todoList.length-1;
    for( var i=0;i<=length; i++){
        if ( this.todoList[i] === task) 
        this.todoList.splice(i, 1);
        }
        console.log("=========== TASK REMOVED ===========");
        console.log("Task "+task+" removed from the list");
        console.log("Number of items:"+this.todoList.length);     
return this.todoList;
}
iterate(){
    console.log("=========== ITERATION ===========");
    var length=this.todoList.length-1;
    for( var i=0;i<=length; i++){
        console.log(this.todoList[i]);
        }
}
}
let task1="run";
let task2="play";
let task3="swim";
let todoObject=new Todo;
console.log(todoObject.addNewTask(task1));
console.log(todoObject.addNewTask(task2));
console.log(todoObject.addNewTask(task3));
console.log(todoObject.removeTask("swim"));
console.log(todoObject.removeTask(task2));
console.log(todoObject.addNewTask(task2));
console.log(todoObject.addNewTask(task3));
console.log(todoObject.iterate());