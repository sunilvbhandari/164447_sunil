import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'user',
  templateUrl: 'user.component.html',
})

export class UserComponent  { 
name: string; 
email: string;
address: Address;
hobbies: string[];
showHobbies: boolean;
toggleHobbies(){
  this.showHobbies = !this.showHobbies;
}

addHobby(hobby: any){
  this.hobbies.push(hobby);
}

deleteHobby(i: any){
  this.hobbies.splice(i, 1);
}

constructor(){
  this.name = 'Sunil'; 
  this.email = 'sunil@gmail.com',
  this.address = {
      street: '2nd Main byrappa layout',
      city: 'Bangalore', 
      state: 'Karnataka'
  }
  this.hobbies = ['Music', 'Movies', 'Sports'];
  this.showHobbies = false;
  
}}

class Address{
  street:string;
  city: string; 
  state:string; 
}
