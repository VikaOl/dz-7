
public class Main {
    public static void main(String[] args) {
        for (Planets planet : Planets.values()) {
            System.out.println(planet);
            System.out.println("Distance from the previous Planet " + planet.getDistanceFromPreviousPlanet() + " km");
            System.out.println("Distance from the Sun " + planet.getDistanceFromSun() + " km");
            System.out.println("Radius: " + planet.getRadius() + " km");
        }
    }
}