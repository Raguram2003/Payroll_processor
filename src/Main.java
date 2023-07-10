class Employee
{
    String name;
    void calculatePay(double salary){
        System.out.println("Monthly salary of the "+ name +" Employee is " + salary/12);
    }
    void calculatePay(double hourlyRate,double hourlyWorked){
        System.out.println("weekly salary of the "+ name +" Employee is " + hourlyRate*hourlyWorked);
    }
}
public class Main {
    public static void main(String[] args) {

        Employee employee = new Employee();
        employee.name="Ragu";
        employee.calculatePay(240000.0);
        employee.calculatePay(150.0,56.0);
        System.out.println(employee.name);
    }
}