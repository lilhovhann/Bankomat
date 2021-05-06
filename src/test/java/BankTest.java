
import com.mycompany.javaconsoleapplication.Account;
import com.mycompany.javaconsoleapplication.Bank;
import com.mycompany.javaconsoleapplication.Person;
import org.junit.Test;

/**
 *
 * @author lilith
 */
public class BankTest {

    Bank bank = new Bank("ArdshinBank", "Abovyan 5/4");
    Person person1 = new Person(System.currentTimeMillis(), "Armen", 34, "male");
    Person person2 = new Person(System.currentTimeMillis() + 1, "Lilit", 23, "female");
    Account account1 = new Account(System.currentTimeMillis() + 2, person1.getId(), 250000);
    Account account2 = new Account(System.currentTimeMillis() + 2, person2.getId(), 200000);

    @Test
    public void BankomatChecker() {
        
    }

    public BankTest() {
    }

    

}
