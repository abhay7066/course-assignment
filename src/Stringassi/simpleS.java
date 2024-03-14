package Stringassi;

import javax.sound.midi.Soundbank;
import java.sql.SQLOutput;
import java.util.Scanner;
import java.util.SplittableRandom;

public class simpleS {
    public static void main(String[] args) {

        // solution 1:
        Scanner sc =new Scanner(System.in);
        System.out.println("entre your name :");
        String name =sc.nextLine();
        System.out.println("name is :"+name);

        //solution 2 :-
        // in java we can concat two string using '+' operator and "concat" method..

        String name1= "abhay ";
        String  surname="chauhan";

        String fulln = name1+surname;
        String fulln1=name1.concat(surname);
        System.out.println("your concat Steing is 1: "+fulln + " 2: "+fulln1);

        //solution 3:-
        // in java we can finde the lengh of string by inbuilt method class "length()";
        System.out.println("length of name is : "+ name.length());

       //solution 4 :-
        // in java we can compare to string by method name "equals()" and "compareTo()"

        System.out.println("if your String is sanme than return 1 otherwise 0 "+ name1.equals(surname) + name1.compareTo(surname));

        //solution 5 :-
        //retrun length of refrigerator
        String name2= "refrigarator ";
        System.out.println("langht of eq5 is : " + name2.length());

        //solution 6:-
        // chaeck whether number is present or not

        String name3="umbrella";

        for(char word: name3.toCharArray())
        {
            if(word == 'e')
            {
                System.out.println("alphaabet is present : ");
                break;
            }
            else
            {
                System.out.println("alphabet is not present : ");
                break;
            }
        }

        //solution 7:-
        //remove all consonants
        String input="Hello, have a good day";
        String removeConsonants = RemoveConsonants(input);
        System.out.println("after removal of all consonants : "+ removeConsonants);

    }
    public static String RemoveConsonants(String input)
    {
        StringBuilder sb=new StringBuilder();
        for(int i=0;i<input.length();i++)
        {
            char ch =input.charAt(i);
            if(isVowel(ch)|| Character.isWhitespace( i))
            {
                sb.append(ch);
            }

        }
        return sb.toString();
    }

    private static boolean isVowel(char ch) {

        ch = Character.toLowerCase(ch);
        return ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u';
    }
}
