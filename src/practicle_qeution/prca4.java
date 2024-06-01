package practicle_qeution;

import java.util.Scanner;

public class prca4 {

    public static int graterNumber(int a,int b)
    {
        if(a>b)
        {
            return a;
        }
        else
        {
            return b;
        }
    }

    public static void main(String[] args) {

        Scanner sc=new Scanner(System.in);

        System.out.println("etner number a:");
        int a=sc.nextInt();
        System.out.println("enter number b:");
        int b=sc.nextInt();

        int result=graterNumber(a,b);

        System.out.println("bigger number is = "+result );

    }
}
