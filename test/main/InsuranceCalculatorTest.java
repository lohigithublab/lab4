package main;

import org.junit.Test;
import static org.junit.Assert.*;


public class InsuranceCalculatorTest {
    
    public InsuranceCalculatorTest() {
    }
    
    @Test
    public void testCost_Sucess() 
    {
        System.out.println("Insurance calculator for the age 33 - success case");
        double x = 33;
        double expResult = 465.0;
        double result = InsuranceCalculator.cost(x);
        assertEquals(expResult, result, 0.0);
    }

    @Test
    public void testCost_Failure() 
    {
        System.out.println("Insurance calculator for the age 30 - failure case");
        double x = 30;
        double expResult = 459.0;
        double result = InsuranceCalculator.cost(x);
        assertNotEquals(expResult, result, 0.0);
    }
}
