import java.util.ArrayList;

public class ConferenceRoom {

    private int capacity;
    private String name;
    private ArrayList<Guest> guests;

    public ConferenceRoom(int capacity, String name){
        this.capacity = capacity;
        this.guests = new ArrayList<Guest>();
        this.name = name;
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

    public String getName() {
        return this.name;
    }

    public void removeGuest(Guest guest) {
        this.guests.remove(guest);
    }
}
