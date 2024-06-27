package com.cardealer.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.cardealer.model.Buyer;
import com.cardealer.repository.BuyerRepository;

import jakarta.servlet.http.HttpSession;

//the service layer is the middleman between the repository and the controller 
//it is the business logic 
//methods in this layer will allow you to manipulate data before it reaches the database 
//or if it is coming from the database and going to a view 
//dependency injection; injecting the buyer repository into the repository

//the warehouse
//the business logic layer
@Service
public class BuyerService {

//Dependency injection
@Autowired
private BuyerRepository buyerRepository;

//this method takes in a buyer object and asks the BuyerRepository to insert it (or save) into the database
//access modifier, return type, method name, (parameters), {block of code}
public Buyer signUp(Buyer buyer) {

 //data_type variable = ask middleman to save buyer
//othercode depending on what you want to do with the data before it reaches the database,  e.g.encrypting the password

Buyer savedBuyer = buyerRepository.save(buyer);
return savedBuyer;
//save(Employee entity): Employee
// saves an entity and return the updated one.
}
 
// public Buyer signIn(Buyer buyer) throws Exception{

//   //check whether the buyer exists in the database, using their email
//   //used the buyer object and the getter 
//   Buyer foundBuyer = buyerRepository.findByEmail(buyer.getEmail());
  

//   if (foundBuyer == null) {

//     //null means empty 
//     //checking if the buyer repository found anything in the database with
//     // the entered email 
//   throw new Exception("Buyer not found");
//     }

//     //check if the password from the foundbuyer in the database matches
//     // the password from the buyer entered in the view/jsp page
//     if(!foundBuyer.getPassword().equals(buyer.getPassword())){
//       throw new Exception("Invalid credentials.Wrong password");
//     }
//       return foundBuyer;
//   }

public Buyer findById(Long id){

  Buyer buyer = buyerRepository.findById(id).orElse(null);

  return buyer;
}


public Buyer editProfile(Buyer buyer, HttpSession session){
  
Buyer sessionBuyer = (Buyer) session.getAttribute("user");

Buyer editedbuyer = buyerRepository.findById(sessionBuyer.getId()).orElse(null);

editedbuyer.setFirstname(buyer.getFirstname());
editedbuyer.setLastname(buyer.getLastname());
editedbuyer.setAddress(buyer.getAddress());
editedbuyer.setEmail(buyer.getEmail());
editedbuyer.setPhonenumber(buyer.getPhonenumber());

return buyerRepository.save(editedbuyer);

  
  }
}