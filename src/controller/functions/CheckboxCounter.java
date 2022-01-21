package controller.functions;

public class CheckboxCounter {
    static int counter = 0;

    public static void resetCounter() {
        CheckboxCounter.counter = 0;
    }

    public static void increment() {
        CheckboxCounter.counter += 1;
    }

    public static void decrement() {
        CheckboxCounter.counter -= 1;
    }

    public static int getCheckboxCounter() {
        return counter;
    }
}
