package practicle_qeution;

class instanceCount
{
    static int count;

    public instanceCount()
    {
        count++;
    }
    public static int getCount()
    {
        return count;
    }
}

public class prac1 {
    public static void main(String[] args) {

        instanceCount i1=new instanceCount();
        instanceCount i2=new instanceCount();
        instanceCount i3=new instanceCount();

        System.out.println("instnce is create for "+ instanceCount.getCount() + " times");

    }
}
