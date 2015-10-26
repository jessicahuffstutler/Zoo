import java.util.Scanner;

/**
 * Created by jessicahuffstutler on 10/13/15.
 */
public class Zoo {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Type the name of an animal");
        String animalName = scanner.nextLine();
        Animal animal = createAnimal(animalName);
        System.out.println(String.format("Created %s!", animal));
    }

    static Animal createAnimal(String animalName) { //creating methods
        Animal animal;
        switch (animalName) { //this is how you start a switch statement
            case "snake":
                animal = new Snake();
                break;
            case "lion":
                animal = new Lion();
                break;
            case "condor":
                animal = new Condor();
                break;
            //doing this in the code instead of creating an explicit class.
            case "alligator":
                animal = new Reptile() { //we immediately type the curly brace
                    @Override
                    public String toString() {
                        return "Alligator";
                    }
                }; //semi colon after last curly brace
                break;
            default:
                animal = new Animal();
        }
         return animal;
    }
}
