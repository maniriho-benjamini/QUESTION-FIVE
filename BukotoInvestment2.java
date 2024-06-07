
package com.codemulo.bukotoinvestment;
import java.util.Scanner;
public class BukotoInvestment2 {


  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of members: ");
    int numMembers = scanner.nextInt();
    int count = 1;

    while (count <= numMembers) {
      System.out.printf("\nMember %d:\n", count);
      double principal = getInvestmentAmount(scanner, "Enter principal amount: ");
      double interestRate = getInterestRate(scanner);
      int time = getInvestmentTime(scanner);

      double futureValue = calculateFutureValue(principal, interestRate, time);
      System.out.printf("Future value of investment after %d years: %.2f\n", time, futureValue);
      count++;
    }

    scanner.close();
  }

  // ... rest of the methods are same as the for loop version

    private static double getInvestmentAmount(Scanner scanner, String enter_principal_amount_) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from ates/Classes/Code/GeneratedMethodBody
    }

    private static double getInterestRate(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from GeneratedMethodBody
    }

    private static int getInvestmentTime(Scanner scanner) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from GeneratedMethodBody
    }

    private static double calculateFutureValue(double principal, double interestRate, int time) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from GeneratedMethodBody
    }
}    
