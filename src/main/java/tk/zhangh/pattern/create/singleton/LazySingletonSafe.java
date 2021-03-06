package tk.zhangh.pattern.create.singleton;

/**
 * Created by ZhangHao on 2016/3/17.
 * 懒汉单例,加锁线程安全
 */
public class LazySingletonSafe {
    private static LazySingletonSafe instance;
    private LazySingletonSafe(){}

    public static synchronized LazySingletonSafe getInstance(){
        if (instance == null){
            instance = new LazySingletonSafe();
        }
        return instance;
    }
}
