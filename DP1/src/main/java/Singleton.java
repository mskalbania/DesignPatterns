public class Singleton {

    private static Singleton instance;

    private Singleton() {
    }

    public static Singleton getNonThreadSafeInstance() {
        if (instance == null) {
            instance = new Singleton();
        }
        return instance;
    }

    public static Singleton getThreadSafeInstance(){
        if(instance == null){
            synchronized (Singleton.class){
                if(instance == null){
                    instance = new Singleton();
                }
            }
        }
        return instance;
    }
}
