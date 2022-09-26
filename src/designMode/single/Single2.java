package designMode.single;

public class Single2 {
    private static Single2 Instance;

    private Single2() {
    }

    public static Single2 getInstance() {
        synchronized (Instance) {
            if (Instance == null)
                Instance = new Single2();
            return Instance;
        }
    }
}
