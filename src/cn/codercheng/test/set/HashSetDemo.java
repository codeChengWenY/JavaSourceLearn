package cn.codercheng.test.set;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * @ClassName HashSet
 * @Description:
 * @Author CoderCheng
 * @Date 2020-04-15 10:04
 * @Version V1.0
 **/
public class HashSetDemo {

    public static void main(String[] args) {


        Set set= new HashSet();
        set.add(1);
        for (Object o : set) {
            System.out.println(o);
        }


    }
}
