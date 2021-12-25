package creational.singleton;

public class DBSingleton {

    //single class instance
    private static DBSingleton instance = new DBSingleton();

    //private constructor
    private DBSingleton(){}

    //getInstance method
    public static DBSingleton getInstance(){
        return instance;
    }
}
