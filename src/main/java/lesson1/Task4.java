package lesson1;

public class Task4 {

    public static void main(String[] args) {
        int s = 1;
        do {
            s++;
            int k = 1;
            do {
                k++;
                System.out.print("Svitlana ");
            }
            while (k < 11);
            System.out.println();
        }
        while (s < 6);
    }
}