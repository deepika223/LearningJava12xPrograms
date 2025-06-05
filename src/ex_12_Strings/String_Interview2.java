package ex_12_Strings;

public class String_Interview2 {
    public static void main(String[] args) {

        String s1 = "Hello";   //1 string present in String constant pool
        String s4 = "Hello";   //1 string present in String constant pool

        String s2=new String("Hello"); //1 string present in Object area
        String s3=new String("Hello"); //2 strings present in Object area
        String s5=new String("hello"); //3 strings present in Object area

        // == ->comparison -->String checks the reference location
        System.out.println(s1==s3);  //false
        System.out.println(s1==s2);  //false
        System.out.println(s2==s3);  //false

        System.out.println(s1==s4);  //true
        System.out.println(s3==s5);  //false

        //equals-->checks the value
        System.out.println(s1.equals(s2));  //true
        System.out.println(s1.equals(s3));  //true
        System.out.println(s3.equals(s5));  //false

        //equalsIgnorecase
        System.out.println(s3.equalsIgnoreCase(s5));  //true
    }
}
