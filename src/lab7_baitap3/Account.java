package lab7_baitap3;

public class Account {
    private int mapin;
    private double sodu;
    private String tentk;

    public Account(double sodu, String tentk) {
        this.sodu = sodu;
        this.tentk = tentk;
    }
    public int rutTien(int sotien){
        String dk = "Số tiền trong tài khoản không đủ để rút";
        int sodu1 = (int) getSodu();

        if(sotien <= getSodu()){
           sodu1 = (int) (getSodu() - sotien);
        } else {
            System.out.println(dk);
        }
        return sodu1;
    }
    public int chuyenKhoan(Account o, int sotien){

        rutTien(sotien);
        if(sotien != 0){
            return  o.rutTien(sotien);
        }
        System.out.println("thanh cong");
        return rutTien(sotien);
    }

    public double getSodu() {
        return sodu;
    }

    public void setMapin(int mapin) {
        this.mapin = mapin;
    }

}
