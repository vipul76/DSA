package leetcode.stream.string_stream;

import java.util.stream.Collectors;

public class SpecialCharacter {
    static void main() {
        String str = "Hello, World! 123 @# ";
        String result = str.chars()
                .filter(c->!Character.isLetterOrDigit(c))
                .mapToObj(c->String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
