package lessons.lesson3;

public class Food {

    String food;
    String cost;

    public Food() {
        this.food = "salad";
        this.cost = "$15";
    }

    public Food(String cost) {
        this.food = "salad";
        this.cost = cost;
    }
    public Food(String food, String cost) {
        this.food = food;
        this.cost = cost;
    }

    public String itemContents() {
        return food + " " + cost;
    }
}