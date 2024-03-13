package Park;

import java.util.ArrayList;
import java.util.List;

public class Park {
    private String name;
    private List<Attraction> attractions;
    public Park(String name) {
        this.name = name;
        this.attractions = new ArrayList<>();
    }
    public void addAttraction(String name, String operationHours, double price) {
        this.attractions.add(new Attraction(name, operationHours, price));
    }
    public List<Attraction> getAttractions() {
        return attractions;
    }
    public class Attraction {
        private String name;
        private String operationHours;
        private double price;
        public Attraction(String name, String operationHours, double price) {
            this.name = name;
            this.operationHours = operationHours;
            this.price = price;
        }
        public String getName() {
            return name;
        }
        public void setName(String name) {
            this.name = name;
        }
        public String getOperationHours() {
            return operationHours;
        }
        public void setOperationHours(String operationHours) {
            this.operationHours = operationHours;
        }
        public double getPrice() {
            return price;
        }
        public void setPrice(double price) {
            this.price = price;
        }
        @Override
        public String toString() {
            return "Атракцион{" +
                    "Название:'" + name + '\'' +
                    ", Время работы:'" + operationHours + '\'' +
                    ", Цена: " + price +
                    '}';
        }
    }
}
class lunaPark {
    public static void main(String[] args) {

        Park lunoPark = new Park("Лунопарк");

        lunoPark.addAttraction("Сальто", "09:30 - 16:00", 10);
        lunoPark.addAttraction("Пираты", "10:00 - 18:00", 15);

        for (Park.Attraction attraction : lunoPark.getAttractions()) {
            System.out.println(attraction.toString());
        }
    }
}