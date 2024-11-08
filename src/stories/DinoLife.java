package stories;

import creatures.Dinosaur;

public class DinoLife {
    public static void main(String[] args) {
        Dinosaur Trex = new Dinosaur();
        Dinosaur Stegosaurus = new Dinosaur();

        Trex.setSpecies("Trex");
        Trex.setCanFly(true);
        Trex.setDiet("Omnivorous");
        Trex.setMaxSpeed(130);
        Trex.setSound("TTTTTEEEEEXXXXXX!");
        Trex.setSpecialFeature("Fire coming out of the mouth.");

        Stegosaurus.setSpecies("Stegosaurus");
        Stegosaurus.setCanFly(false);
        Stegosaurus.setDiet("Vegan");
        Stegosaurus.setMaxSpeed(25);
        Stegosaurus.setSound("SSSSSOOOOORRRRRSSSSS!");
        Stegosaurus.setSpecialFeature("Impenetrable armor.");

        Trex.showAttributes();

        Stegosaurus.showAttributes();

        Trex.eating();
        Stegosaurus.eating();
        System.out.println("*****");

        Trex.fly();
        Stegosaurus.fly();
        System.out.println("*****");

        Trex.voice();
        Stegosaurus.voice();
        System.out.println("*****");

        Trex.extraordinaryAct();
        Stegosaurus.extraordinaryAct();
        System.out.println("*****");
    }
}
