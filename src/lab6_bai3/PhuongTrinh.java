package lab6_bai3;

public class PhuongTrinh {
    private float a, b, c;

    public PhuongTrinh(float a, float b, float c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }

    public float getA() {
        return a;
    }

    public float getB() {
        return b;
    }

    public float getC() {
        return c;
    }

    public float tinhDelta(float a, float b, float c){
        return (b*b - 4 * a * c);
    }

    public void giaiPhuongTrinh(float a, float b, float c){
        if (a == 0) {
            if (b == 0) {
                System.out.println("Phương trình vô nghiệm!");
            } else {
                System.out.println("Phương trình có một nghiệm: "
                        + "x = " + (-c / b));
            }
            return;
        }
        float x1;
        float x2;
        // tính nghiệm
        if (tinhDelta(a, b, c) > 0) {
            x1 = (float) ((-b + Math.sqrt(tinhDelta(a, b, c ))) / (2*a));
            x2 = (float) ((-b - Math.sqrt(tinhDelta(a, b, c ))) / (2*a));
            System.out.println("Phương trình có 2 nghiệm là: "
                    + "x1 = " + x1 + " và x2 = " + x2);
        } else if (tinhDelta(a ,b, c) == 0) {
            x1 = (-b / (2 * a));
            System.out.println("Phương trình có nghiệm kép: "
                    + "x1 = x2 = " + x1);
        } else {
            System.out.println("Phương trình vô nghiệm!");
        }
    }
}
