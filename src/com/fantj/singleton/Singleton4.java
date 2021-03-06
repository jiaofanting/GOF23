package com.fantj.singleton;

/**
 * 双检锁/双重校验锁DCL（线程安全）
 */
public class Singleton4 {
    /**
     * 必须添加私有的 构造方法，防止外面实例化该对象。
     */
    private Singleton4(){}
    private static Singleton4 instance;

    public static Singleton4 getInstance(){
        if (instance == null){
            synchronized (Singleton4.class){
                if (instance == null){
                    instance = new Singleton4();
                }
            }
        }
        return instance;
    }
}