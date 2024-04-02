import org.example.ComponentSquare;
import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;


public class ComponentSquareTest{
    ComponentSquare square1;
    ComponentSquare square2;
    @BeforeEach
    void squareCreation(){
        this.square1 = new ComponentSquare();
        this.square2 = new ComponentSquare();
    }

    @Test
    void unsupportedOperationsTest() {
        Assertions.assertThrows(UnsupportedOperationException.class, ()->square1.add(square2));
        Assertions.assertThrows(UnsupportedOperationException.class, ()->square1.remove(square2));
    }

}
