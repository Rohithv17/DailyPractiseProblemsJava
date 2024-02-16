package com.bridgelabz.neonnumber;

public class NeonNumber {             // sum of the digits after squaring the given  num has to be equal to the given number
    public void checkNeonNum(int num){
        int squarenum= num*num;
        int sum=0;
        System.out.println("Square of the given num is "+squarenum);
        while(squarenum>0){
            int digit = squarenum%10;
            sum=sum+digit;
            squarenum=squarenum/10;
        }
        System.out.println("Sum of the digits is : "+sum);
        if(sum==num){
            System.out.println("It is a Neon number ");
        }
        else {
            System.out.println("Not a neon number");
        }
    }
}
