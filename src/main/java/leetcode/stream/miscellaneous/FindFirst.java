package leetcode.stream.miscellaneous;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.IntStream;

public class FindFirst {
    static void main() {
        List<Integer> list = Arrays.asList(7,3,11,12,53,15,1,53,4,11,3);

        int number = list.stream()
                .sorted()
                .filter(num->num>10)
                .findFirst()
                .orElse(-1);
        System.out.println("1) Find first number greater than 10 : " +number);

        //Find Minimum
        int min = list.stream()
                .min(Integer::compareTo)
                .orElseThrow(()->new RuntimeException("No minimum value found"));
        System.out.println("2) Minimum value : "+ min);

        //Duplicate element in a list
        Set<Integer> duplicates = list.stream()
                .filter(num-> Collections.frequency(list,num)>1)
                .collect(Collectors.toSet());

        System.out.print("3) Duplicate number : ");
        duplicates.forEach(num-> System.out.print(num+", "));

        //Prime or not Prime
        Map<Boolean,List<Integer>> map = list.stream()
                .collect(Collectors.groupingBy(FindFirst::isPrime));

        map.forEach((k,v) -> {
            if(k==true){
                System.out.print("Prime : ");
                System.out.print(v+", ");
            }
            else {
                System.out.print("Non Prime : ");
                System.out.print(v+" , ");
            }
        });
    }

    private static Boolean isPrime(Integer num) {
        if(num<=1) return false;
        return IntStream.rangeClosed(2,(int) Math.sqrt(num))
                .noneMatch(n->num%n==0);
    }
}
