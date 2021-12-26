package creational.factoryPattern;

public class ElectronicApplianceFactory {
    static public ElectronicAppliances getAppliance(ApplianceType type){
        switch (type){
            case TV: return new TV();
            case AC: return new AC();
            default: return null;
        }
    }
}
