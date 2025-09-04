import java.util.Scanner;

public class bank_lab4_1 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter the name : ");
        String name = input.nextLine();


        System.out.println("Enter the number of your choice : ");
        System.out.println("1:Deposit Money");
        System.out.println("2:Withdraw money");
        System.out.println("3:Check Balance");
        String number;
        number = input.nextLine();

        int current_balance = 0;

        switch (number)
        {
            case  "1" :
                Scanner sc = new Scanner(System.in);
                System.out.println("Enter the deposit money : ");
                double dp = sc.nextInt();
                current_balance = (int) (current_balance + dp);

                System.out.println("Your account balance is : "+current_balance);
                break;

            case "2" :
                Scanner s = new Scanner(System.in);
                System.out.println("Enter the Withdraw money : ");
                double wm = s.nextInt();
                if (wm < current_balance){
                current_balance = (int) ( current_balance - wm);

                System.out.println("Your account balance is : "+current_balance);
                break;}

                else{
                    System.out.println("You don't have enough money");
                }
            case "3" :
                System.out.println("Your account balance is : "+current_balance);
                break;
        }
    }
}
