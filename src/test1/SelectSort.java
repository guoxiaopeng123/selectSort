package test1;

import java.util.Arrays;

/**
 *  直接选择排序
 *  若有n个数据，数据交换的次数最多有n-1，但程序比较的次数较多，时间效率为O(n的平方)
 */
public class SelectSort {

    public static void selectSort(DataWrap [] data){
        int length=data.length;
        for(int i=0;i<1;i++){
            for (int j=i+1;j<length;j++){
                if(data[i].compareTo(data[j])>0){
                    DataWrap tmp=data[i];
                    data[i]=data[j];
                    data[j]=tmp;
                }
            }
            System.out.println(Arrays.toString(data));
        }
    }
    public static void main(String[] args) {
        DataWrap [] data = {
                new DataWrap(21,""),
                new DataWrap(30,""),
                new DataWrap(49,""),
                new DataWrap(30,""),
                new DataWrap(16,""),
                new DataWrap(9,"") ,
                new DataWrap(6,"") ,
        };
        selectSort(data);
        System.out.println("sort :");
        System.out.println(Arrays.toString(data));
    }
}

class DataWrap implements Comparable<DataWrap>{
     int data;
     String flag;

    public DataWrap(int data, String flag) {
        this.data = data;
        this.flag = flag;
    }

    @Override
    public String toString() {
        return data+flag;
    }

    @Override
    public int compareTo(DataWrap o) {
        return this.data > o.data ? 1 : (this.data == o.data ? 0 : -1);
    }

}

