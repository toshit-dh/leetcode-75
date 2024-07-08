package Leetcode75.ArrayString;

public class AS1 {
    public String mergeAlternately(String word1, String word2) {
        String merged = "";
        int idx = 0;
        for (char i : word1.toCharArray()) {
            merged+=i;
            idx++;
            if (idx % 2 != 0){
                System.out.println(idx);
                if (idx / 2 >= word2.length()){
                    merged+="";
                }else{
                    merged+=word2.charAt(idx++/2);
                }
            }
            System.out.println(idx);
            System.out.println(merged);
        }
        if(idx / 2 < word2.length()){
            for(int i = idx/2;i<word2.length();i++){
                merged+=word2.charAt(i);
            }
        }
        return merged;
    }
    public static void main(String[] args) {
        AS1 as = new AS1();
        System.out.println(as.mergeAlternately("ab", "pqrs"));

    }
}
//thooslh