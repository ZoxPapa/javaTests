import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import java.util.List;

public class TwoListsTaskTest {
    TwoListsTask task;
    @BeforeEach
    void taskPreparing(){
        this.task = new TwoListsTask();
    }
    @Test
    @DisplayName("Find average test")
    void findAverageTest(){
        Assertions.assertEquals(2, task.findAverage(List.of(1, 2, 3)));
        Assertions.assertEquals(0, task.findAverage(List.of(-23, 0, 23)));
        Assertions.assertThrows(RuntimeException.class, ()-> task.findAverage(List.of()));
    }

    @Test
    @DisplayName("Output to console test")
    void outputToConsoleTest(){
        Assertions.assertEquals("Average numbers:\n For first list: 2.0, for second list: 123.0.",
                task.outputAveragesToConsole(2, 123));
    }

    @Test
    @DisplayName("Comparing test")
    void compareTwoAveragesTest() throws InterruptedException {
        List<Integer> firstList = List.of(5, 10, 15);
        List<Integer> secondList = List.of(-200, 0, 200);

        Assertions.assertEquals("Первый список имеет большее среднее значение",
                task.compareAverages(firstList, secondList));
        Assertions.assertEquals("Второй список имеет большее среднее значение",
                task.compareAverages(secondList, firstList));
        Assertions.assertEquals("Средние значения равны",
                task.compareAverages(firstList, List.of(10)));
    }

}
