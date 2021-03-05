package main;

import org.junit.Test;
import static org.junit.Assert.*;

public class BankChargeTest {
    
    public BankChargeTest() {
    }

    @Test
    public void testFee_60Plus_Success() 
    {
        System.out.println("Calculate fee for >=60 number of checks - success case");
        double i = 61.0;
        double expResult = 12.44;
        double result = BankCharge.Fee(i);
        assertEquals(expResult, result,0.0); 
    }
    
    @Test
    public void testFee_40To59_Success() 
    {
        System.out.println("Calculate fee for 40To59 number of checks - success case");
        double i = 34.0;
        double expResult = 12.72;
        double result = BankCharge.Fee(i);
        assertEquals(expResult, result, 0.0); 
    }
    
    @Test
    public void testFee_20To40_Success() 
    {
        System.out.println("Calculate fee for 20To40 number of checks - success case");
        double i = 25.0;
        double expResult = 12.0;
        double result = BankCharge.Fee(i);
        assertEquals(expResult, result, 0.0); 
    }
    
    @Test
    public void testFee_Below20_Success() 
    {
        System.out.println("Calculate fee for Below20 number of checks - success case");
        double i = 19.0;
        double expResult = 11.9;
        double result = BankCharge.Fee(i);
        assertEquals(expResult, result, 0.0); 
    }
    
    @Test
    public void testFee_0_Success() 
    {
        System.out.println("Calculate fee for 0 number of checks - success case");
        double i = 0.0;
        double expResult = 10.0;
        double result = BankCharge.Fee(i);
        assertEquals(expResult, result, 0.0); 
    }
    
    @Test
    public void testFee_60Plus_Failure() 
    {
        System.out.println("Calculate fee for >=60 number of checks - failure case");
        double i = 67.0;
        double expResult = 234.0;
        double result = BankCharge.Fee(i);
        assertNotEquals(expResult, result, 0.0); 
    }
    
    @Test
    public void testFee_40To59_Failure() 
    {
        System.out.println("Calculate fee for 40To59 number of checks - failure case");
        double i = 46.0;
        double expResult = 46.0;
        double result = BankCharge.Fee(i);
        assertNotEquals(expResult, result, 0.0); 
    }
    
    @Test
    public void testFee_20To40_Failure() 
    {
        System.out.println("Calculate fee for 20To39 number of checks - failure case");
        double i = 28.0;
        double expResult = 756.0;
        double result = BankCharge.Fee(i);
        assertNotEquals(expResult, result, 0.0); 
    }
    
    @Test
    public void testFee_Below20_Failure() 
    {
        System.out.println("Calculate fee for Below20 number of checks - failure case");
        double i = 19.0;
        double expResult = 345.0;
        double result = BankCharge.Fee(i);
        assertNotEquals(expResult, result, 0.0); 
    }
    
}
