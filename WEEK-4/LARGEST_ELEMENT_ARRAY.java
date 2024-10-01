public class LARGEST_ELEMENT_ARRAY {
    public static void main(String[] args) {
        int[] arr={3,8,9,1,3,6,88};
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(arr[i]>max) {
                max=arr[i];
            }
        }
        System.out.println("largest elemnt in the array is ");
        System.out.println(max);
    }
}
