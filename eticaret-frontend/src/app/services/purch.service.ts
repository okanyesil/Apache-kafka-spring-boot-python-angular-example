import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {BookModel} from "../models/book.model";
import {OrderModel} from "../models/order.model";

@Injectable({
  providedIn: 'root'
})
export class PurchService {

  constructor(
    private http: HttpClient
  ) { }

  purchBook(books: OrderModel){
    return this.http.post("http://localhost:8082/api/order/create", books);

  }
}
