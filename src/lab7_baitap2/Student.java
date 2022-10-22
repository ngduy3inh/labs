package lab7_baitap2;

public class Student {
    private int maso;
    private String hoten;
    private float toan, van, anh;

    public Student(int maso, String hoten, float toan, float van, float anh) {
        this.maso = maso;
        this.hoten = hoten;
        this.toan = toan;
        this.van = van;
        this.anh = anh;
    }

    public float getDiemTrungBinh() {
        return ((getToan() + getVan() + getAnh()) / 3);
    }
    public String getXepLoai(){
        String xeploai = "";
        String gioi = "Gioi";
        String kha = "Kha";
        String trungbinh = "Trung Binh";
        String yeu = "Yeu";
        String kem = "Kem";
        if(getDiemTrungBinh() >= 8.5){
           return xeploai = gioi;
        } else if (getDiemTrungBinh() >= 6.5) {
            return xeploai = kha;
        } else if (getDiemTrungBinh() >=5 ) {
            return  xeploai = trungbinh;
        } else if(getDiemTrungBinh() >= 3.5){
            return xeploai = yeu;
        } else if (getDiemTrungBinh() < 3.4) {
            return xeploai = kem;
        }
        return xeploai;
    }
    public void xemThongTin(){
        System.out.println("Student{" +
                "maso=" + getMaso() +
                " - hoten='" + getHoten() + '\'' +
                " - toan=" + getToan() +
                " - van=" + getVan() +
                " - anh=" + getAnh() +
                '}');
    }
    public String xetHocBong(String xeploai){
        String hocbong = "";
            if(getXepLoai() == "Gioi"){
                hocbong = "Hoc bong";
            }
        return hocbong;
    }
    public void xetLenLop(float diemtb){
        if(getDiemTrungBinh() >= 5){
            System.out.println("Len lop thang");
        }else if(getDiemTrungBinh() < 5 && getDiemTrungBinh() >= 3.5){
            System.out.println("Thi lai");
        }else {
            System.out.println("O lai");
        }

    }

    public int getMaso() {
        return maso;
    }

    public void setMaso(int maso) {
        this.maso = maso;
    }

    public String getHoten() {
        return hoten;
    }

    public void setHoten(String hoten) {
        this.hoten = hoten;
    }

    public float getToan() {
        return toan;
    }

    public void setToan(float toan) {
        this.toan = toan;
    }

    public float getVan() {
        return van;
    }

    public void setVan(float van) {
        this.van = van;
    }

    public float getAnh() {
        return anh;
    }

    public void setAnh(float anh) {
        this.anh = anh;
    }
}
