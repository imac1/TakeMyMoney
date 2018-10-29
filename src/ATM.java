import java.lang.reflect.Array;
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {

        int entry = 0;
        int password = 0;
        boolean success = true ;
        String name = " ";
        int sum = 0;

        User u1 = new User("a", 1111, 10);
        User u2 = new User("b", 2222, 20);
        User u3 = new User("c", 3333, 30);

        User[] u = new User[3];
        u[0] = u1;
        u[1] = u2;
        u[2] = u3;


        Scanner scanner = new Scanner(System.in);
        System.out.println("please enter a PIN");
        entry = scanner.nextInt();
        String answer="n";
        for (User anU : u)
            if (anU.getPassword() == entry) {
                while (answer.equals("n")) {
                    System.out.println("Welcome to your account," + anU.getName() + "please select an operation");
                    System.out.println("Insert 1 for visualising your account");
                    System.out.println(" Insert 2 for withdrawal");
                    System.out.println("Insert 3 for deposit");
                    entry = scanner.nextInt();
                            if (entry == 1) {
                            System.out.println("your sold is" + anU.getSold());
                        } else if (entry == 2) {
                                System.out.println("your sold is " + anU.getSold() +
                                        "how much would you like to withdraw? ");
                                sum = scanner.nextInt();
                                if (sum > anU.getSold()) {
                                    System.out.println("insufficient funds, please try another sum");

                                } else if (sum <= anU.getSold()) {
                                    anU.withdrawSum(sum);
                                    System.out.println("your sold is now " + anU.getSold());
                                }
                            }else if (entry == 3) {
                                System.out.println("insert a sum to deposit");
                                sum = scanner.nextInt();
                                if (sum > 0) {
                                    anU.addSum(sum);
                                    System.out.println("your sold is now " + anU.getSold());
                                }
                            }else{
                                System.out.println("Invalid option, please try again");
                            }
                                System.out.println("Exit?(y/n)");
                                answer=scanner.next();
                                switch (answer){
                                    case "y": answer="y";break;
                                    case "n":answer="n";break;
                                    default:
                                        System.out.println("wrong input");
                                }


                        }

                        break;
                }else if (entry != anU.getPassword()) {
                    success = false;
                    System.out.println("please try to login again");
                    //he is not here
                }scanner.close();
            }


}
