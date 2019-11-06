/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package adapterpattern;

import java.util.Date;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author t7047098
 */
public class AdapterTest {
    final Website w;
    Adapter instance;
    
    public AdapterTest() {
        w = new ETicket("A-B","12/07/2019-12/14/2019",21.73,"non","Student");
    }
    
    @BeforeClass
    public static void setUpClass() 
    {
        System.out.println("Series of tests to check that all the data has been adapter properly.");  
    }
    
    @AfterClass
    public static void tearDownClass() 
    {
        System.out.println("Tests Complete.");
    }
    
    @Before
    public void setUp() 
    { 
        instance = new Adapter(w);
        System.out.println("The ETicket Contains the Following Information: " + w.toString());
        System.out.print("The test that will be carried out is: ");
    }
    
    @After
    public void tearDown() 
    {
        instance = null;
    }

    /**
     * Test of getOrigin method, of class Adapter.
     */
    @Test
    public void testGetOrigin() {
        System.out.println("Test getOrigin");
        String expResult = "A";
        String result = instance.getOrigin();
        assertEquals(expResult, result);
        System.out.println("The Value of the Paper Ticket Origin is: " + instance.getOrigin());
        System.out.println("Test Was Completed Correctly");
    }

    /**
     * Test of getDestination method, of class Adapter.
     */
    @Test
    public void testGetDestination() {
        System.out.println("Test getDestination");
        String expResult = "B";
        String result = instance.getDestination();
        assertEquals(expResult, result);
        System.out.println("The Value of the Paper Ticket Destination is: " + instance.getDestination());
        System.out.println("Test Was Completed Correctly");
    }

    /**
     * Test of getTicketType method, of class Adapter.
     */
    @Test
    public void testGetTicketType() {
        System.out.println("Test getTicketType");
        String expResult = "non;Student";
        String result = instance.getTicketType();
        assertEquals(expResult, result);
        System.out.println("The Value of the Paper ticket Ticket Type is: " + instance.getTicketType());
        System.out.println("Test Was Completed Correctly");
    }

    /**
     * Test of getPrice method, of class Adapter.
     */
    @Test
    public void testGetPrice() {
        System.out.println("Test getPrice");
        double expResult = 21.73;
        double result = instance.getPrice();
        assertEquals(expResult, result, 0.0);
        System.out.println("The Value of the Paper Ticket Price is: " + instance.getPrice());
        System.out.println("Test Was Completed Correctly");
    }

    /**
     * Test of startDate method, of class Adapter.
     */
    @Test
    public void testStartDate() {
        System.out.println("Test startDate");
        Date expResult = new Date("12/07/2019");
        Date result = instance.startDate();
        assertEquals(expResult, result);
        System.out.println("The Value of the Paper Ticket Start Date is: " + instance.startDate().toGMTString());
        System.out.println("Test Was Completed Correctly");
    }

    /**
     * Test of endDate method, of class Adapter.
     */
    @Test
    public void testEndDate() {
        System.out.println("Test endDate");
        Date expResult = new Date("12/14/2019");
        Date result = instance.endDate();
        assertEquals(expResult, result);
        System.out.println("The Value of the Paper Ticket End Date is: " + instance.endDate().toGMTString());
        System.out.println("Test Was Completed Correctly");
    }
    
}
