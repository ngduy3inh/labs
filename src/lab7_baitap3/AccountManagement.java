package lab7_baitap3;

public class AccountManagement {
    public static void main(String[] args) {
        Account firstAccount = new Account(50000, "nguyen");
        Account seconccount = new Account(10000, "duy");
        System.out.println(firstAccount.rutTien(10000));
        firstAccount.getSodu();
        firstAccount.chuyenKhoan(seconccount, 10000);
        firstAccount.getSodu();
    }
}
