package ex_08_For_Loop;

public class Continue_Even_Numbers {
    public static void main(String[] args) {
        for (int i = 0; i <= 50; i++) {
            if (i % 2 == 0) {
                continue;
            }
            System.out.println("Odd -> " + i);
        }
    }
}
