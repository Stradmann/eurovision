/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/UnitTests/JUnit4TestClass.java to edit this template
 */

import mainPackage.PointsTable;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;
import static org.junit.Assert.*;

/**
 *
 * @author 13168
 */
public class PointsTableTest {
    
    public PointsTableTest() {
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
     * Test of initializePointsTable method, of class PointsTable.
     */
    @Test
    public void testInitializePointsTable() {
        System.out.println("initializePointsTable");
        PointsTable.initializePointsTable();
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of assignCountryPoints method, of class PointsTable.
     */
    @Test
    public void testAssignCountryPoints() {
        System.out.println("assignCountryPoints");
        int countryIndex = 0;
        int[] votedCountries = null;
        PointsTable.assignCountryPoints(countryIndex, votedCountries);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of sumContryPoints method, of class PointsTable.
     */
    @Test
    public void testSumContryPoints() {
        System.out.println("sumContryPoints");
        int countryIndex = 0;
        int expResult = 0;
        int result = PointsTable.sumContryPoints(countryIndex);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of countPointType method, of class PointsTable.
     */
    @Test
    public void testCountPointType() {
        System.out.println("countPointType");
        int x = 0;
        int[] expResult = null;
        int[] result = PointsTable.countPointType(x);
        assertArrayEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }

    /**
     * Test of maxCount method, of class PointsTable.
     */
    @Test
    public void testMaxCount() {
        System.out.println("maxCount");
        int x = 0;
        int expResult = 0;
        int result = PointsTable.maxCount(x);
        assertEquals(expResult, result);
        // TODO review the generated test code and remove the default call to fail.
        fail("The test case is a prototype.");
    }
    
}
