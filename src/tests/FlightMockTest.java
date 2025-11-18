package tests;

import interfaces.IFlight;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.mockito.Mockito.verify;

public class FlightMockTest {

    @Test
    public void testGetFlightInfoMock() {
        IFlight mockFlight = Mockito.mock(IFlight.class);
        Mockito.when(mockFlight.getFlightInfo())
                .thenReturn("Рейс №PS203 до Парижа (виліт о 12:00)");

        String result = mockFlight.getFlightInfo();

        assertEquals("Рейс №PS203 до Парижа (виліт о 12:00)", result);
        verify(mockFlight).getFlightInfo();
    }

    @Test
    public void testGetStatusMock() {
        IFlight mockFlight = Mockito.mock(IFlight.class);
        Mockito.when(mockFlight.getStatus())
                .thenReturn("Поточний статус рейсу: Вчасно");

        String result = mockFlight.getStatus();

        assertEquals("Поточний статус рейсу: Вчасно", result);
        verify(mockFlight).getStatus();
    }
}
