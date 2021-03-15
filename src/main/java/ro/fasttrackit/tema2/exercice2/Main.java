package ro.fasttrackit.tema2.exercice2;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Planet planet = Planet.JUPITER;
        double weight = readMass();
        calculateTheWeight(planet, weight);
    }

    private static void calculateTheWeight(Planet planet, double weight) {
        System.out.print("The weight is: ");
        System.out.println(planet.getWeightOnEarth(weight));
    }

    private static double readMass() {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter the mass");
        double mass = scanner.nextDouble();
        return mass;
    }
}
