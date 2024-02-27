package JavaExercism;

public class CalculatorConundrum {
    public static void main(String[] args) throws IllegalOperationException {
        CalculatorConundrum abc = new CalculatorConundrum();
        abc.calculate(1,1,"/");
    }

    public String calculate(int operand1, int operand2, String operation) throws IllegalOperationException {
        int result;
        String computation = operand1 + operation + operand2 + " = %d";
        try {
            switch (operation) {
                case "+" -> result = operand1 + operand2;
                case "*" -> result = operand1 * operand2;
                case "/" -> result = operand1 / operand2;
                case null -> throw new IllegalArgumentException("Operation cannot be null");
                case "" -> throw new IllegalArgumentException("Operation cannot be empty");
                default -> throw new IllegalOperationException(String.format("Operation '%s' does not exist", operation));
            }
            return String.format(computation, result);
        } catch (ArithmeticException ecx) {
            throw new IllegalOperationException("Division by zero is not allowed", ecx);
        }
    }
}

class IllegalOperationException extends RuntimeException {
    public IllegalOperationException(String errorMessage) {
        super(errorMessage);
    }

    public IllegalOperationException(String errorMessage, Throwable cause) {
        super(errorMessage, cause);
    }
}
