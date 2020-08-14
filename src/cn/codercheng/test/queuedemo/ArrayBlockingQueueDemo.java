package cn.codercheng.test.queuedemo;

import java.util.concurrent.ArrayBlockingQueue;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName ArrayBlockingQueueDemo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-07-03 10:52
 * @Version V1.0
 **/
public class ArrayBlockingQueueDemo {


    public static void main(String[] args) throws InterruptedException {


        ArrayBlockingQueue arrayBlockingQueue = new ArrayBlockingQueue<>(1);
        arrayBlockingQueue.put(1);

        ExecutorService executorService = Executors.newFixedThreadPool(10);
        executorService.submit(

                new Runnable() {
                    @Override
                    public void run() {
                        try {
                            arrayBlockingQueue.put(2);
                        } catch (InterruptedException e) {
                            e.printStackTrace();
                        }

                    }
                }
        );

    }
}
