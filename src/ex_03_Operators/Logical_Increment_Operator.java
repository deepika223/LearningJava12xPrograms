package ex_03_Operators;

public class Logical_Increment_Operator {
    public static void main(String[] args) {

        // ++ increment operator

        //case1
		/*int a=10;
		System.out.println(a);

		++a;  // a=a+1
		System.out.println(a);
		*/

        //case2--post increment
		/*int a=10;
		int res=a++;
		System.out.println(res); //10
		System.out.println(a);   //11
		*/


        //case3 --pre increment
        int a=10;
        int res=++a;
        System.out.println(res); //11
        System.out.println(a);   //11
    }
}
