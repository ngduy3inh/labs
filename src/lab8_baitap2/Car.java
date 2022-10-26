package lab8_baitap2;

public class Car implements Actionable{

    private String name;
    private String producer;
    private int year;
    private int seat;
    private int price;

    public Car(String name, String producer, int year, int seat, int price) {
        this.name = name;
        this.producer = producer;
        this.year = year;
        this.seat = seat;
        this.price = price;
    }

    @Override
    public float calculateTax() {
        int tax1= (int) (0.6 * getPrice());
        int tax2=  (int) (0.7 * getPrice());
        if(getSeat() < 7 ){
            return  tax1;
        }else{
           return  tax2;
        }
    }

    @Override
    public float calculatePrice() {
        float tongtien = getPrice() + calculateTax();
        return tongtien;
    }

    @Override
    public void getInfor() {
        System.out.printf("%s car produced by %s in %d\n" +
                "has %d seats with the total price is %d $",getName(), getProducer(), getYear(), getSeat(), getPrice());
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getProducer() {
        return producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getSeat() {
        return seat;
    }

    public void setSeat(int seat) {
        this.seat = seat;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }
}
