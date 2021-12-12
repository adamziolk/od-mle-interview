package B;

public class DCFactory {
    public String distType;

    public DistanceCalculator calculateDistance(String distType) {
        if ("Euclidean".equals(distType)) {
            return new Euclidean();
        } else if ("Haversine".equals(distType)) {
            return new Haversine();
        } else {
            System.out.println("Method must be 'Euclidean' or 'Haversine'");
        }
        return null;
    }
}