package org.testdiversity.example;

class Calculator{

    public int add(int x, int y){
        return x+y;
    }

    public int subtract(int x, int y){
        return x-y;
    }

    public int multiplication(int x, int y){
        return x*y;
    }

    public int division(int x, int y) throws Exception {
        int result = 0;

        try{
            result = x/y;
        } catch(ArithmeticException e) {
            System.out.println("Cannot divide by zero");
        }

        return result;

    }

    public int modulo(int x, int y){
        return x%y;
    }

    public int factorial (int x) throws Exception{
        if(x < 0){
            throw new Exception("Negative factorial not possible");
        }
        if(x == 0 || x == 1){
            return 1;
        }
        int sum = 1;
        for(int i = x; i > 0; i--){
            sum *= i;
        }
        return sum;
    }
}