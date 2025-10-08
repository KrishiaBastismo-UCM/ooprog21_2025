public class Employee {
    private int employeeNumber;
    private double payRate;
    private double hoursWorked;
    private final double OVERTIME_RATE = 1.5;

    public Employee(int employeeNumber, double payRate, double hoursWorked) {
        if (employeeNumber > 9999) {
            employeeNumber = 9999;
        }
        if (payRate > 60.00) {
            payRate = 60.00;
        }
        this.employeeNumber = employeeNumber;
        this.payRate = payRate;
        this.hoursWorked = hoursWorked;
    }

    public double getRegularPay() {
        double regularHours = Math.min(40.0, hoursWorked);
        return regularHours * payRate;
    }

    public double getOvertimePay() {
        if (hoursWorked > 40.0) {
            double overtimeHours = hoursWorked - 40.0;
            return overtimeHours * payRate * OVERTIME_RATE;
        } else {
            return 0.0;
        }
    }

    public double getGrossPay() {
        return getRegularPay() + getOvertimePay();
    }

    public int getEmployeeNumber() {
        return employeeNumber;
    }

    public double getPayRate() {
        return payRate;
    }

    public double getHoursWorked() {
        return hoursWorked;
    }
}
