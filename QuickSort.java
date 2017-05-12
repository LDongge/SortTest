package r20170223evening;

import java.util.Arrays;

/**
 * Created by ldgg on 2017/2/24.
 */
public class QuickSort {
    public static int middle(int[] datas,int left,int right){
        int p = datas[left];
        while (left < right){
            while (left < right && datas[right] >= p){
                right--;
            }
            datas[left] = datas[right];
            while (left < right && datas[left] < p){
                left++;
            }
            datas[right] = datas[left];
        }
        datas[right] = p;
        return left;
    }

    public static int[] sort(int[] datas,int left,int right){
        if (left < right){
            int mid = middle(datas,left,right);
            sort(datas,left,mid);
            sort(datas,mid + 1,right);
        }
        return datas;
    }
    public static void sort(int[] datas){
        sort(datas,0,datas.length-1);
    }

//    public static int  sor(int[] datas, int left, int right) {
//        int p = datas[left];
//        while (left < right) {
//            while (left < right && datas[right] >= p) {
//                right--;
//            }
//            datas[left] = datas[right];
//            while (left < right && datas[left] <= p) {
//                left++;
//            }
//            datas[right] = datas[left];
//        }
//        datas[left] = p;
//        return left;
//    }
//
//    public static int[] sort(int[] datas, int left, int right) {
//        if (left < right) {
//            int mid = sor(datas, left, right);
//            sort(datas, left, mid - 1);
//            sort(datas, mid + 1, right);
//        }
//        return datas;
//    }
//
//    public static void sort(int[] datas) {
//        sort(datas, 0, datas.length - 1);
//    }
//
//    public static void main(String[] args) {
//        int[] datas = {1, 33, 4, 55, 6, 77};
//        sort(datas);
////        System.out.println(Arrays.toString(datas));
//        for (int data : datas){
//            System.out.println(data);
//        }
//    }
}
