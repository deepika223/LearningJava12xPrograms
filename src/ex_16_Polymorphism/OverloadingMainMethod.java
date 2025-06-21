package ex_16_Polymorphism;

public class OverloadingMainMethod {


    void main(int x)
    {
        System.out.println(x);
    }

    void main(String s)
    {
        System.out.println(s);
    }

    void main(String s1,String s2)
    {
        System.out.println(s1+s2);
    }
    public static void main(String[] args) {

        OverloadingMainMethod ov=new OverloadingMainMethod();
        ov.main(100);
        ov.main("Deepika");
        ov.main("Hi","Deepika");

    }
}
