package lesson1;

public class Task3 {

    public static void main(String[] args) {
        int s = 1;
        int k = 1;

        while (s < 6) {
            while (k < 11) {
                System.out.print("Svitlana ");
                k++;
            }
            s++;
            k=1;
            System.out.println();
        }
    }
}
