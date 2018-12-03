package cn.itheima.test02;

public class TV {
    //a.定义电视类TV，要求包含：
    //    1)成员变量:名称 name（ String 型）；
    //    2)构造方法:空参、满参构造方法；
    //    3)成员方法:void play(String channel ) ,
    // 方法内,打印输出 "xx电视正在播放xxx节目"（channel表示电视节目）；

    public TV() {
    }

    public TV(String name) {
        this.name = name;
    }

    String name;
    void play(String channel ){
        System.out.println(name+"电视正在播放"+channel+"节目");

    }
}
