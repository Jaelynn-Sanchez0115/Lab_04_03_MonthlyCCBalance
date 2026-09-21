//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
void main() {

    double balance = 5000.00;
    double interestRate = 0.17;

    double firstMonthInterest = balance * interestRate;
    balance = balance + firstMonthInterest;

    double secondMonthInterest = balance * interestRate;

    System.out.printf("Interest due after one month: $%.2f%n", firstMonthInterest);
    System.out.printf("Interest due after two months: $%.2f%n", firstMonthInterest + secondMonthInterest);
}
