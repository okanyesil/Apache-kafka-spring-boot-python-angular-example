import {UserModel} from "./user.model";
import {BookModel} from "./book.model";
import {OrderBookModel} from "./order-book.model";

export interface OrderModel{
  userInfo: UserModel;
  cart: OrderBookModel[];
}
