package bs450.stringutils;

import java.util.Set;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

// change "StringUtils" to "StringUtilsBuggy1" and "StringUtilsBuggy2" to get test failures


public class StringUtilsTest {

    @Test
    public void shouldReturnRepeatedChar() {
        Set<Character> resultSet = StringUtils.duplicateLetters("software testing");
        assertTrue(resultSet.contains('t'));
    }

    @Test
    public void shouldNotReturnNonRepeatedChar() {
        Set<Character> resultSet = StringUtils.duplicateLetters("software debugging");
        assertFalse(resultSet.contains('t'));
    }

    @Test
    public void shouldReturnRepeatedCharFromStartOfString() {
        Set<Character> resultSet = StringUtils.duplicateLetters("software skill");
        assertTrue(resultSet.contains('s'));
    }
}
