package ex_15_Constructor;

public class Constructor_Types {
    int x,y;

    Constructor_Types()  //default constructor
    {
        x=100;
        y=200;
    }

    Constructor_Types(int a,int b)  //parameterized constructor
    {
        x=a;
        y=b;
    }

     void sum()
    {
        System.out.println(x+y);
    }


    public static void main(String[] args) {

        Constructor_Types ct=new Constructor_Types();  //invokes default constructor
        Constructor_Types ct1=new Constructor_Types(10,20);  //invokes parameterized
        ct.sum();
        ct1.sum();
    }
}
