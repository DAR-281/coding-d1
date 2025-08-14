public class main  {
    
    public static void main(String[] args) {
        dog d1 = new dog("Canine", 5, "Labrador");
        System.out.println("Species: " + d1.getSpecies());
        System.out.println("Age: " + d1.getAge());
        System.out.println("Breed: " + d1.getBreed());
    }
}
