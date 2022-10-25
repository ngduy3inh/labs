package lab8_baitap1;

import java.util.Scanner;

public class StaffManager {
    private Staff[] staff;
    private int siso;

    public StaffManager() {
        siso = 0;
        staff = new Staff[100];
    }
    Scanner sc = new Scanner(System.in);
    public void nhapDS(){
        for(int i = 0; i < staff.length; i++){
            System.out.println("Nhap thong tin");

        }
    }


}
