import { Component } from '@angular/core';
import { MatCardModule } from '@angular/material/card';
import { MatInputModule } from '@angular/material/input';
import { MatButtonModule } from '@angular/material/button';
import { MatIconModule } from '@angular/material/icon';
import { FormBuilder, FormControl, FormGroup, ReactiveFormsModule } from '@angular/forms';
import { CommonModule } from '@angular/common';

@Component({
  selector: 'app-login',
  standalone: true,
  imports: [
    MatCardModule,
    MatInputModule,
    MatButtonModule,
    MatIconModule,
    ReactiveFormsModule,
    CommonModule
  ],
  templateUrl: './login.component.html',
  styleUrl: './login.component.css'
})
export class LoginComponent {
  loginform: FormGroup;

  constructor (private fb: FormBuilder){
    this.loginform = new FormGroup({
      user: new FormControl(),
      password: new FormControl()
    })
  }

  login(){
    const credentials = this.loginform.value;
    
    if (credentials.user == null || credentials.password == null) {
      console.log("Invalid credentials")
    } else {
      console.log(credentials);
    }
  }
}
