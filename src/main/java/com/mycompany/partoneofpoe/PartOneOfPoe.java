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
        String userName = "";
        String password = "";
        String firstName = "";
        String lastName = "";
        
        //Creating an object of the Login() method
        Login acc = new Login();
        
        //Prompting
        System.out.println("=================== REGISTERING ======================");
        
        //User name
        do {
            System.out.print("Please enter your user name: ");
            userName = sc.next();
        }
        while(!acc.checkUserName(userName));
        
        //Password
        do {
            System.out.print("Please enter your password: ");
            password = sc.next();
        }
        while(!acc.checkPasswordComplexity(password));
        
        //register message
        acc.registerUser("");
    }
}
