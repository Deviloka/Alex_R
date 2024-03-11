public class Park {
    public static class Attractions {
    private String name;
    private String time;
    private String cost;
    public Attractions (String name, String time, String cost) {
        this.name = name;
        this.time = time;
        this.cost = cost;
    }
    public String  getName() {
        return name;
    }
    public void setName (String name) {
        this.name = name;
    }
    public  String getTime() {
        return time;
    }
    public void setTime(String time) {
        this.time = time;
    }
    public String getCost() {
        return cost;
    }
    public void setCost(String cost) {
        this.cost = cost;
    }
    }
}
