/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import code.usercode;
import java.util.ArrayList;
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
public class updatedIT {
    
    public updatedIT() {
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
     * Test of  method, of class updated.
     */
    @Test
    public void testUserlist() {
        
    }

    /**
     * Test of show_user method, of class updated.
     */
    @Test
    public void testShow_user() {
       
    }

    /**
     * Test of main method, of class updated.
     */
    @Test
    public void testMain() {
       
    }
    public void testCheck() {
        System.out.println("check");
        
        String TransactionID = "1";
        String Quantity ="10" ;
        String PriceperUnit = "100";
        String TotalPrice = "1000";
        updated instance = new updated();
        instance.check( TransactionID,Quantity,PriceperUnit,TotalPrice );
        
    }
    
}
