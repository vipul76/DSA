package leetcode;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.stream.IntStream;

public class Merge2Arrays {
    static void main() {
        int[] num1 = {1,3,5,7};
        int[] num2 = {2,5,8,12,13};

        int[] num = IntStream.concat(
                Arrays.stream(num1),
                Arrays.stream(num2))
                .sorted()
                .toArray();
        Arrays.stream(num).forEach(t->System.out.print(t+", "));
    }
}
