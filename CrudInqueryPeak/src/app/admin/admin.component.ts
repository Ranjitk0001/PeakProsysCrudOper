import { Component } from '@angular/core';
import { AdminService } from '../serviceData/admin.service';
import { User } from '../classData/user';

@Component({
  selector: 'app-admin',
  templateUrl: './admin.component.html',
  styleUrl: './admin.component.css'
})
export class AdminComponent {
  users:User[]=[];
  constructor(private adminService:AdminService){}
  ngOnInit(): void {
      this.getAdminList();
  }

  getAdminList(){
    this.adminService.getAdmin().subscribe(data=>{
      this.users=data;
    })
  }
}
