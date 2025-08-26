package qlsinhvien;

public class Main {
    public static void main(String[] args) {
        // 1. Tạo các đối tượng Teacher và Student
        Teacher t1 = new Teacher("T001", "Nguyen Van A", "Computer Science");
        Teacher t2 = new Teacher("T002", "Le Thi B", "Mathematics");

        Student s1 = new Student("S101", "Tran Van C", 20, 3.5);
        Student s2 = new Student("S102", "Phan Thi D", 21, 3.8);
        Student s3 = new Student("S103", "Hoang Van E", 20, 3.2);

        // 2. Tạo các đối tượng Course
        Course courseCS101 = new Course("CS101", "Introduction to Programming", t1);
        Course courseMA201 = new Course("MA201", "Linear Algebra", t2);

        // 3. Thực hiện các thao tác quản lý
        System.out.println("--- Đăng ký sinh viên vào khóa học ---");
        courseCS101.addStudent(s1);
        courseCS101.addStudent(s2);
        courseMA201.addStudent(s2); // Sinh viên có thể đăng ký nhiều khóa học
        courseMA201.addStudent(s3);
        courseCS101.addStudent(s1); // Thử thêm lại sinh viên đã có

        // 4. Hiển thị thông tin
        courseCS101.displayCourseDetails();
        courseMA201.displayCourseDetails();

        // 5. Xóa sinh viên khỏi khóa học
        System.out.println("\n--- Xóa sinh viên khỏi khóa học ---");
        courseCS101.removeStudent(s2);
        courseCS101.removeStudent(s3); // Thử xóa sinh viên không có trong khóa học

        // 6. Hiển thị lại thông tin để kiểm tra
        courseCS101.displayCourseDetails();
    }
}
