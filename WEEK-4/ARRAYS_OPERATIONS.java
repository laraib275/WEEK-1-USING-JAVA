public class ARRAYS_OPERATIONS {
    public static void main(String[] args) {
        int[] arr={1,4,7,4,3,7,9};
        System.out.println("sum of the arrays are: ");
        int sum=0;
        for(int i=0; i<arr.length; i++){
            sum=sum+arr[i];
        }
        System.out.println(sum);
        System.out.println("average of the arrays are: ");
        int avg=(sum)/arr.length;
        System.out.println(avg);
        System.out.println("maximum element inb the array are : ");
        int max=arr[0];
        for (int i = 1; i < arr.length; i++) {

            if(max<arr[i]){
              max=arr[i];
          }
        }
        System.out.println(max);
        int min=arr[0];
        for (int i = 1; i < arr.length; i++) {
            if(min>arr[i]){
                min=arr[i];
            }
        }
        System.out.println("minimum of the array are : ");
        System.out.println(min);
    }
}
