package Number;
/*
 *比较运算符
 *@Author zzg
 *@create 2020 06 02 12:41
 */

import java.net.SocketTimeoutException;

public class Compare {

    public static void main(String[] args) {
        int number1 = 4;
        int number2 = 5;
        number1+= number1++;
        number2+=++number2;
        System.out.println("number1:"+number1);
        System.out.println("number2:"+number2);
        System.out.println(number1>number2);
        System.out.println(number1==number2);
        System.out.println(number1>number2);

    }
}
