package tk.zhangh.pattern.structure.decorator;


import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by ZhangHao on 2016/3/14.
 * 具体的装饰器B，扩展基本方法
 */
public class ConcreteDecoratorB extends Decorator{
    private Logger log = LoggerFactory.getLogger(this.getClass());
    public ConcreteDecoratorB(Component component) {
        super(component);
    }

    @Override
    public void execute() {
        component.execute();
        log.info("add new function B");
    }
}
