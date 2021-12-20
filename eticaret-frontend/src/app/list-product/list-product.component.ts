import {Component, Input, OnInit} from '@angular/core';
import {BookModel} from "../models/book.model";
import {Observable} from "rxjs";
import {CartService} from "../services/cart.service";
import {MatSnackBar} from "@angular/material/snack-bar";

@Component({
  selector: 'app-list-product',
  templateUrl: './list-product.component.html',
  styleUrls: ['./list-product.component.scss']
})
export class ListProductComponent implements OnInit {

  @Input()
  allBooks: Observable<BookModel[]> = new Observable<BookModel[]>();

  constructor(
    private cartService: CartService,
    private _snackBar: MatSnackBar
  ) { }

  ngOnInit(): void {
  }
  addToCart(book: BookModel){
    this.cartService.addToCart(book);
    this._snackBar.open('Kitap Sepete başarıyla eklendi.','Kapat', {
      duration: 1000
    });

  }

}
