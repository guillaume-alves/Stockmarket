import java.util.*;
import java.io.*;

    public class Main{

        public static void main(String[] args){
            Stock a1 = new Stock("Apple", 139, 0);
            Stock a2 = new Stock("Microsoft", 235, 0);
            Stock a3 = new Stock("Facebook", 285, 0);
            Stock a4 = new Stock("Amazon", 3240, 0);
            Scanner sc = new Scanner(System.in);
            Scanner sc1 = new Scanner(System.in);
            int option, buyStock, buyNumber;
            char reponse = ' ';

            do { // Main loop
                do { //Presentation loop
                    System.out.println("-------------------- STOCK EXCHANGE MANAGER --------------------\n");
                    System.out.println("What do you want to do ? :\n 1 - Look you shares up\n 2 - Buy shares \n 3 - Sell shares\n");
                    option = sc.nextInt();

                    if (option != 1 && option != 2 && option != 3) {System.out.println("Error - no valid option");}
                } while (option != 1 && option != 2 && option != 3);

                // Reading operation
                if (option == 1) {
                    System.out.println(a1.Status());
                    System.out.println(a2.Status());
                    System.out.println(a3.Status());
                    System.out.println(a4.Status());
                } // End of reading operation

                // Buying operation
                else if (option == 2) {
                    System.out.println("Choose the company to invest in :\n1 - Apple (current value : 129)\n2 - Microsoft (current value : 235)\n3 - Facebook (current value : 285)\n4 - Amazon (current value : 3240)");
                    buyStock = sc.nextInt();
                    System.out.println("How many shares do you want to buy ?");
                    buyNumber = sc.nextInt();

                    if (buyStock == 1) {
                        a1.setNombre(a1.getNombre() + buyNumber);
                        System.out.println(a1.Status());
                    }

                    else if (buyStock == 2) {
                        a2.setNombre(a2.getNombre() + buyNumber);
                        System.out.println(a2.Status());
                    }

                    else if (buyStock == 3) {
                        a2.setNombre(a3.getNombre() + buyNumber);
                        System.out.println(a3.Status());
                    }

                    else if (buyStock == 4) {
                        a3.setNombre(a4.getNombre() + buyNumber);
                        System.out.println(a4.Status());
                    }

                } // End of buying operation

                // Selling operation
                else if (option == 3) {
                    System.out.println("Choose the company to disinvest from :\n1 - Apple (current value : 129)\n2 - Microsoft (current value : 235)\n3 - Facebook (current value : 285)\n4 - Amazon (current value : 3240)");
                    buyStock = sc.nextInt();
                    System.out.println("How many shares do you want to sell ?");
                    buyNumber = sc.nextInt();

                    if (buyStock == 1) {
                        a1.setNombre(a1.getNombre() - buyNumber);
                        System.out.println(a1.Status());
                    }

                    else if (buyStock == 2) {
                        a2.setNombre(a2.getNombre() - buyNumber);
                        System.out.println(a2.Status());
                    }

                    else if (buyStock == 3) {
                        a3.setNombre(a3.getNombre() - buyNumber);
                        System.out.println(a3.Status());
                    }

                    else if (buyStock == 4) {
                        a4.setNombre(a4.getNombre() - buyNumber);
                        System.out.println(a4.Status());
                    }
                } // End of selling operation

                do{
                    System.out.println("Do you want to make another operation ? (Y/N)");
                    reponse = sc1.nextLine().charAt(0);
                } while(reponse != 'N' && reponse != 'Y');

            }while (reponse == 'Y'); //End of main loop

        }
    }
