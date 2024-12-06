import { Injectable } from '@angular/core';

@Injectable({
  providedIn: 'root'
})
export class StudentService {

  constructor() { }
  getStudList(){
    return[
      {"age":20, "sname":"Sachin", "sclass":"FyBcs"},
      {"age":10, "sname":"Ranjit", "sclass":"SyBcs"},
      {"age":11, "sname":"ak", "sclass":"Mcs"},

    ]
  }
}
