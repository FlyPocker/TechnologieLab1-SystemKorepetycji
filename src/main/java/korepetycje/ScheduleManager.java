package korepetycje;

import java.util.ArrayList;
import java.util.List;

public class ScheduleManager {
    private List<Lesson> lessons;

    public ScheduleManager() {
        this.lessons = new ArrayList<>();
    }

    public void addLesson(Lesson lesson) {
        if (lesson != null) {
            lessons.add(lesson);
        }
    }

    public List<Lesson> getLessons() {
        return lessons;
    }

    public double calculateTotalIncome() {
        double totalIncome = 0.0;
        for (Lesson lesson : lessons) {
            totalIncome += lesson.getPrice();
        }
        return totalIncome;
    }
}
