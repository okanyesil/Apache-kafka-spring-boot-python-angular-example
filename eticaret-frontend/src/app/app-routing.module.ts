import { NgModule } from '@angular/core';
import { RouterModule, Routes } from '@angular/router';
import {ProductContainerComponent} from "./product-container/product-container.component";
import {
  ShoppingCartContainerComponent
} from "./shopping-cart-container/shopping-cart-container.component";

const routes: Routes = [
  {path: "", component: ProductContainerComponent},
  {path: 'shopping-cart', component: ShoppingCartContainerComponent}
];

@NgModule({
  imports: [RouterModule.forRoot(routes)],
  exports: [RouterModule]
})
export class AppRoutingModule { }
