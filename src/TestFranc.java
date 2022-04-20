import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class TestFranc {
  @Test
  public void testFrancMultiplication() {
    Money five = Money.franc(5);
    assertEquals(Money.franc(10), five.times(2));
    assertEquals(Money.franc(15), five.times(3));
  }
}
