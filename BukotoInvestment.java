
package com.codemulo.bukotoinvestment;

import java.util.Scanner;

public class BukotoInvestment {

  public static void main(String[] args) {
    Scanner scanner = new Scanner(System.in);

    System.out.print("Enter the number of members: ");
    int numMembers = scanner.nextInt();

    for (int i = 1; i <= numMembers; i++) {
      System.out.printf("\nMember %d:\n", i);
      double principal = getInvestmentAmount(scanner, "Enter principal amount: ");
      double interestRate = getInterestRate(scanner);
      int time = getInvestmentTime(scanner);

      double futureValue = calculateFutureValue(principal, interestRate, time);
      System.out.printf("Future value of investment after %d years: %.2f\n", time, futureValue);
    }

    scanner.close();
  }

  private static double getInvestmentAmount(Scanner scanner, String message) {
    System.out.print(message);
    return scanner.nextDouble();
  }

  private static double getInterestRate(Scanner scanner) {
    System.out.print("Enter interest rate (as a decimal): ");
    return scanner.nextDouble();
  }

  private static int getInvestmentTime(Scanner scanner) {
    System.out.print("Enter investment time (in years): ");
    return scanner.nextInt();
  }

  private static double calculateFutureValue(double principal, double interestRate, int time) {
    return principal * Math.pow(1 + interestRate, time);
  }
}
