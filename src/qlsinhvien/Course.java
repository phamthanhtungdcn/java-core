package qlsinhvien;

import java.util.ArrayList;
import java.util.List;

public class Course {
    private String courseID;
    private String courseName;
    private Teacher teacher;
    private List<Student> students;

    public Course(String courseID, String courseName, Teacher teacher) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.teacher = teacher;
        this.students = new ArrayList<>();
    }

    public void addStudent(Student student) {
        if (!students.contains(student)) {
            students.add(student);
            System.out.println(student.getName() + " đã được thêm vào khóa học " + courseName);
        } else {
            System.out.println(student.getName() + " đã có trong khóa học " + courseName);
        }
    }

    public void removeStudent(Student student) {
        if (students.remove(student)) {
            System.out.println(student.getName() + " đã được xóa khỏi khóa học " + courseName);
        } else {
            System.out.println(student.getName() + " không có trong khóa học " + courseName);
        }
    }

    public void displayCourseDetails() {
        System.out.println("\n--- Thông tin Khóa học ---");
        System.out.println("Mã khóa học: " + courseID);
        System.out.println("Tên khóa học: " + courseName);
        System.out.println("Giảng viên: " + teacher.getName());
        System.out.println("Danh sách sinh viên:");
        if (students.isEmpty()) {
            System.out.println("  (Chưa có sinh viên nào đăng ký)");
        } else {
            for (Student s : students) {
                System.out.println("  - " + s.getName());
            }
        }
        System.out.println("--------------------------");
    }
}
