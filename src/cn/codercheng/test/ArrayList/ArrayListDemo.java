package cn.codercheng.test.ArrayList;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.LinkedList;
import java.util.List;

/**
 * @ClassName ArrayListDemo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-04-14 16:46
 * @Version V1.0
 **/
public class ArrayListDemo {

    public static void main(String[] args) {

//        List<String> list = new ArrayList<>(1);
//
//
//        list .add("aaa");
//        list .add("bbb");
//        list .add("ccc");
//        list .add(1,"ccc");
//
//
//        list.removeIf(string->string.equals("aaa"));
//
//
//
//        list.forEach(item ->{
//
//
//            System.out.println(item);
//
//        });



//        LinkedList<String> linkedList = new LinkedList<>();
//        linkedList.addFirst("1");
//         linkedList.add("2");
//        linkedList.add("3");
//
//        // linkedList.get(1);
//        linkedList.remove(1);
//       // linkedList.remove();
//
//        //testVariable
//        System.out.println(linkedList);


        List<Integer> list = new ArrayList<Integer>(){{
            add(1);
            add(2);
            add(3);
            add(4);
        }};
  // List<Integer> list2 = list.toArray();

        Integer[] array0 = new Integer[10];
      Integer[] b= list.toArray(array0);

        System.out.println(array0[8]+"---"+b[9]);



       // Integer[] array0 = new Integer[4];


//        Object[]a ={1,2,3,4};

       // System.out.println(Arrays.copyOf(a, 4, array0.getClass()).toString());

        // 反转list

    }
}
