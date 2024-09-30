/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit5TestClass.java to edit this template
 */
package com.mycompany.poepart1;


import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

/**
 *
 * @author RC_Student_lab
 */
public class LoginTest {
    
   

    /**
     * Test of main method, of class Login.
     */
    @Test
    public void testMain() {
        System.out.println("main");
        String[] args = null;
        Login.main(args);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
      @Test
    public void testUsernameIncorrectlyFormatted() {
        Login userAccount = new Login ();
        String username = "kyl!!!!!!";
        assertFalse(userAccount.checkUsername(username), 
                    "Username is incorrectly formatted. Please ensure that your username contains an underscore and is no more than 5 characters long.");
    }

    @Test
    public void testPasswordMeetsComplexityRequirements() {
        Login  userAccount = new Login ();
        String password = "Ch&&sec@99!";
        assertTrue(userAccount.checkPasswordComplexity(password), 
                   "Password incorrectly formatted. Please ensure that the password is at least 8 characters, contains a capital letter, a number and a special character.");
    }

    @Test
    public void testPasswordDoesNotMeetComplexityRequirements() {
        Login  userAccount = new Login ();
        String password = "password";
        assertFalse(userAccount.checkPasswordComplexity(password), 
                    "Password incorrectly formatted. Please ensure that the password is at least 8 characters, contains a capital letter, a number and a special character.");
    }

    @Test
    public void testLoginSuccessful() {
        Login  userAccount = new Login ();
        userAccount.username = "test_user";
        userAccount.password = "Test@1234";

        assertTrue(userAccount.loginUser("test_user", "Test@1234"), 
                   "Login should be successful.");
    }

    @Test
    public void testLoginFailed() {
        Login  userAccount = new Login ();
        userAccount.username = "test_user";
        userAccount.password = "Test@1234";

        assertFalse(userAccount.loginUser("wrong_user", "wrong_password"), 
                    "Login should fail.");
    }

    @Test
    public void testUsernameCorrectlyFormattedTrue() {
        Login  userAccount = new Login();
        assertTrue(userAccount.checkUsername("kyl_1"));
    }

    @Test
    public void testPasswordMeetsComplexityRequirementsTrue() {
        Login userAccount = new Login();
        assertTrue(userAccount.checkPasswordComplexity("Ch&&sec@99!"));
    }

    @Test
    public void testPasswordDoesNotMeetComplexityRequirementsFalse() {
       Login  userAccount = new Login();
        assertFalse(userAccount.checkPasswordComplexity("password"));

    /**
     * Test of registerUser method, of class Login.
     */
    
}
}
