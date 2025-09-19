package lessons.lesson3;

public class Store {

    public static void main(String[] args) {

        Food salad = new Food();
        Food cheapSalad = new Food("$5");
        Food cookie = new Food("Cookie", "$8");
        Food badCookie = new Food("Cookie", "$8", .5);
        Food drink = new Food("Soda", "$3", 2.5);

        System.out.println(salad.itemContents());
        System.out.println(cheapSalad.itemContents());
        System.out.println(cookie.itemContents());
        System.out.println(badCookie.itemContents());
        System.out.println(drink.itemContents()); 
    }
}