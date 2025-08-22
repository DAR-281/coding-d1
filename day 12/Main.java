public class Main {
    public static void main(String[] args) {
        Circle circle = new Circle(5.0);
        System.out.println("Radius: " + circle.getRadius());
        System.out.println("Area: " + circle.area());
        System.out.println("Circumference: " + circle.circumference());

        circle.setRadius(10.0);
        System.out.println("Updated Radius: " + circle.getRadius());
        System.out.println("Updated Area: " + circle.area());
        System.out.println("Updated Circumference: " + circle.circumference());
    }
    
}
