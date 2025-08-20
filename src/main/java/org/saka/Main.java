package org.saka;

import java.util.*;
import java.util.stream.Collectors;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
            List<String> strs = new ArrayList<>(Arrays.asList("act","pots","tops","cat","stop","hat"));
            //GroupAnagrams.getGroupAnagrams(strs);
            int[] nums = new int[]{1,2,2,3,3,3};
            //KMostFrequestElementInAnArray.topKFrequent(nums,2);
            nums = new int[]{1,2};
            //KMostFrequestElementInAnArray.topKFrequent(nums,2);
            nums = new int[]{3,0,1,0};
            //KMostFrequestElementInAnArray.topKFrequent(nums,1);
            nums = new int[]{2,20,4,10,3,4,5};
            //LongestSequence.getLongestSequenceCnt(nums);
            nums = new int[]{0,3,2,5,4,6,1,1};
            //LongestSequence.getLongestSequenceCnt(nums);
            nums = new int[]{9,1,4,7,3,-1,0,5,8,-1,6};
            //LongestSequence.getLongestSequenceCnt(nums);
            nums = new int[]{9,1,-3,2,4,8,3,-1,6,-2,-4,7};
            //LongestSequence.getLongestSequenceCnt(nums);

            HashMap<String, Integer> nameage = new HashMap<>();
            nameage.putIfAbsent("Ada", 35);
            nameage.putIfAbsent("Adb", 30);
            nameage.putIfAbsent("Kda", 13);
            nameage.putIfAbsent("Kdb", 3);
            nameage.putIfAbsent("nii", 30);
            Main.printAdult(nameage);
        }

        public static void printAdult(HashMap<String,Integer> ng){
            Map<String,Integer> te = ng.entrySet().stream().filter(entry -> entry.getValue() > 20).collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue));
            te.entrySet().stream().forEach(entryset -> {System.out.println(entryset.getKey());});
        }
   }
