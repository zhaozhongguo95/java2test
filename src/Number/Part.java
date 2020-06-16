package Number;
/*
 *声明常量,通常大写，需要加上final
 *@Author zzg
 *@create 2020 06 02 12:22
 */

public class Part {
    static  final  double PI = 3.14;
    static  int age=23;//静态变量，可以跨库。

    public static void main(String[] args) {
        final int number = 110;
        age=22;
        System.out.println("常量PI:"+ PI);
        System.out.println("赋值后number值：" + number);
        System.out.println("int型变量age的值为："+age);
        System.out.println("打印First类中s1的值："+First.s1);
    }
}
