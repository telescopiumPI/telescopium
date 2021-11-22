import { NgModule } from '@angular/core';
import { CommonModule } from '@angular/common';
import { HomeComponent } from './home/home.component';
import { AjoutmagComponent } from './ajoutmag/ajoutmag.component';
import { AjoutmodComponent } from './ajoutmod/ajoutmod.component';



@NgModule({
  declarations: [
    HomeComponent,
    AjoutmagComponent,
    AjoutmodComponent
  ],
  imports: [
    CommonModule
  ]
})
export class HomeModule { }
