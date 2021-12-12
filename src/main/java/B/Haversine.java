package B;

import extras.Location;

public class Haversine implements DistanceCalculator {
    public double distance(Location src, Location dst) {
//        double a1 = Math.pow( Math.sin( (dst.lat - src.lat)/2 ), 2);
//        double a2 = Math.cos(src.lat) * Math.cos(dst.lat);
//        double a3 = Math.pow( Math.sin( (dst.lon - src.lon)/2 ), 2);
//        double a = a1 + a2 * a3;
//        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));

        double deltaLat = dst.lat - src.lat;
        double deltaLon = dst.lon - src.lon;

        double a = Math.pow( Math.sin(deltaLat/2), 2) +
                Math.cos(src.lat) * Math.cos(dst.lat) *
                        Math.pow( Math.sin(deltaLon/2), 2);
        double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1-a));
        double R = 6.371;

        return R * c;
    }
}
