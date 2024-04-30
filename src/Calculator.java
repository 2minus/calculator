import java.util.LinkedList;
import java.util.Queue;

public class Calculator {
    static double result;
    // 사칙연산
    private Queue<Double> numQ = new LinkedList<Double>();
    public double ArithmeticCalculator(double firstNumber, double secondNumber, char operator) throws Exception {
        // 연산자에 따른 연산방법
        switch (operator) {
            case '+':
                result = firstNumber + secondNumber;
                break;
            case '-':
                result = firstNumber - secondNumber;
                break;
            case '*':
                result = firstNumber * secondNumber;
                break;
            case '/':
                if (secondNumber != 0) {
                    result = firstNumber / secondNumber;
                } else {
                    throw new BadInputException("0이 아닌 정수");
                }
                break;
        }
        // 연산방법 제어 끝
        return result;

    }

    public Queue<Double> getNumQ() {
        return numQ;
    }

    public void setNumQ(double result) {
        numQ.add(result);
    }

    public void removeNumQ() {
        System.out.println("가장 먼저 저장된 " + numQ.peek() + " 를 삭제합니다.");
    }

    public void searchNumQ() {
        System.out.println("저장된 연산결과를 불러옵니다.");
        for (double num : numQ) {
            System.out.println(num);
        }
    }
    // 사칙연산 끝

    // 원넓이
    private Queue<Double> circleQ = new LinkedList<Double>();
    final static double PI = 3.14159265358979323846;

    public double CircleCalculator(double radius) {
        result = PI * radius * radius;
        return result;
    }

    public Queue<Double> getCircleQ() {
        return circleQ;
    }

    public void setCircleQ(double result) {
        circleQ.add(result);
    }

    public void removeCircleQ() {
        System.out.println("가장 먼저 저장된 " + circleQ.peek() + " 를 삭제합니다.");
    }

    public void searchCircleQ() {
        System.out.println("저장된 연산결과를 불러옵니다.");
        for (double num : circleQ) {
            System.out.println(num);
        }
    }
}


