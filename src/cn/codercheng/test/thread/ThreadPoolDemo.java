package cn.codercheng.test.thread;

import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/**
 * @ClassName ThreadPoolDemo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-04-16 15:18
 * @Version V1.0
 **/
public class ThreadPoolDemo {


    public static void main(String[] args) {

        System.out.println(Runtime.getRuntime().availableProcessors());
        ExecutorService executorService=Executors.newFixedThreadPool(Runtime.getRuntime().availableProcessors());



        //创建线程本地变量
        ThreadLocal<String> threadLocal = new ThreadLocal<String>();
        for (int i = 0; i < 10; i++) {
            executorService.execute(new Runnable() {
                @Override
                public void run() {
                    System.out.println("aa");
                }
            });
        }
        executorService.shutdown(); //一定要调用这个方法，不然executorService.isTerminated()永远不为true


        while(true){//等待所有任务都结束了继续执行
            try {
                if(executorService.isTerminated()){
                    System.out.println("所有的子线程都结束了！");
                    break;
                }
                Thread.sleep(1000);
            }catch (Exception e){
                e.printStackTrace();
            }
        }
    }
}

