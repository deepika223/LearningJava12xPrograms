package ex_08_For_Loop;

public class Even_Odd {
    public static void main(String[] args) {

        for(int i=1; i<=10 ;i++)
        {
            if(i%2==0)
            {
                System.out.println(i + "Even");
            }
            else
            {
                System.out.println(i + "Odd");
            }
        }
    }
}
