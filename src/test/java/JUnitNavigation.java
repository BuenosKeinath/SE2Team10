import static org.junit.Assert.*;

import org.junit.Test;

public class JUnitNavigation {

    @Test
    public void test() {
        assertEquals(Navigation.Stadtnamen("Hamburg"), "Hamburg Postleitzah: 20095");
    }
    
    @Test
    public void test1() {
        assertEquals(Navigation.Stadtnamen("Nürnberg"), "Wir können leider keine Adresse ausmachen.");
    }

}
