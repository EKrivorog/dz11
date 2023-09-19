import org.example.Man;
import org.example.Woman;
import org.junit.Test;

import static org.junit.Assert.*;

public class PersonTest {

    @Test
    public void testRegisterPartnership() {
        Man evgeniy = new Man("Evgeniy", "Krivorog", 32);
        Woman natalia = new Woman("Natalia", "Krivorog", 32);

        evgeniy.registerPartnership(natalia);
        assertEquals(natalia, evgeniy.getPartner());
        assertEquals("Krivorog", evgeniy.getLastName());
    }

    @Test
    public void testDeregisterPartnership() {
        Man evgeniy = new Man("Evgeniy", "Krivorog", 32);
        Woman natalia = new Woman("Natalia", "Krivorog", 32);

        evgeniy.registerPartnership(natalia);
        evgeniy.deregisterPartnership(true);

        assertNull(evgeniy.getPartner());
        assertEquals("Krivorog", evgeniy.getLastName());
    }
    @Test
    public void testIsRetiredForWoman() {
        Woman natalia = new Woman("Natalia", "Krivorog", 60);
        assertTrue(natalia.isRetired());
    }

    @Test
    public void testIsRetiredForMan() {
        Man evgeniy = new Man("Evgeniy", "Krivorog", 65);
        assertTrue(evgeniy.isRetired());
    }
}

