package Oops;

public class EmployeeMain {
    public static void main(String[] args) {
        Employee emp1=new Employee(); //object
        emp1.eid=100;
        emp1.ename="John";
        emp1.job="tester";
        emp1.sal=50000;
        emp1.display();


        Employee emp2=new Employee(); //object
        emp2.eid=101;
        emp2.ename="Miller";
        emp2.job="Dev";
        emp2.sal=50000;
        emp2.display();
    }
}
