
import {TodoItemInterface} from "./interface";

import {TodoListInterface} from "./interface";

class TodoItem implements TodoItemInterface{
    title:String;
    status:boolean=true;
    updatedAt:Date;
    constructor(title:String,updatedAt:Date){
        this.title=title;
        this.updatedAt=updatedAt;
            }
    toggleStatus(){
if(this.status==true)
this.status=false;
else 
this.status=true;
console.log(this.status);
return this.status;
    }

}

class TodoList  implements TodoListInterface {
    todoList: TodoItem[]=new Array; 
    addNewTask(task:TodoItem){
       this.todoList.push(task);
        console.log("=========== NEW TASK ===========");
        console.log("Task "+task+" inserted in the list");
        console.log("Number of items:"+this.todoList.length);
        return this.todoList;
    }
    removeTask(task:TodoItem){
        for( var i=0;i<= this.todoList.length-1; i++){
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
        for( var i=0;i<=this.todoList.length-1; i++){
            console.log("TodoItem{\n title: "+this.todoList[i].title+",\n updatedAt: "+this.todoList[i].updatedAt+"}");
            }
}

}

let TodoItem1=new TodoItem('run',new Date());
let TodoItem2:TodoItem=new TodoItem("play",new Date());
let TodoItem3:TodoItem=new TodoItem("swim",new Date());
let TodoList1:TodoList=new TodoList();
TodoItem1.toggleStatus();
TodoList1.addNewTask(new TodoItem('run',new Date()));
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




