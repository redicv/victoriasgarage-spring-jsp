package com.cardealer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.cardealer.model.Buyer;
import com.cardealer.services.BuyerService;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;





//the controller is the middleman between the jsps/views and the application 
@Controller 
public class BuyerController {
    
    @Autowired
    private BuyerService buyerService;

    //Http methods/mappings
    //GET - retrieve or load a resource e. g. just loading a message 
    //POST - submitting data e. g. signing up 
    //PUT - Update a record or entity e.g. updating car information, updating user profile
    //DELETE - if you're trying to delete a resource


 
    @GetMapping("/signup")//the endpoint
    public String signUp(){
    return "Sign-up"; //returns the Sign-up.jsp/form
  }
  
  //@ModelAttribute is going to bind the data from the form to the
  //input object i. e. the data coming from the sign up form will be bound to the buyer 
  @PostMapping("/signup")
  public String submitSignUp(@ModelAttribute Buyer buyer) {

//store customer/user(anyone who uses the webpage or interacting with the webpage) 
//in the store gives to the request to the service layer and will handle 
//the webpages represent the store(webpages act as the rooms within your store)
    //takes the request and gives it to the service which will fulfill the request and will give the user the final product
    //this will send the buyer object from the signup page to the buyer service 
    //customer service - victoria //the warehouse Mya works with Toyia (the repository). Mya is the chef and gets the ingredients and she knows what to do with the ingredients. 
    //when Mya is done she gives the final product to Victoria aka the customer service desk( the controller) and Victoria gives the final product to the user
    //Toyia knows how to get the raw materials that Mya needs (data from the database/storehouse) 
    //as long as she gives the right instructions from the methods in the repository with the sequel queries 
      buyerService.signUp(buyer);
      
      //load sign in webpage
      return "Sign-in";
  }
  
  @GetMapping("/signin")
  public String signIn() {
      return "Sign-in";
  }

//the model class allows you to send data to the webpage/jsp's
//when do you use Model model as an input? when you want to send data to a webpage 
  // @PostMapping("/signin")
  // public String submitSignin(@ModelAttribute Buyer buyer, Model model, HttpSession session) {

   
  //   //we use the try /catch in case the buyer's infromation is false or the buyer doesn't exist
  //   //it will TRY to signin the buyer using the code in the try block, and if it fails it will
  //   //run the code in the CATCH block 
   
  //      try{ 

  //     //this will send the buyer object (email/password) to the signin method in the buyer service 
  //     //the signin method will return the signed in buyer and it will be stored in "loggedinBuyer"
  //     Buyer loggedinBuyer = buyerService.signIn(buyer);



  //      //this will save/set the loggedinbuyer in the user session
  //   //when you set an object/value in the user session, you can get it
  //   // whenever you want else where in the application 
  //     session.setAttribute("loggedinbuyer", loggedinBuyer);

  //     //model has a method called AddAttribute which allows you to send an object/entity to a webpage
  //     model.addAttribute("buyer", loggedinBuyer);

  //     //load homepage if sucessfully signed in
  //     return "Home";
  //     }


    //if anyexception occurs in the sign in method in the Buyer service,
    // the code in the catch statement will run, i. e. it will reload the sign in page 
   
//     catch (Exception e){
//       return "Sign-in";
//      }
     
// }
  
  
@GetMapping("/profile")
public String Profile(Model model, HttpSession session){

  //we use the session object to get the buyer that was set in the session at signin, and we store 
  //that buyer inside "buyer" (light blue)
  Buyer sessionbuyer =(Buyer) session.getAttribute("user");

  Buyer buyer = buyerService.findById(sessionbuyer.getId());
  //we check if the buyer is empty , because if it is empty it means no one has signed in, so it will load 
  //the sign in page so that someone can signin
  if (buyer == null){
     return "Sign-in";

     //if it is not empty, it means a buyer was set in the session at signin, and we want you to pass the logged in 
     //buyer object to the profile webpage so we can view their profile 
  } else {

    model.addAttribute("buyer", buyer);

    return "Profile";
  }
}
  @GetMapping("/logout")
    public String logout(HttpSession session){

      //this will remove/clear the logged in buyer from the session
      //invalidate this session then unbinds any objects bound to it 
    session.invalidate();
  
    return "redirect:/signin";
  
}
//persistence is the ability to save an object and retrieve the state of an object from the database 
  @GetMapping("/editprofile/{id}")
  public String editProfile(@PathVariable Long id, Model model) {

    Buyer buyerProfile = buyerService.findById(id);

    if(buyerProfile != null){

      model.addAttribute("buyerprofile", buyerProfile);
      return "EditProfile";

    }
      else{

        return "redirect:/signup";
      }

     
     }
     
     @PostMapping("/editprofile") 
     public String editProfileForm(@ModelAttribute Buyer buyer, HttpSession session){

      buyerService.editProfile(buyer, session);

        return "redirect:/profile";
  
    }

}

 




