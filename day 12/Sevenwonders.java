// Base class, parent class

class Wonder {

void display() {

System.out.println("This is a wonder of the world.");

}

}

// Derived classes for each wonder

class GreatWallOfChina extends Wonder {

void display() {

System.out.println("Great Wall of China - Location: China");

}

}

class Petra extends Wonder {

void display() {

System.out.println("Petra - Location: Jordan");

}

}

class ChristTheRedeemer extends Wonder {

void display() {

System.out.println("Christ the Redeemer - Location: Brazil");

}

}

class MachuPicchu extends Wonder {

void display() {

System.out.println("Machu Picchu - Location: Peru");

}

}

class ChichenItza extends Wonder {

void display() {

System.out.println("Chichen Itza - Location: Mexico");

}

}

class RomanColosseum extends Wonder {

void display() {

System.out.println("Roman Colosseum - Location: Italy");

}

}

class TajMahal extends Wonder {

void display() {

System.out.println("Taj Mahal - Location: India");

}

}

// Main class

public class Sevenwonders {

public static void main(String[] args) {

// Create an array of Wonder objects (Polymorphism)

Wonder[] wonders = {

new GreatWallOfChina(),

new Petra(),

new ChristTheRedeemer(),

new MachuPicchu(),

new ChichenItza(),

new RomanColosseum(),

new TajMahal()

};

// Display details of each wonder

for (Wonder w : wonders) {

w.display();

}

}

}