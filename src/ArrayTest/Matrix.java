package ArrayTest;
/*
 *输出3行4列的全零矩阵
 *@Author zzg
 *@create 2020 06 03 13:16
 */

public class Matrix {
    public static void main(String[] args) {
        int a[][] = new int[3][4];
        for (int i = 0; i < a.length; i++) {
            for (int j = 0; j < a[i].length; j++) {
                System.out.print(a[i][j]);
            }
            System.out.println();
        }
    }
}
