import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.BeforeEach;
import static org.junit.jupiter.api.Assertions.*;

class BankingApplicationTest {

    private BankingApplication bankingApp;
    @BeforeEach
    void setUp(){
        bankingApp=new BankingApplication();
    }
  @Test
    void TestDepositMethod(){
       bankingApp.setBalance(1000);
       bankingApp.MyDeposit(200);
      // double expectedBalance=bankingApp.getBalance(
       assertEquals(1200,bankingApp.getBalance());

  }
    @Test
    void testWithdrawMethod_Successful() {
        bankingApp.setBalance(1000);
        assertTrue(bankingApp.MyWithdraw(500)); // Withdrawal should succeed
        assertEquals(500, bankingApp.getBalance());
    }

    @Test
    void testWithdrawMethod_Failure() {
        bankingApp.setBalance(300);
        assertFalse(bankingApp.MyWithdraw(400)); // Should fail due to insufficient funds
        assertEquals(300, bankingApp.getBalance()); // Balance should remain unchanged
    }

    @Test
    void testCheckBalanceMethod() {
        bankingApp.setBalance(750);
        assertEquals("Your current balance: $750.0", bankingApp.MyCheckBalance());
    }
}