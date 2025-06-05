package ex_13_Arrays;

public class Printallvalues_2D_Forloop {
    public static void main(String[] args) {

        int b[][]={ {100,200},
                {300,400},
        };
        for(int r=0;r<=b.length-1;r++)
        {
            for(int c=0;c<=b[r].length-1;c++)
            {
                System.out.print(b[r][c]+ "  ");
            }
            System.out.println();
        }
    }
}
