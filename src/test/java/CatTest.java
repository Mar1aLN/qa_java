import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Test;

import java.util.List;

public class CatTest {

    @Test
    public void test(){
        Feline feline = new Feline();
        Cat cat = new Cat(feline);

        Assert.assertEquals("Звук кота не \"Мяу\"","Мяу", cat.getSound());

        try {
            Assert.assertEquals("Список еды не соответствует еде хищника", List.of("Животные", "Птицы", "Рыба"), cat.getFood());
        } catch (Exception e) {
            Assert.fail("При получении списка еды произошла ошика: " + e.getMessage());
        }
    }
}
