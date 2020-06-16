package ArrayTest;
/*
 *直接选择排序
 *@Author zzg
 *@create 2020 06 03 15:15
 */

public class SelectSort {
    public static void main(String[] args) {
        int[] array ={63, 4, 24, 1, 3, 15};
        SelectSort sorter = new SelectSort();
        sorter.sort(array);
    }



    /**
     * 选择排序
     */
    private void sort(int[] array) {
        int index;
        for (int i = 1; i < array.length; i++) {
            index=0;
            for (int j = 1; j < array.length-1; j++) {
                if(array[j]>array[index]){
                    index=j;
                }
            }
            int temp = array[array.length-i];
            array[array.length-i] = array[index];
            array[index] = temp;
        }
        showArray(array);
    }

    /**
     * 显示数组中的所有元素
     *
     * @param array
     */
    private void showArray(int[] array) {
        for (int i : array) {
            System.out.print(">" + i);
        }
        System.out.println();
    }

}

