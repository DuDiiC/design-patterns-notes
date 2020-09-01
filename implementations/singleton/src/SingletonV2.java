// version with duuble-check-locking
public class SingletonV2 {

    private volatile static SingletonV2 INSTANCE;

    private SingletonV2() {
    }

    public static SingletonV2 getInstance() {
        if(INSTANCE == null) {
            synchronized (SingletonV2.class) {
                if(INSTANCE == null) {
                    INSTANCE = new SingletonV2();
                }
            }
        }

        return INSTANCE;
    }
}
