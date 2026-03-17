package leetcode.stream.integer_stream;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class MaximumInteger {
    static void main() {
        List<Integer> list = Arrays.asList(1,2,5,3,8,34,23,42,33,16,13,11,105,43);
        int max = list.stream()
                .max(Integer::compare)
                .orElse(0);
        System.out.println(max);

        List<String> strList = Arrays.asList("Bobo","Vipul","Alice","Pihu","Deepik","Nilesh");
        Map<Integer,List<String>> map = strList.stream()
                .collect(Collectors.groupingBy(String::length));

        map.forEach((key, value) -> System.out.println("Key : " + key + " , value : " + value));

    }
}
