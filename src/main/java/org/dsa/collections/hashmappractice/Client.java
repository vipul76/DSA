package org.dsa.collections.hashmappractice;

import org.dsa.collections.hashmappractice.repository.FruitVegetableRepository;
import org.dsa.collections.hashmappractice.service.FruitVegetableImpl;
import org.dsa.collections.hashmappractice.service.FruitVegetableService;

import java.util.List;
import java.util.Map;

public class Client {
    static void main() {
        FruitVegetableRepository fruitVegetableRepository = new FruitVegetableRepository();
        FruitVegetableService fruitVegetableService = new FruitVegetableImpl(fruitVegetableRepository);

        fruitVegetableService.printKeysAndValues();
        fruitVegetableService.printKeysWithMoreThanTwoElements();
        fruitVegetableService.printValuesStartingWithB();
        fruitVegetableService.countLetterA();
        fruitVegetableService.convertValuesToUpperCase();

        System.out.print("sortValuesAlphabetically : ");
        fruitVegetableService.sortValuesAlphabetically();

        fruitVegetableService.flattenToList();
    }
}
