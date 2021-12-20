import { Component, OnInit } from '@angular/core';
import {BookModel} from "../models/book.model";
import {CartService} from "../services/cart.service";
import {UserService} from "../services/user.service";
import {OrderModel} from "../models/order.model";
import {PurchService} from "../services/purch.service";
import {OrderBookModel} from "../models/order-book.model";

@Component({
  selector: 'app-shopping-cart-container',
  templateUrl: './shopping-cart-container.component.html',
  styleUrls: ['./shopping-cart-container.component.scss']
})
export class ShoppingCartContainerComponent implements OnInit {
  toplamUcret: number=0;
  cart: BookModel[] = [];
  order: OrderModel = <OrderModel>{};
  constructor(
    private cartService: CartService,
    private userService: UserService,
    private purchService: PurchService
  ) { }

  ngOnInit(): void {
    this.cart = this.cartService.getTheCart();

    this.cart.forEach(value => {
      return this.toplamUcret += value.price;
    })
  }
  yonlendir(){
    let books: OrderBookModel[] = [];
    this.cart.forEach(value => {
      return books.push({bookID: value.id, price: value.price})
    });
    this.order.cart = books;
    //this.userService.getUser().subscribe(value => this.order.userInfo = value);
    this.order.userInfo = {
      id:1,
      name:"Okan",
      lastName:"Yeşiloğlu",
      email:"myesiloglu0@gmail.com"
    }
    console.log(this.order);
    this.purchService.purchBook(this.order).subscribe(console.log);
    window.location.href = 'http://localhost:5000/1';
  }

}
