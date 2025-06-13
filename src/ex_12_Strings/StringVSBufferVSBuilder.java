package ex_12_Strings;

public class StringVSBufferVSBuilder {
    public static void main(String[] args) {

        //Immutable
        String s=new String("welcome");
        s.concat("to java");
        System.out.println(s);   //welcome

        //Mutable
        StringBuffer sbf=new StringBuffer("welcome");
        sbf.append("to java");
        System.out.println(sbf);  //welcome to java

        //Mutable
        StringBuilder sbr=new StringBuilder("welcome");
        sbr.append("to java");
        System.out.println(sbr);  //welcome to java

    }
}
