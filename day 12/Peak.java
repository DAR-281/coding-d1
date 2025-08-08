class mountains {
    void location() {
        System.out.println("Location is:");
    }
    void fact() {
        System.out.println("famous for:");
    }
}



class Mteverest extends mountains {
    void location() {
        System.out.println("Mteverest located in Nepal");
    }
    void fact() {
        System.out.println("Tallest mountain in world");
    }
}

class Mtpanorama extends mountains {
    void location() {
        System.out.println("Mtpanorama located in australia");
    }
    void fact() {
        System.out.println("Largest mountain in australia");
    }
}

public class Peak {
    public static void main (String[]args){
        
        mountains m = new mountains();
        mountains EV = new Mteverest();
        mountains PN = new Mtpanorama();
        
        System.out.println("Mountains M");
        m.location();
        m.fact();
        
        System.out.println("Mountains EV");
        EV.location();
        EV.fact();
        
        System.out.println("Mountains PN");
        PN.location();
        PN.fact();

    }
}