import java.lang.reflect.Array;
import java.util.ArrayList;

public class Hotel {

    private ArrayList<Bedroom> bedrooms;
    private ArrayList<ConferenceRoom> conferenceRooms;
    private ArrayList<Booking> bookings;
    private ArrayList<Bedroom> vacants;
    private ArrayList<Bedroom> bookedRooms;
    private Guest guest;

    public Hotel(){
        this.bedrooms = new ArrayList<Bedroom>();
        this.conferenceRooms = new ArrayList<ConferenceRoom>();
        this.bookings = new ArrayList<Booking>();
        this.vacants = new ArrayList<Bedroom>();
        this.bookedRooms = new ArrayList<Bedroom>();
        this.guest = new Guest("Ted", 21.51);
    }

    public void addBedroom(Bedroom bedroom) {
        this.bedrooms.add(bedroom);
    }

    public void addConferenceRoom(ConferenceRoom conferenceRoom) {
        this.conferenceRooms.add(conferenceRoom);
    }

    public int bedroomCount() {
        return this.bedrooms.size();
    }

    public int conferenceRoomCount() {
        return this.conferenceRooms.size();
    }

    public void checkInBedroom(Guest guest, Bedroom bedroom) {
            bedroom.addGuest(guest);
    }

    public void checkInConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.addGuest(guest);
    }

    public void checkOutBedroom(Guest guest, Bedroom bedroom) {
        bedroom.removeGuest(guest);
    }

    public void checkOutConferenceRoom(Guest guest, ConferenceRoom conferenceRoom) {
        conferenceRoom.removeGuest(guest);
    }

    public void makeBooking(Bedroom bedroom, int nightsBooked, Guest guest) {
        if (!this.bookedRooms.contains(bedroom) && guest.getMoney() >= (bedroom.getPrice() * nightsBooked)) {
            Booking booking = new Booking(nightsBooked, bedroom, guest);
            this.bookings.add(booking);
            this.bookedRooms.add(bedroom);
            guest.payMoney(booking);
        }
    }

    public int getBookingsAmount() {
        return this.bookings.size();
    }

    public ArrayList<Bedroom> getVacants() {
        for(int i=0; i<=this.bedrooms.size() - 1; i++) {
            if (!this.bookedRooms.contains(this.bedrooms.get(i))) {
                this.vacants.add(this.bedrooms.get(i));
            }
        }
        return this.vacants;
    }

    public int getFullAmountOfBookings() {
        return this.bookedRooms.size();
    }

}
