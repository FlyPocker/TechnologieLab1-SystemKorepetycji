package korepetycje;

public class Student {
    private String name;
    private String schoolLevel;

    public Student(String name, String schoolLevel) {
        this.name = name;
        this.schoolLevel = schoolLevel;
    }

    public String getName() {
        return name;
    }

    public String getSchoolLevel() {
        return schoolLevel;
    }
}
