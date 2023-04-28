public enum Planets {
    Mercury(1, 0, 244, null),
    Venus(2, 5029, 605, Planets.Mercury),
    Earth(3, 4140, 637, Planets.Venus),
    Mars(4, 7834, 339, Planets.Earth),
    Jupiter(5, 55039, 6991, Planets.Mars),
    Saturn(6, 64627, 5823, Planets.Jupiter),
    Uranus(7, 144895, 2536, Planets.Saturn),
    Neptune(8, 162745, 2462, Planets.Uranus);

    private final int sequenceNumber;
    private final double distanceFromPreviousPlanet;
    private final int radius;
    private final Planets previousPlanet;
    private final double distanceFromSun;
    private final double DISTANCE_MERCURY_SUN = 4600;


    Planets(int sequenceNumber, double distanceFromPreviousPlanet, int radius, Planets previousPlanet) {
        this.sequenceNumber = sequenceNumber;
        this.distanceFromPreviousPlanet = distanceFromPreviousPlanet;
        this.radius = radius;
        this.previousPlanet = previousPlanet;
        this.distanceFromSun = (previousPlanet != null) ? (previousPlanet.distanceFromSun + distanceFromPreviousPlanet) : DISTANCE_MERCURY_SUN;
    }

    public int getSequenceNumber() {
        return sequenceNumber;
    }

    public double getDistanceFromPreviousPlanet() {
        return distanceFromPreviousPlanet;
    }

    public double getDistanceFromSun() {
        return distanceFromSun;
    }

    public int getRadius() {
        return radius;
    }


    public Planets getPreviousPlanet() {
        return previousPlanet;
    }
}
