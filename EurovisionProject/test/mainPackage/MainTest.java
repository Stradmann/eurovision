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
public class MainTest {
    
    public MainTest() {
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
     * Test of countryQuicksort method, of class Main.
     */
    @Test
    public void testCountryQuicksort() {
        System.out.println("countryQuicksort");
        Country[] A = new Country[5];
        Country[] sortedA = new Country[5];
        String[] countryNames = {"Alemania", "Dinamarca", "Belgica", "Holanda", "Polonia"};
        int[] countryPoints = {36, 47, 125, 92, 24};
        for(int i = 0; i < A.length; i++){
            A[i] = new Country();
            A[i].name = countryNames[i];
            A[i].totalPoints = countryPoints[i];
        }
        String[] sortedCountryNames = {"Polonia", "Alemania", "Dinamarca", "Holanda", "Belgica"};
        int[] sortedCountryPoints = {24, 36, 47, 92, 125};
        for(int i = 0; i < sortedA.length; i++){
            sortedA[i] = new Country();
            sortedA[i].name = sortedCountryNames[i];
            sortedA[i].totalPoints = sortedCountryPoints[i];
        }
        int izq = 0;
        int der = A.length - 1;
        Main.countryQuicksort(A, izq, der);
        for(int i = 0; i < A.length; i++){
            assertEquals(sortedA[i].name, A[i].name);
            assertEquals(sortedA[i].totalPoints, A[i].totalPoints);
        }
    }
    
}
