package Leetcode75.ArrayString;

import java.util.*;

public class AS5 {
    public static void main(String[] args) {
        System.out.println(reverseVowels("Marge, let's \"went.\" I await news telegram."));
    }
    public static String reverseVowels(String s) {
        Set<Character> vowels = new LinkedHashSet<>(Arrays.asList('A','a','E','e','I','i','O','o','U','u'));
        char[] chars = s.toCharArray();
        int i = 0;
        int j = chars.length -1;
        while (i < j){
            if(vowels.contains(chars[i])){
                while (!vowels.contains(chars[j])){
                    j--;
                }
                char temp = chars[i];
                chars[i] = chars[j];
                chars[j] = temp;
                i++;
                j--;
            }else {
                i++;
            }
        }
        return String.copyValueOf(chars);
    }
}
