public class Main {
    public static void main(String[] args) {
        try {
            int[] array = {1, 2, 3};
            System.out.println("Element at index 5: " + array[5]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of bounds");
        }
    }
}
