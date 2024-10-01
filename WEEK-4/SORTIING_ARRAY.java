public class SORTIING_ARRAY {
    public static void main(String[] args) {
        int[] arr={7,55,2,88,5,6,0,34,4};
        int temp;
        for(int i=0; i<arr.length; i++) {
            for (int j = i+1; j <arr.length ; j++) {
                if(arr[i]>arr[j]){
                    temp=arr[i];
                    arr[i]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        System.out.println("after bubble sort : ");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + " ");
        }
    }
}
