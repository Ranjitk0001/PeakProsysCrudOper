import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { User } from '../classData/user';
import { Observable } from 'rxjs';

@Injectable({
  providedIn: 'root'
})
export class UserService {

  constructor(private httpClient:HttpClient) { }
private baseUrl="http://localhost:8084/version1/"

  createUser(userin:User):Observable<User>{
    return this.httpClient.post<User>(`${this.baseUrl}`+'insert',userin)
   }

   
}
