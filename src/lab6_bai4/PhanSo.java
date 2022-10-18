package lab6_bai4;

public class PhanSo {
    private float tuSo, mauSo;


    public PhanSo() {
        this.tuSo = 1;
        this.mauSo = 1;
    }

    public PhanSo(float tuSo, float mauSo) {
        this.tuSo = tuSo;
        this.mauSo = mauSo;
    }

    public float getTuSo() {
        return tuSo;
    }

    public void setTuSo(float tuSo) {
        this.tuSo = tuSo;
    }

    public float getMauSo() {
        return mauSo;
    }

    public void setMauSo(float mauSo) {
        this.mauSo = mauSo;
    }

    public PhanSo congPhanSo(PhanSo p){
        float ts = this.getTuSo() * p.getMauSo() + p.getTuSo() * this.getMauSo();
        float ms = this.getMauSo() * p.getMauSo();
        PhanSo phanSoTong = new PhanSo(ts, ms);
        return phanSoTong;
    }

    public PhanSo rutGonPhanSo(PhanSo ps, float uscln){

        PhanSo rutgon = new PhanSo();
        this.setTuSo(this.getTuSo() / uscln);
        this.setTuSo(this.getMauSo() / uscln);
        return rutgon;

    }

    public void hienThiPhanSo(){
        System.out.println(getTuSo() +  "/" + getMauSo());
    }
}
