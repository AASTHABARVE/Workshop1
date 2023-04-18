package com.bl.workshop;

import java.util.Arrays;

//1,0,0,0,1,1,1,0,0,1,1,1,0,1
//shift all one to left
//and zeros to right
public class ShiftIntValue{
    public static void main(String aa[])
    {
        int[] arr  = {1,0,0,0,1,1,1,0,0,1,1,1,0,1};

        Arrays.sort(arr);
        System.out.println("sorting");
        for(int i=0; i<arr.length;i++) {
            System.out.print(arr[i]);
        }

    }

}
