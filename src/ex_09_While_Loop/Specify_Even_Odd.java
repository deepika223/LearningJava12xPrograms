package ex_09_While_Loop;

public class Specify_Even_Odd {
    public static void main(String[] args) {
         int i=1;

         while(i<=10)
         {
             if(i%2==0)
             {
                 System.out.println(i +"Even");
             }
             else
             {
                 System.out.println(i +"Odd");
             }
             i++;
         }
    }
}
