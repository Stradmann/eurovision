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
 * @author ausias
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
    }

    /**
     * Test of sumContryPoints method, of class PointsTable.
     */
    @Test
    public void testSumContryPoints() {
        System.out.println("sumContryPoints");
        int countryIndex = 0;
        int expResult = 195;
        PointsTable.initializePointsTable();
        int punts[] = {1, 2, 3, 4, 5, 5, 6, 6, 7, 7, 0, 0, 0, 0, 0, 0, 8, 8, 9, 9, 21, 22, 23, 24, 25};
        int offset = 0;

        for (int i = 0; i < PointsTable.table.length; i++) {
            if (PointsTable.table[i][countryIndex] != -1) {
                PointsTable.table[i][countryIndex] = punts[i + offset];
            } else {
                offset = -1;
            }

        }

        int result = PointsTable.sumContryPoints(countryIndex);
        assertEquals(expResult, result);
    }

    /**
     * Test of countPointType method, of class PointsTable.
     */
    @Test
    public void testCountPointType() {
        System.out.println("countPointType");
        int x = 12;
        int offset = 0;
        int col = 0;
        int punts[] = {1, 2, 3, 4, 5, 5, 6, 6, 7, 7, 0, 0, 0, 0, 12, 12, 8, 8, 9, 9, 11, 10, 11, 11, 12};

        for (int i = 0; i < PointsTable.table.length; i++) {
            if (PointsTable.table[i][col] != -1) {
                PointsTable.table[i][col] = punts[i + offset];
            } else {
                offset = -1;
            }
        }

        int[] expResult = {0};
        int[] result = PointsTable.countPointType(x);
        for (int i = 0; i < result.length; i++) {
            assertEquals(expResult[i], result[i]);
        }

    }

    /**
     * Test of maxCount method, of class PointsTable.
     */
    @Test
    public void testMaxCount() {
        System.out.println("maxCount");
        int x = 12;
        int expResult = 3;
        int col = 0;
        int offset = 0;
        int punts[] = {1, 2, 3, 4, 5, 5, 6, 6, 7, 7, 0, 0, 0, 0, 12, 12, 8, 8, 9, 9, 11, 10, 11, 11, 12};

        for (int i = 0; i < PointsTable.table.length; i++) {
            if (PointsTable.table[i][col] != -1) {
                PointsTable.table[i][col] = punts[i + offset];
            } else {
                offset = -1;
            }
        }
        int result = PointsTable.maxCount(x);
        assertEquals(expResult, result);
    }

}
