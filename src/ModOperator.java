public class ModOperator {
    public double operate(double a, double b) throws Exception {
        if (b == 0) {
            throw new BadInputException("0이 아닌 정수");
        }
        return a % b;
    }
}
