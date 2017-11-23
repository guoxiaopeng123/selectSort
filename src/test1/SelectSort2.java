package test1;

import java.util.Arrays;

public class SelectSort2 {
    public static void selectSort(DataWrap[] data){
        int length=data.length;
        for (int i = 0; i <length ; i++) {
            int minIndex=i;
            for (int j = i+1; j <length ; j++) {
                if(data[minIndex].compareTo(data[j])>0){
                    minIndex=j;
                }
            }
            if(minIndex!=i){
                 DataWrap tmp=data[i];
                 data[i]=data[minIndex];
                 data[minIndex]=tmp;
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
