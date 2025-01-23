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
public class insertIT {
    
    public insertIT() {
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
     * Test o method, of class insert.
     */
    @Test
    public void testUserlist() {
      
    }

    /**
     * Test of show_user method, of class insert.
     */
    @Test
    public void testShow_user() {
       
    }

    /**
     * Test of main method, of class insert.
     */
    @Test
    public void testMain() {
      
    }
    public void testCheck() {
        System.out.println("check");
        
        String CustomerID = "1234";
        String ProductID = "1010";
        String ProductName = "yogat";
        String Quantity ="10" ;
        String PriceperUnit ="100";
        String Date = "01/02/2024";
        String TotalPrice ="100";
        String Region ="kandy";
        insert instance = new insert();
        instance.check(CustomerID,ProductID, ProductName,Quantity,PriceperUnit,Date,TotalPrice,Region  );
        
    }
    
}
