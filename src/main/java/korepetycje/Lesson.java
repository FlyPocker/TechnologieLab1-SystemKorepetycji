package korepetycje;

public class Lesson {
    private Student student;
    private String topic;
    private double price;

    public Lesson(Student student, String topic, double price) {
        this.student = student;
        this.topic = topic;
        this.price = price;
    }

    public Student getStudent() {
        return student;
    }

    public String getTopic() {
        return topic;
    }

    public double getPrice() {
        return price;
    }
}
