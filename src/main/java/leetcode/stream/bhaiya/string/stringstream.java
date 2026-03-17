package leetcode.stream.bhaiya.string;

import java.awt.image.ImageProducer;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.function.Function;
import java.util.stream.Collectors;

public class stringstream {
    static void main() {
        System.out.println("afjehfiahvlcilhariphp"
                .chars()
                .mapToObj(c -> (char) c)
                .collect(Collectors
                        .collectingAndThen(Collectors.groupingBy(Function.identity(), Collectors.counting()),
                                map -> map.entrySet()
                                        .stream()
                                        .filter(a -> a.getValue() == 1)))
                .collect(Collectors.toList()));
//-> input.chars().mapToObj(c -> (char) c).collect(Collectors.toSet()).size();

        List<String> myList = List.of("Vipul","Nilesh","Pooja","Pihu");
        String optStr = myList.stream().reduce((a, b)->a+b).get();
        System.out.println(optStr);
    }
}
