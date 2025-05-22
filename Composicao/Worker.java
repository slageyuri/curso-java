package Composicao;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Worker {
    //Atributos basicos
    private String name;
    private Level level;
    private double salary;
    //Associacoes
    private Department department;
    private List<HourContract> contracts = new ArrayList<>();

    public Worker(String name, Level level, double salary, Department department) {
        this.name = name;
        this.level = level;
        this.salary = salary;
        this.department = department;
    }

    public void addContract(HourContract contract){
        contracts.add(contract);
    }
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }

    public double income(int year, int month){
        double sum=salary;
         for(HourContract c: contracts){
             Calendar cal = Calendar.getInstance();
             cal.setTime(c.getDate());
             int c_year= cal.get(Calendar.YEAR);

             int c_month =cal.get(Calendar.MONTH)+1;//Calendar.MONTH starts at 0;

             if(year== c_year && month==c_month){
                 sum += c.totalvalue();
             }

         }
         return sum;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Level getLevel() {
        return level;
    }



    public void setLevel(Level level) {
        this.level = level;
    }

    public double getSalary() {
        return salary;
    }

    public void setSalary(double salary) {
        this.salary = salary;
    }

    public String getDepartment() {
        return department.name;
    }

    public void setDepartment(Department department) {
        this.department = department;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

}
