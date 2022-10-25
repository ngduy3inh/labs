package lab8_baitap1;

public class Administration extends Staff{
    protected float phucap;

    public Administration(String ten, int maso, float luongcanban, float thamnien, float phucap) {
        super(ten, maso, luongcanban, thamnien);
        this.phucap = phucap;
    }
    public void setPhucap(float phucap) {
        if(phucap < 0){
            System.out.println("Khong hop le");
        }else
            this.phucap = phucap;
    }
    public float getPhucap() {
        return phucap;
    }
    @Override
    public float tinhLuong(){
        float luongThuclanh = getLuongcanban() * getLuongThucLanh() + getPhucap() ;
        return luongThuclanh;
    }
    @Override
    public void xuatThongTinNV(){
        System.out.println("Staff{" +
                "ten='" + getTen() + '\'' +
                ", maso=" + getMaso() +
                ", luongcanban=" + getLuongcanban() +
                ", Luongthuclanh=" + getLuongThucLanh() +
                '}');
    }

}
