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
    
    
    //constructor
    public Login(){
        
    }
    public Login (String userName, String password, String firstName, String lastName){
        this.userName = userName;
        this.password = password;
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    // checking the user name
    public boolean checkUserName(String userName){
        boolean results= true;
        
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
        boolean results = true;
        
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
    
    //loginUser() method
    public boolean loginUser(String userName, String password){
        
        String verUserName = userName;
        String verPassword = password;
        
        if (userName.equals(verUserName) && password.equals(verPassword)){
            return true;
        }
        else{
            return false;
        }
        
    }
    
}
