package ex_19_Inheritance;

class A
{
    int a=100;
    void dispaly()
    {
        System.out.println(a);
    }
}

class B extends A
{
    int b=200;
    void show()
    {
        System.out.println(b);
    }
}

public class Single {
    public static void main(String[] args) {

        B bobj=new B();
        System.out.println(bobj.a);
        System.out.println(bobj.b);
        bobj.dispaly();
        bobj.show();
    }
}
