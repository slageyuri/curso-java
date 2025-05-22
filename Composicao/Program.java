package Composicao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

public class Program {


    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner scanner= new Scanner(System.in);
        SimpleDateFormat sdf1 = new SimpleDateFormat("dd/MM/yyyy");

        System.out.print("Enter department's name: ");
        String departmentname= scanner.nextLine();
        System.out.println("Enter worker data: ");
        System.out.print("Name: ");
        String name = scanner.nextLine();
        System.out.print("Level: ");
        String workerLevel = scanner.nextLine();
        System.out.print("Base salary: ");
        double salary = scanner.nextDouble();
        Worker worker1= new Worker(name,Level.valueOf(workerLevel), salary, new Department(departmentname));

        System.out.print("How many contracts does this worker have: ");
        int n = scanner.nextInt();
        for(int i=1; i<=n; i++){
            System.out.println("Enter contract number #"+i + " data:");
            System.out.print("Date (DD/MM/YYYY): " );
            Date contractDate = sdf1.parse(scanner.next());
            System.out.print("Value per Hour: ");
            double valuePerHour = scanner.nextDouble();
            System.out.print("Duration (Hours): ");
            int hours = scanner.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker1.addContract(contract);
        }
        System.out.println();
        System.out.print("Enter a month and year to calculate income (MM/YYYY): ");
        String monthAndYear = scanner.next();
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: "+ worker1.getName());
        System.out.println("Department: "+ worker1.getDepartment());
        System.out.println("Income for " + monthAndYear + ": " + String.format("%.2f", worker1.income(year, month)));
        scanner.close();
    }
}
