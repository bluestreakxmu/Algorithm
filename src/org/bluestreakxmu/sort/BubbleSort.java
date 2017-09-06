package org.bluestreakxmu.sort;

/**
 * 冒泡排序算法实现类。
 * <p>
 * Created by LIXIBO on 2017/5/12.
 */
public class BubbleSort {

    /**
     * 冒泡排序。<br>
     * 会改变实参arr数组顺序。
     *
     * @param arr 需要排序的数组
     */
    public static void sort(Integer[] arr) {
        int remainLoop = arr.length - 1; // 剩余的循环数
        while (remainLoop > 0) {
            for (int i = 0; i < remainLoop; i++) {
                // 大的数字往后靠
                if (arr[i] > arr[i + 1]) {
                    int tmp = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = tmp;
                }
            }

            --remainLoop;
        }
    }
}
