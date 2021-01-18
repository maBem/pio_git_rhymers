package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    private static final int init_call = -1;
    private static final int numbers_count = 12;
    private static final int max_size = 11;
    private int[] numbers = new int[getNumbers_count()];

    private int total = getInit_call();

    public static int getInit_call() {
        return init_call;
    }

    public static int getNumbers_count() {
        return numbers_count;
    }

    public static int getMax_size() {
        return max_size;
    }

    public int getTotal() {
        return total;
    }

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == getInit_call();
    }

    public boolean isFull() {
        return total == getMax_size();
    }

    protected int peekaboo() {
        if (callCheck())
            return getInit_call();
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return getInit_call();
        return numbers[total--];
    }

}
