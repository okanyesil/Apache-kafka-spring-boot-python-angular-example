import { Component, OnInit } from '@angular/core';
import {BookService} from "../services/book.service";
import {Observable} from "rxjs";
import {BookModel} from "../models/book.model";
import {UserService} from "../services/user.service";
import {UserModel} from "../models/user.model";

@Component({
  selector: 'app-product-container',
  templateUrl: './product-container.component.html',
  styleUrls: ['./product-container.component.scss']
})
export class ProductContainerComponent implements OnInit {

  allBook: Observable<BookModel[]> = new Observable<BookModel[]>();
  userInfo: Observable<UserModel> = new Observable<UserModel>();
  constructor(
    private bookService: BookService,


  ) { }

  ngOnInit(): void {
    this.allBook = this.bookService.getAllBook();

  }

}
