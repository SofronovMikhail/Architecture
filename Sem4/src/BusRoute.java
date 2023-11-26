import java.util.ArrayList;
import java.util.List;

public class BusRoute {
    private int id;
    private String remark;
    private int capacity;
    private List<BusStop> busStop = new ArrayList<BusStop>();

    public int getId() {
        return id;
    }

    public void setRemark(String remark) {
        this.remark = remark;
    }

    public String getRemark() {
        return remark;
    }

    public List<BusStop> getBusStop() {
        return busStop;
    }
}
