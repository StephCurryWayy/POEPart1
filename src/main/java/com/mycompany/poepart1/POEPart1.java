/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.poepart1;
import java.util.Scanner;
/**
 *
 * @author RC_Student_lab
 */
public class POEPart1 {

    public static void main(String[] args) {
        Login userAccount = new Login();
        
        //Declarations
        String firstName;
        String lastName;
        String username;
        String password;
        
  try (Scanner se = new Scanner ( System.in)){
       // Prompt user for first name, last name, username, and password
        System.out.print("Enter First Name: ");
        firstName = se.next();

        System.out.print("Enter Last Name: ");
        lastName = se.next();

        System.out.print("Enter Username: ");
        username = se.next();

        System.out.print("Enter Password: ");
        password = se.nextLine();

        // Register the user with the provided details
        userAccount.registerUser(username, password, firstName, lastName);


        // Login Process
        System.out.print("Enter Username for Login: ");
        String loginUsername = se.next();

        System.out.print("Enter Password for Login: ");
        String loginPassword = se.next();

        // Check login credentials and display status
        boolean loginSuccess = userAccount.loginUser(loginUsername, loginPassword);
        userAccount.returnLoginStatus(loginSuccess);
    }
}
}
