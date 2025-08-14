public class main {
    public static void main(String[] args) {

        Student s1 = new Student("John", 90);  //grade <--
        Student s2 = new Student("Jane", 85);  //grade <--    
        Student s3 = new Student("Alice", 95); //grade <--
        Student s4 = new Student("Bob", 76);   //grade <--

s1.displayinfo();
        System.out.println();
        s2.displayinfo();
        System.out.println();
        s3.displayinfo();
        System.out.println();
        s4.displayinfo();
    }
}
