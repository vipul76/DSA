package leetcode.stream.integer_stream;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StartingWith1 {
    static void main() {
        int[] arr = {11,18,20,24,85,66,13};
        //First Approach
        List<Integer> result = Arrays.stream(arr)
                .mapToObj(String::valueOf)
                .filter(t->t.startsWith("1"))
                .map(Integer::parseInt)
                .toList();

        System.out.println(result);

        //Second Approach
        List<Integer> number = Arrays.asList(11,18,20,24,85,66,13);
        List<Integer> result2 = number.stream()
                .map(String::valueOf)
                .filter(t->t.startsWith("1"))
                .map(Integer::parseInt)
                .toList();
        System.out.println(result2);
    }
}
