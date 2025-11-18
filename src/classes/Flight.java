package classes;

import interfaces.IFlight;

/**
 * Клас Flight реалізує інтерфейс IFlight і описує базову інформацію про рейс.
 */
public class Flight implements IFlight {
    private String flightNumber;
    private String destination;
    private String departureTime;
    private String status;

    public Flight(String flightNumber, String destination, String departureTime, String status) {
        this.flightNumber = flightNumber;
        this.destination = destination;
        this.departureTime = departureTime;
        this.status = status;
    }

    @Override
    public String getFlightInfo() {
        // Тест очікує, що цей текст містить статус (On Time) без українських фраз
        return "Flight " + flightNumber + " to " + destination + " (departure at " + departureTime + "), Status: " + status;
    }

    @Override
    public String getSchedule() {
        // Короткий варіант, бо тести очікують тільки час
        return departureTime;
    }

    @Override
    public String getStatus() {
        // Повертаємо тільки сам статус
        return status;
    }
}
