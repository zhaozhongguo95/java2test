package StringTest;
/*
 *验证字符串操作和字符串生成器操作的效率
 *@Author zzg
 *@create 2020 06 03 12:39
 */

public class Jerque {
    public static void main(String[] args) {
        String str="";
        long startTime=System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            str = str + i;
        }
        long stopTime = System.currentTimeMillis();
        long time = stopTime-startTime;
        System.out.println("String消耗时间"+time);

        StringBuilder builder = new StringBuilder("");
        startTime = System.currentTimeMillis();
        for (int i = 0; i < 10000; i++) {
            builder.append(i);
        }
        stopTime = System.currentTimeMillis();
        time=stopTime-startTime;
        System.out.println("StringBuilder消耗时间" + time);
    }
}
