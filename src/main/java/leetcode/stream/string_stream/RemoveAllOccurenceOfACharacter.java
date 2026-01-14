package leetcode.stream.string_stream;

import java.util.stream.Collectors;

public class RemoveAllOccurenceOfACharacter {
    static void main() {
        String str = "java interview";
        char ch = 'a';

        String resultString = str.chars()
                .filter(c->c!=ch)
                .mapToObj(c->String.valueOf((char)c))
                .collect(Collectors.joining());

        System.out.println(resultString);
    }
}
