package leetcode.stream.implementation;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class NumberStreamImpl {

    public void oddAndEvenGroup(List<Integer> numbers) {
        Map<Boolean,List<Integer>> oddEvenList =
                numbers.stream()
                        .collect(Collectors
                                .partitioningBy(num -> num %2 == 0 , Collectors.toList()));

        oddEvenList
                .forEach((key, value) -> {
                        String label = key ? "Even" : "odd";
                        System.out.println(label +" : " + value);
                });
    }
    public void oddAndEvenSum(List<Integer> numbers){
        Map<Boolean, Integer> EvenOddSum = numbers.stream()
                .collect(Collectors.partitioningBy(num -> num%2==0,
                        Collectors.summingInt(Integer::intValue)));

        EvenOddSum.forEach((key,value)->{
            String label = key ? "Even Sum" : "Odd Sum";
            System.out.println(label + " : " + value);
        });
    }

    public void duplicateElement(List<Integer> numbers){
        List<Integer> duplicateElement = numbers.stream()
                        .collect(Collectors.groupingBy(element -> element,Collectors.counting()))
                        .entrySet()
                        .stream()
                        .filter(entry-> entry.getValue()>1)
                        .map(Map.Entry::getKey)
                        .toList();

        System.out.print("Duplicate Elements : ");
        duplicateElement.forEach(e-> System.out.print(e +","));
    }
}
