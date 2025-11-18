import org.junit.jupiter.api.Test;
import repository.FlightRepository;
import service.FlightService;

import static org.junit.jupiter.api.Assertions.*;

class FlightServiceTest {

    @Test
    void testGetFlightInfo() {
        // Створюю об’єкти для тесту
        FlightRepository repo = new FlightRepository();
        FlightService service = new FlightService(repo);

        // Викликаю метод
        String result = service.getFlightInfo("PS123");

        // Перевіряю, що результат містить номер рейсу і статус
        assertTrue(result.contains("PS123"));
        assertTrue(result.contains("On time"));
    }
}
