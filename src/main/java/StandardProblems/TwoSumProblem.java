package StandardProblems;

import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {
    public static int[] twoSum(int[] nums, int target) {
        HashMap<Integer,Integer> numMap = new HashMap<>();
        int i,n;

        n=nums.length;
        for(i=0;i<n;i++){
            int secondNum = target-nums[i];
            if(numMap.containsKey(secondNum)){
                return new int[]{numMap.get(secondNum), i};
            }
            else{
                numMap.put(nums[i],i);
            }


        }
        return new int[]{};
    }

    public static void main(String[] args){

        int[] data = {2,7,11,15};
        int target = 9;
        int[] result = twoSum(data, target);

        for(int k=0; k<result.length;k++){
            System.out.println(data[result[k]]);
        }

    }
}
