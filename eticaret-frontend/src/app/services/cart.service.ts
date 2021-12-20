import { Injectable } from '@angular/core';
import {BookModel} from "../models/book.model";

@Injectable({
  providedIn: 'root'
})
export class CartService {
  cart: BookModel[] = [];

  constructor() { }

  addToCart(book: BookModel){
    this.cart.push(book);
  }
  getTheCart(): BookModel[]{
    return this.cart;
  }
}
