package lessons.lesson3;

public class Food {

    private String food;
    private String cost;
    private double rating;

    public Food() {
        this.food = "salad";
        this.cost = "$15"; 
        this.rating = StoreConstants.SALAD_FOOD_QUALITY;
    }

    public Food(String cost) {
        this.food = "salad";
        this.cost = cost;
        this.rating = StoreConstants.SALAD_FOOD_QUALITY;
    }
    public Food(String food, String cost) {
        this.food = food;
        this.cost = cost;
        if (food.equals("Cookie")) {
            this.rating = StoreConstants.COOKIE_FOOD_QUALITY;
        } else {
            this.rating = StoreConstants.SALAD_FOOD_QUALITY;
        }
    }

    public Food(String food, String cost, double rating) {
        this.food = food;
        this.cost = cost;
        if (food.equals("Cookie")) {
            this.rating = StoreConstants.COOKIE_FOOD_QUALITY;
        } else {
            this.rating = rating;
        }
    }


    public String itemContents() {
        return food + " " + cost + " Rating: " + rating;
    }
}