package lab6_bai2;

public class TuGiac {
    private float a, b;

    public TuGiac() {

    }
    public TuGiac(int b) {
        this.a = b;
        this.b = b;

    }
    public TuGiac(float a, float b) {
        this.a = a;
        this.b = b;
    }
    public void setHeight(float a) {
        this.a = a;
    }

    public void setWidth(float b) {
        this.b = b;
    }
        public TuGiac(float a) {
        this.a = a;
    }
    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public void veTuGiac(float a, float b){
        if(a == 0 || b == 0){
            System.out.println("Không thể vẽ hình.");
        }else {
            for(int i = 1; i <= a; i++){
                for(int j = 1; j <= b; j++) {
                    System.out.print("*  ");
                }
                System.out.println("");
            }
        }
    }

    public float tinhChuVi(float a, float b){
        return (a + b) * 2;
    }

    public float tinhDienTich(float a, float b){
        return a*b;
    }

    public String phanLoaiTuGiac(float a,float b){
        String phanLoai = "";
        String vuong = "Vuong", chunhat = "Chu nhat", khongbiet = "khong biet";

        if(a != 0 && b !=0 && a == b){
            return phanLoai = vuong;
        } else if (a != 0 && b !=0 && a != b) {
            return phanLoai = chunhat;
        } else if (a == 0 || b ==0) {
            return phanLoai = khongbiet;
        }
        return phanLoai;
    }
}
