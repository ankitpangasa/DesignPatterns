package creational.abstractFactory;

public class RegisterNewCar {
    public static void main(String[] args) {
        AbstractFactoryCar carfactory1 = AbstractFactoryCar.getCarFactory(CarType.SUV);
        Car newCar1 = carfactory1.getCar(Model.AT_XV);
        System.out.println(newCar1);

        AbstractFactoryCar carfactory2 = AbstractFactoryCar.getCarFactory(CarType.HATCHBACK);
        Car newCar2 = carfactory2.getCar(Model.MT_XL);
        System.out.println(newCar2);
    }
}
