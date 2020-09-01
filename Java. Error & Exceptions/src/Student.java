import subjectenum.Subjects;

public class Student {
    private String name;
    private String surName;

    public Student(String name, String surName) {
        this.name = name;
        this.surName = surName;
    }

    public String getName() {
        return name;
    }

    public String getSurName() {
        return surName;
    }
    //Группа
    //Оценки

    @Override
    public String toString() {
        return "Student: " + name + " " + surName;
    }
}
