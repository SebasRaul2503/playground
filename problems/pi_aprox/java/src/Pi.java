
public class Pi {
    public static void main(String[] args) throws Exception {
        long steps = 10000;
        double x, y, origDist, pi = 0;
        long square = 0;
        long circle = 0;

        for (int i = 0; i < (steps * steps); i++) {
            x = Math.random()*2-1;
            y = Math.random()*2-1;

            origDist = x * x + y * y;

            if (origDist <= 1) {
                circle++;
            }

            square++;

            pi = (4.0 * circle) / square;
        }

        System.out.println("Pi is: " + pi + " approx.");
    }
}
