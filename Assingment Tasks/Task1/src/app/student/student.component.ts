import { Component, OnInit } from '@angular/core';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrl: './student.component.css'
})
export class StudentComponent implements OnInit{
  student:any=[]
onSubmit() {
console.log(this.student)
this.student
}

 
  // uname:string ="Java Patil";

  
  constructor(){ }

  ngOnInit(): void {
    this.onSubmit()

  }
 
}
