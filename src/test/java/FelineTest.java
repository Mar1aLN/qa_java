import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.Mock;
import org.mockito.MockitoAnnotations;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
//    @Before
//    public void init() {
//        MockitoAnnotations.initMocks(this);
//    }



    @Test
    public void testFeline(){
        Feline feline = new Feline();

        try {
            Assert.assertEquals("Список еды не соответствует еде хищника", List.of("Животные", "Птицы", "Рыба"), feline.getFood("Хищник"));
        } catch (Exception e) {
            Assert.fail("При получении списка еды произошла ошика: " + e.getMessage());
        }

        Assert.assertEquals("Ошибка количества котят", 1, feline.getKittens());
        Assert.assertEquals("Ошибка количества котят", 2, feline.getKittens(2));

        Assert.assertEquals("Ошибка вида Кошачьих", "Кошачьи", feline.getFamily());
    }
}
