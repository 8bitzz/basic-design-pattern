import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class LibraryTest {

    @Test
    public void testGetName() {
        Library classUnderTest = new Library("Test library");
        assertEquals("Test library", classUnderTest.getName());
    }

    @Test
    public void testIsInSelections() {
        Library classUnderTest = new Library("test library");
        assertTrue(classUnderTest.isInSelection("Science"), "Science should be in library's selection");
        assertTrue(classUnderTest.isInSelection("Children"), "Children should be in library's selection");
        assertFalse(classUnderTest.isInSelection("Drama"), "Drama should not be in library's selection");
    }
}