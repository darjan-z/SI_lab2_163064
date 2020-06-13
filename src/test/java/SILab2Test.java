import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

class SILab2Test {

    private final SILab2 cls = new SILab2();

    @Test
    void multipleCondition() {
        assertFalse(cls.function(new User(null, null, "email@email.com"), new ArrayList<>()));

        assertFalse(cls.function(new User("null", null, "email@email.com"), new ArrayList<>()));

        assertFalse(cls.function(new User("darjanz", null, "email@email.com"), new ArrayList<>()));

        assertFalse(cls.function(new User("darjanz", "darjanzz", null), new ArrayList<>()));

        assertFalse(cls.function(new User("darjanz", "blabla", null), new ArrayList<>()));

        assertFalse(cls.function(new User("darjanz", "blablabla", null), new ArrayList<>()));

        assertFalse(cls.function(new User("darjanz", "Password", "email@email.com"), new ArrayList<>()));

        assertFalse(cls.function(new User("darjanz", "1Password", "email@email.com"), new ArrayList<>()));

        assertTrue(cls.function(new User("darjanz", "1pAssword^", "email@email.com"), new ArrayList<>()));
    }

    @Test
    void everyBranch() {
        assertFalse(cls.function(null, new ArrayList<>()));

        assertFalse(cls.function(new User(null, null, "email@email.com"), new ArrayList<>()));

        assertFalse(cls.function(new User("darjanz", "password", "email@email.com"), new ArrayList<>()));

        assertFalse(cls.function(new User("darjanz", "darjanzz", "email@email.com"), new ArrayList<>()));

        assertFalse(cls.function(new User("darjanz", "blabla", "email@email.com"), new ArrayList<>()));

        assertFalse(cls.function(new User("darjanz", "Password", "email@email.com"), new ArrayList<>()));

        assertFalse(cls.function(new User("darjanz", "1Password", "email@email.com"), new ArrayList<>()));

        assertTrue(cls.function(new User("darjanz", "1pAssword^", "email@email.com"), new ArrayList<>()));
    }
}