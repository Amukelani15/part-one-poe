/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partoneofpoe;

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
        boolean Found= true;
        
        if(userName.contains("_") && userName.length()<= 5){
            Found = true;
            System.out.println("Username successfully captured");
        }
        else{
            Found = false;
            System.out.println("Username is not correctly formatted, please ensure that your username contains an "
                    + "underscore and is no more than 5 characters in length.");
        }
        return Found;
    }
    
}
