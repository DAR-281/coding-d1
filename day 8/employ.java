class employ {
    int idnum;
    String name;
    float marks;


    // contructor
    employ() {
        idnum = 1120;
        name = "Viren";
        marks = 78.0f;
    }

    //Display Method
    void display() {
       System.out.println(idnum + "⏹" + name + "⏹" + marks);
    }
}
 class emain {  

public static void main(String[] args) {
        employ emp1 = new employ();
        emp1.display();
    }


 }










