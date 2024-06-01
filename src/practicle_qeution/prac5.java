package practicle_qeution;

class sum
{
    int result1;
    int result2;
    static
    {
        int a;
        int b;
        int c;
        int d;
    }


    public sum(int a,int b)
    {
        a=a;
        b=b;
        result1=a+b;

    }
    public sum(int d,int b,int c)
    {
        d=d;
        b=b;
        c=c;

        result2=d+b+c;
    }

    public void getsum()
    {
        System.out.println("your sum from first controcter = "+result1 + "  and from secod contructer is="+ result2);
    }
}

public class prac5 {
    public static void main(String[] args) {

        sum s=new sum(5,8);
        sum s1=new sum(5,5,10);

        s1.getsum();
        s.getsum();


    }
}
