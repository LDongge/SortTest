package r20170223evening;

/**
 * Created by ldgg on 2017/2/24.
 */
public class HeapSort {
    public static void sort(int[] datas) {
        creat(datas);
        for (int i = datas.length; i > 0; i--) {
            swap(datas, 0, i - 1);
            adjust(datas, 0, i - 1);
        }

    }

    public static void creat(int[] datas) {
        for (int i = datas.length / 2 - 1; i >= 0; i--) {
            adjust(datas, i, datas.length);
        }
    }

    public static void adjust(int[] datas, int i, int length) {
        int left = 2 * i + 1;
        if (left >= length) {
            return;
        }
        if (left + 1 < length && datas[left] < datas[left + 1]) {
            left++;
        }
        if (datas[left] > datas[i]) {
            swap(datas, left, i);
            adjust(datas, left, length);
        }
    }

    public static void swap(int[] a, int index1, int index2) {
        int temp = a[index1];
        a[index1] = a[index2];
        a[index2] = temp;
    }

    public static void main(String[] args) {
        int[] datas = {3, 44, 5, 66, 66, 7, 88};
        sort(datas);
        for (int data : datas) {
            System.out.println(data);
        }
    }
}


