package lec9prob1;
import java.util.Scanner;

public class SalaryInfo {
    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        System.out.println("Please enter the employee name: ");
        String name = s.nextLine();
        System.out.println("Please enter the employee gross salary: ");
        double gSal = s.nextDouble();
        double fedTax = 0.03, stateTax = 0.04, localTax = 0.02;

        HRSection hr = new HRSection();     
        double nSal = hr.salcalculation(gSal, fedTax, stateTax, localTax);        
        hr.displaySal(name, nSal);
    }
}