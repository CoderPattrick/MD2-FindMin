public class FindMin {
    public static void main(String[] args) {
        int array[]={3,4,66,3,2,8,-1,9,100};
        int indexMin=indexOfMin(array);
        System.out.printf("Min of array is %d at index %d",array[indexMin],indexMin);
    }
    public static int indexOfMin(int[] arr){
        int index=0;
        for (int i = 1; i <arr.length ; i++) {
            if(arr[index]>arr[i]){
                index=i;
            }
        }
        return index;
    }
}
