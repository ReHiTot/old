package designMode.agency;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class DynamicAgency {
    private Agency target;

    public DynamicAgency(Agency target) {
        this.target = target;
    }

    public Object newInstance() {

        return Proxy.newProxyInstance(target.getClass().getClassLoader(), target.getClass().getInterfaces(), (proxy, method, args) -> {
            System.out.println("代理开始");
            method.invoke(target, args);
            System.out.println("代理结束");

            return null;
        });

    }

    public static void main(String[] args) {
//        DynamicAgency dynamicAgency = new DynamicAgency(new Principal());
//        Agency o = (Agency) dynamicAgency.newInstance();
//        o.print();
        Agency o=()->{
            System.out.println("测试");
        };
o.print();
    }
}
