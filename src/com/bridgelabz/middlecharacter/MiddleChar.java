package com.bridgelabz.middlecharacter;

public class MiddleChar {
    public void findMiddleChar(String s){
        int length=s.length();

        if(length%2==0){
            System.out.println("The middle element is : "+s.charAt(length/2-1));
        }
        else {
            System.out.println("The middle element is "+ s.charAt(length/2));
        }



        }
    }

