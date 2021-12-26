package creational.factoryPattern;

import java.time.Instant;
import java.util.Date;

public class NewProduct {
    public static void main(String[] args) {
        ElectronicAppliances appliances1 = ElectronicApplianceFactory.getAppliance(ApplianceType.TV);
        appliances1.setManufacturingDate(java.util.Date.from(Instant.now()));
        ElectronicAppliances appliances2 = ElectronicApplianceFactory.getAppliance(ApplianceType.AC);
        appliances2.setManufacturingDate(Date.from(Instant.now()));
        appliances1.printDetails();
        appliances2.printDetails();

    }

}
