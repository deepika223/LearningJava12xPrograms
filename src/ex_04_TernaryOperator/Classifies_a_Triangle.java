package ex_04_TernaryOperator;

public class Classifies_a_Triangle {
    public static void main(String[] args) {
        int n1=10,n2=10,n3=1;

        String result= n1==n2?(n2==n3?"equilateral":"isosceles"):(n2==n3?" isosceles":"scalene");
        System.out.println(result);

    }
}
