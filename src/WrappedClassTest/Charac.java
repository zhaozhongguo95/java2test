package WrappedClassTest;
/*
 *实现将字符变量以2，16，8进制输出
 *@Author zzg
 *@create 2020 06 08 23:10
 */

public class Charac {
    public static void main(String[] args) {
        String str = Integer.toString(456);
        String str2 = Integer.toHexString(456);//16
        String str3 = Integer.toOctalString(456);//8
        String str4 = Integer.toBinaryString(456);//2
        System.out.println(str);
        System.out.println(str2);
        System.out.println(str3);
        System.out.println(str4);
    }

}
