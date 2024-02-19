public class ArmstrongNumber {
    void checkNum(int num) {
        int ognumber=num;
        double result=0;
        int remainder;
        while (num > 0) {
            remainder = num % 10;  // gets last digit
            result = result + Math.pow(remainder, 3);
            num = num / 10;  // removes last digit
        }
        if(result==ognumber){
            System.out.println("Armstrong Number ");
        }
        else {
            System.out.println("Not an Armstrong Number");
        }
    }
}
