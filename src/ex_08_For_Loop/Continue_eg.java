package ex_08_For_Loop;

public class Continue_eg {
    public static void main(String[] args) {

        for(int i=1; i<=10; i++)
        {
            if(i==5)
            {
                continue;
            }
            System.out.println(i); // 1 2 3 4 6  7 8 9 10
        }
    }
}
