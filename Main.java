// Тестирование
public class Main {
    public static void main(String[] args) {
        // Создание экземпляров классов
        IUStudent iuStudent = new IUStudent("Иван Иванов", 2, 4.5);
        MathStudent mathStudent = new MathStudent("Анна Петрова", 3, 4.8);

        // Вывод информации и выполнение методов
        iuStudent.printInfo();
        iuStudent.writeExam();

        mathStudent.printInfo();
        mathStudent.writeExam();

        SortStrings sortStrings = new SortStrings();

        sortStrings.addString("0000");
        sortStrings.addString("111");
        sortStrings.addString("222222");
        sortStrings.addString("33");
        sortStrings.addString("5555");
        sortStrings.addString("6");

        sortStrings.printStrings();
        System.out.println(sortStrings.getMaxString());
        System.out.println(sortStrings.getAverageLength());
    }
}