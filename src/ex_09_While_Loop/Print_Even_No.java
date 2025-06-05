package ex_09_While_Loop;

public class Print_Even_No {
    public static void main(String[] args) {
    //Approach1
      /*  int i=2;
        while(i<=10)
        {
            System.out.println(i);
            i+=2;
        }
       */

     //Approach2
     int i=1;

     while(i<=10)
     {
         if(i%2==0)
         {
             System.out.println(i);
         }
         i++;
     }
    }
}
