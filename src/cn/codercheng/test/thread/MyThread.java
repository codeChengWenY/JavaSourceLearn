package cn.codercheng.test.thread;

/**
 * @ClassName MyThread
 * @Description:
 * @Author CoderCheng
 * @Date 2020-06-10 15:01
 * @Version V1.0
 **/
public class MyThread extends Thread {

    @Override
    public void run() {
        System.out.println("打印");
    }

    public static void main(String[] args) {


        new MyThread().start();
    }
}

