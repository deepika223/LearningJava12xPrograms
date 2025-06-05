package ex_06_If_IfElse_Conditions;

public class Largest_Of_3_Numbers {
    public static void main(String[] args) {

        int a=500,b=200,c=30;

        if (a>b && a>c)
        {
            System.out.println("a is largest:" +a);
        }

        else if(b>a && b>c)
        {
            System.out.println("b is largest:" +b);
        }
        else
        {
            System.out.println("c is the largest:" +c);
        }
    }
}
