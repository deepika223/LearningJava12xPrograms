package ex_16_Polymorphism;

import java.sql.SQLOutput;

public class Construct_OverloadMain {
    public static void main(String[] args) {

        //Construct_Overload co=new Construct_Overload();
       // Construct_Overload co=new Construct_Overload(10.2,2.5,10.5);
          Construct_Overload co=new Construct_Overload(5.5);


        System.out.println(co.volume());

    }


}
