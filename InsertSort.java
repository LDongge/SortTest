package r20170223evening;

/**
 * Created by ldgg on 2017/4/27.
 */
public class InsertSort {

    public int[] insertSort(int[] ints) {
        for (int i = 0; ++i < ints.length && i < ints.length; i++) {
            if (ints[i] < ints[++i]) {
                continue;
            } else {
                swap(i, i++);
                for (int j = i - 1; i - 1 >= 0 && j >= 0; j--) {
                    if (ints[i - 1] < ints[i]) {
                        continue;
                    } else {
                        swap(i - 1, i);
                    }
                }
            }
        }
        return ints;
    }

    public void swap(int i, int j) {
        int temp;
        temp = i;
        i = j;
        j = temp;
    }

    public static void main(String[] args) {
        int[] ints = {2, 33, 4, 55, 6};
        InsertSort insertSort = new InsertSort();
        for (int a : insertSort.insertSort(ints)) {
            System.out.println(a);
        }
    }
}

