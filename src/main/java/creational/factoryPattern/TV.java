package creational.factoryPattern;

import java.util.Date;

public class TV implements ElectronicAppliances{

    Date date;

    @Override
    public void printDetails() {
        System.out.println("TV details are: " + getManufacturingDate() + "," );
    }

    @Override
    public void setManufacturingDate(Date date) {
        this.date= date;
    }

    @Override
    public Date getManufacturingDate() {
        return date;
    }

}
