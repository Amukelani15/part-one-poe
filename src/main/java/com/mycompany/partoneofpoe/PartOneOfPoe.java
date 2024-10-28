/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.partoneofpoe;
import java.util.*;
import javax.swing.JOptionPane;

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
        
        
        
        
        
        //Adding part two of the POE which is the functionality of the application
        //Welcoming the user to EasyKanban after a successful login
        
        //Declarations
        String description = "";
        
        //Welcoming the user
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        int option = Integer.parseInt(JOptionPane.showInputDialog("Choose an option to perform:\n" + "(1)Add tasks\n" + "(2)Show report\n" + "(3)Quit"));
        
        //Creating an object of the Task class
        Task task = new Task();
        
        boolean quit = false;
        while(!quit){
            switch(option) {
                case 1:
                    int numTasks = 0;
                    
                    numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks you want perform"));
                    
                    for(int numberOfTasks = 0; numberOfTasks < numTasks;numberOfTasks++ ){
                        JOptionPane.showMessageDialog(null, "Number of tasks: " + numberOfTasks);
                        
                        String name=JOptionPane.showInputDialog("Please enter the name of the task: ");
                        task.setName(name);
                        
                        do{
                            JOptionPane.showInputDialog("Please enter a short description of the task that is less than 50 characters");
                            task.setDescription(description);                         
                        }
                        while(!task.checkTaskDescription(description));
                        
                        String developerDetails =JOptionPane.showInputDialog("Please enter the developer details (first name and las name):");
                        task.setDeveloperDetails(developerDetails);
                        
                        //task duration
                        int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Please enter the duration of the task:"));
                        task.setTaskDuration(taskDuration);
                        
                        //Task ID
                        String taskID =task.CreateTaskID(name, numberOfTasks, developerDetails);
                        task.setTaskID(taskID);
                        JOptionPane.showMessageDialog(null, "Task id :" + task.getTaskID());
                        
                        //task status
                        String taskStatus = JOptionPane.showInputDialog("Please select a task status:\n" + "(1)To do\n" + "(2)Done\n" + "(3)Doing");
                        //int status = Integer.parseInt(taskStatus);
                        task.setTaskStatus( taskStatus);
                        
                        //full details                       
                        JOptionPane.showMessageDialog(null, "THE TASK'S FULL DETAILS \n" + task.printTaskDetails(taskStatus, developerDetails, numberOfTasks, taskID, description, taskID, taskDuration));
                        task.printTaskDetails(taskStatus, developerDetails, numberOfTasks, taskID, description, taskID, taskDuration);
                    }
                    break;
                case 2:
                    JOptionPane.showMessageDialog(null, "Coming soon");
                    break;
                case 3:
                   System.exit(0);
                   quit = true;
                   break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid input please enter a valid number from 1 to 3");
                   
            }
            option = Integer.parseInt(JOptionPane.showInputDialog("Choose an option to perform: \n" + "(1)Add tasks\n" + "(2)Show report\n" + "(3)Quit"));
        }
         
    }
}
