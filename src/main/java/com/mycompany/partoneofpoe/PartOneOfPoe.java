/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.partoneofpoe;
import java.util.*;

/**
 *
 * @author RC_Student_lab
 */
public class PartOneOfPoe {

    public static void main(String[] args) {
        
        //creating an object of the Scanner
        Scanner sc = new Scanner(System.in);
        
        //Declarations
        String userName="";
        String password="";
        String firstName="";
        String lastName ="";
        String verUserName, verPassword;
        
        //Creating an object of the Login() method
        Login acc = new Login();
        
        //Prompting
        System.out.println("=================== REGISTERING ======================");
        
        //User name
        do {
            System.out.print("Please enter your user name: ");
            userName = sc.next();
            acc.setUserName(userName);
        }
        while(!acc.checkUserName(userName));
        
        //Password
        do {
            System.out.print("Please enter your password: ");
            password = sc.next();
            acc.setPassword(password);
        }
        while(!acc.checkPasswordComplexity(password));
        
        //firstname and lastname
        System.out.print("Please enter your first name: ");
        firstName = sc.next();
        acc.setFirstName(firstName);
        
        System.out.print("Please enter your last name: ");
        lastName = sc.next();
        acc.setLastName(lastName);
        
        //register message
        acc.registerUser("");
        
        //loginUser() method
        System.out.println("=================== LOGIN =====================");
        
        //to validate
        //boolean loginSuccessful = true;
        do {
            System.out.print("Please enter your user name: ");
            verUserName = sc.next();
        
        //password
        
            System.out.print("Please enter your password: ");
            verPassword = sc.next();
            
            //loginSuccessful = acc.loginUser(verUserName ,  verPassword);
            
            //returning 
           
        }
        while(!acc.loginUser(verUserName ,  verPassword));
        
        //
        System.out.println(acc.returnLoginStatus(firstName, lastName));
         
    }
}
