package lab9_baitap1;
import java.util.Scanner;

public class BankAccountManager {
    private static int solanGD = 0;
    public static void main(String[] args) {

        BankAccount ac = new BankAccount();
        ac.setSodu(100);
        BankAccount ac1 = new BankAccount();
        ac1.setSoTK(123);
        Scanner sc = new Scanner(System.in);

        String key = "";
        Loop : do{
            showMenu();
            key = sc.nextLine();
            switch (key) {
                case "open":
                    try {
                        ac.moTK();
                        System.out.println("success");
                        continue Loop;
                    } catch (Exception e) {
                        System.out.println("fail");
                        break Loop;
                    }
                case "deposit":
                    ac.guiTien();
                    solanGD++;
                    System.out.println("So du: " + ac.getSodu());;
                    break;
                case "withdraw":
                    ac.rutTien(ac1);
                    solanGD++;
                    System.out.println("Rut tien: " + ac1.getSodu());
                    break;
                case "show":
                    ac.show();
                    break;
                default:
                    break Loop;
            }
        }while (true);

    }
        public static void showMenu(){
            System.out.println("Open an account(open): ");
            System.out.println("Make a deposit(deposit): ");
            System.out.println("Make a withdrow(withdrows): ");
            System.out.print("Show the number of transactions(show): ");
            System.out.println("Exit the ATM(quit): ");

            System.out.println("You choice: ");
        }
    }

