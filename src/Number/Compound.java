package Number;
/*
 *复合语句
 *@Author zzg
 *@create 2020 06 02 19:41
 */

public class Compound{

    public static void main(String[] args) {
        int x = 20;
        {
            int y =40;
            System.out.println(y);
            int z = 245;
            boolean b;
            {
                b = y>z;
                System.out.println(b);
            }
        }
        String word = "hello java";
        System.out.println(word);
    }
}
