package lec9prob1;

public class HRSection {
    public double salcalculation(double gSal, double fedTax, double stateTax, double localTax) {
        return gSal - (gSal * (fedTax + stateTax + localTax));
    }

    public void displaySal(String name, double nSal) {
        System.out.println(name + "'s net salary is: " + nSal);
    }
}