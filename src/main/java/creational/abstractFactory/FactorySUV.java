package creational.abstractFactory;

import com.sun.org.apache.xpath.internal.operations.Mod;

public class FactorySUV extends AbstractFactoryCar{

    public Car getCar(Model model){
        switch (model) {
            case MT_XL: return new SUV_MT_XL();
            case MT_XV: return new SUV_MT_XV();
            case AT_XL: return new SUV_AT_XL();
            case AT_XV: return new SUV_AT_XV();
            default: return null;
        }
    }
}
