package tests;

import classes.Flight;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class FlightTest {

    @Test
    void testGetFlightInfo() {
        Flight flight = new Flight("PS101", "Київ", "Лондон", "On Time");
        String info = flight.getFlightInfo();

        // перевіряємо, що рядок містить усі ключові дані
        assertTrue(info.contains("Київ"), "Інформація про рейс не містить міста вильоту");
        assertTrue(info.contains("Лондон"), "Інформація про рейс не містить міста прибуття");
        assertTrue(info.contains("On Time"), "Інформація про рейс не містить статусу");
    }

    @Test
    void testStatus() {
        Flight flight = new Flight("PS101", "Київ", "Лондон", "On Time");
        // якщо getStatus() повертає текст типу "Поточний статус рейсу: On Time",
        // то перевіримо, що статус містить "On Time"
        assertTrue(flight.getStatus().contains("On Time"));
    }
}
