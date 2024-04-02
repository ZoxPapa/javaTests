import org.example.ComponentCircle;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class ComponentCircleTest{
    ComponentCircle circle1;
    ComponentCircle circle2;
    @BeforeEach
    void circlesCreation(){
        this.circle1 = new ComponentCircle();
        this.circle2 = new ComponentCircle();
    }

    @Test
    void unsupportedOperationsTest() {
        Assertions.assertThrows(UnsupportedOperationException.class, ()->circle1.add(circle2));
        Assertions.assertThrows(UnsupportedOperationException.class, ()->circle1.remove(circle2));
    }
}
