import java.util.Scanner;

public class syraManual {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int value = sc.nextInt();
        int length = 1;

        while(value > 1) {

            if(value % 2 == 0) { //quand le nombre est pair
                value = value / 2;
                System.out.println(value);
                length++;
            }
            else { //quand le nombre est impair
                value = value * 3 + 1;
                System.out.println(value);
                length++;
            }
        }
        System.out.println("\n" + length);
    }
}