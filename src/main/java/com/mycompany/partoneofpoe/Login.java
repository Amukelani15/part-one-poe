/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partoneofpoe;

import java.util.regex.Pattern;

/**
 *
 * @author RC_Student_lab
 */
public class Login {
    
    //attributes
    private String userName;
    private String password;
    private String firstName;
    private String lastName;
    
    
    //setters and getters

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
   
   
    
    // checking the user name
    public boolean checkUserName(String userName){
        boolean results= false;
        
        if(userName.contains("_") && userName.length()<= 5){
            results = true;
            System.out.println("Username successfully captured");
        }
        else{
            results = false;
            System.out.println("Username is not correctly formatted, please ensure that your username contains an "
                    + "underscore and is no more than 5 characters in length.");
        }
        return results;
    }
    
    //Checking the password 
    public boolean checkPasswordComplexity(String password){
        boolean results = false;
        
        //An object of the Regex Pattern
        Pattern checkUpperCase = Pattern.compile("[ABCDEFGHIJKLMNOPQRSTUVWXYZ]");
        Pattern checkNum = Pattern.compile("[0123456789]");
        Pattern checkSpecial = Pattern.compile("[`~!@#$%^&*-_]");
        
        //conditions
        if (password.length() >= 8 && checkUpperCase.matcher(password).find() && checkNum.matcher(password).find() && checkSpecial.matcher(password).find()){
            results = true;
            System.out.println("Password successfully captured.");
            
        }
        else {
            results = false;
            System.out.println("Password not correctly formatted, please ensure that the password contains at least 8 characters, a capital letter, a number and a special character.");
        }
        return results;
    }
    
    //messaging after registering
    public String registerUser(String message){
        String msg = "You have been successfully registered.";
        System.out.println(msg);
        return msg;
    }
    
    //login user method
    public boolean loginUser(String userName, String password){    
       
   boolean check=false;
        if (userName.equals(this.userName) && password.equals(this.password)){
            
            System.out.println("successfully captured");
            check=true;
        }
        else{
            System.out.println("Not successfully captured");
           check= false;
        }
       return check; 
    }
    
    //Return login status method
    public String returnLoginStatus(String firstName, String lastName){
   
        if (loginUser(this.userName, this.password)){
            return "Welcome " + firstName + " " + lastName + " it is great to see you again.";
        }
        else{
            return "User name or password incorrect, please try again";
        }
        
    }
     
}

