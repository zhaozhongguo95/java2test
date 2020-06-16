package Number;
/*
 *逻辑运算符
 *@Author zzg
 *@create 2020 06 02 12:49
 */

public class Caculation {
    public static void main(String[] args) {
        int a =2;
        int b=5;
        boolean result1=((a>b)&&(a!=b));
        boolean result2 = ((a>b)||(a!=b));
        System.out.println(result1);
        System.out.println(result2);
    }
}
