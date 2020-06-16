package ArrayTest;
/*
 *实现fill()方法填充数组元素
 *@Author zzg
 *@create 2020 06 03 13:28
 */
import java.util.Arrays;
public class Swap {
    public static void main(String[] args) {
        int arr[] = new int[5];
        Arrays.fill(arr,8);//使用同一个值对数组进行填充
        for (int i = 0; i < arr.length; i++) {
            System.out.println("第"+i+"个元素是"+arr[i]);
        }
    }
}
