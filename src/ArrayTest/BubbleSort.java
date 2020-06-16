package ArrayTest;
/*
 *冒泡排序
 *@Author zzg
 *@create 2020 06 03 14:46
 */

public class BubbleSort {
    public static void main(String[] args) {
        int[] array = {63, 4, 24, 1, 3, 15};
        BubbleSort sorter = new BubbleSort();
        sorter.sort(array);
    }
    /**
     * 冒泡排序
     */
    private void sort(int[] array){
        for (int i = 1; i < array.length; i++) {
            for (int j = 0; j < array.length-1; j++) {
                if(array[j]>array[j+1]){
                    int temp = array[j];
                    array[j] = array[j+1];
                    array[j+1] = temp;
                }
            }
        }
        showArray(array);
    }

    /**
     * 显示数组中的所有元素
     * @param array
     */
    private void showArray(int[] array) {
        for(int i: array){
            System.out.print(">"+i);
        }
        System.out.println();
    }

}
