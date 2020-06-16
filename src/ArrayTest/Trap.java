package ArrayTest;
/*
 *遍历数组1
 *@Author zzg
 *@create 2020 06 03 13:20
 */

public class Trap {
    public static void main(String[] args) {
        int b[][] = new int[][]{{1},{2,3},{4,5,6,}};
        for (int i = 0; i < b.length; i++) {
            for (int j = 0; j < b[i].length; j++) {
                System.out.print(b[i][j]);
            }
            System.out.println();
        }
    }
}
