import com.example.IFeline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.junit.MockitoJUnitRunner;

@RunWith(MockitoJUnitRunner.class)
public class LionExceptionTest {

    @Mock
    IFeline iFeline;

    @Test
    public void test(){
        try {
            Lion lion = new Lion("Дивергент", iFeline);
            Assert.fail("При создании льва невозможного пола не срабатывает исключение");
        } catch (Exception e) {
            Assert.assertEquals("Текст исключения при создании льва недопустимого пола не соответствует ожидаемому"
                    , "Используйте допустимые значения пола животного - самей или самка"
                    , e.getMessage());
        }
    }
}
