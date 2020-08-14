package cn.codercheng.test.map;

import java.util.TreeMap;

/**
 * @ClassName TreeMap
 * @Description:
 * @Author CoderCheng
 * @Date 2020-04-14 17:45
 * @Version V1.0
 **/
public class TreeMapDemo {

    public static void main(String[] args) {

        TreeMap<String, Integer> treeMap= new TreeMap();
        treeMap.put("ddd", 5);
        treeMap. put("aa", 4);
        treeMap .put("ccc", 1);

        treeMap.forEach((key,vale)->{


            System.out.println("键"+key+"---"+vale);

        });

    }
}
