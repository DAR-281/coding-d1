public class Truck extends Vehicle {
    private double payloadCapacity;

    public Truck(String make, String model, int year, double payloadCapacity) {
        super(make, model, year);
        this.payloadCapacity = payloadCapacity;
    }

    public double getPayloadCapacity() {
        return payloadCapacity;
    }

    @Override
    public String toString() {
        return "Truck{" +
                "make='" + getMake() + '\'' +
                ", model='" + getModel() + '\'' +
                ", year=" + getYear() +
                ", payloadCapacity=" + payloadCapacity +
                '}';
    }
    
}
