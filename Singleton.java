package com.SZX.pattern.singleton.demo1;

/**
 * 饿汉式 单例模式
 * 静态成员变量
 */
public class Singleton {
    //1.私有构造方法,Singleton类使用了私有构造方法本类之外不能new新对象
    private Singleton(){}
    //2.在本类中创建本类对象
    private static Singleton instance = new Singleton();
    //3.提供一个公共的访问方式,让外界获取该对象
    public static Singleton getInstance(){
        return instance;
    }
}
