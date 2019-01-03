let todoList=new Array;

function addNewTask(task:string){
todoList.push(task);
console.log("=========== NEW TASK ===========");
console.log("Task "+task+" inserted in the list");
console.log("Number of items:"+todoList.length);
return todoList;
}
function removeTask(task:string){
    var length=this.todoList.length-1;
    for( var i=0;i<=length; i++){
        if ( todoList[i] === task) 
        todoList.splice(i, 1);
        }
        console.log("=========== TASK REMOVED ===========");
        console.log("Task "+task+" removed from the list");
        console.log("Number of items:"+todoList.length);     
return todoList;
}

function iterate(){
    console.log("=========== ITERATION ===========");
    var length=this.todoList.length-1;
    for( var i=0;i<=length; i++){
        console.log(todoList[i]);
        }
    }


let task1="run";
let task2="play";
let task3="swim";
console.log(addNewTask(task1));
console.log(addNewTask(task2));
console.log(addNewTask(task3));
console.log(removeTask("swim"));
console.log(removeTask(task2));
console.log(addNewTask(task2));
console.log(addNewTask(task3))
console.log(iterate());
