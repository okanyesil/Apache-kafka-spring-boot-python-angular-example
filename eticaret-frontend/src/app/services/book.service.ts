import { Injectable } from '@angular/core';
import {HttpClient} from "@angular/common/http";
import {BookModel} from "../models/book.model";
import {Observable} from "rxjs";

@Injectable({
  providedIn: 'root'
})
export class BookService {

  constructor(
    private http: HttpClient
  ) { }

  getAllBook(): Observable<BookModel[]>{
    return this.http.get<BookModel[]>('http://localhost:8080/api/book/all');
  }
}
