import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Student student1 = new Student(10, "Dong", 6f);
        Student student2 = new Student(1, "Thanh", 7f);

        //DÙng constructor default
        Student student3 =  new Student();
        student3.setStudentId(2);
        student3.setName("Duy Anh");
        student3.setAverageScore(10f);


        // Thêm student vào list
        StudentManagement studentManagement =  new StudentManagement();
        studentManagement.addStudent(student1);
        studentManagement.addStudent(student2);
        studentManagement.addStudent(student3);

        // HIển thị tất cả các Student bên trong List
        System.out.println("Hiển thị danh sách tất cả student:");
        studentManagement.showAll();

//        //Xóa sinh viên có mã số sinh viên là studentId khỏi danh sách sinh viên.
//        studentManagement.removeStudent(11);
//        System.out.println("Hiển thị danh sách tất cả student sau khi xóa:");
//        studentManagement.showAll();

        // Tính và trả về điểm trung bình của tất cả student.
        System.out.println("Điểm trung bình của tất cả student là:" + studentManagement.getAverageScore());
        System.out.printf("Điểm trung bình của tất cả student là: %.1f \n",studentManagement.getAverageScore());

        // Sắp xếp sinh viên theo điểm tăng dần
        studentManagement.sortByScore();
        System.out.println("Danh schs student sau khi sort");
        studentManagement.showAll();
    }
}
