package org.saka;

import java.util.Arrays;

public class LongestSequence {
    public static int getLongestSequenceCnt(int[] nums){
        int[] t = nums;
        Arrays.sort(t);
        int currentmax = 0, newmax = 1;
        for(int i=0,j=i+1;j<t.length;i++,j++){
            if(t[i] == t[j]-1){
                newmax++;
            }
            else{
                if(t[i]!=t[j]){
                    if(currentmax < newmax ){
                        currentmax = newmax;
                        newmax =1;
                    }
                }
            }
        }
        return Math.max(currentmax, newmax);
    }
}
