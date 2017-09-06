package org.bluestreakxmu.sort;

import org.bluestreakxmu.sort.BubbleSort;
import org.junit.Test;

import static org.junit.Assert.*;

/**
 * 冒泡排序单元测试。
 * <p>
 * Created by LIXIBO on 2017/5/12.
 */
public class BubbleSortTest {

    @Test
    public void sort() throws Exception {
        Integer[] arr = {36, 25, 48, 12, 25, 65, 43, 57};
        Integer[] correctArr = {12, 25, 25, 36, 43, 48, 57, 65};

        // 调用排序
        BubbleSort.sort(arr);

        assertArrayEquals(arr, correctArr);
    }

}