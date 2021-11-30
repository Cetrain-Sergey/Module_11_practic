import java.util.*;

public class Main {

    public static void main(String[] args) {

        TreeMap<String, Double> tm = new TreeMap<String, Double>(new TComp());

        tm.put("Вася Пупкин", 1378.0);
        tm.put("Иван Иванов", 3434.34);
        tm.put("Дима Петров", -19.08);
        tm.put("Алена Романова", 123.22);
        tm.put("Ваня Куликов", 99.22);

        Set<Map.Entry<String, Double>> set = tm.entrySet();

        for (Map.Entry<String, Double> me : set) {
            System.out.print(me.getKey() + ": ");
            System.out.println(me.getValue());
        }
        System.out.println();
    }
}
