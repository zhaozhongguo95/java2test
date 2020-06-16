package Number;
/*
 *隐式类型转换
 *@Author zzg
 *@create 2020 06 02 13:02
 */

public class Conver {
    public static void main(String[] args) {
        byte mybyte = 127;
        int myint=150;
        float myfloat = 452.12f;
        char mychar = 10;
        double mydouble=45.46546;
        System.out.println("byte与float进行运算："+(mybyte+myfloat));
        System.out.println("byte与int进行运算："+(mybyte*myint));
        System.out.println("byte与char进行运算："+(mybyte/mychar));
        System.out.println("double与char进行运算："+(mydouble+mychar));

    }
}
