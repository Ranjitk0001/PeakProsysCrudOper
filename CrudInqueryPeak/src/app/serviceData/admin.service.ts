import { HttpClient } from '@angular/common/http';
import { Injectable } from '@angular/core';
import { Observable } from 'rxjs';
import { User } from '../classData/user';

@Injectable({
  providedIn: 'root'
})
export class AdminService {

constructor(private httpClient:HttpClient) { }
private baseUrl="http://localhost:8084/version1/"

getAdmin ():Observable<User[]>{
  return this.httpClient.get<User[]>(`${this.baseUrl}${`adminlist`}`);
 }



}
