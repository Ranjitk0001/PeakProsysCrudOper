import { Component, OnInit } from '@angular/core';
import { StudentService } from '../student.service';

@Component({
  selector: 'app-student',
  templateUrl: './student.component.html',
  styleUrl: './student.component.css'
})
export class StudentComponent implements OnInit{
student: any=[];
// student=[{"age":100, "sname":"Sachin", "sclass":"FyBcs"},];
  constructor(private studentService:StudentService){}

  ngOnInit(): void {
     this.student=this.studentService.getStudList();
    alert(JSON.stringify(this.student));
  }
}
