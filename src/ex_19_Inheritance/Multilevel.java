package ex_19_Inheritance;

class X
{
  int a;
  void display()
   {
    System.out.println(a);
   }
}

class Y extends X
{
    int b;
    void show()
    {
        System.out.println(b);
    }
}

class Z extends Y
{
    int c;
    void print()
    {
        System.out.println(c);
    }
}


public class Multilevel {
    public static void main(String[] args) {


    Z cobj=new Z();
    cobj.a=100;
    cobj.b=200;
    cobj.c=300;

    cobj.display();
    cobj.show();
    cobj.print();

}
}