package classes;

public class Baggage {
    private String tag;
    private double weight;
    private boolean registered;

    public Baggage(String tag, double weight, boolean registered) {
        this.tag = tag;
        this.weight = weight;
        this.registered = registered;
    }

    public String getBaggageInfo() {
        String status = registered ? "Registered" : "Not registered";
        return "Baggage tag: " + tag + " | Weight: " + weight + " kg | Status: " + status;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public void setRegistered(boolean registered) {
        this.registered = registered;
    }
}
