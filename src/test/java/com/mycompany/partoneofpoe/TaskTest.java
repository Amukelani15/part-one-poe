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
public class TaskTest {
    
    public TaskTest() {
    }
    
    

    /**
     * Test of getName method, of class Task.
     */
    @Test
    public void testGetName() {
        System.out.println("getName");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getName();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setName method, of class Task.
     */
    @Test
    public void testSetName() {
        System.out.println("setName");
        String name = "";
        Task instance = new Task();
        instance.setName(name);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getNumberOfTasks method, of class Task.
     */
    @Test
    public void testGetNumberOfTasks() {
        System.out.println("getNumberOfTasks");
        Task instance = new Task();
        int expResult = 0;
        int result = instance.getNumberOfTasks();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setNumberOfTasks method, of class Task.
     */
    @Test
    public void testSetNumberOfTasks() {
        System.out.println("setNumberOfTasks");
        int numberOfTasks = 0;
        Task instance = new Task();
        instance.setNumberOfTasks(numberOfTasks);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDescription method, of class Task.
     */
    @Test
    public void testGetDescription() {
        System.out.println("getDescription");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getDescription();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDescription method, of class Task.
     */
    @Test
    public void testSetDescription() {
        System.out.println("setDescription");
        String description = "";
        Task instance = new Task();
        instance.setDescription(description);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getDeveloperDetails method, of class Task.
     */
    @Test
    public void testGetDeveloperDetails() {
        System.out.println("getDeveloperDetails");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getDeveloperDetails();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setDeveloperDetails method, of class Task.
     */
    @Test
    public void testSetDeveloperDetails() {
        System.out.println("setDeveloperDetails");
        String developerDetails = "";
        Task instance = new Task();
        instance.setDeveloperDetails(developerDetails);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskDuration method, of class Task.
     */
    @Test
    public void testGetTaskDuration() {
        System.out.println("getTaskDuration");
        Task instance = new Task();
        int expResult = 0;
        int result = instance.getTaskDuration();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskDuration method, of class Task.
     */
    @Test
    public void testSetTaskDuration() {
        System.out.println("setTaskDuration");
        int taskDuration = 0;
        Task instance = new Task();
        instance.setTaskDuration(taskDuration);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskID method, of class Task.
     */
    @Test
    public void testGetTaskID() {
        System.out.println("getTaskID");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getTaskID();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskID method, of class Task.
     */
    @Test
    public void testSetTaskID() {
        System.out.println("setTaskID");
        String taskID = "";
        Task instance = new Task();
        instance.setTaskID(taskID);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of getTaskStatus method, of class Task.
     */
    @Test
    public void testGetTaskStatus() {
        System.out.println("getTaskStatus");
        Task instance = new Task();
        String expResult = "";
        String result = instance.getTaskStatus();
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of setTaskStatus method, of class Task.
     */
    @Test
    public void testSetTaskStatus() {
        System.out.println("setTaskStatus");
        String taskStatus = "";
        Task instance = new Task();
        instance.setTaskStatus(taskStatus);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of checkTaskDescription method, of class Task.
     */
    @Test
    public void testCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        String description = "Create login to authenticate users";
        Task instance = new Task();
        boolean expResult = true;
        boolean result = instance.checkTaskDescription(description);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //Test check for invalid Task description method of class Task
    @Test
    public void invalidTestCheckTaskDescription() {
        System.out.println("checkTaskDescription");
        String description = "Create login to authenticate users!!!!!!!!!!!!!!!!!";
        Task instance = new Task();
        boolean expResult = false;
        boolean result = instance.checkTaskDescription(description);
        assertEquals(expResult, result);
    }

    /**
     * Test of CreateTaskID method, of class Task.
     */
    @Test
    public void testCreateTaskID() {
        System.out.println("CreateTaskID");
        String name = "Login feature";
        int number = 0;
        String devName = "Robyn Harrison";
        Task instance = new Task();
        String expResult = "LO:0:SON";
        String result = instance.CreateTaskID(name, number, devName);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    

    /**
     * Test of printTaskDetails method, of class Task.
     */
    @Test
    public void testPrintTaskDetails() {
        System.out.println("printTaskDetails");
        String taskStatus = "To do";
        String developerDetails = "Robyn Harrison";
        int numberOfTasks = 0;
        String taskName = "Login feature";
        String description = "Create login to authenticate users";
        String taskID = "LO:0:SON";
        int taskDuration = 8;
        int total = 8;
        Task instance = new Task();
        String expResult = "";
        String result = instance.printTaskDetails(taskStatus, developerDetails, numberOfTasks, taskName, description, taskID, taskDuration, total);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //Test check for Task's full details method for task number 2 
    @Test
    public void testPrintTaskDetailsTaskTwo() {
        System.out.println("printTaskDetails");
        String taskStatus = "Doing";
        String developerDetails = "Mike Smith";
        int numberOfTasks = 1;
        String taskName = "Add task feature";
        String description = "Create Add Task feature to add task user's";
        String taskID = "";
        int taskDuration = 10;
        int total = 18;
        Task instance = new Task();
        String expResult = "";
        String result = instance.printTaskDetails(taskStatus, developerDetails, numberOfTasks, taskName, description, taskID, taskDuration, total);
        assertEquals(expResult, result);
    }
    //
    /**
     * Test of returnTotalHours method, of class Task.
     */
    @Test
    public void testReturnTotalHours() {
        System.out.println("returnTotalHours");
        int taskDuration = 8 + 10;
        Task instance = new Task();
        int expResult = 18;
        int result = instance.returnTotalHours(taskDuration);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
    //Test check for the return of total hours for additional data
    @Test
    public void testReturnTotalHoursAdditionalData() {
        System.out.println("returnTotalHours");
        int taskDuration = 10 + 12 + 55 + 11 + 1;
        Task instance = new Task();
        int expResult = 89;
        int result = instance.returnTotalHours(taskDuration);
        assertEquals(expResult, result);
    }
    
}
