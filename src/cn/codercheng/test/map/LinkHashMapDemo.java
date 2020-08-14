package cn.codercheng.test.map;

import java.util.LinkedHashMap;
import java.util.TreeMap;

/**
 * @ClassName LinkHashMapDemo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-04-14 17:52
 * @Version V1.0
 **/
public class LinkHashMapDemo {


    public static void main(String[] args) {

        LinkedHashMap<String, Integer> linkedHashMap= new LinkedHashMap<>();
        linkedHashMap.put("ddd", 5);
        linkedHashMap. put("aaa", 4);
        linkedHashMap .put("ccc", 1);

        linkedHashMap.forEach((key,vale)->{


            System.out.println("键"+key+"---"+vale);

        });

    }
}
