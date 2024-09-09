public class Reduce {
    public static void main(String[] args) {
        int step = 0;
        int initial = 100;
        while (initial > 0){
            if (initial % 2 == 0){
                initial /= 2;
            } else {
                initial -= 1;
            }
            step++;
        }
        System.out.println("It took " + step + " steps.");
    }
}
