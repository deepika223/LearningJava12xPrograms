package ex_14_Oops;

public class FourTypes_Main_Method {
    public static void main(String[] args) {

        FourTypes_Main gr=new FourTypes_Main();

        gr.m1();

        String s=gr.m2();
        System.out.println(s);

        gr.m3("John");

        String str=gr.m4("David");
        System.out.println(str);

    }
}
