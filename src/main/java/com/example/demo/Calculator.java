package com.example.demo;

public class Calculator implements ICalculator {

    public Calculator() {
       
    }

    @Override
    public int plus(int number1, int number2) {
        return number1 + number2;
    }

    @Override
    public int minus(int number1, int number2) {
        return number1 - number2;
    }

}
