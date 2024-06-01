package practicle_qeution;

class cont
{
    int age;
    String name;

    public cont(int a,String b)
    {
        age=a;
        name=b;
    }
    public void getdetail()
    {
        System.out.println("age="+ age+" name="+name);
    }
}

public class constrocuter {
    public static void main(String[] args) {


        cont c1=new cont(18,"ram");
        c1.getdetail();
    }
}
