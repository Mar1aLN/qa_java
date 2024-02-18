import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class FelineExceptionTest {
    @Test
    public void test(){
        Feline feline = new Feline();
        try {
            feline.getFood("Дивергент");
            Assert.fail("При получении списка еды невозможного семейства Кошачьих не создается исключение");
        } catch (Exception e) {
        }

    }
}
