package ArraysQuestions;

import java.util.HashMap;
import java.util.Map;

public class Count_of_Each_Element {
    public static void main(String[] args) {
        int[] arr = {10,40,40,20,30,30,30,5,10};
        countFrequency(arr);
    }
    public static void countFrequency(int[] arr){
        //Creating a map to store the element and its frequency.
        Map<Integer, Integer> map = new HashMap<>();

        //running the loop to store the element and its count in map.
        for (int i : arr) {
            //if the element is present in the map then increase the count by 1
            if (map.containsKey(i)) {
                map.put(i, map.get(i) + 1);
            }
            //else we are going to initialize the count for current element by 1
            else {
                map.put(i, 1);
            }
        }

        //Printing all the values of the Map using for each loop
        for (Map.Entry<Integer, Integer> element: map.entrySet()) {
            System.out.println(element.getKey() + " " + element.getValue());
        }
    }
}
