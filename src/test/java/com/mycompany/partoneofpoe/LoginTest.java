/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.partoneofpoe;

import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
    
    public LoginTest() {
    }
    

    /**
     * Test of checkUserName method, of class Login.
     */
    @Test
    public void testCheckUserName() {
        System.out.println("checkUserName");
        String userName = "kyl_1";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkUserName(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //test check for inavaild username
    @Test
    public void invalidTestCheckUserName(){
        System.out.println("checkUserName");
        String userName = "kyle!!!!!!!";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkUserName(userName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }

    /**
     * Test of checkPasswordComplexity method, of class Login.
     */
    @Test
    public void testCheckPasswordComplexity() {
        System.out.println("checkPasswordComplexity");
        String password = "Ch&&sec@ke99!";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //testing for the invalid password
    @Test
    public void invalidTestPasswordComplexity(){
        System.out.println("checkPasswordComplexity");
        String password = "password";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.checkPasswordComplexity(password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of registerUser method, of class Login.
     */
    @Test
    public void testRegisterUser() {
        System.out.println("registerUser");
        String message = "";
        Login instance = new Login();
        String expResult = "";
        String result = instance.registerUser(message);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of loginUser method, of class Login.
     */
    @Test
    public void testLoginUser() {
        System.out.println("loginUser");
        String userName = "kyl_1";
        String password = "Ch&&sec@ke99!";
        Login instance = new Login();
        boolean expResult = true;
        boolean result = instance.loginUser(userName, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //invalid LoginUser
    @Test
    public void invalidTestLoginUser(){
        System.out.println("loginUser");
        String userName = "kyle!!!!!!";
        String password = "password";
        Login instance = new Login();
        boolean expResult = false;
        boolean result = instance.loginUser(userName, password);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }

    /**
     * Test of returnLoginStatus method, of class Login.
     */
    @Test
    public void testReturnLoginStatus() {
        System.out.println("returnLoginStatus");
        String results = "";
        String firstName = "kyl_1";
        String lastName = "Ch&&sec@ke99!";
        Login instance = new Login();
        String expResult = "";
        String result = instance.returnLoginStatus(firstName, lastName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //invalid returnLoginStatus
    @Test
    public void invalidTestReturnLoginStatus(){
        System.out.println("returnLoginStatus");
        String results = "";
        String firstName = "kyle!!!!!!!";
        String lastName = "password";
        Login instance = new Login();
        String expResult = "false";
        String result = instance.returnLoginStatus(firstName, lastName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
        
    }
}
