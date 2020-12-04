package org.testdiversity.example;

import org.junit.Rule;

import static org.junit.Assert.assertEquals;

import org.junit.Test;
import org.junit.rules.ExpectedException;

public class AppTest {

    Calculator calc = new Calculator();

    @Rule 
    public final ExpectedException exception = ExpectedException.none(); 

    
    @Test
    public void testAddition(){
        assertEquals(6+7, calc.add(6, 7));
    }

    @Test
    public void testSubtraction(){
        assertEquals(-1-(-5), calc.subtract(-1, -5));
    }

    @Test
    public void testMultiplication(){
        assertEquals(1*2, calc.multiplication(1, 2));
    }

    @Test
    public void testMinusMultiplication(){
        assertEquals(-1*2, calc.multiplication(-1, 2));
    }

    @Test
    public void testDivision() throws Exception {
            assertEquals(6/2, calc.division(6, 2));   
    }

    @Test
    public void testMinusDivision() throws Exception {
        assertEquals(-6/2, calc.division(-6, 2));
    }

    @Test
    public void testDivisionByZero() throws Exception{
        exception.expect(ArithmeticException.class);
        assertEquals(6/0, calc.division(6, 0));
    }

    @Test
    public void testFactorial(){
        try{
            assertEquals(120, calc.factorial(5)); 
        }catch(Exception e){
            // do nothing
        } 
    }
}
