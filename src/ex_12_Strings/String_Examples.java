package ex_12_Strings;

public class String_Examples {
    public static void main(String[] args) {

        String s="Java";
        char c=s.charAt(2); //-->Index starts from 0
        System.out.println(c);

        System.out.println(s.codePointAt(0)); //returns ASCII value

        //compareToIgnore(String sr)
        int result="abc".compareTo("ABC"); //gives difference of ASCII value i e 32
        System.out.println(result);

        int result1="abc".compareToIgnoreCase("ABC"); //returns 0 if equal
        System.out.println(result1);


    }
}
