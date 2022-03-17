import { Injectable } from '@angular/core';
import {User} from "./user";
import {Observable} from "rxjs";
import {HttpClient} from "@angular/common/http";

@Injectable({
  providedIn: 'root'
})
export class RegistrationService {

  constructor(private httpClient:HttpClient) { }

  public loginUserFromRemote(user:User):Observable<any>{
    return this.httpClient.post<any>("http://localhost:8090/login",user)
  }
}
