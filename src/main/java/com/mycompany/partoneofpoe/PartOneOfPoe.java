/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.partoneofpoe;
import java.util.*;
import javax.swing.JDialog;
import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class PartOneOfPoe {

    public static void main(String[] args) {
        
        //creating an object of the Scanner
        Scanner sc = new Scanner(System.in);
        final JDialog dialog = new JDialog();
        dialog.setAlwaysOnTop(true);
        //Declarations
        String userName="";
        String password="";
        String firstName="";
        String lastName ="";
        String verUserName, verPassword;
        
        //Creating an object of the Login() method
        Login acc = new Login();
        
        //Prompting the user for registration and login
        System.out.println("=================== REGISTERING ======================");
        
        //A do-while loop in which the user enters their user name and it is checked if it meets the user name requirements 
        do {
            System.out.print("Please enter your user name: ");
            userName = sc.next();
            acc.setUserName(userName);
        }
        while(!acc.checkUserName(userName));
        
        //A do-while loop in which the user enters their password and it is checked if it meets the password complexity requirements 
        do {
            System.out.print("Please enter your password: ");
            password = sc.next();
            acc.setPassword(password);
        }
        while(!acc.checkPasswordComplexity(password));
        
        //The user is asked to input their first name 
        System.out.print("Please enter your first name: ");
        firstName = sc.next();
        acc.setFirstName(firstName);
        
        //The user is asked to input their last name
        System.out.print("Please enter your last name: ");
        lastName = sc.next();
        acc.setLastName(lastName);
        
        //The message the user will receive when they have registered successfully
        acc.registerUser("");
        
        //The login process after successful registration
        System.out.println("=================== LOGIN =====================");
        
        //A do-while loop that validates if the user name and password that are are entered for logging in are correct
        do {
            System.out.print("Please enter your user name: ");
            verUserName = sc.next();
        
            System.out.print("Please enter your password: ");
            verPassword = sc.next();
        }
        while(!acc.loginUser(verUserName ,  verPassword));
        
        //The message that will affirm the user that they have an account if they successfully logged in and registered
        System.out.println(acc.returnLoginStatus(firstName, lastName));
        
        
        
        
        
        //Adding part two of the POE which is the functionality of the application
        
        //Declarations
        String description = "";
        
        //Welcoming the user to the EasyKanban application after logging in successfully
        JOptionPane.showMessageDialog(null, "Welcome to EasyKanban");
        
        //Creating an object of the Task class
        Task task = new Task();
        //Creating an object of the TaskArray class
        TaskArray taskArray = new TaskArray();
        
        
        //Asking the user what they want to do through the options of adding tasks, show report OR if they want to exit
        int option = Integer.parseInt(JOptionPane.showInputDialog("Choose an option to perform:\n" + "(1)Add tasks\n" + "(2)Show report\n" + "(3)Quit"));
        
        boolean quit = false;
        //A while loop that will execute for the user to input what they want to do and loop again except if the user enter quit 
        while(!quit){
            switch(option) {
                //If the user chooses option 1 the system will execute the task features and at the end it will display the user's full task details
                case 1:
                    //Declaration
                    int totalHours = 0;
                    
                    //The user is asked to input the input the number of tasks they will perform
                    int numTasks = Integer.parseInt(JOptionPane.showInputDialog("Enter the number of tasks you want to perform:"));
                    
                    //A for-loop that will execute according to the number of tasks the user will perform
                    for(int i = 0; i < numTasks; i++ ){
                        JOptionPane.showMessageDialog(null, "Task number: " + (i));
                        
                        //The user is asked to input the name of the task
                        String name=JOptionPane.showInputDialog("Please enter the name of the task: ");
                        task.setName(name);
                        
                        //The user is asked to input the task description that is less than 50 characters and the task description is checked if it meets the requirements
                        do{
                            description = JOptionPane.showInputDialog("Please enter a short description of the task that is less than 50 characters");
                            task.setDescription(description);                         
                        }
                        while(!task.checkTaskDescription(description));
                        
                        //The user is asked to input the developer details which is their first name and last name
                        String developerDetails =JOptionPane.showInputDialog("Please enter the developer details (first name and last name):");
                        task.setDeveloperDetails(developerDetails);
                        
                        //The user is asked to input the task duration and the task duration is also added to the total hours after each and every task 
                        int taskDuration = Integer.parseInt(JOptionPane.showInputDialog("Please enter the duration of the task in hours:"));
                        task.setTaskDuration(taskDuration);
                        totalHours += taskDuration;
                        
                        //The system will display the task ID which contains the first two letters of the Task name, Task number and the last three letters assigned to the developer details 
                        String taskID =task.CreateTaskID(name, i, developerDetails);
                        task.setTaskID(taskID);
                        JOptionPane.showMessageDialog(null, "Task ID :" + task.getTaskID());
                        
                        
                        //The user is asked to input the task status from the options of to do, doing OR done
                        int status = Integer.parseInt(JOptionPane.showInputDialog("Select task status:\n" + "(1) To do\n" + "(2) Doing\n" + "(3) Done"));
                        
                        //Declaration
                        String taskStatus ="";
                        
                        switch(status) {
                            case 1:
                                taskStatus = "To do";
                                break;
                            case 2:
                                taskStatus = "Doing";
                                break;
                            case 3:
                                taskStatus = "Done";
                                break;
                            default:
                                //If the user enters a number not between one and 3 for the task status they are prompted again to enter the task status input
                                JOptionPane.showMessageDialog(null, "Invalid input. Setting status to 'To do'.");
                                taskStatus = "To do";
                            }
                        task.setTaskStatus(taskStatus);
                        
                        //adding the array contents into TaskArray 
                        taskArray.addTask(developerDetails, name, taskID, taskDuration, taskStatus);
                        
                           
                        //The system then displays the task's full details                       
                        JOptionPane.showMessageDialog(null, "THE TASK'S FULL DETAILS \n" + task.printTaskDetails(taskStatus, developerDetails, i, name, description, taskID, taskDuration, totalHours));
                        
                        //A for-loop that displays the total hours and increments the number of total of hours inputted 
                        int[]totHours = {};
                        for (int z = 0; z < totHours.length; z++){
                             JOptionPane.showMessageDialog(null, task.returnTotalHours(taskDuration));
                         }
                    }
                    
                    //Adding part 3 of the POE which is to store data and display task report
                    boolean stop = false;
                    //A do-while loop that excutes when the user wants to do something with in the "Report list" and stops when the user enters number 7 for exiting
                    do{
                        //The report list that the user will choose from when they want to perform the specific tasks listed
                        int reportList = Integer.parseInt(JOptionPane.showInputDialog("Choose an option:\n" +
                        "(1) Displays the tasks with status 'Done'\n" +
                        "(2) Displays the task with the longest duration\n" +
                        "(3) Searches for a task by name\n" +
                        "(4) Searches for a tasks by developer name\n" +
                        "(5) Deletes a task by task name\n" +
                        "(6) Display all tasks\n" +
                        "(7) stop"));
                    
                    switch (reportList) {
                        case 1://When the user chooses (1) the displayTasksWithStatusDone() in the TaskArray class will be called for execution and displays the statuses with status done
                            taskArray.displayTasksWithStatusDone();
                            break;
                        case 2://When the user chooses (2) the displayLongestTask() in the TaskArray class will be called for execution and displays the tasks with the longest hours
                            taskArray.displayLongestTask();
                            break;
                        case 3://When the user chooses (3) the displayTasksByName() in the TaskArray class will be called for execution and displays the task that is inputted by the user according to the task name
                            String searchName = JOptionPane.showInputDialog("Please enter task name to search:");
                            taskArray.searchTaskByName(searchName); 
                            break;
                        case 4://When the user chooses (4) the displayTasksByDeveloper() in the TaskArray class will be called for execution and displays the task that is inputted by the user according to the developer name 
                            String searchDeveloper = JOptionPane.showInputDialog("Please enter developer name to search:");
                            taskArray.searchTasksByDeveloper(searchDeveloper); 
                            break;
                        case 5://When the user chooses (5) the deleteTasksByName() in the TaskArray class will be called for execution and displays the task that is inputted by the user according to the task name
                            String deleteName = JOptionPane.showInputDialog("Please enter task name to delete:");
                            taskArray.deleteTaskByName(deleteName); 
                            break;
                        case 6:/*When the user chooses (6) the displayAllTasks() in the TaskArray class will be called for execution and will display the a report of tasks.
                                Note that the Deleted tasks will not be displayed when the displayAllTasks() method executes */
                            taskArray.displayAllTasks();
                            break;
                        case 7://When the user chooses (7) the program ends
                            System.exit(0);
                            stop = true;
                            break;
                            
                        default:
                            JOptionPane.showMessageDialog(null, "Invalid option.");
                            break;
                    }
                    }
                    while(!stop);
                    break;
                case 2:
                    //If the user chooses option 2 the system will display coming soon
                    JOptionPane.showMessageDialog(null, "Coming soon");
                    break;
                case 3:
                    //If the user chooses option 3 the system will exit
                    System.exit(0);
                    quit = true;
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Invalid input please enter a valid number from 1 to 3");
                   
            }
            //If the user did not input option 3 for quiting the user will be asked again to input the option they want to perform
            option = Integer.parseInt(JOptionPane.showInputDialog("Choose an option to perform: \n" + "(1)Add tasks\n" + "(2)Show report\n" + "(3)Quit"));
        }
        //dialog.Dispse();
    }
}
