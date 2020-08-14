package cn.codercheng.test.thread;

/**
 * @ClassName ThreadDemo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-04-16 14:54
 * @Version V1.0
 **/
public class ThreadDemo {


    public static void main(String[] args) {
    // 两个线程依次执行
        demo1();
    }

    private static void demo1() {
        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                printNumber("A");
            }
        });
        Thread B = new Thread(new Runnable() {
            @Override
            public void run() {
                printNumber("B");
            }
        });
        A.start();
        B.start();
    }

    private static void printNumber(String threadName) {
        int i=0;
        while (i++ < 3) {
            try {
                Thread.sleep(100);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
            System.out.println(threadName + " print: " + i);
        }
    }
}
