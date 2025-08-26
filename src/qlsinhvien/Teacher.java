package qlsinhvien;

public class Teacher {
    private String teacherID;
    private String name;
    private String specialty;

    public Teacher(String teacherID, String name, String specialty) {
        this.teacherID = teacherID;
        this.name = name;
        this.specialty = specialty;
    }

    public String getTeacherID() {
        return teacherID;
    }

    public String getName() {
        return name;
    }

    public String getSpecialty() {
        return specialty;
    }

    @Override
    public String toString() {
        return "Teacher ID: " + teacherID + ", Name: " + name + ", Specialty: " + specialty;
    }
}
