import java.util.Scanner;


public class ATM
{

    private double balance = 0;  // Account balance initialized to 0.

   
    // Method to check balance
    
    public void checkBalance()
 {
        
   System.out.println("Your current balance is: $" + balance);
  
 }

    
// Method to deposit money
   
 public void deposit(double amount)
{
    
    if (amount > 0) 
  {
         
   balance += amount;
         
   System.out.println("Deposited: $" + amount);
   
  }
 else
 {
        
    System.out.println("Invalid deposit amount.");
       
 }
   
}

  
  // Method to withdraw money
   
 public void withdraw(double amount) 
{
       
 if (amount > 0 && amount <= balance)
  {
         
   balance -= amount;
          
   System.out.println("Withdrawn: $" + amount);
      
  }
 else 
 {
          
  System.out.println("Invalid or insufficient funds.");
     
 }
   
}

    
public static void main(String[] args) 
{
 
 Scanner scanner = new Scanner(System.in);  // Scanner to read user input
   
 ATM atm = new ATM();  // Create an instance of the ATM class

     
 while (true) {
           
 // Displaying the menu options
     
 System.out.println("\nWelcome to the ATM!");
       
 System.out.println("1. Check Balance");
           
 System.out.println("2. Deposit");
      
 System.out.println("3. Withdraw");
       
 System.out.println("4. Exit");
          
 System.out.print("Choose an option: ");

        
 int choice = scanner.nextInt();
 // Get user's choice

         
 switch (choice)
 {
               
  case 1:
                 
   atm.checkBalance();  // Show the balance
         
   break;
             
  case 2:
                  
   System.out.print("Enter amount to deposit: ");
         
   double depositAmount = scanner.nextDouble();
          
   atm.deposit(depositAmount);  // Deposit money
          
   break;
            
  case 3:
                  
   System.out.print("Enter amount to withdraw: ");
             
   double withdrawAmount = scanner.nextDouble();
                
   atm.withdraw(withdrawAmount);  // Withdraw money
              
   break;
      
  case 4:
                 
   System.out.println("Thank you for using the ATM. Goodbye!");
           
   scanner.close();  // Close the scanner
            
   return;  // Exit the program
              
   default:
                 
   System.out.println("Invalid choice, please try again.");
        
  }
    
 }
 
}

}
