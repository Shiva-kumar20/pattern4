public class pattern4 {

        public static void printDiamond(int size) {
            int n = size; // The size of the diamond
            // Print upper half
            for (int i = 1; i <= n; i++) {
                for (int j = i; j < n; j++) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
            // Print lower half
            for (int i = n - 1; i >= 1; i--) {
                for (int j = n; j > i; j--) {
                    System.out.print(" ");
                }
                for (int j = 1; j <= (2 * i - 1); j++) {
                    System.out.print("*");
                }
                System.out.println();
            }
        }
    
        public static void main(String[] args) {
            int size = 5; // Adjust the size as needed
            printDiamond(size);
        }
    }
    

