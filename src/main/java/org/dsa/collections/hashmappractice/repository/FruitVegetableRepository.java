package org.dsa.collections.hashmappractice.repository;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class FruitVegetableRepository {
    /*public static Map<Integer, List<String>> getSampleData() {
        Map<Integer, List<String>> sampleData = new HashMap<>();

        hMap.put(1, List.of("Apple", "Banana", "Avocado", "Apricot"));
        hMap.put(2, List.of("Broccoli", "Baigan", "Beetroot", "Bell Pepper", "Bitter Gourd"));
        hMap.put(3, List.of("Carrot", "Cabbage", "Capsicum", "Cauliflower", "Celery"));
        hMap.put(4, List.of("Date", "Dragonfruit", "Durian", "Dewberry"));
        hMap.put(5, List.of("Eggplant", "Endive", "Elderberry"));
        hMap.put(6, List.of("Fig", "Fennel", "French Bean"));
        hMap.put(7, List.of("Grapes", "Guava", "Gooseberry", "Garlic", "Ginger"));

        return sampleData;
    }
*/
    public Map<Integer, List<String>> getSample() {
        Map<Integer, List<String>> sampleData = new HashMap<>();
        sampleData.put(1, List.of("Apple", "Banana", "Avocado", "Apricot"));
        sampleData.put(2, List.of("Broccoli", "Baigan", "Beetroot", "Bell Pepper", "Bitter Gourd"));
        sampleData.put(3, List.of("Carrot", "Cabbage", "Capsicum", "Cauliflower", "Celery"));
        sampleData.put(4, List.of("Date", "Dragonfruit", "Durian", "Dewberry"));
        sampleData.put(5, List.of("Eggplant", "Endive", "Elderberry"));
        sampleData.put(6, List.of("Fig", "Fennel", "French Bean"));
        sampleData.put(7, List.of("Grapes", "Guava", "Gooseberry", "Garlic", "Ginger"));

        return sampleData;
    }
}
