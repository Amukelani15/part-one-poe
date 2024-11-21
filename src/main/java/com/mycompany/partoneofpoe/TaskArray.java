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
public class TaskArray {
    
    //Arrays to store task details
    private String[] developers = new String[100];
    private String[] taskNames = new String[100];
    private String[] taskIDs = new String[100];
    private int[] taskDurations = new int[100];
    private String[] taskStatuses = new String[100];
    private int taskCount = 0;

    //Add task details to arrays
    public void addTask(String developer, String taskName, String taskID, int taskDuration, String taskStatus) {
        developers[taskCount] = developer;
        taskNames[taskCount] = taskName;
        taskIDs[taskCount] = taskID;
        taskDurations[taskCount] = taskDuration;
        taskStatuses[taskCount] = taskStatus;
        taskCount++;
    }

    //The displayTasksWithStatusDone() that displays the tasks with the status 'Done' which will contain the Developer name, Task name and Task Duration
    public void displayTasksWithStatusDone() {
        for (int i = 0; i < taskCount; i++) {
            if ("Done".equalsIgnoreCase(taskStatuses[i])) {
                JOptionPane.showMessageDialog(null,
                    "Developer: " + developers[i] +
                    "\nTask Name: " + taskNames[i] +
                    "\nTask Duration: " + taskDurations[i] + " hours");
            }
        }
    }

    //The displayLongestTask() that displays the tasks with the longest hours which will contain the Developer name and the Task's longest hours  
    public void displayLongestTask() {
        int maximumIndex = 0;
        for (int i = 1; i < taskCount; i++) {
            if (taskDurations[i] > taskDurations[maximumIndex]) {
                maximumIndex = i;
            }
        }
        JOptionPane.showMessageDialog(null,
            "Developer: " + developers[maximumIndex] +
            "\nTask Duration: " + taskDurations[maximumIndex] + " hours");
    }

    //The searchTaskByName() that allows the user to search a task by Task Name and displays the Task name, Developer name and the Task status 
    public void searchTaskByName(String taskName) {
        for (int i = 0; i < taskCount; i++) {
            if (taskNames[i].equalsIgnoreCase(taskName)) {
                JOptionPane.showMessageDialog(null,
                    "Task Name: " + taskNames[i] +
                    "\nDeveloper: " + developers[i] +
                    "\nTask Status: " + taskStatuses[i]);
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Task not found.");
    }

    //The searchTasksByDeveloper() that allows the user to search a task by Developer name and displays the Task name and the Task status
    public void searchTasksByDeveloper(String developerName) {
        boolean found = false;
        for (int i = 0; i < taskCount; i++) {
            if (developers[i].equalsIgnoreCase(developerName)) {
                JOptionPane.showMessageDialog(null,
                    "Task Name: " + taskNames[i] +
                    "\nTask Status: " + taskStatuses[i]);
                found = true;
            }
        }
        if (!found) {
            JOptionPane.showMessageDialog(null, "No tasks found for developer: " + developerName);
        }
    }

    //The deleteTaskByName() that allows the user to search a task by Task name and displays the Task name and deletes the details of that Task 
    public void deleteTaskByName(String taskName) {
        for (int i = 0; i < taskCount; i++) {
            if (taskNames[i].equalsIgnoreCase(taskName)) {
                for (int j = i; j < taskCount - 1; j++) {
                    developers[j] = developers[j + 1];
                    taskNames[j] = taskNames[j + 1];
                    taskIDs[j] = taskIDs[j + 1];
                    taskDurations[j] = taskDurations[j + 1];
                    taskStatuses[j] = taskStatuses[j + 1];
                }
                taskCount--;
                JOptionPane.showMessageDialog(null, "Task is deleted successfully.");
                return;
            }
        }
        JOptionPane.showMessageDialog(null, "Task not found.");
    }

    //The displayAllTasks() that displays the report that lists the full details of all the captured tasks which is the Developer name, Task name, Task ID, Task duration and the Task status
    public void displayAllTasks() {
        for (int i = 0; i < taskCount; i++) {
            JOptionPane.showMessageDialog(null,
                "Developer: " + developers[i] +
                "\nTask Name: " + taskNames[i] +
                "\nTask ID: " + taskIDs[i] +
                "\nTask Duration: " + taskDurations[i] + " hours" +
                "\nTask Status: " + taskStatuses[i]);
        }
    }
    
}
