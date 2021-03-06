package Array;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class PairGivenSum {
    public static void main(String[] args) {
        int arr[] = {8,7,2,5,3};
        int sum = 10;

        findpair(arr,sum);


    }
    static void findpair(int arr[]  ,int sum ){

        int Min = 0 ,Max = arr.length-1;

        Arrays.sort(arr);
        while (arr[Min] < arr[Max]){
            if (arr[Min] + arr[Max] == sum){
                System.out.println("Pair Found " + arr[Min] + " " + arr[Max]);
            }

            if (arr[Min] + arr[Max] < sum ){
                Min++;
            }else
                Max--;
        }
        System.out.println("Pair not found");
    }
    public int[] twoSum(int[] nums, int target) {

        Map<Integer,Integer> visitednumbers = new HashMap<>();
        for(int i =0;i < nums.length;i++){
            int delta = target - nums[i];
            if(visitednumbers.containsKey(delta)){
                return new int[] {i, visitednumbers.get(delta)} ;
            }

            visitednumbers.put(nums[i],i);


        }
        return new int[] {-1,-1};
    }
}
