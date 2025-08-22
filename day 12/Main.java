public class Main {
    public static void main(String[] args) {
        Vehicle truck = new Truck("Ford", "F-150", 2020, 1000.0);
        Vehicle car = new Car("Toyota", "Camry", 2019, 4);

        System.out.println(truck);
        System.out.println(car);
    }
    
}
