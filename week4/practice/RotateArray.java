import java.util.*;

public class RotateArray {
    static int[] rotateArray(int[] nums,int k){
        int n=nums.length;
        k%=n;
        int[] res=new int[n];
        for(int i=0;i<n;i++){
            res[(i+k)%n]=nums[i];
        }
        return res;
    }
    public static void main(String[] args){
        int[] nums={1,2,3,4,5,6,7};
        int[] res=rotateArray(nums,3);
        System.out.println(Arrays.toString(res));
    }
}
