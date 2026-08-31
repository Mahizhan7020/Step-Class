import java.util.*;

public class MergeArrays {
    static int[] mergeSortedArrays(int[] arr1,int[] arr2){
        int i=0,j=0,k=0;
        int[] res=new int[arr1.length+arr2.length];
        while(i<arr1.length && j<arr2.length){
            if(arr1[i]<=arr2[j]) res[k++]=arr1[i++];
            else res[k++]=arr2[j++];
        }
        while(i<arr1.length) res[k++]=arr1[i++];
        while(j<arr2.length) res[k++]=arr2[j++];
        return res;
    }
    public static void main(String[] args){
        int[] arr1={1,3,5},arr2={2,4,6};
        int[] res=mergeSortedArrays(arr1,arr2);
        System.out.println(Arrays.toString(res));
    }
}
