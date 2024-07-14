public class syracuse {
    public static void main(String[] args) {
        // Scanner sc = new Scanner(System.in);
        // int value = sc.nextInt();
        int incrValue = 0;
        int bestLength = 0;
        int bestNumber = 0;
        // boolean found = false;
        while (incrValue < 100000) {
            int length = 1;
            int value = incrValue;
            while(value > 1) {

                if(value % 2 == 0) { //quand le nombre est pair
                    value = value / 2;
                    // System.out.println(value);
                    length++;
                }
                else { //quand le nombre est impair
                    value = value * 3 + 1;
                    // System.out.println(value);
                    length++;
                }
            }
            System.out.println("----------");
            System.out.println(incrValue);
            System.out.println("Length : " + length);
            if(length > bestLength) {
                bestLength = length;
                bestNumber = incrValue;
            }
            incrValue++;
        }
        System.out.println("\nBest number : " + bestNumber + " length : " + bestLength);
    }
}