package cn.codercheng.test.GcTest;


/**
 * @ClassName GCTest
 * @Description:
 * @Author CoderCheng
 * @Date 2020-05-28 10:48
 * @Version V1.0
 **/
public class GCTest {

    public Object instance=null;

    private static  final  int _1MB=1024*1024;

    private  byte[] bigSize=new byte[2*_1MB];


    public static void main(String[] args) {


        GCTest  objA=  new GCTest();
        GCTest  objb=  new GCTest();


        objA.instance=objb;
        objb.instance=objA;


        System.gc();

    }


}
