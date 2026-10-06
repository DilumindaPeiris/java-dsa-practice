/** Checks fixed-capacity stack operations and boundary behavior. */
public class IntArrayStackChecks {
    private static int checks;

    private static void check(boolean condition, String message) {
        if (!condition) throw new AssertionError(message);
        checks++;
    }

    private static void expectException(Class<? extends RuntimeException> type, Runnable action) {
        try {
            action.run();
        } catch (RuntimeException exception) {
            check(type.isInstance(exception), "Unexpected exception type: " + exception);
            return;
        }
        throw new AssertionError("Expected " + type.getSimpleName());
    }

    public static void main(String[] args) {
        expectException(IllegalArgumentException.class, () -> new IntArrayStack(0));

        IntArrayStack stack = new IntArrayStack(2);
        check(stack.isEmpty(), "New stack should be empty");
        check(stack.size() == 0, "New stack size should be zero");
        expectException(IllegalStateException.class, stack::pop);
        expectException(IllegalStateException.class, stack::peek);

        stack.push(10);
        stack.push(20);
        check(stack.size() == 2, "Stack should report both values");
        check(stack.peek() == 20, "Peek should return the most recent value");
        expectException(IllegalStateException.class, () -> stack.push(30));
        check(stack.pop() == 20, "Pop should return the most recent value");
        stack.push(30);
        check(stack.pop() == 30, "A popped slot should be reusable");
        check(stack.pop() == 10, "Remaining value should pop in LIFO order");
        check(stack.isEmpty(), "Stack should be empty after all pops");
        System.out.println("Passed " + checks + " stack checks.");
    }
}