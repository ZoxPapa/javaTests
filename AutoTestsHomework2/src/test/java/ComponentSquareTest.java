import org.example.ComponentSquare;
import org.junit.jupiter.api.Test;

public class ComponentSquareTest extends ComponentTest{
    @Test
    void testTest(){
        ComponentSquareTest componentSquareTest = new ComponentSquareTest();
        ComponentSquare square1 = new ComponentSquare();
        ComponentSquare square2 = new ComponentSquare();
        componentSquareTest.unsupportedOperationsTest(square1, square2);
    }

}
