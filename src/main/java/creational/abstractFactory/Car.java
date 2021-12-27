package creational.abstractFactory;

public abstract class Car {
    long chassisNumber;
    String engineNumber;

    public void setChassisNumber(long chassisNumber) {
        this.chassisNumber = chassisNumber;
    }

    public void setEngineNumber(String engineNumber) {
        this.engineNumber = engineNumber;
    }

    public void setSeatingCapacity(int seatingCapacity) {
        this.seatingCapacity = seatingCapacity;
    }

    public void setEngineCapacity(int engineCapacity) {
        this.engineCapacity = engineCapacity;
    }

    int seatingCapacity;

    public long getChassisNumber() {
        return chassisNumber;
    }

    public String getEngineNumber() {
        return engineNumber;
    }

    public int getSeatingCapacity() {
        return seatingCapacity;
    }

    public int getEngineCapacity() {
        return engineCapacity;
    }

    int engineCapacity;

}
