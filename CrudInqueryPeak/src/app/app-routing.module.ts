import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import { UserComponent } from './user/user.component';
import { AdminComponent } from './admin/admin.component';


const routes: Routes = [
  // {path:'home',component:},
  // {path:'',redirectTo:'home',pathMatch:'full'},
  {path:'user',component:UserComponent},
  {path:'admin',component:AdminComponent},
  
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
