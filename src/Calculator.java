import java.util.LinkedList;
import java.util.Queue;

public class Calculator {

    private Queue<Double> numQ = new LinkedList<Double>();
    private Queue<Double> circleQ = new LinkedList<Double>();

    private final ArithmeticCalculator arithCalc = new ArithmeticCalculator();
    private final CircleCalculator circleCalc = new CircleCalculator();

    public double arithC (double a, double b, char c) throws Exception {
        return this.arithCalc.operate(a, b, c);
    }

    public double circleC (double a) {
        return this.circleCalc.operate(a);
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


