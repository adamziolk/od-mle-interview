package B;

import extras.Location;

public class Euclidean implements DistanceCalculator {
    public double distance(Location src, Location dst) {
        return Math.sqrt(
                Math.pow(dst.lat - src.lat, 2) + Math.pow(dst.lon - src.lon, 2)
        );
    }
}
