package com.cardealer.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.cardealer.model.Cart;
import com.cardealer.services.CartService;

import jakarta.servlet.http.HttpSession;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;

@Controller
//allows you to have a route/base for all requests in the controller 
@RequestMapping("/cart")
public class CartController {

    @Autowired
    CartService cartService;


    //this takes the apikey we entered in the application.properties and puts it inside the variable below 
    //the apikey is needed inside a method so that the method can use the api service 
    //the apikey is a unique identifier used to authenticate and authorize a developer or a project the 
    //developer is working on 
    @Value("${stripe.apiKey}")
    public String stripeApiKey;



    //we use Model model because we're trying to send over the cart session 
    //data over to the cart webpage/jsp
    @GetMapping
    public String viewCart(Model model, HttpSession session){
       //this line is using the getCart method in the cart service to 
       //either get whatever cart that is currently set in the user session 
       //or set a new cart in the user session 
        Cart cart = cartService.getCart(session);
          //this method is also passing over cartitems to the cart page
        model.addAttribute("cartitems", cart.getItemsinCart());

        return "Cart";
      }

       @GetMapping("/add/{id}")
       public String addtoCart(@PathVariable Long id, HttpSession session){

        cartService.addtoCart(id, session);
        return "redirect:/cart";

       }

      //anytime the info is being extracted from the path we use @PathVariable
       @GetMapping("/remove/{id}")
       public String removeFromCart(@PathVariable Long id, HttpSession session){

        cartService.removeFromCart(id, session);
        return "redirect:/cart";
       }
       
    }
   