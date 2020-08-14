package cn.codercheng.test.thread;

/**
 * @ClassName ThreadDemo2
 * @Description:   B 在 A 全部打印 完后再开始打
 * @Author CoderCheng
 * @Date 2020-04-16 15:04
 * @Version V1.0
 **/
public class ThreadDemo2 {


    public static void main(String[] args) {
   // B 在 A 全部打印 完后再开始打
        demo2();
    }


    private static void demo2() {
        Thread A = new Thread(new Runnable() {
            @Override
            public void run() {
                printNumber("A");
            }
        });
        Thread B = new Thread(new Runnable() {
            @Override
            public void run() {
                System.out.println("B 开始等待 A");
                try {
                    A.join();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }
                printNumber("B");
            }
        });
        B.start();
        A.start();
    }


    private static void printNumber(String threadName) {
        int i=0;
        while (i++ < 3) {
//            try {
//                Thread.sleep(100);
//            } catch (InterruptedException e) {
//                e.printStackTrace();
//            }
            System.out.println(threadName + " print: " + i);
        }
    }
}
