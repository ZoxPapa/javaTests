import org.example.Component;
import org.example.ComponentCircle;
import org.example.ComponentSquare;
import org.example.Container;
import org.junit.jupiter.api.*;

public class ContainerTest {
    Container container;
    Component circle;
    Component square;
    @BeforeEach
    void prepareForContainerTest(){
        this.container = new Container();
        this.circle = new ComponentCircle();
        this.square = new ComponentSquare();
    }

    @Test
    void addTest(){
        container.add(circle);
        container.add(square);
        Assertions.assertTrue(container.unitList.contains(circle));
        Assertions.assertTrue(container.unitList.contains(square));
    }
    @Test
    void removeTest(){
        container.add(circle);
        container.remove(circle);
        Assertions.assertFalse(container.unitList.contains(circle));
    }
    @Test
    void printComponentsTest(){
        container.add(circle);
        container.add(square);
        Assertions.assertEquals("I'm circle.\nI'm square.\n", container.print());
    }
    @Test
    void printComponentsAndContainers(){
        container.add(circle);
        container.add(square);
        Container container2 = new Container();
        Container container3 = new Container();
        container2.add(circle);
        container3.add(square);
        container.add(container2);
        container.add(container3);
        Assertions.assertEquals("I'm circle.\nI'm square.\nI'm circle.\nI'm square.\n",
                container.print());
    }
}
