package com.SZX.pattern.singleton.demo1;

public class Test {
    public static void main(String[] args) {
        //创建Singleton类的对象，这里应为Singleton类使用了私有构造方法所以不能new新对象
        Singleton instance = Singleton.getInstance();

        Singleton instance1 = Singleton.getInstance();

        //判断获取到的两个是否是同一个对象
        System.out.println(instance == instance1);
    }
}
