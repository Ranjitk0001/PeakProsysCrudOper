import { Component } from '@angular/core';
import { User } from '../classData/user';
import { UserService } from '../serviceData/user.service';

@Component({
  selector: 'app-user',
  templateUrl: './user.component.html',
  styleUrl: './user.component.css'
})
export class UserComponent {
    user:User=new User();
  constructor(private userService:UserService){}

saveUser(){
  this.userService.createUser(this.user).subscribe(data=>{
    console.log(data);
    
  })
}

onSubmit(){
  this.saveUser();
}
}
