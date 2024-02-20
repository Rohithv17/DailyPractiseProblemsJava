public class RemoveWhiteSpaces {
    public  void remove(String s){
        System.out.println("Before removal : " + s);
        s=s.replaceAll("\\s","");
        System.out.println("After removal "+s);
    }
}
