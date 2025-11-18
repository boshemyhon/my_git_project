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
        return "Рейс №" + flightNumber + " до " + destination + " (виліт о " + departureTime + ")";
    }

    @Override
    public String getSchedule() {
        return "Розклад: " + departureTime;
    }

    @Override
    public String getStatus() {
        return "Статус: " + status;
    }
}
