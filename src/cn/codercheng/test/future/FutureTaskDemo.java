package cn.codercheng.test.future;

import java.util.concurrent.*;

/**
 * @ClassName FutureTaskDemo
 * @Description:
 * @Author CoderCheng
 * @Date 2020-07-22 09:52
 * @Version V1.0
 **/
public class FutureTaskDemo {


    public static void main(String[] args) throws ExecutionException, InterruptedException {

        ThreadPoolExecutor executor = new ThreadPoolExecutor(3, 3, 0L, TimeUnit.MILLISECONDS,
                new LinkedBlockingQueue<>());

        // futureTask 我们叫做线程任务，构造器的入参是 Callable
        FutureTask futureTask = new FutureTask(new Runnable() {

            @Override
            public void run() {

            }
        }, null);
// 把任务提交到线程池中，线程池会分配线程帮我们执行任务
        executor.submit(futureTask);
// 得到任务执行的结果
        String result = (String) futureTask.get();
        System.out.println(result);
    }
}
