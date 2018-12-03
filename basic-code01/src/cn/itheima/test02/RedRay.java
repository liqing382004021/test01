package cn.itheima.test02;

public interface RedRay {
    //b.定义接口RedRay，要求 ：
    //    1)定义抽象方法： void controlTV(TV tv)；
    //    2)定义默认方法： void connecting()，方法内,打印输出"外接设备,连接成功, 可以使用红外线"；
    void controlTV(TV tv);
    default void connecting(){
        System.out.println("外接设备,连接成功, 可以使用红外线");
    }
}
