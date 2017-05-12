package r20170228;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by ldgg on 2017/3/1.
 */
public class MergeSort {
    public static void merge(int[] data) {
        police(data, 0, data.length - 1);
    }

    public static void police(int[] data, int start, int end) {
        if (start < end) {
            int mid = (start + end) / 2;
            police(data, start, mid);
            police(data, mid + 1, end);
            merge(data, start, mid, end);
        }
    }

    public static void merge(int[] data1, int start, int mid, int end) {
        int index1 = start;
        int index2 = mid + 1;
        List<Integer> temp = new ArrayList<>();
        while (index1 <= mid && index2 <= end) {
            if (data1[index1] <= data1[index2]) {
                temp.add(data1[index1++]);
            } else {
                temp.add(data1[index2++]);
            }
        }
            while (index1 <= mid) {
                temp.add(data1[index1++]);
            }
            while (index2 <= end) {
                temp.add(data1[index2++]);
            }
            for (Integer data : temp) {
                data1[start++] = data;
            }
    }

    public static void main(String[] args) {
        int[] arr = {4, 55, 6, 77, 8, 8};
        merge(arr);
        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }
    }
//    public static int[] merge(int[] data1, int[] data2) {
//        int[] temp = new int[data1.length + data2.length];
//        int i = 0, j = 0, k = 0;
//        while (i < data1.length && j < data2.length) {
//            if (data1[i] < data2[j]) {
//                temp[k++] = data1[i++];
//            } else {
//                temp[k++] = data2[j++];
//            }
//
//        }
//        while (i < data1.length) {
//            temp[k++] = data1[i++];
//        }
//        while (j < data2.length) {
//            temp[k++] = data1[j++];
//        }
//        return temp;
//    }

}
