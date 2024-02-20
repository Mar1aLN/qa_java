import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import java.util.List;

@RunWith(MockitoJUnitRunner.class)
public class FelineTest {
    Feline feline;
    @Before
    public void init(){
        feline = new Feline();
    }

    @Test
    public void felineFoodTest() throws Exception {
        Assert.assertEquals("Список еды не соответствует еде хищника", List.of("Животные", "Птицы", "Рыба"), feline.getFood("Хищник"));
    }

    @Test
    public void felineKittensTest(){
        Assert.assertEquals("Ошибка количества котят", 1, feline.getKittens());
    }

    @Test
    public void felineKittensParamTest(){
        Assert.assertEquals("Ошибка количества котят", 2, feline.getKittens(2));
    }

    @Test
    public void felineFamilyTest(){
        Assert.assertEquals("Ошибка вида Кошачьих", "Кошачьи", feline.getFamily());
    }
}
