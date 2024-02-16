package com.bridgelabz.consecutiveintegers;

public class ConsecutiveIntegers {
    public void checkIntegers(int num1,int num2,int num3){
        if(num1 + 1==num2 && num2 + 1==num3){
            System.out.println("They are consecutive integers ");
        }
        else {
            System.out.println("They are not consecutive integers ");
        }
    }
}
