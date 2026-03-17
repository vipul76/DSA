package leetcode.stream.string_stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class LengthSeparation {
    static void main() {
        List<String> list = Arrays.asList("banana","apple","banana","mango");
        Map<String,List<String>> map = list.stream()
                .collect(Collectors.groupingBy(String::toUpperCase,Collectors.toList()));
        map.forEach((k,v)-> System.out.println("key: "+k+" , value: "+v));
    }
}
