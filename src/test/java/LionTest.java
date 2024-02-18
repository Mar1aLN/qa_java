import com.example.Feline;
import com.example.Lion;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;
import org.mockito.MockitoAnnotations;

import java.util.Arrays;
import java.util.Collection;
import java.util.List;

@RunWith(Parameterized.class)
public class LionTest {
    private final String sex;

    private final boolean expectedMane;

    public LionTest(String sex, boolean expectedMane) {
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
    public void test(){
        Feline feline = new Feline();
        try {
            Lion lion = new Lion(this.sex, feline);
            Assert.assertEquals("Грива не соответствует полу",expectedMane, lion.doesHaveMane());

            Assert.assertEquals("Ошибка количества котят",1, lion.getKittens());

            Assert.assertEquals("Список еды не соответствует еде хищника", List.of("Животные", "Птицы", "Рыба"), lion.getFood());
        } catch (Exception e) {
            Assert.fail("При создании льва произошла ошибка: " + e.getMessage());
        }

    }
}
