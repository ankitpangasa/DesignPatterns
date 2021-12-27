package creational.abstractFactory;

public abstract class AbstractFactoryCar {
    public static AbstractFactoryCar getCarFactory(CarType carType){
        switch (carType) {
            case HATCHBACK:return new FactoryHatchback();
            case SEDAN: return new FactorySedan();
            case SUV:return new FactorySUV();
            default: return null;
        }
    }

    public abstract Car getCar(Model model);
}
