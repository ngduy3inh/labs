package lab8_baitap1;

public class Marketing extends  Staff{
    protected float doanhso;

    public Marketing(String ten, int maso, float luongcanban, float thamnien, float doanhso) {
        super(ten, maso, luongcanban, thamnien);
        this.doanhso = doanhso;
    }
    public float getHoaHongTheoDS(){
        float hoahong1 = (float) 0.05;
        float hoahong2 = (float) 0.1;
        float hoahong3 = (float) 0.2;

        if(getDoanhso() > 5000000 && getDoanhso() < 10000000){
            return hoahong1;
        } else if (getDoanhso() > 10000000 && getDoanhso() < 20000000 ){
            return hoahong2;
        } else if (getDoanhso() > 20000000) {
            return hoahong3;
        }else{
            return 0;
        }
    }

    public float getDoanhso() {
        return doanhso;
    }

    public void setDoanhso(float doanhso) {
        if(getDoanhso() < 0){
            System.out.println("khong hop le");
        }else
          this.doanhso = doanhso;
    }
    @Override
    public float tinhLuong(){
        float luongThuclanh = getLuongcanban() * getLuongThucLanh() + getDoanhso() * getHoaHongTheoDS();
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
