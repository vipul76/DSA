package leetcode.slidingwindow;

import java.util.HashMap;
import java.util.Map;

public class FruitIntoBasket {
    static void main() {
        int[] fruits = {1,2,3,2,2};//{0,1,2,2};
        int maxElement = totalFruit(fruits);
        System.out.println(maxElement);
    }

    private static int totalFruit(int[] fruits) {
        int low = 0, maxLength = -1, k=2;
        Map<Integer,Integer> hm = new HashMap<>();

        for (int high=0;high<fruits.length;high++){

            hm.put(fruits[high], hm.getOrDefault(fruits[high],0)+1);

            while (hm.size()>k){
                int removeElement = fruits[low];
                hm.put(removeElement,hm.get(removeElement)-1);

                if(hm.get(removeElement)==0){
                    hm.remove(removeElement);
                }
                low++;
            }
                maxLength = Integer.max(maxLength,high-low+1);
        }
        return maxLength;
    }
/*
    private static int totalFruit(int[] fruits) {
        Map<Integer, Integer> hm = new HashMap<>();
        int max1=0,max2=0;

        for(int i=0;i<fruits.length;i++){
            hm.put(fruits[i],hm.getOrDefault(fruits[i],0)+1);
            if(hm.get(fruits[i])>max1){
                max2=max1;
                max1=hm.get(fruits[i]);
            } else if (hm.get(fruits[i])>max2 && hm.get(fruits[i])<max1) {
                max2=hm.get(fruits[i]);
            }
        }
        return max1+max2;
    }
    */
}
