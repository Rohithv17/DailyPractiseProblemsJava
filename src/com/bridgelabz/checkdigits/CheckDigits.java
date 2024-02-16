package com.bridgelabz.checkdigits;

public class CheckDigits {
    public  boolean checkDigits(int num) {
        int digit;
        while (num != 0) {
            digit = num % 10;

            if (digit % 2 != 0) {
                return false;

            }
            num = num / 10;
        }
        return true;
    }
}
