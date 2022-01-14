

import static org.junit.Assert.assertFalse;
import static org.junit.Assert.assertTrue;

import org.junit.Test;

import Multimedia.checkPassword;

class JUnitCheckPassword {

    @Test
    void test() {
        checkPassword.setPassword(1234);
        assertTrue(checkPassword.checkPass(1234));
        assertFalse(checkPassword.checkPass(1235));
    }

}
