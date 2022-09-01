import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class AnimalTest {

    @Test
    public void shouldEat() {
        Animal animal = new Animal();
        animal.eat();

        Assertions.assertFalse(animal.hungry);
    }

    @Test
    public void shouldGetOld() {
        Animal animal = new Animal();
        animal.age = 2;
        animal.getOld();

        Assertions.assertEquals(animal.age, 3);
    }
}
