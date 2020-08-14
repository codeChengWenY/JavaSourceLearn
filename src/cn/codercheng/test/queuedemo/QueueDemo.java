package cn.codercheng.test.queuedemo;

import java.util.concurrent.LinkedBlockingDeque;

/**
 * @ClassName QueueDemo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-07-01 14:35
 * @Version V1.0
 **/
public class QueueDemo {

    public static void main(String[] args) throws InterruptedException {


        LinkedBlockingDeque linkedBlockingDeque = new LinkedBlockingDeque(1);
        linkedBlockingDeque.put(1);
        //阻塞了
        new Thread(new Runnable() {
            @Override
            public void run() {
                try {

                    Thread.sleep(3000);
                    System.out.println("子线程跑起来了");
                    linkedBlockingDeque.take();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }
        },"线程1").start();

        linkedBlockingDeque .put(2);

        System.out.println("其他线程消费了");


    }


}
