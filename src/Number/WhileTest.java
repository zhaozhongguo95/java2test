package Number;
/*
 *循环计算1+1/2!+1/3!+...1/20!
 *@Author zzg
 *@create 2020 06 02 22:34
 */

import java.sql.SQLOutput;

public class WhileTest {
    private  static int factorial(int number){
        //计算number的阶乘
        int sum=1;
        for (int i = 1; i <= number; i++) {
            sum *= i;
        }
        return sum;

    }

    public static void main(String[] args) {
        float sum_all = 0;
        for (int i = 1; i <= 20; i++) {
            sum_all += (1f/factorial(i));
        }
        System.out.println(sum_all);

    }

}
