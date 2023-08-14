public class MaxRange {
    public static void main(String[] args) {
        int[] zaid = {1,2,0,4,5,6};
        System.out.println(MaxRange(zaid,0,2));
    }
    static int MaxRange(int[] arr,int index1 ,int index2){
        int max = arr[index1];
        for (int i = index1; i <= index2; i++) {
            if (max< arr[i]){
                max = arr[i];
            }
        }
        return max;
    }
}
