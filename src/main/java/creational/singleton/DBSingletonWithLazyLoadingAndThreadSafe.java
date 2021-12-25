package creational.singleton;

public class DBSingletonWithLazyLoadingAndThreadSafe {

    //single class instance
    private static volatile DBSingletonWithLazyLoadingAndThreadSafe instance = null;

    //private constructor
    private DBSingletonWithLazyLoadingAndThreadSafe(){
        //to block access to constructor through reflections
        if(instance != null)
            throw new RuntimeException("use getInstance() method");
    }

    //getInstance method
    public static DBSingletonWithLazyLoadingAndThreadSafe getInstance(){
        synchronized (DBSingletonWithLazyLoadingAndThreadSafe.class) {
            if (instance == null)
                instance = new DBSingletonWithLazyLoadingAndThreadSafe();
        }
        return instance;
    }
}
