package com.company;

import java.util.Scanner;

/**
 * Created by Farrukh's on 27-Jul-16.
 */
public class Acount {



    int choice;

    int cash=0;




    public void creditadd(int outcome)
    {
        if (cash==outcome)
        {
            System.out.println("No Money In Your Account");
        }
        else {
             cash = cash - outcome;
        }

    }
    public void deposite(int income)
    {
        cash=cash+income;

    }

    public void checkbalance()
    {
        System.out.println("Your balance is"+cash);
    }


    int count;
    public void pinN(int check){


        int array []=new int[10];

            array[0] = 0000;
            array[1] = 0001;
            array[2] = 0002;
            array[3] = 0003;
            array[4] = 0004;
            array[5] = 0005;
            array[6] = 0006;
            array[7] = 0007;
            array[8] = 0011;
            array[9] = 0022;


            if (check == array[0]||check == array[1]||check == array[2]||check == array[3]||check == array[4]||check == array[5]||check == array[6] ) {
                System.out.println("your pin num is right");

            } else {
                System.out.println("your pin is wrong");
                System.exit(0);
            }
        }




    public void Accountinquery() {
        try {
            System.out.println("Enter your pin code");
            Scanner s = new Scanner(System.in);
            int z = s.nextInt();
            this.pinN(z);
            int doloop = 5;
            do {


                do {
                    System.out.println("Welcome To Your Account");
                    System.out.println(" 1  press for Check Balance");
                    System.out.println(" 2. Press for Credit");
                    System.out.println(" 3. Press for Deposit");
                    System.out.println(" 4. press for Exit");


                    choice = s.nextInt();
                } while (choice < 1 || choice > 3);
                System.out.println("\n");

                switch (choice) {

                    case 1:
                        checkbalance();
                        break;
                    case 2:
                        System.out.println("Enter Cash Digit");
                        int cre = s.nextInt();
                        creditadd(cre);
                        System.out.println("your balance now " + cash);

                        break;

                    case 3:
                        System.out.println("Enter Cash Digit");
                        int des = s.nextInt();
                        deposite(des);
                        System.out.println("your balance now " + cash);

                        break;

                    case 4:
                        System.exit(0);
                        break;


                }
                doloop--;
            } while (doloop > 0);






        }catch (Exception e){
            System.out.println("Wrong Selection  "+e);
        }
        }

}
