package ex_13_Arrays;

public class Printallvalues_2D_Foreach {
    public static void main(String[] args) {

        int a[][]= {{100, 200},
                    {300, 400},
                   };

           for(int arr[]:a)
           {
               for(int x:arr)
               {
                   System.out.print(x+"  ");
               }
               System.out.println();
           }
    }

}
