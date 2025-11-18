package classes;

public class Passenger {
    private String name;
    private String passport;
    private String seat;

    public Passenger(String name, String passport, String seat) {
        this.name = name;
        this.passport = passport;
        this.seat = seat;
    }

    public String getPassengerInfo() {
        return "Пасажир (оновлено): " + name + ", паспорт № " + passport + ", місце: " + seat;

    }


    public void setSeat(String seat) {
        this.seat = seat;
    }
}
