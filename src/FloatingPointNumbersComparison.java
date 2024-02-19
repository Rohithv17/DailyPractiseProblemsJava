public class FloatingPointNumbersComparison {
    public void compareNum(double a,double b){
        a=Math.round(a*1000);
        a=a/1000;
        b=Math.round(b*1000);
        b=b/1000;
        if(a==b){
            System.out.println("The floating point numbers are equal");
        }
        else {
            System.out.println("not equal");
        }
    }
}
