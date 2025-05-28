package TernaryOperator;

public class NestedTernary {
    public static void main(String[] args) {

    //result=condition1 ? expression1: (condition2 ? expression2: expression3);
    int num=27;
    String result=(num>18)? (num>25? "In Goa,Cant drink" : "Can drink"): "Cant drink not 18";
        System.out.println(result);
    }
}
