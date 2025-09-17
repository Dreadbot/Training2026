public class Loops {
    public static void main(String[] args) {

    // necessary variable list
    int[] array = {1, 2, 3, 4, 5};
    
    // while loops continue to run while a condition is true
    // used when the number of iterations is not known beforehand
    int i = 0;
    while (i < array.length) {
        System.out.print(array[i] + " ");
        i++;
    }

    //line break
    System.out.print("\n");

    // for loops run until the stated condition is met
    // used when the number of iterations is predetermined
    for (int j = 0; j < array.length; j++) {
        System.out.print(array[j] + " ");
    }

    //line break
    System.out.print("\n");

    // for each loops (or enhanced for loops) are a quicker way to write for loops
    for (int list : array) {
        System.out.print(list + " ");
    }
   
    /*
     * while loops and for loops can be used to perform similar tasks
     * each type of loop has its own use, however for loops will often be more concise 
     * for each loops will be the most efficent loops
     */
        
    }
}
