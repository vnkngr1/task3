// Абстрактный класс Student
abstract class Student {
    private String fullName;
    private int course;
    private double lastExamGrade;

    // Конструктор
    public Student(String fullName, int course, double lastExamGrade) {
        this.fullName = fullName;
        this.course = course;
        this.lastExamGrade = lastExamGrade;
    }

    // Геттеры
    public String getFullName() {
        return fullName;
    }

    public int getCourse() {
        return course;
    }

    public double getLastExamGrade() {
        return lastExamGrade;
    }

    // Абстрактный метод
    public abstract void writeExam();

    // Метод для вывода общей информации
    public void printInfo() {
        System.out.println("ФИО: " + fullName + ", Курс: " + course +
                ", Оценка за последний экзамен: " + lastExamGrade);
    }
}

// Класс IUStudent
class IUStudent extends Student {
    public IUStudent(String fullName, int course, double lastExamGrade) {
        super(fullName, course, lastExamGrade);
    }

    @Override
    public void writeExam() {
        System.out.println(getFullName() + " пишет экзамен по направлениям международных отношений.");
    }
}

// Класс MathStudent
class MathStudent extends Student {
    public MathStudent(String fullName, int course, double lastExamGrade) {
        super(fullName, course, lastExamGrade);
    }

    @Override
    public void writeExam() {
        System.out.println(getFullName() + " пишет экзамен по математическим дисциплинам.");
    }
}