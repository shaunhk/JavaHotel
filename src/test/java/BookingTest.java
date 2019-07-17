import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BookingTest {

    Bedroom bedroom;
    Booking booking;
    Guest guest;

    @Before
    public void setup(){
        bedroom = new Bedroom(3, 1, "Single", 19.50);
        guest = new Guest("Sam Gamgee", 251.10);
        booking = new Booking(3, bedroom, guest);
    }

    @Test
    public void hasRoom(){
        assertEquals(bedroom, booking.getRoom());
    }

    @Test
    public void hasGuest(){
        assertEquals(guest, booking.getGuest());
    }

    @Test
    public void hasNightsBooked(){
        assertEquals(3, booking.getNightsBooked());
    }

    @Test
    public void priceTotalCalculated(){
        assertEquals(58.50, booking.getTotal());
    }

}
