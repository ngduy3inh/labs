package lab6_bai2;

public class TuGiacManagement {
    public static void main(String[] args) {

        TuGiac tuGiac1 = new TuGiac();
        tuGiac1.setHeight(2);
        tuGiac1.setWidth(4);
        tuGiac1.veTuGiac(tuGiac1.getA(), tuGiac1.getB());
        float cv1 = tuGiac1.tinhChuVi(tuGiac1.getA(), tuGiac1.getB());
        float dt1 =tuGiac1.tinhDienTich(tuGiac1.getA(), tuGiac1.getB());
        String pl1 = tuGiac1.phanLoaiTuGiac(tuGiac1.getA(),tuGiac1.getB());
        System.out.println("hinh " + pl1 + ",co chu vi la " + cv1 + ", dien tich la: " + dt1 );

        System.out.println("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂");

        TuGiac tuGiac2 = new TuGiac(6);
        tuGiac2.veTuGiac(tuGiac2.getA(), tuGiac2.getB());
        float cv2 = tuGiac2.tinhChuVi(tuGiac2.getA(), tuGiac2.getB());
        float dt2 =tuGiac2.tinhDienTich(tuGiac2.getA(), tuGiac2.getB());
        String pl2 = tuGiac2.phanLoaiTuGiac(tuGiac2.getA(),tuGiac2.getB());
        System.out.println("hinh " + pl2 + ",co chu vi la " + cv2 + ", dien tich la: " + dt2 );

        System.out.println("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂");

        TuGiac tuGiac3 = new TuGiac(3,6);
        tuGiac3.veTuGiac(tuGiac3.getA(),tuGiac3.getB());
        float cv3 = tuGiac3.tinhChuVi(tuGiac3.getA(),tuGiac3.getB());
        float dt3 = tuGiac3.tinhDienTich(tuGiac3.getA(),tuGiac3.getB());
        String pl3 = tuGiac3.phanLoaiTuGiac(tuGiac3.getA(),tuGiac3.getB());
        System.out.println("hinh " + pl3 + ", sco chu vi la " + cv3 + ", dien tich la: " + dt3 );

    }
}