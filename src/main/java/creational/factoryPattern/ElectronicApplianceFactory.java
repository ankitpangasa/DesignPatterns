package creational.factoryPattern;

public class ElectronicApplianceFactory {
    static public ElectronicAppliances getAppliance(String appliance){
        switch (appliance){
            case "AC": return new AC();
            case "TV": return new TV();
            default: return null;
        }
    }
}
