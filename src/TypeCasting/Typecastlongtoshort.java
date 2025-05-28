package TypeCasting;

public class Typecastlongtoshort {
    public static void main(String[] args){
        long phone_no=8971998365l;
        //short s=phone_no //Narrowing Impicit
        short s=(short) phone_no; //narrowing Explicit
        System.out.println(s);
    }
}
