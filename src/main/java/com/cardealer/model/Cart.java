package com.cardealer.model;

import java.util.ArrayList;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.JoinColumn;
import jakarta.persistence.JoinTable;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="cart")
public class Cart {
    

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    //many to many
    //multiple instances of one class are related to multiple instances of another classs
   //a car can be in multiple carts and then a cart can have multiple cars 
   //a many to many joins two tables into one by taking the primary key from each table 
   // and using them to form another table 

   @ManyToMany
   //jointable links two entities/models together 
   @JoinTable(
    name ="car-cart",
    //cars are inside of the cart which makes cart the owning side of the relatinship
    joinColumns = @JoinColumn(name = "cart_id", referencedColumnName ="id"),
    inverseJoinColumns = @JoinColumn(name ="car_id",referencedColumnName="id"))
    private List<Car> itemsinCart = new ArrayList<>();

public Long getId() {
    return id;
}

public void setId(Long id) {
    this.id = id;
}

public List<Car> getItemsinCart() {
    return itemsinCart;
}

public void setItemsinCart(List<Car> itemsinCart) {
    this.itemsinCart = itemsinCart;
}
    
   
    

}
