


export interface TodoItemInterface{
    title:String;
    status:boolean;
    updatedAt:Date;
    toggleStatus();

}

export interface TodoListInterface {
    todoList;
    addNewTask(task:TodoItemInterface);
    removeTask(task:TodoItemInterface);
    iterate();
     
}










