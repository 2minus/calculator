public class ArithmeticCalculator {

    private final AddOperator add = new AddOperator();
    private final SubtractOperator sub = new SubtractOperator();
    private final MultiplyOperator mul = new MultiplyOperator();
    private final DivideOperator div = new DivideOperator();
    private final ModOperator mod = new ModOperator();

    public double operate(double firstNumber, double secondNumber, char operator) throws Exception {
        // 연산자에 따른 연산방법
        switch (operator) {
            case '+':
                return add.operate(firstNumber, secondNumber);
            case '-':
                return sub.operate(firstNumber, secondNumber);
            case '*':
                return mul.operate(firstNumber, secondNumber);
            case '/':
                return div.operate(firstNumber, secondNumber);
            case '%':
                return mod.operate(firstNumber, secondNumber);
            default:
                throw new BadInputException("사칙연산자");
        }

        // 연산방법 제어 끝
    }
}
