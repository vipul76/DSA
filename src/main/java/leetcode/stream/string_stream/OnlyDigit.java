package leetcode.stream.string_stream;

import java.util.stream.Collectors;

public class OnlyDigit {
    static void main() {
        String str = "a1b2c3";
        String result = str.chars()
                .filter(Character::isDigit)
                .mapToObj(c->String.valueOf((char) c))
                .collect(Collectors.joining());
        System.out.println(result);
    }
}
