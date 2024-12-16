import java.util.ArrayList;
import java.util.Comparator;

public class SortStrings {
    private ArrayList<String> strings;

    // Конструктор
    public SortStrings() {
        this.strings = new ArrayList<>();
    }

    // Метод добавления строки
    public void addString(String str) {
        strings.add(str);
        // Сортировка массива по длине строк
        strings.sort(Comparator.comparingInt(String::length));
    }

    // Метод для получения строки максимальной длины
    public String getMaxString() {
        if (strings.isEmpty()) {
            return null; // Если массив пуст
        }
        return strings.get(strings.size() - 1); // Последний элемент после сортировки
    }

    // Метод для вычисления средней длины строк
    public double getAverageLength() {
        if (strings.isEmpty()) {
            return 0.0; // Если массив пуст
        }
        int totalLength = strings.stream().mapToInt(String::length).sum();
        return (double) totalLength / strings.size();
    }

    // Метод для вывода всех строк
    public void printStrings() {
        System.out.println("Строки в массиве: " + strings);
    }
}



