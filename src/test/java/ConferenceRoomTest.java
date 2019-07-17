import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class ConferenceRoomTest {

    ConferenceRoom conferenceroom;
    Guest guest;

    @Before
    public void setup(){
        conferenceroom = new ConferenceRoom(5, "The One Room");
        guest = new Guest("Gollum", 52);
    }

    @Test
    public void hasCapacity(){
        assertEquals(5, conferenceroom.getCapactiy());
    }

    @Test
    public void hasGuests(){
        conferenceroom.addGuest(guest);
        assertEquals(1, conferenceroom.guestCount());
    }

    @Test
    public void hasName(){
        assertEquals("The One Room",conferenceroom.getName());
    }
}
