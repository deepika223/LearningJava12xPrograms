package TypeCasting;

public class Typecasting_Narrowing {
    public static void main(String[] args){
        int val=300;
        //byte b=val;//Narrowing--Implicit JVM will do it--Data loss will be there
        byte b1=(byte) val;//Narrowing--Explicit JVM will do it--Data loss will be there
        System.out.println(b1);
    }
}
