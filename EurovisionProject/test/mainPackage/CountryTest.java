/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package mainPackage;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author enric
 */
public class CountryTest {
    
    public CountryTest() {
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
     * Test of toVote method, of class Country.
     */
    @Test
    public void testToVote() {
        System.out.println("toVote");
        int selfIndex = 0;
        Country instance = new Country();
        int expResult = 10;
        int[] votedCountries = instance.toVote(selfIndex);
        int result = votedCountries.length;
        assertEquals(expResult, result);
        
    }

    /**
     * Test of toString method, of class Country.
     */
    @Test
    public void testToString() {
        System.out.println("toString");
        Country instance = new Country();
        instance.name = "ALEMANIA";
        instance.totalPoints = 125;
        String expResult = "                                ALEMANIA       125";
        String result = instance.toString();
        assertEquals(expResult, result);
    }
    
}
