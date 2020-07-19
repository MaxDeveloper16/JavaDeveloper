/*
Task Description:
Complete the “String reverse” coding problem.

Write a function that takes a string as input and returns the string reversed.

Example1: input: "Hello World!", return "!dlroW olleH"

Example2: input: “abcde”, return “edcba”
 */

public class ReverseString{
    public static String reverseWord(String input){
       StringBuilder sb = new StringBuilder();
       for(int i=input.length()-1; i>=0; i--) {
           sb.append(input.charAt(i));
       }
       return sb.toString();

    }

}
