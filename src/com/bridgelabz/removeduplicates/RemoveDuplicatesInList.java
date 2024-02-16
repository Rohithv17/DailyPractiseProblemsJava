package com.bridgelabz.removeduplicates;

import java.util.ArrayList;
import java.util.Arrays;

public class RemoveDuplicatesInList {
    public static void main(String[] args) {
        ArrayList<Integer>a1=new ArrayList<>(Arrays.asList(1,4,5,5,6,7,8,9,9,0));
        ArrayList<Integer>a2=new ArrayList<>();
        for(Integer b:a1){
            if(!a2.contains(b)){
                a2.add(b);
            }
        }
        System.out.println("New list is "+a2);
    }
}
