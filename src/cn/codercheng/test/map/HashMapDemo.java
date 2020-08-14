package cn.codercheng.test.map;

import java.util.HashMap;
import java.util.Map;

/**
 * @ClassName HashMapDemo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-04-14 11:17
 * @Version V1.0
 **/
public class HashMapDemo {

    public static void main(String[] args) {

        Map map= new HashMap();


        map.put("cc", 1);
        map.put("aa", 1);

      Integer a= (Integer) map.getOrDefault("dd", 11);

      map.putIfAbsent("cc", 2);
        Object cc = map.get("cc");

        map.computeIfPresent(11, (key,value) -> (Integer)key * (Integer) value);
        System.out.println(map.get(11));
        System.out.println(cc);
        System.out.println(a);
        map.forEach((key,vale)->{


            System.out.println("键"+key+"---"+vale);

        });
    }
}
