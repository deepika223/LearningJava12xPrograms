package ex_18_This;

public class ThisKeyword {
    int x,y;  //Class variables

    ThisKeyword(int x,int y)
    {
        this.x=x;
        this.y=y;
    }
    void display()
    {
        System.out.println(x);
        System.out.println(y);
    }

    public static void main(String[] args) {
        ThisKeyword th=new ThisKeyword(100,200);
        th.display();

    }
}
