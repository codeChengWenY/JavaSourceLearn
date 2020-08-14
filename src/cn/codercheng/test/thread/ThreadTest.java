package cn.codercheng.test.thread;

/**
 * @ClassName ThredDemo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-07-02 15:11
 * @Version V1.0
 **/
public class ThreadTest {

    private static  ThreadLocal<Integer>firstNum=new ThreadLocal<Integer>();
    private static  ThreadLocal<Integer>secondNum=new ThreadLocal<Integer>(){
        @Override
        protected  Integer initialValue(){
            return 12;
        }
    };




    public static void main(String[] args) {

        System.out.println(firstNum.get());
        System.out.println(secondNum.get());

        System.out.println(System.identityHashCode("aa"));



    }
}
