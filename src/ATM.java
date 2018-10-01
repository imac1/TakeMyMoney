import java.lang.reflect.Array;
import java.util.Scanner;

public class ATM {

    public static void main(String[] args) {
        User u1 = new User("a", 1111, 10);
        User u2 = new User("b", 2222, 20);
        User u3 = new User("c", 3333, 30);

     User [] u = new User[2];
     u[0] = u1;
     u[1] = u2;
     u[2] = u3;

     int entry = 0;
        int password = 0;
        boolean success=false;
        Scanner scanner = new Scanner(System.in);




        while (entry != password) {
            System.out.println("Welcome to the ATM, please insert your PIN");
            entry = scanner.nextInt();
            for (User anU : u) {
                if (anU.getPassword() == password) {
                    success = true;
                    //bla blaa
                }
            }
            if(success){
                //found the motherfucker
            }
            else{
                //he is not here
            }
                System.out.println( "Welcome to your account, please select an operation");
                System.out.println("Insert 1 for visualising your account");
                System.out.println(" Insert 2 for withdrawal");
                System.out.println("Insert 3 for deposit");
                if (entry == 1){




            }
        }


    }


}
