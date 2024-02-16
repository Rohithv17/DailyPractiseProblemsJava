package com.bridgelabz.dailypractise;

public class CopyElements {
    public void copyElements(int[]a){
        int n= a.length;
        int[]b=new int[n];
        System.out.println("Array a is ");
        for(int i=0;i<a.length;i++){
            System.out.println(a[i]+" ");
        }
        System.out.print("Array b is ");
        for(int j=0;j<a.length;j++){
            b[j]=a[j];
            System.out.print(b[j]+" ");

        }

    }
}
