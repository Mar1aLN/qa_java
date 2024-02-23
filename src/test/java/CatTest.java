import com.example.Cat;
import com.example.Feline;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import java.util.List;

public class CatTest {
    Cat cat;

    @Before
    public void init(){
        Feline feline = new Feline();
        cat = new Cat(feline);
    }
    @Test
    public void catSoundTest(){
        Assert.assertEquals("Звук кота не \"Мяу\"","Мяу", cat.getSound());

    }
    @Test
    public void catFoodTest() throws Exception {
        Assert.assertEquals("Список еды не соответствует еде хищника", List.of("Животные", "Птицы", "Рыба"), cat.getFood());
    }
}
