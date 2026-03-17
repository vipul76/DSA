package leetcode.stream.miscellaneous;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Merge2List {
    static void main() {
        List<Integer> list1 = Arrays.asList(1,2,3);
        List<Integer> list2 = Arrays.asList(4,5,6);

        List<Integer> mergeList = Stream.of(list1,list2)
                .flatMap(List::stream)
                .toList();

        mergeList.forEach(System.out::print);

        System.out.println();

        List<String> strList1 = Arrays.asList("vipul","Nilesh");
        List<String> strList2 = Arrays.asList("Pooja","Pihu");

        List<String> mergeListStr = Stream.of(strList1,strList2)
                .flatMap(List::stream)
                .toList();
        mergeListStr.forEach(System.out::print);
     }
}
