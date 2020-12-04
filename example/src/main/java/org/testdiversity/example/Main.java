package org.testdiversity.example;

/**
 * Hello world!
 *
 */
public class Main {
    public static void main( String[] args ){
        Calculator calc = new Calculator();
        try{
            int sum = calc.subtract(-5,-8);
            System.out.println(sum);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
