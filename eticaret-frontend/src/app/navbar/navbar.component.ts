import {Component, Input, OnInit} from '@angular/core';
import {UserService} from "../services/user.service";
import {Observable} from "rxjs";
import {UserModel} from "../models/user.model";
import  { faShoppingBag } from '@fortawesome/free-solid-svg-icons'
import {ActivatedRoute, Router} from "@angular/router";
@Component({
  selector: 'app-navbar',
  templateUrl: './navbar.component.html',
  styleUrls: ['./navbar.component.scss']
})
export class NavbarComponent implements OnInit {

  userInfo: Observable<UserModel> = new Observable<UserModel>();
  faIcon = faShoppingBag;
  constructor(
    private userService: UserService
  ) { }

  ngOnInit(): void {
    this.userInfo = this.userService.getUser();
  }


}
