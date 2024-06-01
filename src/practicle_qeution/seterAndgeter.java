package practicle_qeution;


class car
{
    private String color;
    private String name ;
    private int cid;

    public void setCid(int id)
    {
        cid=id;
    }
    public void setName(String name)
    {
        this.name=name;
    }
    public void setColor(String c)
    {
        color=c;
    }


    public int getCid()
    {
        return cid;
    }
    public String getName()
    {
        return name;

    }
    public String getColor()
    {
        return color;
    }
}

public class seterAndgeter {
    public static void main(String[] args) {

        car c1=new car();

        c1.setCid(1);
        c1.setName("vegenar");
        c1.setColor("balck");

        System.out.println(" car detail is : id="+c1.getCid()+" name="+c1.getName()+" color="+ c1.getColor() );
    }
}
