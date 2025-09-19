public class LogicalOperators {
    public static void main(String[] args) {
        int x = 5;
        int y = 2;
        int z = 5;
        boolean bool;

        /*  
        * = operator assigns a value to a variable
        * == operator compares values to each other
        * != operator means "not equal to"
        * && means "and"
        * || means "or"
        */

        // Compares the value of x (5) to the value of y (2) and returns the validity of the statment
        if (x == y) {
            bool = true;
            System.out.println("x = y: " + bool); 
        } else {
            bool = false;
            System.out.println("x = y: " + bool);
        }

        // Compares the value of x (5) to the value of z (5) and returns the validity of the statment
        if (x == z) {
            bool = true;
            System.out.println("x = z: " + bool);
        } else {
            bool = false;
            System.out.println("x = z: " + bool);
        }
        
        // checks to see if x is not equal to y
        if (x != y) {
            bool = false;
            System.out.println("x does not equal y");
        } else {
            bool = true;
            System.out.println("x does equal y");
        }

        // checks to see if x and z both equal 5
        if (x == 5 && z == 5) {
            bool = true;
            System.out.println("x and z equal 5: " + bool);
        }

        // checks to see if x or y equals 5
        if (x == 5 || y == 5) {
            bool = true;
            System.out.println("x or y equals 5: " + bool);
        }
    }
}
