package leetcode.stream.string_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class WordCount {
    static void main() {
        List<String> words = Arrays.asList("apple","banana","apple");
        Map<String, Long> word = words.stream()
                .collect(Collectors.groupingBy(w->w,Collectors.counting()));

        word.forEach((k,v)-> System.out.println("key: "+k+" , "+"value: "+v));
    }
}
