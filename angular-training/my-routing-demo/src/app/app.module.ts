import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { routing } from './app-routing.module';
import { FormsModule } from '@angular/forms';
import { LocationStrategy, HashLocationStrategy } from '@angular/common';

import { AppRoutingModule } from './app-routing.module';
import { AppComponent } from './app.component';
import { HomeComponent } from './components/home/home.component';
import { AdduserComponent } from './components/adduser/adduser.component';
import { UserDetailsComponent } from './components/user-details/user-details.component';


@NgModule({
  declarations: [
    AppComponent,
    HomeComponent,
    AdduserComponent,
    UserDetailsComponent
  ],

  imports: [
    BrowserModule,
    AppRoutingModule,
    FormsModule,
    routing
  ],

  providers: [{ provide: LocationStrategy, useClass: HashLocationStrategy} ],
  bootstrap: [AppComponent]
})
export class AppModule { }
