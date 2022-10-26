package lab8_baitap2;

import java.util.Scanner;

public class CarManagement {
    public static void main(String[] args) {

        Car car1 = new Car("Toyota", "xyz", 2000, (byte) 7,50000);
        Car car2 = new Car("Tesla", "xyzabc", 2001, (byte) 4,54000);

        Car[] cars = {car1, car2};

        for(Car o : cars){
            o.getInfor();
            System.out.println("\nThue: " + o.calculateTax());
            System.out.println("Gia: " + o.calculatePrice() + "\n");
        }


    }
}
