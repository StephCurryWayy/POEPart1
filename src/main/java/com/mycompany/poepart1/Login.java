/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.poepart1;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class Login {
     private String firstName;
    private String lastName;
    public String username;
    public String password;

   
    // Method to check username format
    public boolean checkUsername(String username) {
        return username.contains("_") && username.length() <= 5;
    }

    // Method to check password complexity
    public boolean checkPasswordComplexity(String password) {
        return password.length() >= 8 &&
               password.matches(".*[A-Z].*") && // Contains a capital letter
               password.matches(".*[0-9].*") && // Contains a number
               password.matches(".*[^a-zA-Z0-9].*"); // Contains a special character
    }
 // Method to register user and validate username and password
    public void registerUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter First Name: ");
        firstName = scanner.nextLine();

        System.out.print("Enter Last Name: ");
        lastName = scanner.nextLine();

        System.out.print("Enter Username: ");
        username = scanner.nextLine();
        if (checkUsername(username)) {
            System.out.println("Username successfully captured.");
        } else {
            System.out.println("Username incorrectly formatted, please ensure the username contains an underscore and is no more than 5 characters in length.");
            return;
        }

        System.out.print("Enter Password: ");
        password = scanner.nextLine();
        if (checkPasswordComplexity(password)) {
            System.out.println("Password successfully captured.");
        } else {
            System.out.println("Password is incorrectly formatted, please ensure the password is at least 8 characters in length, contains a capital letter, contains a number, and contains a special character.");
            return;
        }

        System.out.println("User registered successfully.");
    }

    // Method for user login
    public void loginUser() {
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter Username for Login: ");
        String loginUsername = scanner.nextLine();

        System.out.print("Enter Password for Login: ");
        String loginPassword = scanner.nextLine();

        if (loginUser(loginUsername, loginPassword)) {
            returnLoginStatus(true);
        } else {
            returnLoginStatus(false);
        }
    }

    // Method to verify login credentials
    public boolean loginUser(String loginUsername, String loginPassword) {
        return username.equals(loginUsername) && password.equals(loginPassword);
    }

    // Method to return login status message
    public void returnLoginStatus(boolean status) {
        if (status) {
            System.out.println("Welcome, " + firstName + " " + lastName + ". It is great to see you again.");
        } else {
            System.out.println("Username and/or password is incorrect.");
        }
    }
}