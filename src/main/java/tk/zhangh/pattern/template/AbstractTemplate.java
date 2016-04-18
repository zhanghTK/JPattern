package tk.zhangh.pattern.template;

/**
 * 抽象模板
 * Created by ZhangHao on 2016/4/18.
 */
public abstract class AbstractTemplate {
    /**
     * 模板方法
     */
    public void templateMethod(){
        abstractMethod();
        hookMethod();
        concreteMethod();
    }

    /**
     * 基本方法，子类实现
     */
    protected abstract void abstractMethod();

    /**
     * 钩子方法
     */
    protected void hookMethod(){}

    /**
     * 基本方法，父类实现
     */
    private void concreteMethod(){
        System.out.println("AbstractTemplate.concreteMethod");
    }
}
