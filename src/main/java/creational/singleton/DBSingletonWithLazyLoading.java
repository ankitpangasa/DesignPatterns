package creational.singleton;

public class DBSingletonWithLazyLoading {

    //single class instance
    private static DBSingletonWithLazyLoading instance = null;

    //private constructor
    private DBSingletonWithLazyLoading(){}

    //getInstance method
    public static DBSingletonWithLazyLoading getInstance(){
        if(instance == null)
            instance = new DBSingletonWithLazyLoading();
        return instance;
    }
}
