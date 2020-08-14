package cn.codercheng.test.ArrayList;

/**
 * @ClassName ThreadLocalNormalUsage06
 * @Description:
 * @Author CoderCheng
 * @Date 2020-04-16 14:25
 * @Version V1.0
 **/

/**
 * 演示 ThreadLocal 的用法2：避免参数传递的麻烦
 */
public class ThreadLocalNormalUsage06 {


    public static void main(String[] args) {

       new Service1().process();
    }
}

class Service1 {

    public void process() {
        User user = new User("鲁毅");
        //将User对象存储到 holder 中
        UserContextHolder.holder.set(user);
        new Service2().process();
    }
}

class Service2 {

    public void process() {
        User user1 = new User("张三");
        ThreadLocal<User> holder = new ThreadLocal<>();
        UserContextHolder.holder.set(user1);
        User user = UserContextHolder.holder.get();
        System.out.println("Service2拿到用户名: " + user.name);
        new Service3().process();
    }
}

class Service3 {

    public void process() {
        User user = UserContextHolder.holder.get();
        System.out.println("Service3拿到用户名: " + user.name);
    }
}


class UserContextHolder {

    public static  final ThreadLocal<User> holder = new ThreadLocal<>();
}

class User {

    String name;

    public User(String name) {
        this.name = name;
    }
}