public class dog extends animal {
    private String breed;

    public dog(String species, int age, String breed) {
        super(species, age);
        this.breed = breed;
    }
    public String getBreed() {
        return breed;
    }
    
}
