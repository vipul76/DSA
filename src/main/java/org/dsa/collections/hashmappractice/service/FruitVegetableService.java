package org.dsa.collections.hashmappractice.service;

public interface FruitVegetableService {

        /**
         * 1. Print all keys and values using both Stream and for-each loop.
         */
        void printKeysAndValues();

        /**
         * 2. Print only the keys that have more than 2 elements in their value list.
         */
        void printKeysWithMoreThanTwoElements();

        /**
         * 3. Print all values (strings) that start with the letter "B".
         */
        void printValuesStartingWithB();

        /**
         * 4. Count how many times the letter 'a' (case-insensitive) appears in all strings combined.
         */
        void countLetterA();

        /**
         * 5. Convert all strings in the map to uppercase and print the new map.
         */
        void convertValuesToUpperCase();

        /**
         * 6. Create a new map where the key is the same,
         * but the value list is sorted alphabetically.
         */
        void sortValuesAlphabetically();

        /**
         * 7. Flatten all values (lists) from the map into a single List<String>.
         */
        void flattenToList();

        /**
         * 8. Group all strings by their first letter into a new Map<Character, List<String>>.
         */
        void groupByFirstLetter();

        /**
         * 9. Find the longest string in the entire map.
         */
        void findLongestString();

        /**
         * 10. Reverse the mapping: Create a Map<String, Integer> where
         * each string is a key, and the value is the original map's key it came from.
         */
        void reverseMapping();
}
