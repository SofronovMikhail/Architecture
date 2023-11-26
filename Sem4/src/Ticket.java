import java.math.BigDecimal;
import java.util.Date;

public class Ticket {
    private BigDecimal price;
    private Date date;
    private int startZone;
    private int finishZone;
    private boolean isLuggage;
    private int place;
    private int roadNumber;

    public void setDate(Date date) {
        this.date = date;
    }

    public Date getDate() {
        return date;
    }

    public void setStartZone(TransportZone transportZone) {
        this.startZone = transportZone.getId();
    }

    public int getStartZone() {
        return startZone;
    }

    public void setFinishZone(TransportZone transportZone) {
        this.finishZone = transportZone.getId();
    }

    public int getFinishZone() {
        return finishZone;
    }

    public int getPlace() {
        return place;
    }

    public BusRoute busRoute = new BusRoute();

    public Person person = new Person();

}
