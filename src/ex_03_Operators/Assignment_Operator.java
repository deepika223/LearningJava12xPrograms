package ex_03_Operators;

public class Assignment_Operator {
    public static void main(String[] args) {

        // Assignment  =  +=  -=  *=  /=  %=

        int a=10;
        a+=5;     //a=a+5
        a-=5;     //a=a-5
        System.out.println(a);  //10

        int b=10;
        b*=5;     //b=b*5
        System.out.println(b); //50

        int c=10;
        c/=5;     //c=c/5
        System.out.println(c);  //2

        int d=10;
        d%=5;
        System.out.println(d);  //0
    }
}
