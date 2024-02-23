import com.example.IFeline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.Mock;
import org.mockito.Mockito;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class LionTest {
    private Lion lion;

    private final String sex;

    private final boolean expectedMane;

    @Mock
    IFeline feline;

    @Before
    public void init() throws Exception {
        MockitoAnnotations.initMocks(this);

        Mockito.when(feline.getKittens()).thenReturn(1);
        Mockito.when(feline.getFood("Хищник")).thenReturn(List.of("Животные", "Птицы", "Рыба"));

        lion = new Lion(this.sex, feline);
    }

    public LionTest(String sex, boolean expectedMane) throws Exception {
        this.sex = sex;
        this.expectedMane = expectedMane;
    }


    @Parameterized.Parameters
    public static Collection<Object[]> data() {
        return Arrays.asList(new Object[][]{
                {"Самец", true},
                {"Самка", false}
        });
    }

    @Test
    public void maneTest(){
        Assert.assertEquals("Грива не соответствует полу",expectedMane, lion.doesHaveMane());
    }

    @Test
    public void kittensTest(){
        Assert.assertEquals("Ошибка количества котят",1, lion.getKittens());
    }

    @Test
    public void foodTest() throws Exception {
        Assert.assertEquals("Список еды не соответствует еде хищника", List.of("Животные", "Птицы", "Рыба"), lion.getFood());
    }
}
