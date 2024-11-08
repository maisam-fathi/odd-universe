package creatures;

public class Dinosaur {
    String species; //(species name e.g. Trex, Stegosaurus)
    boolean canFly; //(yes/no)
    String diet; //Diet (carnivorous, vegan, omnivorous)
    int maxSpeed; //Maximum speed (in kmh)
    String sound; //(What sound does the dinosaur make? Text information)
    String specialFeature; //(text information)

    public void showAttributes() {
        System.out.println("Dinosaur specie: " + species);
        System.out.println(species + " can" + (canFly ? "" : " not") + " fly.");
        System.out.println(species + "'s diet: " + diet);
        System.out.println(species + "'s maximum speed (kmh): " + maxSpeed);
        System.out.println(species + "'s sound: " + sound);
        System.out.println(species + "'s special feature " + ": " + specialFeature);
        System.out.println("*****");
    }

    public void eating() {
        System.out.println(species + " is eating. He eat " + diet + ".");
    }

    public void fly() {
        if (canFly) {
            System.out.println(species + " is flying at a speed of " + maxSpeed + " (km/h).");
        } else {
            System.out.println(species + " cannot fly.");
        }
    }

    public void extraordinaryAct() {
        System.out.println(species + ": " + specialFeature);
    }

    public void voice() {
        System.out.println(species + " says " + sound);
    }

    public void setSpecies(String species) {
        this.species = species;
    }

    public String getSpecies() {
        return species;
    }

    public void setCanFly(boolean canFly) {
        this.canFly = canFly;
    }

    public boolean getCanFly() {
        return canFly;
    }

    public void setDiet(String diet) {
        this.diet = diet;
    }

    public String getDiet() {
        return diet;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setSound(String call) {
        this.sound = call;
    }

    public String getSound() {
        return sound;
    }

    public void setSpecialFeature(String specialFeature) {
        this.specialFeature = specialFeature;
    }

    public String getSpecialFeature() {
        return specialFeature;
    }
}
