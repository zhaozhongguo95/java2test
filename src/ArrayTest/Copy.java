package ArrayTest;
/*
 *复制数组
 *@Author zzg
 *@create 2020 06 03 14:09
 */

import java.util.Arrays;

public class Copy {
    public static void main(String[] args) {
        int arr[] = new int[]{23,3,2,4,32};
        int newarr[] = Arrays.copyOf(arr,9);
        int newarr2[] = Arrays.copyOfRange(newarr,0,5);
        for (int i = 0; i < newarr.length; i++) {
            System.out.print(newarr[i]);
        }
        System.out.println();
        for (int i = 0; i < newarr2.length; i++) {
            System.out.print(newarr2[i]);
        }
    }
}
