package Number;
/*
 *使用continue跳出循环
 *@Author zzg
 *@create 2020 06 02 22:25
 */

public class ContinueTest {
    //可以使用标签（Con）跳出循环，和break一样。
    public static void main(String[] args) {
        Con:for (int i = 1; i < 20; i++) {
            if(i % 2==0){
                continue Con;
            }
            System.out.println(i);
        }
    }
}
