package lab6_bai3;

public class PhuongTrinhManagement {
    public static void main(String[] args) {

        PhuongTrinh pt1 = new PhuongTrinh(3, 6, 2);
        System.out.println("Delta: " + pt1.tinhDelta(pt1.getA(), pt1.getB(), pt1.getC()));
        pt1.giaiPhuongTrinh(pt1.getA(), pt1.getB(), pt1.getC());

        System.out.println("▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂▂");

        PhuongTrinh pt2 = new PhuongTrinh(0, 0, 0);
        System.out.println("Delta: " + pt1.tinhDelta(pt2.getA(), pt2.getB() ,pt2.getC()));
        pt1.giaiPhuongTrinh(pt1.getA(), pt2.getB(), pt2.getC());
    }
}
