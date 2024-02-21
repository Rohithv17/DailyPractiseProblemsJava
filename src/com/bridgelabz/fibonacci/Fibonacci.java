package com.bridgelabz.fibonacci;

public class Fibonacci {
    static void fibo(){
        int n1=0;
        int n2=1;
        System.out.print(n1+" "+n2);
        int size=15;
        for(int i=2;i<size;i++){
            int n3=n1+n2;
            System.out.print(" "+n3+" ");
            n1=n2;
            n2=n3;
        }


    }

    public static void main(String[] args) {
        fibo();
    }
}
