package ex_16_Polymorphism;

public class Construct_Overload {
    double width,height,dept;

    Construct_Overload()
    {
        width=height=dept=0;
    }

    Construct_Overload(double w,double h,double d)
    {
        width=w;
        height=h;
        dept=d;
    }

    Construct_Overload(double len)
    {
        width=height=dept=len;
    }

    double volume()
    {
        return (width*height*dept);
    }


}
