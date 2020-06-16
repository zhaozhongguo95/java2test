package Number;
/*
 *打印9*9的星星
 *@Author zzg
 *@create 2020 06 02 19:53
 */

public class PrintStar {
    public static void main(String[] args) {
        //控制行
        for (int i = 1; i <9; i++) {
            //控制列
            for (int j = 1; j <= i; j++) {
                System.out.print("*");//不换行
            }
            System.out.println("\r");
        }
    }
}
