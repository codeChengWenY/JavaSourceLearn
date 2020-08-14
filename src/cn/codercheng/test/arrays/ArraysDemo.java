package cn.codercheng.test.arrays;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.CopyOnWriteArrayList;

/**
 * @ClassName ArraysDemo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-04-24 22:09
 * @Version V1.0
 **/
public class ArraysDemo {
    public static void main(String[] args) {


//        String[] a = {"aa", "bb", "cc"};
//        List arr = Arrays.asList(a);
//        a[1] = "dd";
//        arr.set(2, "22");
//
//        System.out.println("------------------------");
//
//        int[] i ={11,33};
//        List intlist = Arrays.asList(i);
//        for(Object o:intlist){
//            System.out.println(o.toString());
//        }
//        System.out.println("------------------------");


        int[] arr1=new int[]{1,2,3};
        int[] arr2= Arrays.copyOf(arr1, 1);
        for (int i = 0; i < arr2.length; i++) {
            System.out.println(arr2[i]);
        }
        int[] arr3 = new int[7];


        System.arraycopy(arr1,0,arr3,0,0);

        for ( int i = 0; i < arr3.length;  i++ ) {
            System.out.println(arr3[i]); // 0012000
        }


        CopyOnWriteArrayList copyOnWriteArrayList = new CopyOnWriteArrayList();
        copyOnWriteArrayList.add(1);
        copyOnWriteArrayList.add(3);
        copyOnWriteArrayList.add(2);

        copyOnWriteArrayList.add(0, 5);

        Iterator iterator = copyOnWriteArrayList.iterator();
        copyOnWriteArrayList.add(8);
        iterator.next();
        copyOnWriteArrayList.add(9);
        System.out.println(copyOnWriteArrayList);

//        CopyOnWriteArrayList copyOnWriteArrayList1 = new CopyOnWriteArrayList();
        CopyOnWriteArrayList copyOnWriteArrayList2 = new CopyOnWriteArrayList();
        copyOnWriteArrayList2.add(1);
        System.out.println(copyOnWriteArrayList2.toString());

    }
}
