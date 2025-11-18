import classes.Flight;
import repository.FlightRepository;
import service.FlightService;
public class Main {
    public static void main(String[] args) {
        Flight flight = new Flight("PS123", "Лондон", "12:30", "On Time");

        System.out.println(flight.getFlightInfo());
        System.out.println(flight.getSchedule());
        System.out.println(flight.getStatus());

        FlightRepository repo = new FlightRepository();
        FlightService service = new FlightService(repo);

        System.out.println(service.getFlightInfo("PS123"));
    }
}
