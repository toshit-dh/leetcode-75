package Leetcode75.ArrayString;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

public class AS9 {
    public static void main(String[] args) {
        compress(new char[]{'a','a','b','b','c','c','c'});
    }
    public static void compress(char[] chars) {
        Map<Character,Integer> characters = new LinkedHashMap<>();
        for(char a: chars){
            if(!characters.containsKey(a)){
                characters.put(a,1);
            }
            else {
                int s = characters.get(a);
                characters.replace(a,++s);
            }
        }
        System.out.println(characters);
    }
}
