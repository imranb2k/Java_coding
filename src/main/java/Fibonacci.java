public class Fibonacci {

    public static int getFib(int num) {

        if (num <= 0) return 0;
        if (num == 1) return 1;

        return getFib(num -1) + getFib(num- 2);
    }
}
