package edu.kis.vh.nursery;

public class DefaultCountingOutRhymer {

    public static final int init_call = -1;
    public static final int numbers_count = 12;
    public static final int max_size = 11;
    private int[] numbers = new int[numbers_count];

    public int total = init_call;

    public void countIn(int in) {
        if (!isFull())
            numbers[++total] = in;
    }

    public boolean callCheck() {
        return total == init_call;
    }

    public boolean isFull() {
        return total == max_size;
    }

    protected int peekaboo() {
        if (callCheck())
            return init_call;
        return numbers[total];
    }

    public int countOut() {
        if (callCheck())
            return init_call;
        return numbers[total--];
    }

}
