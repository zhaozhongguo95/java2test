package WrappedClassTest;
/*
 *实现string类型数组中的元素转换成int型，并将各元素相加
 *@Author zzg
 *@create 2020 06 08 23:04
 */

import java.lang.Integer;

public class Summation {
    public static void main(String[] args) {
        String str[] = {"89","23","43","12","100"};
        int sum=0;
        for (int i = 0; i < str.length; i++) {
            int myint=Integer.parseInt(str[i]);
            sum = sum+myint;
        }
        System.out.println("数组中的各元素之和是："+sum);
    }
}
