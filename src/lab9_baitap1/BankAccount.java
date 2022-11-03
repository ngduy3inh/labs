package lab9_baitap1;

import java.text.ParseException;
import java.util.Scanner;

public class BankAccount {
    BankAccount ac;
    private String ten;
    private String gioitinh;
    private int ngaysinh;
    private String noisinh;
    private int sdt;
    private String email;
    private int sodu;
    private int soTK;
    Scanner sc = new Scanner(System.in);
    private  static int solanGD = 0;

    public String moTK(){
        ac = new BankAccount();
        String ten, gioitinh, noisinh, email;
        int ngaysinh, sdt;

        try {
            System.out.println("You choice: Open");
            System.out.print("\nNhap ten: ");
            ten = sc.nextLine();
            ac.setTen(ten);

            System.out.print("\nNhap gioi tinh: ");
            gioitinh = sc.nextLine();
            ac.setGioitinh(gioitinh);

            System.out.print("\nNhap ngay sinh: ");
            ngaysinh = sc.nextInt();
            setNgaysinh(ngaysinh);

            System.out.print("\nNhap noi sinh: ");
            noisinh = sc.nextLine();
            setNoisinh(noisinh);

            System.out.print("\nNhap so dien thoai: ");
            sdt = sc.nextInt();
            setSdt(sdt);

            System.out.print("\nNhap email: ");
            email = sc.nextLine();
            setEmail(email);

        }catch (Exception e){
            System.out.println(e.getMessage());
        }
        return ac.toString();
    }
    public void guiTien(){
        try {
            System.out.println("You choice: deposit");
            System.out.println("So tien muon gui: ");
            int soTienGui = sc.nextInt();
            setSodu(getSodu() + soTienGui);
            solanGD++;
        }catch (Exception e){
            System.out.println("Nhap khong hop le!");
        }
    }

    public void rutTien(BankAccount ac){
        try {
            System.out.println("You choice: withdraw");
            System.out.println("So TK muon rut: ");
            int soTKmuonrut = sc.nextInt();
            System.out.println("So tien muon rut: ");
            int soTienmuonrut = sc.nextInt();
            if(soTKmuonrut == getSoTK()){
                if(soTienmuonrut >= getSodu()){
                    System.out.println("So du khong du "  + getSoTK());
                }else {
                    setSodu(getSodu() - soTienmuonrut);
                    ac.setSodu(getSodu() + soTienmuonrut);
                    solanGD++;
                }
            }
        }catch (Exception e){
            System.out.println("Nhap khong hop le!");
        }
    }

    public void show(){
        System.out.println("You choice: Show");
        System.out.println(solanGD);
    }

    public String getTen() {
        return ten;
    }

    public void setTen(String ten) {
        this.ten = ten;
    }

    public String isGioitinh() {
        return gioitinh;
    }

    public void setGioitinh(String gioitinh) {
        this.gioitinh = gioitinh;
    }

    public int getNgaysinh() {
        return ngaysinh;
    }

    public void setNgaysinh(int ngaysinh) {
        this.ngaysinh = ngaysinh;
    }

    public String getNoisinh() {
        return noisinh;
    }

    public void setNoisinh(String noisinh) {
        this.noisinh = noisinh;
    }

    public int getSdt() {
        return sdt;
    }

    public void setSdt(int sdt) {
        this.sdt = sdt;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    public int getSodu() {
        return sodu;
    }

    public void setSodu(int sodu) {
        this.sodu = sodu;
    }

    public int getSoTK() {
        return soTK;
    }

    public void setSoTK(int soTK) {
        this.soTK = soTK;
    }
}
