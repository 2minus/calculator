import java.util.LinkedList;
import java.util.Queue;

public class ArithmeticCalculator {
    public double operate(double firstNumber, double secondNumber, char operator) throws Exception {
        // 연산자에 따른 연산방법
        switch (operator) {
            case '+':
                return firstNumber + secondNumber;
            case '-':
                return firstNumber - secondNumber;
            case '*':
                return firstNumber * secondNumber;
            case '/':
                if (secondNumber != 0) {
                    return firstNumber / secondNumber;
                } else {
                    throw new BadInputException("0이 아닌 정수");
                }
            default: throw new BadInputException("사칙연산자");
        }

        // 연산방법 제어 끝
    }
}
