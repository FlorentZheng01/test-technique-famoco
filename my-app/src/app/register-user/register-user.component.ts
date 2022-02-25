import { Component, OnInit } from '@angular/core';
import { FormControl, FormGroup, Validators } from '@angular/forms';
import { RegisterService } from '../register.service';
import { User } from '../user';

@Component({
  selector: 'app-register-user',
  templateUrl: './register-user.component.html',
  styleUrls: ['./register-user.component.css']
})
export class RegisterUserComponent implements OnInit {

  registerForm = new FormGroup({
    firstname : new FormControl('',Validators.required),
    userId : new FormControl('',Validators.required),
    lastname : new FormControl('',Validators.required),
    email : new FormControl('', Validators.required)
  })

  user:User =new User();
  constructor(private registerService: RegisterService) {}

 
  ngOnInit(): void {
   
  }



  userRegister(){
    this.registerService.registerUser(this.user).subscribe(data=>{
     alert("Votre inscription a bien été enregistrée")
    },error=>alert("L'utilisateur n'a pas été enregistré"));
  }


}
