package korepetycje;

public class Main {
    public static void main(String[] args) {
        // Tworzenie obiektów Student
        Student student1 = new Student("Jan Kowalski", "Liceum");
        Student student2 = new Student("Anna Nowak", "Technikum");

        // Tworzenie obiektów Lesson
        Lesson lesson1 = new Lesson(student1, "Matematyka", 50.0);
        Lesson lesson2 = new Lesson(student2, "Fizyka", 60.0);

        // Tworzenie obiektu ScheduleManager i dodawanie lekcji
        ScheduleManager scheduleManager = new ScheduleManager();
        scheduleManager.addLesson(lesson1);
        scheduleManager.addLesson(lesson2);

        // Wyświetlanie wszystkich lekcji
        System.out.println("Lista lekcji:");
        for (Lesson lesson : scheduleManager.getLessons()) {
            System.out.println("Student: "
                    + lesson.getStudent().getName()
                    + ", Temat: " + lesson.getTopic() 
                    + ", Cena: " + lesson.getPrice());
        }

        // Obliczanie całkowitego dochodu
        double totalIncome = scheduleManager.calculateTotalIncome();
        System.out.println("Całkowity dochód: " + totalIncome);
    }
}
