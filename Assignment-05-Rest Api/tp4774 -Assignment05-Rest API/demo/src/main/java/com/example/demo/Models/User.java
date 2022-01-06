package com.example.demo.Models;
import javax.persistence.*;
import java.util.*;
import java.text.*;

@Entity
public class User {

    @Id
    private long am;

    @Column
    private String firstName;

    @Column
    private String lastName;

    @Column
    private String street;

    @Column
    private String town;

    @Column
    private String country;

    @Column
    private long phone;

    @Column
    private Date birthDay;

    @Column
    private char gender;

    public long getAM() { return am;}

    public void setAM(long am){
        this.am=am;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName){
        this.firstName=firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName){
        this.lastName=lastName;
    }

    public String getStreet() {
        return street;
    }

    public void setStreet(String street){
        this.street=street;
    }

    public String getTown() {
        return town;
    }

    public void setTown(String town){
        this.town=town;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country){
        this.country=country;
    }

    public long getPhone() { return phone;}

    public void setPhone(long phone){
        this.phone=phone;
    }

    public Date getBirthDay() {
        return birthDay;
    }

    public void setBirthDay(Date birthDay){
        this.birthDay=birthDay;
    }

    public char getGender(){
        return gender;
    }

    public void setGender(char gender){
        this.gender=gender;
    }

}
