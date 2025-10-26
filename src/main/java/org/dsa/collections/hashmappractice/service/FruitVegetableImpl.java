package org.dsa.collections.hashmappractice.service;

import org.dsa.collections.hashmappractice.repository.FruitVegetableRepository;

import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class FruitVegetableImpl implements FruitVegetableService {

    private final FruitVegetableRepository repository;

    public FruitVegetableImpl(FruitVegetableRepository fruitVegetableRepository){
        this.repository = fruitVegetableRepository;
    }

    //<!-----------------------------------Basic Practice-------------------------------------------->
    @Override
    public void printKeysAndValues() {
        Map<Integer, List<String>> data = repository.getSample();
        data.forEach((key, value) -> System.out.println("Key : " + key +
                " value : " + value));
    }

    @Override
    public void printKeysWithMoreThanTwoElements() {
        Map<Integer, List<String>> data =repository.getSample();
        data.entrySet()
                .stream()
                .filter(entry -> entry.getValue().size()>4)
                .forEach(System.out::println);
    }

    @Override
    public void printValuesStartingWithB() {
        Map<Integer,List<String>> data = repository.getSample();
        data.values()
                .stream()
                .flatMap(List::stream)
                .filter(t->t.startsWith("B"))
                .forEach(System.out::println);
    }

    @Override
    public void countLetterA() {
        //IT CHECK WHETHER STRING CONTAINS A OR a. example : apple contains a so count is 1 but banana contains 3 a but still it will count 1 a
        /*Map<Integer, List<String>> data = repository.getSample();
        long countLetterA =  data.values()
                .stream()
                .flatMap(List::stream)
                .filter(t->t.contains("A") || t.contains("a"))
                .count();
        System.out.println(countLetterA);*/

        // IT CHECKS HOW MANY CHARACTER A OR a PRESENT IN THE SAMPLE DATA
        Map<Integer, List<String>> data = repository.getSample();
        long countLetterA =  data.values()
                .stream()
                .flatMap(List::stream)
                .flatMapToInt(String::chars)
                .filter(ch->ch=='A' || ch == 'a')
                .count();
        System.out.println(countLetterA);
    }

    @Override
    public void convertValuesToUpperCase() {
        Map<Integer, List<String>> data = repository.getSample();

        Map<Integer, List<String>> result = data.entrySet()
                .stream()
                .collect(Collectors.toMap(
                        Map.Entry::getKey, entry -> {
                            return entry.getValue()
                                    .stream()
                                    .map(String::toUpperCase)
                                    .toList();
                        }
                ));

        result.forEach((key, value) -> System.out.println("Key : " + key + " value : "+value));
    }

    //<!-----------------------------------XXXX-------------------------------------------->

    //<!-----------------------------------Intermediate Practice-------------------------------------------->

    @Override
    public void sortValuesAlphabetically() {
        Map<Integer,List<String>> data = repository.getSample();

        Map<Integer, List<String>> result = data.entrySet()
                .stream()
                .collect(Collectors.toMap(Map.Entry::getKey,entry->{
                    return entry.getValue()
                            .stream()
                            .sorted()
                            .toList();
                }));

        result.forEach((key,value)->
                System.out.println("Key : " +key + "value : "+ value));
    }

    @Override
    public void flattenToList() {
        Map<Integer, List<String>> data = repository.getSample();

        List<String> result = data.
                values()
                .stream()
                .flatMap(List::stream)
                .toList();

        result.forEach(System.out::println);
    }

    @Override
    public void groupByFirstLetter() {

    }

    @Override
    public void findLongestString() {

    }

    @Override
    public void reverseMapping() {

    }
}
