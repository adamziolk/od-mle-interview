package B;

import B.DCFactory;
import extras.Location;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class DCTest {
    @Test
    public void testEuclidean() {
        Location loc1 = new Location("Alpharetta","GA",30005, 1f, 1f);
        Location loc2 = new Location("NYC","NY",10111, 5f, 5f);
        DCFactory dcFactory = new DCFactory();

        double result = dcFactory.calculateDistance("Euclidean").distance(loc1, loc2);
        assertEquals(5.656854249492381, result);
    }

    @Test
    public void testHaversine() {
        Location loc1 = new Location("Alpharetta","GA",30005, 1f, 1f);
        Location loc2 = new Location("NYC","NY",10111, 5f, 5f);
        DCFactory dcFactory = new DCFactory();

        double result = dcFactory.calculateDistance("Haversine").distance(loc1, loc2);
        assertEquals(628.5, result);
    }
}


