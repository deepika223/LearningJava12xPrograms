package ex_16_Polymorphism;

public class AdderMain {
    public static void main(String[] args) {

        Adder addobj=new Adder();

        addobj.sum();
        addobj.sum(20,30);
        addobj.sum(10.5,10);
        addobj.sum(20,5.5);
        addobj.sum(10,20,30);
    }
}
