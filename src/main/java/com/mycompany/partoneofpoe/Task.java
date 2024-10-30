/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.partoneofpoe;

import javax.swing.JOptionPane;

/**
 *
 * @author RC_Student_lab
 */
public class Task {
    
    //The attributes of the Task class
    private String name;
    private int numberOfTasks;
    private String description;
    private String developerDetails;
    private int taskDuration;
    private String taskID;
    private String taskStatus;
    
    //Setters and getters of all the attributes 
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getNumberOfTasks() {
        return numberOfTasks;
    }

    public void setNumberOfTasks(int numberOfTasks) {
        this.numberOfTasks = numberOfTasks;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDeveloperDetails() {
        return developerDetails;
    }

    public void setDeveloperDetails(String developerDetails) {
        this.developerDetails = developerDetails;
    }

    public int getTaskDuration() {
        return taskDuration;
    }

    public void setTaskDuration(int taskDuration) {
        this.taskDuration = taskDuration;
    }

    public String getTaskID() {
        return taskID;
    }

    public void setTaskID(String taskID) {
        this.taskID = taskID;
    }

    public String getTaskStatus() {
        return taskStatus;
    }

    public void setTaskStatus(String taskStatus) {
        this.taskStatus = taskStatus;
    }
    
    //The method that checks that the task description is less than 50 characters and returns the appropriate message according to the number of characters
    public boolean checkTaskDescription(String description){
        boolean found = false;
        
        if(description.length() <= 50){
            
           JOptionPane.showMessageDialog(null, "Task successfully captured");
           found = true;
        }
        else{
            
            JOptionPane.showMessageDialog(null, "Please enter a task description of less than 50 characters.");
            found = false;
        }
        return found;
    }
    
    //A method that creates and returns a Task ID which contains the first two letters of the Task name, a colon, and contains the task number, a colon and contains the last three letters assigned to the developer's details 
    public String CreateTaskID(String name, int number, String devName){
       String ID = name.substring(0, 2) + ":" + number + ":" + devName.substring(devName.length()- 3);
        
        return ID.toUpperCase();
    }
    
    //The method that returns the full details of each task which is the Task status, developer details, Task number, Task name, Task description, Task ID, Task duration and Totak hours
    public String printTaskDetails(String taskStatus, String developerDetails, int numberOfTasks, String taskName, String description, String taskID, int taskDuration, int total){
        return "Task status: " + taskStatus + "\nDeveloper details: " + developerDetails + "\nTask number: " + numberOfTasks + 
                "\nTask name: " + name + "\nTask description: " + description + "\nTask ID: " + taskID +
                "\nTask duration: " + taskDuration + "hours" + "\nTotal hours: " + total + "hours";
    }
    
    //A method that returns the number of total hours after each task
    public int returnTotalHours(int taskDuration){
        int totalHours = taskDuration;
        return totalHours;
    }
}
