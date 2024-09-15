public class MyRandom {
    // this works SIMILARLY to java's Random class. May be a bit different.
    private long seed;
    private static final long a = 25214903917L; // multiplier for lcg
    private static final long c = 11L; // increment (also for lcg)
    private static final long m = (1L << 48); // 2 ^ 48 (modulus)
    /*
    for more info:
    https://en.wikipedia.org/wiki/Linear_congruential_generator#:~:text=A%20linear%20congruential%20generator%20(LCG,known%20pseudorandom%20number%20generator%20algorithms.
        
    bro uses wikipedia as source of info D:
    */
    public MyRandom(long seed){
        this.seed = seed;
    }

    public MyRandom(){
        this.seed = System.currentTimeMillis();
    } // sets seed as system current time in case it wasnt provided

    public int nextInt(int bound){
        seed = (a * seed + c) % m;
        return (int) (seed % bound);
    }
}
