package ex_12_Strings;

public class String_Immutable1 {
    public static void main(String[] args) {
        String s1="Hello";
     //   s1=s1.concat("World");
     //   System.out.println(s1);   //HelloWord

        s1.concat("World");
        System.out.println(s1);   //Hello
    }
}
