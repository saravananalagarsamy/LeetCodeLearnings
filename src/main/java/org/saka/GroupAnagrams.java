package org.saka;

import java.util.*;

public class GroupAnagrams {
    //"act","pots","tops","cat","stop","hat"
    public static List<List<String>> getGroupAnagrams(List<String> data){
        HashMap<String,List<String>> result = new HashMap<>();
        ArrayList<String> subset;// = new ArrayList<>();
        data.stream().sorted().forEach(d -> {
            char[] dChar = d.toCharArray();
            Arrays.sort(dChar);
            String dCharStr = String.valueOf(dChar);
            if(result.containsKey(dCharStr)){
                result.get(dCharStr).add(d);
            }
            else{
                //subset = new ArrayList<>();
                result.putIfAbsent(dCharStr,new ArrayList<>());
                result.get(dCharStr).add(d);
            }
        });
        List<List<String>> fResult = new ArrayList<>();

        result.values().stream().forEach(t -> fResult.add(t));
        return fResult;

    }
}
