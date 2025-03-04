import java.util.*;
public class  ATM
{
    int choose;
    public static int pin = 1234;
    public static int remaining = 12398;
    public static int Ammount;

    //function to confirm the pin and proceed with the transaction
    static void pin()
    {
        Scanner U =new Scanner(System.in);
        int count = 1;
        System.out.println("Please Enter Your 4 digit ATM pin");
        int Upin = U.nextInt();
        while(count>2){
        if(pin==Upin)
        {
        remaining = remaining-Ammount;
        System.out.println("Please collect your cash");
        System.out.println("Remainging balance- "+remaining);
        System.out.println("Please take your card out");
        count++;
        exit();
       
        }
        else
            {
            count--;
            System.out.println("Wrong pin please take your card out"+"\n "+count+" chance left ");
            }
        }
        U.close();
    }

    //function to confirm the transaction
    static void cash()
    {
        Scanner X3 =new Scanner(System.in);
        System.out.println("Enter Ammount to Withdrawal \n - ");
        Ammount = X3.nextInt(); 
        if(Ammount<remaining){
            pin();
        }
        else{
            System.out.println("Not sufficient balance "); 
        }
        X3.close();
        exit();
    }

    //function to withdraw money from the ATM
    static void Withdraw()
    {
       Scanner X2 = new Scanner(System.in);
        cash();
        X2.close();
        //exit();
    }

    //function to check the balance remaning before and after the transaction
    static void Balance()
    {
        Scanner Bpin = new Scanner(System.in);
        System.out.println("Enter 4 digit pin - ");
        int Balpin= Bpin.nextInt();
        if(pin==Balpin)
        System.out.println("Remaining balance - "+remaining);
        else
        System.out.println("Wrong pin"); 
        Bpin.close();
    }

    //function to change the pin of the ATM card
    static void Pinchange()
    {
        System.out.println("Enter your old pin");
        Scanner pinC=new Scanner(System.in);
        int Cpin = pinC.nextInt();
        if(pin==Cpin)
        {
            System.out.println("Enter new Pin");
            int Npin = pinC.nextInt();
            pin=Npin;
            System.out.println("Pin changed successfully");
        }
        else
        {
            System.out.println("Wrong Pin please try after some time or visit neasrest \n  -lunch-break Bank Of India");
        }
        pinC.close(); 
    }

    //Exit function to print the exit statement after the transctions are completed
    static void exit()
    {
        System.out.println("-- Thanks for using our service --");
    }

    //main funtion
    public static void main(String[] args)
    {
        //user input 
        Scanner X = new Scanner(System.in);
        System.out.println("-      Welcome in lunch-break bank of india      -");
        System.out.println("-           Choose 1 of the following            -");
        System.out.println("-     1. withdraw cash  |  2. balance Enquiry    -");
        System.out.println("-     3. pin change     |  4. Exit               -");
        int choose = X.nextInt();
        //if statement to iterate  between the different functions
        if(choose==4)
            System.out.println("- Thanks for using our service \n   Team LBBoi"); 
        else  
        //switch-case to switch between the different functions corresponding to the input provided
            switch(choose)
            {
                case 1 : Withdraw(); 
                break;
                case 2 : Balance();  
                break;
                case 3 : Pinchange(); 
                break;
                case 4 : exit();
                break;
                default : System.out.println(" Make Your selection between 1 to 4 ");
            }
        X.close();
    }
}