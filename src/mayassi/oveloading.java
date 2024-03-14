package mayassi;

import java.util.Scanner;

class Add
{
    public int add(int x, int y)
    {
        int result = x+y;
        return result;
    }
    public int add( int x,int y ,int z)
    {
        int result = x+y+z;
        return result ;
    }

    public double add( double x , double y )
    {
        double result = x+y;
        return  result;
    }
}
public class oveloading {
    public static void main(String[] args) {

                Add obj = new Add();

                int result =  obj.add(5,6);
                System.out.println(result);

                int result1 = obj.add(7,8,3);
                System.out.println(result1);

                double result2 =  obj.add(4.6,7.3);
                System.out.println(result2);
                 Object ob=new Object();
                 ob.Method();

                 //solution of = 3. Write a Java program to calculate the sum of all elements in an integer array?
              int[] num ={1,2,3,4,5,6,7,8,9,0};
              int sum=0;

              for(int i=0;i<10;i++)
              {
                  sum=sum+num[i];
              }
        System.out.println("arrat sum is : "+ sum);
//solution of = Write a Java program to find the index of a specific element in an integer array.?

        int index;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter th value you want to find index number :");
        index = sc.nextInt();
        for (int i=0;i<10;i++)
        {
            if(index==num[i])
            {
                System.out.println("your index number of value"+ num[i] + " is "+i);
            }

        }
        //solution of = 5. Write a Java program to print an entire array?

        for(int i=0;i<10;i++)
        {
            System.out.println("you value at index " +i + "in num array is :"+num[i]);
        }

    }

}
// solution of = 2. Write a program to create an object of an class which contain a method and call that class method in
//main method.

class Object {
    int i = 10;
    int j = 20;
    public void Method ()
    {
        System.out.println("your multiplication is = " + i*j );
    }
}
