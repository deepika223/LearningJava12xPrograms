package ex_12_Strings;

public class String_Builtin_Functions {
    public static void main(String[] args) {

        int idx="Java".indexOf("a");
        System.out.println(idx); //1

        int  idx1="Java".lastIndexOf("a");
        System.out.println(idx1); //3

        boolean b="".isEmpty();
        System.out.println(b); //true

        String s1=String.join("-","Java","Python");
        System.out.println(s1); //Java-Python

        String s2="Java".replace('a','o');
        System.out.println(s2); //Jovo

        boolean b1="Java".startsWith("Ja");
        System.out.println(b1); //true
    }
}
