import java.util.Random;
public class Main {
    public static void main(String[] args) throws Exception {
        long seed = 1;
        MyRandom myRandom = new MyRandom(seed);

        Random random = new Random(seed);
        for (int i = 0; i < 10; i++) {
            System.out.println(
                "My Random    : " +
                myRandom.nextInt(100) +
                "\nJava's Random: " +
                random.nextInt(100)
            );
        } // java's random vs myrandom wont be the same, i did this just for fun :b
    }
}
