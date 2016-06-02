import java.util.Scanner;

/**
 * Created by sam on 18.05.16.
 */
public class lesson3Trier {
    public static void main(String[] args){


        int i=0,j=0;
        int arr1[]=new int[20];
        for (i=0;i<arr1.length;i++) {
            arr1[i]=(int)(Math.random()*100);
            System.out.print(" "+arr1[i]);
        }
        System.out.println();
        for (j=0;j<arr1.length-1;j++){
        for (i=0;i<arr1.length-1;i++) {
            if (arr1[i] > arr1[i + 1]) {
                int arr2 = arr1[i];
                arr1[i] = arr1[i + 1];
                arr1[i + 1] = arr2;
            }
        }
        }
        for (int k=0;k<arr1.length;k++) {
            System.out.print(" " + arr1[k]);
        }
    }
}
