package cn.codercheng.test.thread;

import java.util.Random;
import java.util.concurrent.BrokenBarrierException;
import java.util.concurrent.CountDownLatch;
import java.util.concurrent.CyclicBarrier;

/**
 * @ClassName ThreadDemo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-04-16 14:54
 * @Version V1.0
 **/
public class ThreadDemo5 {


    public static void main(String[] args) {

        runABCWhenAllReady();
    }

    private static void runABCWhenAllReady() {
        int runner = 3;
        CyclicBarrier cyclicBarrier = new CyclicBarrier(runner);
        final Random random = new Random();
        for (char runnerName='A'; runnerName <= 'C'; runnerName++) {
            final String rN = String.valueOf(runnerName);
            new Thread(new Runnable() {
                @Override
                public void run() {
                    long prepareTime = random.nextInt(10000) + 100;
                    System.out.println(rN + " is preparing for time: " + prepareTime);
                    try {
                        Thread.sleep(prepareTime);
                    } catch (Exception e) {
                        e.printStackTrace();
                    }
                    try {
                        System.out.println(rN + " is prepared, waiting for others");
                        cyclicBarrier.await(); // 当前运动员准备完毕，等待别人准备好
                    } catch (InterruptedException e) {
                        e.printStackTrace();
                    } catch (BrokenBarrierException e) {
                        e.printStackTrace();
                    }
                    System.out.println(rN + " starts running"); // 所有运动员都准备好了，一起开始跑
                }
            }).start();
        }
    }}