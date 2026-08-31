import java.util.*;

public class SubarraySumEqualsK {
    static int subarraySum(int[] nums,int k){
        Map<Integer,Integer> map=new HashMap<>();
        map.put(0,1);
        int sum=0,count=0;
        for(int x:nums){
            sum+=x;
            count+=map.getOrDefault(sum-k,0);
            map.put(sum,map.getOrDefault(sum,0)+1);
        }
        return count;
    }
    public static void main(String[] args){
        int[] nums={1,1,1};
        System.out.println(subarraySum(nums,2));
    }
}
