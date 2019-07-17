import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class BedroomTest {

    Guest guest;
    Bedroom bedroom;

    @Before
    public void setup(){
        guest = new Guest("Frodo Baggins", 1002.50);
        bedroom = new Bedroom(12, 2, "Double", 25.50);
    }

    @Test
    public void hasNumber(){
        assertEquals(12, bedroom.getNumber());
    }

    @Test
    public void hasCapacity(){
        assertEquals(2, bedroom.getCapactiy());
    }

    @Test
    public void hasGuests(){
        bedroom.addGuest(guest);
        assertEquals(1, bedroom.guestCount());
    }

    @Test
    public void hasRoomType(){
        assertEquals("Double", bedroom.getType());
    }

    @Test
    public void hasPrice(){
        assertEquals(25.50, bedroom.getPrice());
    }
}
