public class NegativeDominant {
    public  void calculate(int[]a){
        int negcount=0,poscount=0;
        for(int i=0;i< a.length;i++){
            if(a[i]<0){
                negcount ++;
            }
            else {
                poscount++;
            }
        }
        if(negcount>poscount){
            System.out.println("Negative Dominant");
        }
        else if(negcount==poscount) {
            System.out.println("Equal");
        }
        else {
            System.out.println("Positive Dominant");
        }
    }
}
