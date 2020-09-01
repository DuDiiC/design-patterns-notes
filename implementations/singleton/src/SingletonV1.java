// version with private static class (from Bill Pugh)
public class SingletonV1 {

    private SingletonV1() {
    }

    public static SingletonV1 getInstance() {
        return SingletonHolder.INSTANCE;
    }

    private static class SingletonHolder {
        private static final SingletonV1 INSTANCE = new SingletonV1();
    }
}
