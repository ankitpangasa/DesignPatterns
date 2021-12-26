package creational.factoryPattern;

import java.util.Date;

public class AC implements ElectronicAppliances{

    Date date;

    @Override
    public void printDetails() {
        System.out.println("AC details are: " + getManufacturingDate());
    }

    @Override
    public void setManufacturingDate(Date date) {
        this.date = date;
    }

    @Override
    public Date getManufacturingDate() {
        return date;
    }
}
