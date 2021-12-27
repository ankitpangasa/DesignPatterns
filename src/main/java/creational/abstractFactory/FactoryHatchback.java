package creational.abstractFactory;

public class FactoryHatchback extends AbstractFactoryCar{

    @Override
    public Car getCar(Model model) {
        switch (model) {
            case MT_XL: return new Hatchback_MT_XL();
            case MT_XV: return new Hatchback_MT_XV();
            case AT_XL: return new Hatchback_AT_XL();
            case AT_XV: return new Hatchback_AT_XV();
            default: return null;
        }
    }
}
