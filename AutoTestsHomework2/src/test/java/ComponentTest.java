import org.example.Component;
import org.example.ComponentCircle;
import org.example.MyUnit;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;

public abstract class ComponentTest {
    @Test
    void unsupportedOperationsTest(MyUnit component1, MyUnit component2) {
        Assertions.assertThrows(UnsupportedOperationException.class, ()->component1.add(component2));
        Assertions.assertThrows(UnsupportedOperationException.class, ()->component1.remove(component2));
    }
}
