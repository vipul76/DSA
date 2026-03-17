package leetcode.stream.bhaiya.integers;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

public class IntStreamProblem {
    static void main() {
        List<Integer> list = List.of(1,2,6,8,4,6,3,12,89,86,33,57,87,41,32,88,56,45,72);

        //even sum
        System.out.println(list.stream().filter(num->num%2==0).collect(Collectors.summarizingInt(a->a)));
        //Odd sum
        System.out.println(list.stream().filter(num->num%2!=0).collect(Collectors.summarizingInt(a->a)));
        list.stream().filter(num->num%2==0).forEach(t->System.out.print(t+", "));
        System.out.println(list.stream().filter(num->num%2!=0).reduce(0, Integer::sum));

        System.out.println(list.stream().collect(Collectors.partitioningBy(a -> a % 2 == 0)));
        list.stream()
                .collect(Collectors.partitioningBy(a -> a % 2 == 0))
                .entrySet()
                .forEach(System.out::print);
    }
}
