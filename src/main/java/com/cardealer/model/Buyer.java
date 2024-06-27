package com.cardealer.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

//Encapsulation: The process by which the data (variables) and the code that acts upon them (methods) are integrated into as a single unit (class).
@Entity
@Table(name="Buyer")
public class Buyer {

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






//empty constructor
//allows us to set the initial state of an object
public Buyer() {
}

//getters and setters
//allows you to access a variable
//allows you to modify a variable
public long getId() {
    return id;
}

public void setId(long id) {
    this.id = id;
}

public String getFirstname() {
    return firstname;
}

public void setFirstname(String firstname) {
    this.firstname = firstname;
}

public String getLastname() {
    return lastname;
}

public void setLastname(String lastname) {
    this.lastname = lastname;
}

public String getAddress() {
    return address;
}

public void setAddress(String address) {
    this.address = address;
}

public String getEmail() {
    return email;
}

public void setEmail(String email) {
    this.email = email;
}

public String getPassword() {
    return password;
}

public void setPassword(String password) {
    this.password = password;
}

public String getPhonenumber() {
    return phonenumber;
}

public void setPhonenumber(String phonenumber) {
    this.phonenumber = phonenumber;
}

public String getPhotoUrl() {
    return photoUrl;
}

public void setPhotoUrl(String photoUrl) {
    this.photoUrl = photoUrl;
}

}
