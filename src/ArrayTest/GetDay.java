package ArrayTest;
/*
 *实现将各月的天数输出
 *@Author zzg
 *@create 2020 06 03 13:12
 */

public class GetDay {
    public static void main(String[] args) {
        int day[] = {31,28,31,30,31,30,31,31,30,31,30,31};
        for (int i = 0; i < 12; i++) {
            System.out.println((i+1)+"月有"+day[i]+"天");
        }
    }
}
