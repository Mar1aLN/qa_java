import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

public class FelineExceptionTest {
    @Test()
    public void testFelineFoodException() throws Exception {
        Assert.assertThrows("Неизвестный вид животного, используйте значение Травоядное или Хищник", Exception.class, () -> new Feline().getFood("Дивергент"));
    }
}
