import { BrowserModule } from '@angular/platform-browser';
import { NgModule } from '@angular/core';
import { FormsModule }          from '@angular/forms';
import { ReactiveFormsModule } from '@angular/forms';
import { AppComponent } from './app.component';
import { AddtaskComponent } from './addtask/addtask.component';
import { ViewtaskComponent } from './viewtask/viewtask.component';
import { PageNotFoundComponent } from './page-not-found/page-not-found.component';

import { AppRoutingModule } from './app-routing.module';
import {HttpClientModule} from '@angular/common/http';
import { TaskService } from './services/task.service';
import { StaticTaskService } from './services/static.service';

import {BrowserAnimationsModule} from '@angular/platform-browser/animations';
import {TaskPipe} from './viewtask/task.pipe';
import { HeaderComponent } from './header/header.component';
import { EdittaskComponent } from './edittask/edittask.component';

@NgModule({
  declarations: [
    AppComponent,
    AddtaskComponent,
    ViewtaskComponent,
    PageNotFoundComponent,
    TaskPipe,
    HeaderComponent,
    EdittaskComponent
  ],
  imports: [
    BrowserModule,
    FormsModule,
    HttpClientModule,
    AppRoutingModule,
    ReactiveFormsModule,
    BrowserAnimationsModule
  ],
  exports:[TaskPipe],
  providers: [TaskService, StaticTaskService],
  bootstrap: [AppComponent]
})
export class AppModule { }
