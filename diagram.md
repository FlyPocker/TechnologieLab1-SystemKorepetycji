```mermaid
classDiagram
    class Student {
        -String name
        -String schoolLevel
        +Student(String name, String schoolLevel)
        +getName() String
        +getSchoolLevel() String
    }