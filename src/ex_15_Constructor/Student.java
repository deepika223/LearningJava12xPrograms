package ex_15_Constructor;

public class Student {
    int sid;
    String sname;
    char grade;

    void printStudentData()
    {
        System.out.println(sid+"  "+sname+"  "+grade);
    }

    Student(int id,String name,char gr)
    {
        sid=id;
        sname=name;
        grade=gr;
    }
}
