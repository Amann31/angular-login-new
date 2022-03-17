import { Component, OnInit } from '@angular/core';
import {NgForm} from "@angular/forms";
import {RegistrationService} from "../registration.service";
import {User} from "../user";
import {Router} from "@angular/router";

@Component({
  selector: 'app-login',
  templateUrl: './login.component.html',
  styleUrls: ['./login.component.css']
})
export class LoginComponent implements OnInit {
  msg=""
  user:User = new User();

  constructor(private registrationService:RegistrationService,private router:Router) { }

  ngOnInit(): void {
  }

  loginUser(){
    this.registrationService.loginUserFromRemote(this.user).subscribe(data=>{
        console.log(data);
        this.router.navigate(['/loginsuccess']);
      },
      error => {
        console.log(error),
          this.msg="Bad Credentials, Please enter valid email and password"

      }
    )
  }
}
