package ex_13_Arrays;

public class Two_Dimentional {
    public static void main(String[] args) {
        //declaring array
        int a[][]=new int[2][2];

        a[0][0]=100;
        a[0][1]=200;

        a[1][0]=300;
        a[1][1]=400;

        System.out.println(a[1][0]);

        //approach2

        int b[][]={ {100,200},
                    {300,400},
                   };
        //find size of an array
        System.out.println("Length of row:" +b.length);
        System.out.println("Length of coloumns:" + b[0].length);
    }
}
