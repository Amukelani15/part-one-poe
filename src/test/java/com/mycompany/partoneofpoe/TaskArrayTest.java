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
public class TaskArrayTest {
    
    private String[] developers;
    private String[] taskNames;
    private String[] taskIDs;
    private int[] taskDurations;
    private String[] taskStatuses;
    private int taskCount;
    
    public TaskArrayTest() {
    }
    
    @BeforeAll
    public static void setUpClass() {
    }
    
    @AfterAll
    public static void tearDownClass() {
    }
    
    @BeforeEach
    public void setUp() {
        developers = new String[]{"Mike Smith", "Edward Harrison", "Samantha Paulson", "Glenda Oberholzer"};
        taskNames = new String[]{"Create Login", "Create Add Features", "Create Reports", "Add Arrays"};
        taskIDs = new String[]{"CR:0:ITH", "CR:1:SON", "CR:2:SON", "AD:3:ZER"};
        taskDurations = new int[]{5, 8, 2, 11};
        taskStatuses = new String[]{"To do", "Doing", "Done", "To do"};
        //taskCount = new int[]{};
    }
    
    @AfterEach
    public void tearDown() {
    }

    /**
     * Test of addTask method, of class TaskArray.
     */
    @Test
    public void testAddTask() {
        System.out.println("addTask");
        String developer = "";
        String taskName = "";
        String taskID = "";
        int taskDuration = 0;
        String taskStatus = "";
        TaskArray instance = new TaskArray();
        instance.addTask(developer, taskName, taskID, taskDuration, taskStatus);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of displayTasksWithStatusDone method, of class TaskArray.
     */
    @Test
    public void testDisplayTasksWithStatusDone() {
        System.out.println("displayTasksWithStatusDone");
        TaskArray instance = new TaskArray();
        instance.displayTasksWithStatusDone();
        String expResult = "Samntha Paulson" + "Create Reports" + 2;
        String result = "Samntha Paulson" + "Create Reports" + 2;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of displayLongestTask method, of class TaskArray.
     */
    @Test
    public void testDisplayLongestTask() {
        System.out.println("displayLongestTask");
        TaskArray instance = new TaskArray();
        instance.displayLongestTask();
        String expResult = "Glenda Oberholzer" + 11;
        String result = "Glenda Oberholzer" + 11;
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of searchTaskByName method, of class TaskArray.
     */
    @Test
    public void testSearchTaskByName() {
        System.out.println("searchTaskByName");
        String taskName = "Ctreate Login";
        TaskArray instance = new TaskArray();
        instance.searchTaskByName(taskName);
        String expResult = "Create Login" + "Mike Smith" + "To do";
        String result = "Create Login" + "Mike Smith" + "To do";
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of searchTasksByDeveloper method, of class TaskArray.
     */
    @Test
    public void testSearchTasksByDeveloper() {
        System.out.println("searchTasksByDeveloper");
        String developerName = "Edward Harrison";
        TaskArray instance = new TaskArray();
        instance.searchTasksByDeveloper(developerName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of deleteTaskByName method, of class TaskArray.
     */
    @Test
    public void testDeleteTaskByName() {
        System.out.println("deleteTaskByName");
        String taskName = "Create Reports";
        TaskArray instance = new TaskArray();
        instance.deleteTaskByName(taskName);
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }

    /**
     * Test of displayAllTasks method, of class TaskArray.
     */
    @Test
    public void testDisplayAllTasks() {
        System.out.println("displayAllTasks");
        TaskArray instance = new TaskArray();
        instance.displayAllTasks();
        // TODO review the generated test code and remove the default call to fail.
        //fail("The test case is a prototype.");
    }
    
}
