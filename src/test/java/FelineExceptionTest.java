import com.example.Feline;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

public class FelineExceptionTest {
    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test()
    public void testFelineFoodException() throws Exception {
        thrown.expect(Exception.class);
        thrown.expectMessage("Неизвестный вид животного, используйте значение Травоядное или Хищник");

        Feline feline = new Feline();
        feline.getFood("Дивергент");

    }
}
