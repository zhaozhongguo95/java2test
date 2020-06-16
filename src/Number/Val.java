package Number;
/*
 *成员变量与局部变量,可以同名，相同时，成员变量被影藏
 *@Author zzg
 *@create 2020 06 02 12:33
 */

public class Val {
    static  int times=3;//成员变量
    public static void main(String[] args) {
        int times=4;//局部变量
        System.out.println("times的值："+times);
    }
}
