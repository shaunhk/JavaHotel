import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static junit.framework.TestCase.assertEquals;

public class HotelTest {

    Guest guest;
    Guest guest2;
    Guest guest3;
    Bedroom bedroom;
    Bedroom bedroom2;
    Bedroom bedroom3;
    ConferenceRoom conferenceRoom;
    Hotel hotel;
    ArrayList<Bedroom> emptyBedrooms;

    @Before
    public void setup(){
        guest = new Guest("Gandalf", 1500);
        guest2 = new Guest("Bilbo Baggins", 30);
        guest3 = new Guest("Saruman", 2000);
        hotel = new Hotel();
        bedroom = new Bedroom(5, 1, "Single", 22.00);
        bedroom2 = new Bedroom(15, 2, "Double", 55.60);
        conferenceRoom = new ConferenceRoom(3, "Quest Briefroom");
        bedroom3 = new Bedroom(10, 1, "Single", 15.60);
        emptyBedrooms = new ArrayList<Bedroom>();
    }

    @Test
    public void hasRooms() {
        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom);
        hotel.addConferenceRoom(conferenceRoom);
        hotel.addConferenceRoom(conferenceRoom);
        hotel.addConferenceRoom(conferenceRoom);
        assertEquals(2, hotel.bedroomCount());
        assertEquals(3, hotel.conferenceRoomCount());
    }

    @Test
    public void canCheckInGuestToRooms() {
        hotel.checkInBedroom(guest, bedroom);
        assertEquals(1, bedroom.guestCount());
        hotel.checkInConferenceRoom(guest, conferenceRoom);
        assertEquals(1, conferenceRoom.guestCount());
    }

    @Test
    public void canCheckOutGuestsToRooms(){
        hotel.checkInBedroom(guest, bedroom);
        hotel.checkOutBedroom(guest, bedroom);
        assertEquals(0, bedroom.guestCount());
        hotel.checkInConferenceRoom(guest, conferenceRoom);
        hotel.checkOutConferenceRoom(guest, conferenceRoom);
        assertEquals(0, conferenceRoom.guestCount());
    }

    @Test
    public void canBookRoom(){
        hotel.makeBooking(bedroom, 5, guest);
        assertEquals(1, hotel.getBookingsAmount());
    }

    @Test
    public void canReturnVacants(){
        hotel.addBedroom(bedroom);
        hotel.addBedroom(bedroom2);
        hotel.addBedroom(bedroom3);
        emptyBedrooms.add(bedroom2);
        emptyBedrooms.add(bedroom3);
        hotel.makeBooking(bedroom, 5, guest);
        assertEquals(emptyBedrooms, hotel.getVacants());
    }

    @Test
    public void cantCheckIntoOccupied(){
        hotel.makeBooking(bedroom, 2, guest);
        hotel.makeBooking(bedroom, 2, guest3);
        assertEquals(1, hotel.getFullAmountOfBookings());
    }

    @Test
    public void cantCheckInBrokeAssBilbo(){
        hotel.makeBooking(bedroom3, 2, guest2);
        assertEquals(0, hotel.getFullAmountOfBookings());
    }

    @Test
    public void bookingTakesMoney(){
        hotel.makeBooking(bedroom, 3, guest);
        assertEquals(1434.0, guest.getMoney());
    }
}
