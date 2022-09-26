package designMode.single;

public class Single3 {
    private static volatile Single3 Instance;

    private Single3() {
    }

    public static Single3 getInstance() {

        if (Instance == null) {
            synchronized (Single3.class) {
                if (Instance == null)
                    Instance = new Single3();
            }
        }
        return Instance;
    }

    public static void main(String[] args) {
//        System.out.println(Single3.class);
        Single4 instance = Single4.Instance;
        instance.say();

    }
}
