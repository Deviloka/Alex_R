public class  Main_Park {
    public static void main (String[] args){
        Park park = new Park();
        Park.Attractions attraction1 = new Park.Attractions("attraction1", "09:30 - 16:00", "15");
        System.out.println(attraction1.getName() + " " + attraction1.getTime() + " " + attraction1.getCost());
    }
}
