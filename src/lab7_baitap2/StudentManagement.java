package lab7_baitap2;

public class StudentManagement {
    public static void main(String[] args) {
        Student student = new Student(1, "Nguyen Binh", 8,9,9);
        student.xemThongTin();
        student.xetLenLop(student.getDiemTrungBinh());
        System.out.println(student.xetHocBong(student.getXepLoai()));
    }
}
