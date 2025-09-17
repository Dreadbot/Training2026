import java.util.ArrayList;
import java.util.Arrays;

public class Datatype {
    public static void main(String[] args) {
        // Basic 4 data types
        int i = 3;
        double dbl = 3.0;
        boolean bool = true;
        String str = "Hello";

        // You can declare variables without instantiating them
        int x;
        int y;

        // Then you can assign later
        x = 2;
        y = 10;
        x = 5; // This will override the previous instantiation

        // Basic Operations
        int add = x + y;
        int sub = y - x;
        int mult = x * y;
        int div = y / x;

        // Array
        int[] array = {0, 1, 2, 3, 4};

        // ArrayList
        ArrayList<Integer> list = new ArrayList<>(); // instantiate an empty Array List
        list.add(1); // add method used to expand the list
        list.add(3); // add method used to expand the list
        list.add(5); // add method used to expand the list
        list.remove(2); // this method removes the #2 slot, meaning the number 5 will not appear

        int listReturn = list.get(1); // this method will return the #1 slot

        // Print variables
        System.out.println("Integer: " + i);
        System.out.println("Double: " + dbl);
        System.out.println("Boolean: " + bool);
        System.out.println("String: " + str);
        System.out.println("Addition: " + add);
        System.out.println("Subtraction: " + sub);
        System.out.println("Multiplication: " + mult);
        System.out.println("Division: " + div);

        // Print array
        System.out.println("Array: " + Arrays.toString(array));

        // Print ArrayList
        System.out.println("ArrayList: " + list);
        System.out.println("Get Method: " + listReturn);
    }
}
