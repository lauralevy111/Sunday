package com.example.sunday;

import java.util.Date;

public class Person {

    public String firstName;
    public String lastName;

    /*
    public Date birthDate;
    public String address;
    */
    public double accountBalance=0;


    public Person (String firstName, String lastName/*, Date birthDate, String address, double initialBlance*/){
        this.firstName=firstName;
        this.lastName=lastName;
        /*
        this.birthDate=birthDate;=
        this.address=address;
        accountBalance+=initialBalance;
         */
    }

    public String getFirstName() {
        return firstName;
    }
    public String getLastName() {
        return lastName;
    }
    /*
    public Date getBirthDate(){
        return birthDate;
    }
    public String getAddress(){
        return address;
    }
    public double getAccountBalance(){
        return accountBalance;
    }

     */

    public void purchase(double price){
        accountBalance-=price;
    }
    public void returnPurchase(double price){
        accountBalance+=price;
    }


    @Override
    public String toString(){
        String customerProfile = "Customer Profile: \n" +
                "Name- "+firstName+" "+lastName+"\n" +
                /*
                "BirthDate- "+birthDate+"\n" +
                "Address- "+address+"\n" +=
                 */
                "Account Balance- "+accountBalance;
        return customerProfile;
    }
}
