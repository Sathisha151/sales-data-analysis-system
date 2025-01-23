/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author Sathisha
 */
public class ChangePasswordIT {
    
    public ChangePasswordIT() {
    }
    
    @BeforeClass
    public static void setUpClass() {
    }
    
    @AfterClass
    public static void tearDownClass() {
    }
    
    @Before
    public void setUp() {
    }
    
    @After
    public void tearDown() {
    }

    /**
     * Test of main method, of class ChangePassword.
     */
    @Test
    public void testMain() {
       
    }
     public void testCheck() {
        System.out.println("check");
        String username = "admin";
        String currentPassword = "admin123";
        String newPassword ="admin1234";
        String confirmPassword ="admin1234";
        ChangePassword instance = new  ChangePassword();
        instance.check(username,currentPassword,newPassword,confirmPassword);
        
    }
    
}
