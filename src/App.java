import java.util.*;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner sc = new Scanner(System.in);
        Calculator calculator = new Calculator();
        boolean flag = true;
        while (flag) {
            double result = 0;
            System.out.println("사칙연산(1) 원넓이계산(2) : ");
            Integer calChoice = sc.nextInt();
            switch (calChoice) {
                case 1 : // 숫자 연산자 숫자 입력
                    System.out.println("첫 번째 숫자를 입력하세요: ");
                    Integer firstNumber = sc.nextInt();
                    if (firstNumber < 0 || !(firstNumber instanceof Integer)) {
                        throw new BadInputException("정수");
                    }
                    System.out.println("사칙연산 기호를 입력하세요: ");
                    Character operator = sc.next().charAt(0);
                    System.out.println("두 번째 숫자를 입력하세요: ");
                    Integer secondNumber = sc.nextInt();
                    if (secondNumber < 0 || !(secondNumber instanceof Integer)) {
                        throw new BadInputException("정수");
                    }
                    sc.nextLine();
                    // 입력 끝
                    // 연산
                    //연산 결과 반환 및 저장
                    result = calculator.arithC(firstNumber, secondNumber, operator);
                    calculator.setNumQ(result);
                    System.out.println("결과: " + result);
                    // 후처리-삭제, 조회, 진행 여부
                    System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                    if(sc.nextLine().equals("remove")) {
                        calculator.removeNumQ();
                    }
                    System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                    if(sc.nextLine().equals("inquiry")) {
                        calculator.searchNumQ();
                    }
                    break;

                    case 2 : System.out.println("원의 반지름을 입력하세요: ");
                        Double radius = sc.nextDouble();
                        sc.nextLine();
                        result = calculator.circleC(radius);
                        calculator.setCircleQ(result);
                        System.out.println("결과: " + result);
                        // 후처리-삭제, 조회, 진행 여부
                        System.out.println("가장 먼저 저장된 연산 결과를 삭제하시겠습니까? (remove 입력 시 삭제)");
                        if(sc.nextLine().equals("remove")) {
                            calculator.removeCircleQ();
                        }
                        System.out.println("저장된 연산결과를 조회하시겠습니까? (inquiry 입력 시 조회)");
                        if(sc.nextLine().equals("inquiry")) {
                            calculator.searchCircleQ();
                        }
                        break;

                default: throw new BadInputException("1 아니면 2");

            }
            System.out.println("더 계산하시겠습니까? (exit 입력 시 종료)");
            if (sc.nextLine().equals("exit")) {
                System.out.println("계산기를 종료합니다.");
                flag = false;
            }
        }
    }
    }

