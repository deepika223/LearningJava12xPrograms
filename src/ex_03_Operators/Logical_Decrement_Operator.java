package ex_03_Operators;

public class Logical_Decrement_Operator {
    public static void main(String[] args) {

        // -- decrement operator

        //case1
        int a=10;
        System.out.println(a); //10

        int res2=--a;  // a=a-1
        System.out.println(a); //9
        System.out.println(res2);


        //case2--post increment
        int b=10;
        int res=b--;
        System.out.println(res); //10
        System.out.println(b);   //9



        //case3 --pre increment
        int c=10;
        int res1=--c;
        System.out.println(res1); //9
        System.out.println(c);   //9
    }
}
