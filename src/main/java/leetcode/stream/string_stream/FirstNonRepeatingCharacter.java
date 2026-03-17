package leetcode.stream.string_stream;

import java.util.HashMap;
import java.util.Map;
import java.util.Optional;

public class FirstNonRepeatingCharacter {
    static void main() {
        String str = "swiss";//"iindiiia";
        char ch = firstNonRepeatingChar(str);
        System.out.println(ch);
    }

    private static Character firstNonRepeatingChar(String str) {
        return str.chars()
                .mapToObj(ch -> (char) ch)
                .filter(c -> str.indexOf(c) == str.lastIndexOf(c))
                .findFirst()
                .orElse(null);
    }
}
/*

public class FirstNonRepeatingCharacter {
    static void main() {
        String str = "iindiiia";
        char ch = findFirstNonRepeatingChar(str);
        System.out.println(ch);
        //char result = findFirstNonRepeatingCharStream(str);
        //System.out.println(result);
    }

    */
/*private static char findFirstNonRepeatingCharStream(String str) {
        Map<Integer,Integer> hm = new HashMap<>();
        str.chars()
                .filter(asc->{

                })
        return 0;
    }*//*


    private static char findFirstNonRepeatingChar(String str) {
        Map<Character,Integer> hm = new HashMap<>();

        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            hm.put(ch,hm.getOrDefault(ch,0)+1);
        }
        for(int i=0;i<str.length();i++){
            char ch = str.charAt(i);
            if(hm.get(ch)==1) return ch;
        }
        return ' ';
    }
}

*/
/*
String str = "iindiiia";
        Map<Integer,Integer> hm = new HashMap<>();
        char nonRepeating = str.chars()
                .filter(asc->{
                    if(hm.containsKey(asc)){
                        hm.put(asc,hm.get(asc)+1);
                    }
                    else {
                        hm.put(asc,1);
                    }
                    return hm.get(asc)==1;
                })
                .mapToObj(String::valueOf)
 */
