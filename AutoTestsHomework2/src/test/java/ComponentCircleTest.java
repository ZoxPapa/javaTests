import org.example.ComponentCircle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class ComponentCircleTest extends ComponentTest {
    @Test
    void upsupportedTest(){
        ComponentCircleTest componentCircleTest = new ComponentCircleTest();
        ComponentCircle circle1 = new ComponentCircle();
        ComponentCircle circle2 = new ComponentCircle();
        componentCircleTest.unsupportedOperationsTest(circle1, circle2);
    }
}
