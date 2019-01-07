import { NgModule } from '@angular/core';
import { Routes, RouterModule } from '@angular/router';
import { HomeComponent } from './components/home/home.component';
import { AdduserComponent } from './components/adduser/adduser.component';
import { UserDetailsComponent } from './components/user-details/user-details.component';



const routes : Routes = [
  { path : '', component : HomeComponent},
{ path : 'adduser', component : AdduserComponent},
{ path : 'user-details/:name', component : UserDetailsComponent}
];
  
export const routing = RouterModule.forRoot(routes);
   

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
