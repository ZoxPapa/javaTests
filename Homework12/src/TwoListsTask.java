import java.util.List;

public class TwoListsTask {

    double findAverage(List<Integer> list) {
        if (list.isEmpty()) throw new RuntimeException("Empty list error");
        double result = 0;
        for (int i : list) result += i;
        return result / list.size();
    }

    String outputAveragesToConsole(double average1, double average2) {
        return "Average numbers:\n For first list: " + average1
                + ", for second list: " + average2 + ".";
    }

    public String compareAverages(List<Integer> firstList, List<Integer> secondList) throws InterruptedException {
        double firstAverage = findAverage(firstList);
        double secondAverage = findAverage(secondList);
        System.out.println(outputAveragesToConsole(firstAverage, secondAverage));
        Thread.sleep(3000);
        int result = Double.compare(firstAverage, secondAverage);
        if (result > 0) return "Первый список имеет большее среднее значение";
        else if (result < 0) return "Второй список имеет большее среднее значение";
        else return "Средние значения равны";

    }

}
