package com.cardealer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name="Seller")

//lombok dependency automatically generates boilerplate code e.g.
// getters and setters and empty constructors, to string method etc.
@Data   
public class Seller {
 
@Id
@GeneratedValue(strategy = GenerationType.IDENTITY)
public long id;

@Column(name ="firstname")
public String firstname;

@Column(name = "lastname")
public String lastname;

@Column(name ="address")
public String address;

@Column(name ="email")
public String email;

@Column(name ="password")
public String password;

@Column(name = "phonenumber")
public String phonenumber;

@Column(name ="photoUrl")
public String photoUrl;


}

//