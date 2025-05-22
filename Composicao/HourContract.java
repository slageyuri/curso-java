package Composicao;

import java.util.Date;

public class HourContract {
    private Date date;
    private double value_hour;
    private Integer hours;

    public HourContract(){
    }
    public HourContract(Date date, double value_hour, Integer duration){
        this.date=date;
        this.value_hour= value_hour;
        this.hours=duration;
    }
    public double totalvalue(){
        return value_hour*hours;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public double getValue_hour() {
        return value_hour;
    }

    public void setValue_hour(double value_hour) {
        this.value_hour = value_hour;
    }

    public Integer getHours() {
        return hours;
    }

    public void setHours(Integer hours) {
        this.hours = hours;
    }
}
