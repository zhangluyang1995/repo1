package cn.itcast.domain;

import java.util.Arrays;

public class Srot {

    public static void main(String[] args) {
        //创建一个数组
        int arr[] = {5,1,3,14,7,17,73,43,22,6};

        // 调用排序方法
        sort(arr);
    }

    /**
     * 排序方法
     * @param arr 接收一个数组
     */
    private static void sort(int arr[]){
        //定义一个空变量
        int temp = 0;
        for (int i = 0; i < arr.length; i++) {

            for (int j = i+1; j < arr.length; j++) {
                if (arr[j]<arr[i]){
                    temp = arr[j];
                    arr[j] = arr[i] ;
                    arr[i] = temp;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
