package designMode.single;

public class Single1 {
    private Single1(){
    }
    private static final Single1 single1=new Single1();
    public static Single1 getSingle() {
        return single1;
    }
    public void run(){
        System.out.println("调用方法");
    }
}