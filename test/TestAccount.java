import org.junit.Test;
import static org.junit.Assert.*;
public class TestAccount {
  @Test

  public void testAccName() {
    Account ashish = new Account(123,"Ashish",1000);
    assertEquals(ashish.getHolderName(),"Ashish");
  }

  @Test

  public void testAccNumber() {
    Account ashish = new Account(123,"Ashish",1000);
    int expected = ashish.getAccountNumber();
    assertEquals(expected,123);
  }
  @Test

  public void testBalance() {
    Account ashish = new Account(123,"Ashish",1000);
    float expected = ashish.getBalance();
    assertEquals(expected,1000,0);
  }
}
