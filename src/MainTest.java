

import classes.Flight;
import classes.Passenger;
import classes.Baggage;

public class MainTest {
    public static void main(String[] args) {
        Flight flight = new Flight("PS101", "Київ", "Лондон", "On Time");
        System.out.println("=== Тест рейсу ===");
        System.out.println(flight.getFlightInfo());
        System.out.println("Розклад: " + flight.getSchedule());
        System.out.println("Статус: " + flight.getStatus());
        System.out.println();

        Passenger passenger = new Passenger("Іван Петренко", "AA123456", "14B");
        System.out.println("=== Тест пасажира ===");
        System.out.println(passenger.getPassengerInfo());
        System.out.println();

        Baggage baggage = new Baggage("BG-001", 20.5, true);
        System.out.println("=== Тест багажу ===");
        System.out.println(baggage.getBaggageInfo());
    }
}
