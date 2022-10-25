package lab8_baitap1;

import java.util.Scanner;

public class Staff {
    private String ten;
    private int maso;
    private float luongcanban;
    private float hesoluong;
    private float thamnien;

    Scanner sc = new Scanner(System.in);

    public Staff(String ten, int maso, float luongcanban, float thamnien) {
        this.ten = ten;
        this.maso = maso;
        this.luongcanban = luongcanban;
        this.thamnien = thamnien;
    }
    public float getLuongThucLanh(){
        float hesoluongThuc = (int) (thamnien / 5) + 1;
        return hesoluongThuc;
    }
    public void setThamNienCongTac(float thamnien){
        if(thamnien < 0){
            System.out.println("Khong hop le");
        }else {
           this.thamnien = thamnien;
        }
    }
    public float tinhLuong(){
        float luongThuclanh = getLuongcanban() * getLuongThucLanh();
        return luongThuclanh;
    }
    public void xuatThongTinNV(){
        System.out.println("Staff{" +
                "ten='" + ten + '\'' +
                ", maso=" + maso +
                ", luongcanban=" + luongcanban +
                ", thamnien=" + thamnien +
                '}');
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public int getMaso() {
        return maso;
    }

    public void setMaso(int maso) {
        this.maso = maso;
    }

    public float getLuongcanban() {
        return luongcanban;
    }

    public void setLuongcanban(float luongcanban) {
        this.luongcanban = luongcanban;
    }
}
