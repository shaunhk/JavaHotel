import org.junit.Before;
import org.junit.Test;

import static junit.framework.TestCase.assertEquals;

public class GuestTest {

    Guest guest;

    @Before
    public void setup() {
        guest = new Guest("Bilbo Baggins", 150.25);
    }

    @Test
    public void guestHasName(){
        assertEquals("Bilbo Baggins", guest.getName());
    }

    @Test
    public void guestHasMoney(){
        assertEquals(150.25, guest.getMoney());
    }

}
