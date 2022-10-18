package lab6_baitap1;

import java.util.Scanner;

public class SmartPhoneManagement {
    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);
        SmartPhone s1 = new SmartPhone();
        s1.iputInfoPhone();
        s1.showInfoPhone();

        SmartPhone s2 = new SmartPhone("Iphone 15 Pro max", "Apple", 4, 2000);
        System.out.println(s1.comparePhone(s1, s2));
    }
}
