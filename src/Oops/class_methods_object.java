package Oops;

public class class_methods_object {
    //variables
    int eid;
    String ename;
    String job;
    int sal;

    //methods
    void display()
    {
        System.out.println(eid);
        System.out.println(ename);
        System.out.println(job);
        System.out.println(sal);
    }

    public static void main(String[] args) {
        class_methods_object emp1=new class_methods_object(); //object
        emp1.eid=100;
        emp1.ename="John";
        emp1.job="tester";
        emp1.sal=50000;
        emp1.display();


        class_methods_object emp2=new class_methods_object(); //object
        emp2.eid=101;
        emp2.ename="Miller";
        emp2.job="Dev";
        emp2.sal=50000;
        emp2.display();
    }
}
