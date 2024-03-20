package Stringassi;

import java.util.Scanner;

public class Assingnment1 {
    public static void main(String[] args)
    {
        //solution 1:
        String name="abhay chauhan !";
        String reversename=reverseS(name);
        System.out.println("original name : "+name);
        System.out.println("after reverse naem : " +reversename);

        //solution 2:
        String name1 = "nayan";
        boolean Palindrome = ChekPalindeom(name1);
        System.out.println("given String is palindrom ? = "+Palindrome);

        //solution 3:
        String name3="abhay chauhan ";
        String convertLtoU=ConvertLowertoUpper(name3);
        System.out.println("after convert your is name is ::"+convertLtoU);
        String name4="ABHAY CHUAHNA  ";
        String convertUtoL=ConvertUpertoLower(name4);
        System.out.println("after convert your is name is ::"+convertUtoL);

        //solution 4 :
        String m=" japan b shah ";
        char removeChar= 'b';
        String AfterRemove=RemovecahrAtPoint( m , removeChar);
        System.out.println( "after removal of b : " +AfterRemove);

        //solution 5 :
        String mainstring="abhay chauhan ";
        String substring ="chauhan ";
        int index=FindIndexofSub(mainstring,substring);
        if(index !=-1)
        {
//            System.out.println("subtring "+ substring+ "At index "+index);

        }
        else
        {
            System.out.println("substring " + substring + " not found ");
        }


    }

   //solution 1 = reverse the string without int built function
    public static String reverseS(String name)
    {
        char [] charArray =name.toCharArray();
        int start=0;
        int end=name.length()-1;

     while (start<end)
     {
         char temp=charArray[start];
         charArray[start]=charArray[end];
         charArray[end]=temp;

         start++;
         end--;
     }


     return new String(charArray);

    }

    //solution 2= check palindrome or note ?
    public static Boolean ChekPalindeom(String name)
    {
        name.toLowerCase();

        int start=0;
        int end=name.length()-1;

        while (start<end)
        {
            if(name.charAt(start) != name.charAt(end))
            {
                return false;

            }
            start++;
            end --;
        }
        return true;
    }

    //solution 3 = covert lower to uper and vice versa :
    public static String ConvertLowertoUpper(String name )
    {
        char [] charArray=name.toCharArray();

        for(int i=0;i<charArray.length;i++)
        {
            if(charArray[i]>='a' & charArray[i]<='z')
            {
                charArray[i]=(char)(charArray[i]-32);

            }
        }
        return new String(charArray);

    }

    public static String ConvertUpertoLower(String name )
    {
        char [] charArray=name.toCharArray();

        for(int i=0;i<charArray.length;i++)
        {
            if(charArray[i]>='A' & charArray[i]<='Z')
            {
                charArray[i]=(char)(charArray[i]+32);

            }
        }
        return new String(charArray);

    }

    public static int FindIndexofSub(String m,String s)
    {
        int index=m.indexOf(s);
        return index;
    }

    //solution 4= remover particular from String

    public static String RemovecahrAtPoint(String name5,char removeChar)
    {
        if (name5 == null ||    name5.isEmpty())
        {
            return " ";
        }

        StringBuilder str = new StringBuilder();
        char CharArray []=name5.toCharArray();

        for (int i=0 ;i <CharArray.length; i++)
        {
            if(CharArray[i] != removeChar)
            {
                str.append(CharArray[i]);
            }
        }
        return str.toString();
    }


}
