import java.util.Scanner;
import java.util.Random;
import java.lang.Thread;

public class Atm {

    public static void main(String args[]){  
        promptMessage();
        login();
        transaction();
        goodbye();
    }

    public static void promptMessage() {
        System.out.println("Who do you bank with?: ");
        System.out.println("-----------------------");
        Scanner sc = new Scanner(System.in);  
        String x = sc.nextLine();
        System.out.println("Hi! Welcome to " + x);
    }

    public static void login(){
        Scanner sc = new Scanner(System.in); 
        System.out.println("Please enter your full name: ");
        String fr = sc.nextLine();
        System.out.println("Hi " + fr);
        Boolean correct;
        correct = true;
        while (correct == true){
        System.out.println("Please enter you account number: ");
        String a = sc.next();
        System.out.println("You have entered " + a + " is that correct Y/N");
        String  cv;
        cv = sc.next();
        if (cv.equals("Y") || cv.equals ("y")){
            correct = false;
        }    
        else if (cv.equals("N") || cv.equals ("n")){
            correct = true;
        }
        }     
    }
    
    public static void transaction() {
    try{
    Scanner sc = new Scanner(System.in); 
        Boolean f = true;
        while (f == true){ 
        System.out.println("What would you like to do?");
        System.out.println("--------------------------");
        System.out.println("1: Check Balance, 2: Deposit, or 3: Withdrawal (**Please enter corresponding number**)");  
        int buisness;
        buisness = sc.nextInt();
        Random rand = new Random();
        int n = rand.nextInt(100000);
        n += 1;
        String d;
        if (buisness == 1 ){
            for (int th = 0; th < 3; th++ ){
                Thread.sleep(1500);
                System.out.println("Calculating... ");
            }
            System.out.println("Calculating... ");
            System.out.println("You currently have: $" + n );
            System.out.println("Would you like to make another transaction? Y/N");
            d = sc.next();
            if (d.equals("Y") || d.equals("y")){
                f = true;
            }         
            else if (d.equals("N") || d.equals("n")){
                f = false;
            }
            
        }
        if (buisness == 2){
            int h;
            System.out.println("Please enter the amount you would like to deposit: ");
            h = sc.nextInt();
            Boolean deposit = true;
            while (deposit == true){
                System.out.println("You have entered: $" + h + "\n" + "Is this amount correct: Y / N");   
                String l = sc.next(); 
                if (l.equals("Y") || l.equals("y")){
                    System.out.println("Please insert money!");
                    deposit = false;
                }
                else if (l.equals("N") || l.equals("n")){
                    System.out.println("Please re-enter the correct amount of money");
                    h = sc.nextInt();
                    deposit = true;
                }
            }   
            System.out.println("Would you like to make another transaction? Y/N");
            d = sc.next();
            if (d.equals("Y") || d.equals("y")){
                f = true;
            }         
            else if (d.equals("N") || d.equals("n")){
                f = false;
            }
        }
        if (buisness == 3){
            System.out.println("How much would you like to withdraw?");
            int j = sc.nextInt();
            Boolean withdrawal = true;
            while (withdrawal == true){
                System.out.println("You have entered: $" + j + "\n" + "Is this amount correct: Y / N");   
                String u = sc.next(); 
                if (u.equals("Y") || u.equals("y")){
                System.out.println("Please wait until all the money is printed");    
                    for (int i=0 ; i<3 ; i++){
                    Thread.sleep(1500);
                    System.out.println("Printing...");
                }
                    System.out.println("Please take money!");
                    withdrawal = false;
                }
                else if (u.equals("N") || u.equals("n")){
                    System.out.println("Please re-enter the correct amount of money");
                    j = sc.nextInt();
                    withdrawal = true;
                }
            }
            System.out.println("Would you like to make another transaction? Y/N");
            d = sc.next();
            if (d.equals("Y") || d.equals("y")){
                f = true;
            }         
            else if (d.equals("N") || d.equals("n")){
                f = false;
            }   
        }
        }
    
    }
    catch (Exception e) {
      // catching the exception
      System.out.println(e);    
    }
}    
        

    public static void goodbye(){
        System.out.println("Thank you for banking with us\nHave a nice day!");
    }

}
//user name, maybe account number -> allow to check balance, deposit, or withdraw using user inputs and methods