import { Component } from '@angular/core';

@Component({
  selector: 'app-root',
  templateUrl: './app.component.html',
  styleUrls: ['./app.component.css']
})
export class AppComponent {
  title = 'Hello World of TypeScript! ';
  firstname="sunil";
  lastname="vb";
  location : Address = 
  {
    	 "street" : "2nd main byrappa layout",
        "city" : "whitefield"
      };
    
}
	class Address {
	  street : string;
	  city : string;
  }
  
