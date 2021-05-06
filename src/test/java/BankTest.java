
import com.mycompany.javaconsoleapplication.Account;
import com.mycompany.javaconsoleapplication.Bankomat;
import com.mycompany.javaconsoleapplication.Person;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

/**
 *
 * @author lilith
 */
public class BankTest {

    Person person;
    Person person1 = new Person(System.currentTimeMillis(), "Armen", 34, "male");
    Account account;
    Double money = 240000.0;
    Account account1 = new Account(System.currentTimeMillis() + 2, person1.getId(), 250000);

    @Test
    public void doCheckPerson() {
        assertEquals(person, Bankomat.doCheckPerson("Armen"));
    }

    @Test
    public void doCheckAccount() {
        assertEquals(account, Bankomat.doCheckAccount(person1));
    }

    @Test
    public void doReceiveMoney() {
        assertEquals(money, Bankomat.doReceiveMoney(10000.0, account1));
    } 

    public BankTest() {
    }

}
