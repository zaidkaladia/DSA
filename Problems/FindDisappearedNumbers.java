import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindDisappearedNumbers {
    public static void main(String[] args) {
        int[] nums = {9,9,4,10,8,5,2,2,7,7};
        
        System.out.println(findDisappearedNumbers(nums));

    }

    static List<Integer> findDisappearedNumbers(int[] arr) {
        int i=0;
        while (i<arr.length){
            int correct = arr[i] - 1;
            if (arr[i] != arr[correct] && arr[correct] != correct+1){
                Swap(arr, i, correct);
            }
            else{
                i++;
            }

        }
        ArrayList<Integer> ans = new ArrayList<>();
        for(int j =0; j< arr.length;j++){
            if (arr[j]!=j+1){
                ans.add(j+1);
            }
        }
        return ans ;
    }
    static void Swap(int[] arr,int index1,int index2 ){
        int temp = arr[index1];
        arr[index1] = arr[index2];
        arr[index2] = temp;
    }
}
