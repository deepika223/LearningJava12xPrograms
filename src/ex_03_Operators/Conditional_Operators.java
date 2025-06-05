package ex_03_Operators;

public class Conditional_Operators {
    public static void main(String[] args) {

            // var=exp ? result1 :result2

            //ex1
            int a=200, b=100;
            int x=a>b ? a : b;
            System.out.println(x);

            //ex2
            int z=(1==1)?100:200;
            System.out.println(z);  //100

            //ex3
            int y=(1==2)?200:100;
            System.out.println(y);  //100

            //ex4
            int age=30;
            String res=(age>=18? "Eligible" : "noteligible");
            System.out.println(res);
    }
}
