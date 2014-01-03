import org.junit.Test;

import static junit.framework.Assert.assertEquals;
import static junit.framework.Assert.assertFalse;
import static junit.framework.Assert.assertTrue;

/**
 * Created by malance on 14-1-4.
 */
public class UserTest {
    @Test
    public void shouldUserToStringWork(){
        User user = new User("aa","b1");
        assertFalse(user.toString().startsWith("@"));
        assertTrue(user.hashCode() > 0);
    }
}
