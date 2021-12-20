import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;
import Multimedia.checkPassword;

class JUnitCheckPassword {

    @Test
    void test() {
        checkPassword.setPassword(1234);
        assertTrue(checkPassword.checkPass(1234));
        assertFalse(checkPassword.checkPass(1235));
    }

}
