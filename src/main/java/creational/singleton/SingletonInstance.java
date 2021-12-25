package creational.singleton;

public class SingletonInstance {
    public static void main(String[] args) {

        //first instance
        DBSingleton firstInstance = DBSingleton.getInstance();
        System.out.println(firstInstance);

        //second instance
        DBSingleton secondInstance = DBSingleton.getInstance();
        System.out.println(secondInstance);

        if(firstInstance == secondInstance)
            System.out.println("both instances are same");

        //first instance with lazy loading and thread safe
        DBSingletonWithLazyLoadingAndThreadSafe firstInstanceThreadSafe = DBSingletonWithLazyLoadingAndThreadSafe.getInstance();
        System.out.println(firstInstanceThreadSafe);

        //second instance with lazy loading and thread safe
        DBSingletonWithLazyLoadingAndThreadSafe secondInstanceThreadSafe = DBSingletonWithLazyLoadingAndThreadSafe.getInstance();
        System.out.println(secondInstanceThreadSafe);

        if(firstInstanceThreadSafe == secondInstanceThreadSafe)
            System.out.println("both instances are same");
    }
}
