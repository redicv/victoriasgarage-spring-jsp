package com.cardealer.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;

import com.cardealer.model.Car;
import com.cardealer.services.CarService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.PostMapping;

//its how we get our cars to the webpage through the CarController
@Controller
public class CarController {

    //dependency injection which allows us to use the resources from another class or layer
    //e.g. we created the "findAvailableCars" in CarService.java and in order to use that method in the controller we do a dependency injection
    @Autowired
    private CarService carService;

//use model model whenever we want to send data to a webpage
//the model class allows you to send data to the webpage/jsp's
//when do you use Model model as an input? when you want to send data to a webpage 
  @GetMapping("/cars")
  public String displayCars(Model model) {

     List<Car> cars = carService.findAvailableCars();

     //sends all cars received from the "findAvailableCars()" method over to the "AvailableCars.jsp" webpage 
     model.addAttribute("cars", cars);

     return "AvailableCars";
  }
  

  //use Model model when you want to send data to a webpage
  @GetMapping("/{id}")
  public String carDetails(@PathVariable Long id, Model model) throws Exception {

    Car carDetails = carService.getCar(id);

      model.addAttribute("Cardetails", carDetails);

      return "CarDetails";
  }

  //requestparam allows spring to take input data from the search query or form data
  @GetMapping("/searchcar")
  public String searchCar(@RequestParam ("model") String carModel, Model model) {

    List<Car> cars = carService.findCarsByModel(carModel);
     
    model.addAttribute("cars", cars);
    return "AvailableCars";
    }

    @GetMapping("/addcar")
    public String addCar(){

        return "AddCar";

    } 

    @PostMapping("/addcar")
    public String addCarPost(@ModelAttribute Car car) {
      
        carService.addCar(car);
        
        return "redirect:/cars";
    }
    
}
