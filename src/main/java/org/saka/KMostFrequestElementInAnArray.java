package org.saka;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class KMostFrequestElementInAnArray {
    public static int[] topKFrequent(int[] nums, int k){
        HashMap<Integer,Integer> numCountMap = new HashMap<Integer, Integer>();
        Arrays.stream(nums).forEach(v -> {
            if(numCountMap.containsKey(v)){
                numCountMap.computeIfPresent(v,(key,oldValue) -> oldValue+1);
            }
            else{
                numCountMap.putIfAbsent(v,1);
            }
        });
        Map<Integer,Integer> result = numCountMap.entrySet().stream().filter(entry -> entry.getValue() >= k).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
        int[] res = result.keySet().stream().mapToInt(Integer::intValue).toArray();
        return res.length > 1 ? res : nums;
    }
}
