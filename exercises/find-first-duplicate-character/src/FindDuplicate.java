/*
Task Description:
Complete find the first duplicate character in a string.

Complete the following method so given a string it returns the index of the first duplicated character
or -1 if there are no duplicated characters.


Example1: input: abcabc, return: 3

Example2: input: abcd, return: -1

 */
public class FindDuplicate{
    public int getDuplicateNumber(String input){
        Set<Character> tempSet = new HashSet<>();
        for(int i =0; i< input.length();i++)
        {
            if(tempSet.contains(input.charAt(i))){
                return i;
            }else{
                tempSet.add(input.charAt(i));
            }
        }
        return -1
    }

}
