package lab6_bai4;

public class PhanSoManagement {
    public static float uscln(float a, float b) {
        if (b == 0) return a;
        return uscln(b, a % b);
    }
    public static void main(String[] args) {
        PhanSo p1 = new PhanSo(2,2);
        PhanSo p2 = new PhanSo(2,2);
        PhanSo p3 = p1.congPhanSo(p2);

        p3.rutGonPhanSo(p3, uscln(p3.getTuSo(), p3.getMauSo()));
        p3.hienThiPhanSo();
    }
}
