package ex_12_Strings;

public class String_Interview1 {
    public static void main(String[] args) {

        String s1 = "Hello";   //1 string present in String constant pool
        String s4 = "Hello";   //1 string present in String constant pool
        String s10="Hello";   //1 string present in String constant pool
        String s11="hello";  //2 strings present in String constant pool

        String s2=new String("Hello"); //1 string present in Object area
        String s3=new String("Hello"); //2 strings present in Object area
        String s5=new String("hello"); //3 strings present in Object area

        System.out.println(s1); //Hello
        System.out.println(s2);  //Hello
        System.out.println(s5);  //hello
    }

}
