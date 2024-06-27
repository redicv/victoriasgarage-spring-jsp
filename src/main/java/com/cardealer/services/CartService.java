package com.cardealer.services;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.jms.JmsProperties.Listener.Session;
import org.springframework.stereotype.Service;

import com.cardealer.model.Car;
import com.cardealer.model.Cart;
import com.cardealer.repository.CarRepository;

import jakarta.servlet.http.HttpSession;

@Service
public class CartService{

    @Autowired
    private CarRepository carRepository;

    //HTTP Session
    //Session is used to save user information temporarily on the server 
    //We use the HttpSession class to store temporary data/ session-specific data 

//Get Cart
public Cart getCart(HttpSession session){
    
    //the getAttiribute method allows you to load a value/object/entity/data 
    //that was previously set in the session
    Cart cart = (Cart) session.getAttribute("cart");
    
    //check whether any data was returned(gotten) from the session
    //if cart is equal to null, it means there was no cart in the current session
    //so we have to create one and SET IT.
    
    if(cart == null){
       
        //we initialize/assign a new cart object 
        cart = new Cart();
        
        //we then set that new cart object in the session
        //setAttribute method allows to save data into the session
        session.setAttribute("cart", cart);
    }

        return cart;
  }

  //add to cart method- 
  //its job is to get a cart
  // then also receive the id of the car which it wants to add to the cart
  //it will use the id to get the car from the database and then when it gets
  // the car from the database its going to add it to the items in the 
  //cart(the variable we created also representing every items that is
  // represented in the table)

public void addtoCart(Long id, HttpSession session){
    //get a cart
    Cart cart = getCart(session);
    //look for the car in the database with the id received 
    Car carToAdd = carRepository.findById(id).orElse(null);
    //check whether the car was returned with a given id,
    // and if a car was returned, it will add the car to the cart 

    if(carToAdd!=null){
        //adds car from database(carToAdd) to itemsinCart List
        cart.getItemsinCart().add(carToAdd);
    }


//  public void removefromCart(Long id, HttpSession session){
//    //remove from cart 
//    Cart cart = getCart(session);

 }

//remove from cart

public void removeFromCart(Long id, HttpSession session){
//get a cart (the current cart in the session)

    Cart cart = getCart(session);

   List<Car> itemsToRemove = new ArrayList<>();
    
   //the For each loop iterates through all the items in the cart 
   for (Car car : cart.getItemsinCart()) {
    
    //if an id of a car in the cart matches with the id which was passed 
    //into this method, it will remove that car from the items in cart.
    //the id passed into this method represents the id of the car which  
    //you want to remove from the items in the cart.  
    if(car.getId().equals(id)){
      itemsToRemove.add(car);
    }
   
   }
   cart.getItemsinCart().removeAll(itemsToRemove);
 }
}
