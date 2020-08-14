package cn.codercheng.test.queuedemo;

import java.util.concurrent.*;

/**
 * @ClassName DelayQueueDemo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-07-02 10:01
 * @Version V1.0
 **/
public class DelayQueueDemo {


    static class Consumer implements Runnable {

        private DelayQueue<Message> delayQueue;


        public Consumer(DelayQueue<Message> delayQueue) {
            this.delayQueue = delayQueue;
        }

        @Override
        public void run() {
            while (true) {
                try {
                    long start = System.currentTimeMillis();
                    delayQueue.take().run();
                    long end = System.currentTimeMillis();
                } catch (InterruptedException e) {
                    e.printStackTrace();
                }

            }

        }
    }


    static class Message implements Delayed {

        private int id;

        private String body;

        private long excuteTime;

        private long startTime;

        public long getStartTime() {
            return startTime;
        }

        public void setStartTime(long startTime) {
            this.startTime = startTime;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }

        public String getBody() {
            return body;
        }

        public void setBody(String body) {
            this.body = body;
        }

        public long getExcuteTime() {
            return excuteTime;
        }

        public void setExcuteTime(long excuteTime) {
            this.excuteTime = excuteTime;
        }

        public Message(int id, String body, long excuteTime, long startTime) {
            this.id = id;
            this.body = body;
            this.excuteTime = excuteTime;
            this.startTime = startTime;
        }

        @Override
        public long getDelay(TimeUnit unit) {
            long convert = unit.convert(this.excuteTime - System.currentTimeMillis(), TimeUnit.MILLISECONDS);
            //System.out.println(convert);
            System.out.println(convert + ">>>>>>");

            return convert;
        }

        @Override
        public int compareTo(Delayed o) {
            return (int) (this.getDelay(TimeUnit.MILLISECONDS) - o.getDelay(TimeUnit.MILLISECONDS));
        }

        public void run() {
            System.out.println(String.format("执行%s现在已经过了%sms", body, (System.currentTimeMillis() - startTime)));
        }
    }


    public static void main(String[] args) {

        Thread thisThread = Thread.currentThread();
        System.out.println("线程名称为" + thisThread.getName());


        DelayQueue<Message> delayeds = new DelayQueue<>();
        // 添加延时消息,m 延时5s

        long beginTime = System.currentTimeMillis();

        Message message = new Message(1, "消息1", beginTime + 5000, beginTime);
        // 添加延时消息,m2 延时3s
        Message message1 = new Message(2, "消息2", beginTime + 30000, beginTime);

        delayeds.offer(message);
        delayeds.offer(message1);
        //  new Thread(new Consumer(delayeds),"延迟线程").start();

        ExecutorService executorService = Executors.newFixedThreadPool(3);
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Consumer(delayeds));

        }
    }
}
