package service;

import repository.FlightRepository;

public class FlightService {
    private final FlightRepository flightRepository;

    // Впровадження залежності через конструктор
    public FlightService(FlightRepository flightRepository) {
        this.flightRepository = flightRepository;
    }

    public String getFlightInfo(String flightNumber) {
        return "Flight " + flightNumber + " status: " +
                flightRepository.getFlightStatus(flightNumber);
    }
}
