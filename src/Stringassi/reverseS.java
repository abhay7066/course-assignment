package Stringassi;

import java.util.Arrays;

public class reverseS {
    public static void main(String[] args) {
        String intput="think tiwce";
        String input="chauhan abhay";
        String reverseSentence = reverseSentence(intput);
        System.out.println("Reverse word is :" + reverseSentence);

        String sortstring= SortString(input);
        System.out.println("sort string is :"+ sortstring);


    }
    // answer 3 recerse word of string :
    public static String reverseSentence(String Sentence)
    {
       String [] word= Sentence.split(" ");
        //char [] word = Sentence.toCharArray();


        StringBuilder reverseSentence = new StringBuilder();

        for(String Word:word)
        {
           String reveseWord = reverseWord(Word);
            reverseSentence.append(reveseWord).append("   ");
        }

        return reverseSentence.toString().trim();
    }
    public static String reverseWord(String Word)
    {
        StringBuilder reversew=new StringBuilder(Word).reverse();
//        reversew.reverse();
        return reversew.toString();
    }

    // ansewer 4 soert strig by charechter :;
    public static String SortString( String input)
    {
        char[] charA= input.toCharArray();

        Arrays.sort(charA);

        String SortString=new String(charA);

        return SortString;
    }
}




