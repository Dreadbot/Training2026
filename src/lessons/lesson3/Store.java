package lessons.lesson3;

public class Store {

    public static void main(String[] args) {

        Food salad = new Food();
        Food cheapSalad = new Food("$5");
        Food cookie = new Food("Cookie", "$8");

        System.out.println(salad.itemContents());
        System.out.println(cheapSalad.itemContents());
        System.out.println(cookie.itemContents());
    }
}