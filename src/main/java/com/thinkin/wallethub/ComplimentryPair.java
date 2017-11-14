package com.thinkin.wallethub;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class ComplimentryPair {
    public int noOfComplimentryPairUsingEight(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<Integer, Integer>();
        for (int i = 0; i < arr.length; i++) {
            map.merge(k - arr[i], 1, Integer::sum);
        }
        return Arrays.stream(arr).map(element -> map.getOrDefault(element, 0)).sum();
    }

    public int noOfComplimentaryPair(int[] arr, int k) {
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            int complValue = k - arr[i];
            int tempValue = map.containsKey(complValue) ? map.get(complValue) : 0;
            map.put(complValue, tempValue + 1);
        }

        int counter = 0;
        for (int i = 0; i < arr.length; i++) {
            counter += map.containsKey(arr[i]) ? map.get(arr[i]) : 0;
        }
        return counter;
    }
}
