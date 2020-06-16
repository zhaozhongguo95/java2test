package ArrayTest;
/*
 *对数组进行排序
 *@Author zzg
 *@create 2020 06 03 14:01
 */

import java.util.Arrays;

public class Taxis {
    public static void main(String[] args) {
        int arr[] = new int[]{23,43,12,9};
        Arrays.sort(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
}
