/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package sorting;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int[] arr1={2,4,5,7};
        int[] arr2={2,4,6};

        int[] c=merge(arr1, arr2);
        System.out.println(Arrays.toString(c));
    }
    public static int[] merge(int[] arr1, int[] arr2){
        int[] c=new int[arr1.length+arr2.length];
        int i=0, j=0, k=0;

        while(i<arr1.length && j<arr2.length) {
            if(arr1[i]<arr2[j]) {
                c[k++]=arr1[i++];
            } else {
                c[k++]=arr2[j++];
            }

        }
        while(i<arr1.length ){
            c[k++]=arr1[i++];
        }
        while( j<arr2.length){
            c[k++]=arr2[j++];
        }

        return c;

    }

}
