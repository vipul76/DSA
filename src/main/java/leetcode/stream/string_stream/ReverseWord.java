package leetcode.stream.string_stream;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class ReverseWord {
    static void main() {
        //Chars() -> basically worked on each character
        String str= "Hello My name is vipul Nilesh";

        String result = str.chars()
                .mapToObj(c->(char) c)
                .collect(Collectors.collectingAndThen(
                        Collectors.toList(),
                        list -> {
                            Collections.reverse(list);
                            return list.stream();
                        }
                ))
                .map(String::valueOf)
                .collect(Collectors.joining());

        //System.out.println(result);

        String res = Arrays.stream(str.split(" "))
                .map((word)->new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(res);

        String resu = Arrays.stream(str.split(" "))
                .map((word)->new StringBuilder(word).reverse())
                .collect(Collectors.joining(" "));
        System.out.println(resu);

    }
}
