import java.util.Scanner;

public class Payroll {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter employee number (1-9999) >> ");
        int empNum = input.nextInt();

        System.out.print("Enter pay rate (up to $60.00) >> ");
        double rate = input.nextDouble();

        System.out.print("Enter hours worked this week >> ");
        double hours = input.nextDouble();

        Employee emp = new Employee(empNum, rate, hours);

        System.out.println("\n--- Pay Summary ---");
        System.out.println("Employee Number: " + emp.getEmployeeNumber());
        System.out.println("Pay Rate: $" + String.format("%.2f", emp.getPayRate()));
        System.out.println("Hours Worked: " + emp.getHoursWorked());
        System.out.println("Regular Pay: $" + String.format("%.2f", emp.getRegularPay()));
        System.out.println("Overtime Pay: $" + String.format("%.2f", emp.getOvertimePay()));
        System.out.println("Gross Pay: $" + String.format("%.2f", emp.getGrossPay()));

        input.close();
    }
}
