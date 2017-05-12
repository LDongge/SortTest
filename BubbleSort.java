package r20170222;

/**
 * Created by ldgg on 2017/2/24.
 */
public class BubbleSort {
    private void sort(int[] datas){
        int temp = 0;
        for (int i = 0;i < datas.length-1;i++){
            for (int j = 0;j < datas.length-1-i;j++){
                if (datas[j]>datas[j + 1]){
                    temp = datas[j];
                    datas[j] = datas[j + 1];
                    datas[j + 1] = temp;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] datas= {1,33,5,66,7,88};
        new BubbleSort().sort(datas);
        for(Integer dat : datas){
            System.out.println(dat);
        }
    }
}
