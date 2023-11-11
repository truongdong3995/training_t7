import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class StudentManagement {
    private List<Student> listStudents = new ArrayList<>();

    public void showAll() {
        System.out.println("Danh sách tất cả học sinh:");
        for (Student student : listStudents) {
            System.out.println(student);
        }
//
//        for (int i = 0; i < listStudents.size(); i++) {
//            System.out.println(listStudents.get(i));
//        }
    }

    /**
     * Thêm một sinh viên vào danh sách sinh viên
     *
     * @param student
     */
    public void addStudent(Student student) {
        listStudents.add(student);
    }

    /**
     * Xóa sinh viên có mã số sinh viên là studentId khỏi danh sách sinh viên.
     *
     * @param studentId
     */
    public void removeStudent(int studentId) {
//        for (Student student: listStudents) {
//            // Nếu id nhập vào và id củ sinh viên bằng nhau
//            // Chính la thằng mình muốn xóa-> xóa nó khỏi sanh sách
//            if (studentId == student.getStudentId()) {
//                listStudents.remove(student);
//                System.out.println("Đã xoá student thành công.");
//                return;
//            }
//        }
        // Tìm student dựa vào phương thức findByStudentId
        Student student = findByStudentId(studentId);
        if (student != null) {
            listStudents.remove(student);
        } else {
            System.out.println("Không tồn tại student có id là " + studentId);
        }
    }

    /**
     * Tìm kiếm sinh viên có mã số sinh viên là studentId và trả về đối tượng Student tương ứng
     *
     * @param studentId
     * @return trả về null hoặc student tìm được
     */
    public Student findByStudentId(int studentId) {
        for (Student student : listStudents) {
            // Nếu id nhập vào và id củ sinh viên bằng nhau
            // Chính la thằng mình muốn xóa-> xóa nó khỏi sanh sách
            if (studentId == student.getStudentId()) {
                return student;
            }
        }

        // Nếu không tìm thấy student
        System.out.println("Không tìm thấy student có studentId là " + studentId);
        return null;
    }

    /**
     * Tính và trả về điểm trung bình của tất cả student.
     *
     * @return
     */
    public double getAverageScore() {
        // Bươớc 1: Tính tổng điểm của tất cả các Student
        double sumScore = 0;
        for (Student student : listStudents) {
            sumScore = sumScore + student.getAverageScore();
        }
        // Bước 2: Tính điểm TB của tất cả student
        // điêểm TB = tổng điểm / số student
        return sumScore / listStudents.size();
    }

    /**
     * Sắp xếp danh sách student tăng dần
     */
    public void sortByScore() {
        Collections.sort(listStudents);
    }
}
