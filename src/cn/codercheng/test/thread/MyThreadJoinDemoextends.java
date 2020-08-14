package cn.codercheng.test.thread;

/**
 * @ClassName MyThreadJoinDemo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-04-22 10:56
 * @Version V1.0
 **/
public class MyThreadJoinDemoextends  extends  Thread {

    @Override
    public void run() {
        try {
            int time = 2000;
            System.out.println(Thread.currentThread().getName() + " 执行："
                    + time / 1000 + "s");
            Thread.sleep(time);
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) throws InterruptedException {

       long start=  System.currentTimeMillis();
        MyThreadJoinDemoextends myThread1 = new MyThreadJoinDemoextends();
        MyThreadJoinDemoextendTwo myThread2 = new MyThreadJoinDemoextendTwo();
        myThread1.start();
        myThread2.start();
        myThread1.join();
        myThread2.join();
        System.out.println("我想当 myThread 对象执行完毕之后我在执行");
        System.out.println(System.currentTimeMillis()-start);
    }

}

     class MyThreadJoinDemoextendTwo  extends  Thread {

        @Override
        public void run() {
            try {
                int time = 3000;
                System.out.println(Thread.currentThread().getName() + " 执行："
                        + time / 1000 + "s");
                Thread.sleep(time);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }


}
