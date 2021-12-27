package creational.abstractFactory;

public class FactorySedan extends AbstractFactoryCar{
    @Override
    public Car getCar(Model model) {
        switch (model) {
            case MT_XL: return new Sedan_MT_XL();
            case MT_XV: return new Sedan_MT_XV();
            case AT_XL: return new Sedan_AT_XL();
            case AT_XV: return new Sedan_AT_XV();
            default: return null;
        }
    }
}
