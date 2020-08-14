package cn.codercheng.test.objects;

import java.util.Objects;

/**
 * @ClassName Demo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-15 11:22
 * @Version V1.0
 **/
public class Demo {


    public static void main(String[] args) {



         int [] a={1,2,3};
        int[] b={1,2,3};


        Student student1=new Student(1,"张三");

        Student student2=new Student(1,"张三");


        System.out.println(Objects.deepEquals(a,b));

    }
}
