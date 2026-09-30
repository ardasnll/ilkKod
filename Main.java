import java.util.*;

public class Main {
    public static void main(String[] args) {

        int toplam = 0;

        for(int i = 2; i <= 20; i = i + 2) {

            int kup = i * i * i;

            toplam = toplam + kup;

        }

        System.out.println("Toplam : " + toplam);
    }
}
