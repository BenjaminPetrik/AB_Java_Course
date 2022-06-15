package unit5;

public final class Singleton {
//    private static Singleton instance;

    public static final Singleton INSTANCE = new Singleton();

    private Singleton () {
    }



//    public static Singleton getinstance() {
//        if (instance == null) {
//            instance = new Singleton();
//        }
//        return instance;
//    }
}
