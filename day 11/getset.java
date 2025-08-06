class  Main {
    
    private String name;

    // Getter method
    public String getName() {
        return name;
    }

    // Setter method
    public void setName(String name) {
        this.name = name;
    }
}

public class getset {
    public static void main(String[] args) {
        Main s = new Main();  // Create object of Main class
        s.setName("Aashish @Codingal");  // Use setter to set name
        System.out.println(s.getName()); // Use getter to print name
    }
}
