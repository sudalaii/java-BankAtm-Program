import java.util.Scanner;

class BankAtm {
   public static void main(String[] args) {
      System.out.println("welcome to HDFC bank Atm");
      Scanner sc = new Scanner(System.in);
      System.out.println("Enter the Account number or pin..");
      long accountPin = sc.nextInt();
      if (accountPin == 123456789 || accountPin == 1234) {
         System.out.println("your name :sudalaimuthu");
         System.out.println("your account number:123456789");
         System.out.println("Enter 1 withdrawl.");
         System.out.println("Enter 2 deposit.");
         System.out.println("Enter 3 checkbalance.");
         System.out.println("Enter 4 transaction.");
         System.out.println("Enter 5 exit.");

         BankAtm obj = new BankAtm(sc);
      } else {
         System.out.println("your account number is invalid ");
      }
   }

   BankAtm(Scanner sc) {
      double initialAmount = 100000;
      boolean contision = true;
      while (contision) {
         System.out.println("Enter the option number : ");
         int num = sc.nextInt();
         switch (num) {
            case 1:
               System.out.println("Your choise is withdraw..");
               System.out.println("Enter the withdraw amount : ");
               double amount = sc.nextDouble();
               if (amount < 100) {
                  System.out.println("Enter the amount only 1ooRs,200Rs,500Rs,....");
               } else if (initialAmount <= amount) {
                  System.out.println("your amount invalid.");
                  System.out.println("please check your balance.");
               } else if (amount >= 50001) {
                  System.out.println("withdraw limit per day 50000 only");
               } else if (amount % 100 == 0 || amount % 200 == 0 || amount % 500 == 0) {
                  initialAmount = initialAmount - amount;
                  System.out.println("your amount : " + amount + " Rs" + " withdraw sucessfully.");
                  System.out.println("balace amount :" + initialAmount + " Rs");
               } else {
                  System.out.println("Enter the amount only 1ooRs,200Rs,500Rs Notes ....");
               }
               break;
            case 2:
               System.out.println("your choise is deposit..");
               System.out.println("Enter the deposit  amount : ");
               double damount = sc.nextDouble();
               if (damount > 50000) {
                  System.out.println("deposit limit per day 50000 only");
               } else if (damount % 100 == 0 || damount % 200 == 0 || damount % 500 == 0) {
                  initialAmount = initialAmount + damount;
                  System.out.println("your damount : " + damount + "Rs" + " Deposit sucessfully.");
                  System.out.println("balace amount :" + initialAmount + "Rs");
               } else {
                  System.out.println("Enter the amount only 1ooRs,200Rs,500Rs,....");
               }
               break;
            case 3:
               System.out.println("your choise is check balance.");
               System.out.println("your main balance : " + initialAmount + "Rs");
               break;
            case 4:
               System.out.println("your choise is transaction");
               System.out.println("Enter the benificiary account number : ");
               long accountNum = sc.nextLong();
               if (accountNum == 987654321) {
                  System.out.println("your account number :  123456789");
                  System.out.println("benificiary account number : " + accountNum);
                  System.out.println("benificary name : MessiMuthu");
                  System.out.println("Enter the transaction amount : ");
                  double Tamount = sc.nextDouble();
                  if (Tamount < 100) {
                     System.out.println("Enter the amount only 100RS above");
                  } else if (initialAmount <= Tamount) {
                     System.out.println("your amount invalid.");
                     System.out.println("please check your balance.");
                  } else {
                     initialAmount = initialAmount - Tamount;
                     System.out.println("your amount : " + Tamount + " Rs" + " transaction sucessfully.");
                     System.out.println("balace amount :" + initialAmount + " Rs");
                  }
               }
               break;
            case 5:
               System.out.println("Remove your card...");
               System.out.println("Thankyou for visiting this bank Atm.");
               contision = false;
               break;

         }

      }
      sc.close();
   }

}