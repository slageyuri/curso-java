package Enums;

import java.util.Date;

public class Order {
    private Integer ID;
    private Date moment;
    private OrderStatus status;

    public Order(){}



    public Order(Integer id, Date moment, OrderStatus status){
        this.ID=id;
        this.moment=moment;
        this.status=status;
    }

    public OrderStatus getStatus() {
        return status;
    }

    public Date getMoment() {
        return moment;
    }

    public Integer getID() {
        return ID;
    }

    public void setMoment(Date moment) {
        this.moment = moment;
    }

    public void setStatus(OrderStatus status) {
        this.status = status;
    }

    public void setID(Integer ID) {
        this.ID = ID;
    }

    @Override
    public String toString() {
        return "Order {" +
                "ID=" + ID +
                ", moment=" + moment +
                ", status=" + status +
                '}';
    }
}
