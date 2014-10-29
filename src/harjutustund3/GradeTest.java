package harjutustund3;

import static org.junit.Assert.*;
import org.junit.Test;

/** Test.
 * @author Jaanus
 */
public class GradeTest {

   @Test
   public void testMiddles() {
      assertTrue (Grade.grade(25).equalsIgnoreCase ("fail"));
      assertTrue (Grade.grade(55).equalsIgnoreCase ("sufficient"));
      assertTrue (Grade.grade(65).equalsIgnoreCase ("satisfactory"));
      assertTrue (Grade.grade(75).equalsIgnoreCase ("good"));
      assertTrue (Grade.grade(85).equalsIgnoreCase ("very good"));
      assertTrue (Grade.grade(95).equalsIgnoreCase ("excellent"));
   }

   @Test
   public void testUpperBounds() {
      assertTrue (Grade.grade(50).equalsIgnoreCase ("fail"));
      assertTrue (Grade.grade(60).equalsIgnoreCase ("sufficient"));
      assertTrue (Grade.grade(70).equalsIgnoreCase ("satisfactory"));
      assertTrue (Grade.grade(80).equalsIgnoreCase ("good"));
      assertTrue (Grade.grade(90).equalsIgnoreCase ("very good"));
      assertTrue (Grade.grade(100).equalsIgnoreCase ("excellent"));
   }

   @Test
   public void testLowerBounds() {
      assertTrue (Grade.grade (0).equalsIgnoreCase ("fail"));
      assertTrue (Grade.grade(51).equalsIgnoreCase ("sufficient"));
      assertTrue (Grade.grade(61).equalsIgnoreCase ("satisfactory"));
      assertTrue (Grade.grade(71).equalsIgnoreCase ("good"));
      assertTrue (Grade.grade(81).equalsIgnoreCase ("very good"));
      assertTrue (Grade.grade(91).equalsIgnoreCase ("excellent"));
   }

   @Test (expected=RuntimeException.class)
   public void testNegGrade() {
      Grade.grade (-1);
   }

   @Test (expected=RuntimeException.class)
   public void testTooLargeGrade() {
      Grade.grade (201);
   }

// =================================================================
// Tests below are for double numbers ("student friendly" approach)
// =================================================================

   @Test
   public void testHalfLowerBounds() {
      assertTrue (Grade.grade(50.5).equalsIgnoreCase ("sufficient"));
      assertTrue (Grade.grade(60.5).equalsIgnoreCase ("satisfactory"));
      assertTrue (Grade.grade(70.5).equalsIgnoreCase ("good"));
      assertTrue (Grade.grade(80.5).equalsIgnoreCase ("very good"));
      assertTrue (Grade.grade(90.5).equalsIgnoreCase ("excellent"));
   }

   @Test
   public void testStudentFriendly() {
      assertTrue (Grade.grade(50.000001).equalsIgnoreCase ("sufficient"));
      assertTrue (Grade.grade(60.000001).equalsIgnoreCase ("satisfactory"));
      assertTrue (Grade.grade(70.000001).equalsIgnoreCase ("good"));
      assertTrue (Grade.grade(80.000001).equalsIgnoreCase ("very good"));
      assertTrue (Grade.grade(90.000001).equalsIgnoreCase ("excellent"));
   }

   @Test (expected=RuntimeException.class)
   public void testSmallNegGrade() {
      Grade.grade (-0.000001);
   }

   @Test (expected=RuntimeException.class)
   public void testLittleTooLargeGrade() {
      Grade.grade (200.000001);
   }

   @Test (expected=RuntimeException.class)
   public void testLittleMoreThan100() {
      Grade.grade (100.000001);
   }
}
