import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrls: ['./user.component.css']
})
export class UserComponent implements OnInit {
  	  firstName : string = "May";
    lastName : string = "Do";
    cities : string[] = ["Philadelphia", "Milan", "Bengaluru", "Tokyo"];
  constructor() {
   }

  ngOnInit() {
  }
  	  convertToUpperCase() {
  	    this.firstName = this.firstName.toUpperCase();
  	    this.lastName = this.lastName.toUpperCase();
 	  }

  	  convertToLowerCase() {
          this.firstName = this.firstName.toLowerCase();
          this.lastName = this.lastName.toLowerCase();
        
}
}