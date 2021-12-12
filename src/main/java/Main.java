import B.DCFactory;
import C.Simulator;
import extras.Location;
import extras.Person;

public class Main {

    public static void problemA() {
        // TODO explain why this class is not working as expected
        // Fix this class so the correct names get printed out

        // Explanation: The "static" keyword from the Person class was causing the "name" attribute of the class
        // to serve as a class variable - there could only be one value for all instances of the Person class.
        // I don't know why this is funny - I listen to bad music (i.e. the Tenet soundtrack on repeat for days).
        Person solange = new Person("Solange");
        Person beyonce = new Person("Beyonce");
        solange.sayMyName();
        beyonce.sayMyName();
    }

    public static void problemB() {
        Location atl = new Location("Alpharetta","GA",30005, -84.2941f, 34.0754f);
        Location nyc = new Location("NYC","NY",10111,-74.0060f,40.7128f);
        // These functions MUST be implemented in package B
        DCFactory dcFactory = new DCFactory();

        double edist = dcFactory.calculateDistance("Euclidean").distance(atl, nyc);
        double hdist = dcFactory.calculateDistance("Haversine").distance(atl, nyc);
        // TODO write a unit test for each of these functions in the src.tests folder
    }

    public static void problemC() {
        Person solange = new Person("Solange");
        Person beyonce = new Person("Beyonce");
        Location atl = new Location("Alpharetta","GA",30005, -84.2941f, 34.0754f);
        Location nyc = new Location("NYC","NY",10111,-74.0060f,40.7128f);
        Simulator sim = new Simulator();
        sim.goOnATrip(solange, beyonce, atl, nyc);
    }

    public static void main(String[] args) {
        System.out.println("Let's get it started!");

        problemA();
        problemB();
        problemC();
    }
}
