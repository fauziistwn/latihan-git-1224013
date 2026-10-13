import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class StudentGradeTest {
    StudentGrade grade = new StudentGrade();

    @Test
    public void testCalculateGradeException() {
        assertThrows(IllegalArgumentException.class, () -> grade.calculateGrade(-5));
        assertThrows(IllegalArgumentException.class, () -> grade.calculateGrade(105));
    }

    @Test
    public void testCalculateGrades() {
        assertEquals("A", grade.calculateGrade(85));
        assertEquals("B", grade.calculateGrade(75));
        assertEquals("C", grade.calculateGrade(65));
        assertEquals("D", grade.calculateGrade(55));
        assertEquals("E", grade.calculateGrade(45));
    }

    @Test
    public void testIsPassed() {
        assertTrue(grade.isPassed(60));
        assertFalse(grade.isPassed(50));
        assertThrows(IllegalArgumentException.class, () -> grade.isPassed(-10));
    }
}
