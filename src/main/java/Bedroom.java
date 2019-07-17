import java.util.ArrayList;

public class Bedroom {

    private int num;
    private int capacity;
    private double pricepn;
    private ArrayList<Guest> guests;
    private String type;

    public Bedroom(int num, int capacity, String type, double pricepn){
        this.num = num;
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.type = type;
        this.pricepn = pricepn;
    }

    public int getNumber() {
        return this.num;
    }

    public int getCapactiy() {
        return this.capacity;
    }

    public void addGuest(Guest guest) {
        this.guests.add(guest);
    }

    public int guestCount() {
        return this.guests.size();
    }

    public String getType() {
        return this.type;
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }

    public double getPrice() {
        return this.pricepn;
    }
}
