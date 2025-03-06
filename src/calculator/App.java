package calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;
import java.util.InputMismatchException;
import java.util.List;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        ArithmeticCalculator<Number> cal = new ArithmeticCalculator<>();
        Scanner sc = new Scanner(System.in);

        while (true) {
            try {
                System.out.print("연산자를 입력하세요 (+,-,*,/) : ");
                String operatorInput = sc.next();
                OperatorType operator = OperatorType.inputOp(operatorInput);

                System.out.print("첫번째 정수를 입력하세요 : ");
                double num1 = sc.nextDouble();

                System.out.print("두번째 정수를 입력하세요 : ");
                double num2 = sc.nextDouble();

                double result = cal.calculate(num1, num2, operator);

                result = new BigDecimal(result)
                        .setScale(3, RoundingMode.HALF_UP)
                                .doubleValue();
                System.out.println("결과(반올림): " +result);
                ArithmeticCalculator<Number> calculator = new ArithmeticCalculator<>();




                    System.out.println("입력한 값보다 큰 결과를 조회하려면 값을 입력하세요. (건너뛰려면 n을 입력하세요)");

                    String input = sc.next();

                    if (input.equalsIgnoreCase("n")) {
                        System.out.println("조회 기능을 건너뜁니다.");

                    }

                    List<Double> bigResults = calculator.getBigResult(input);

                    if (bigResults != null) {
                        if (!bigResults.isEmpty()) {
                            System.out.println("입력한 값보다 큰 결과: " + bigResults);
                        } else {
                            System.out.println("입력한 값보다 큰 결과가 없습니다.");
                        }
                    }



            } catch (InputMismatchException e) {
                System.out.println("숫자를 입력해야합니다.");
                sc.nextLine();
            } catch (ArithmeticException|IllegalArgumentException e) {
                System.out.println(e.getMessage());
            }


            System.out.print("연산을 계속 하시겠습니까? ( exit 입력 시, 종료) : ");
            String answer = sc.next();
            if (answer.equals("exit")) {
                break;
            }

        }

    }
}
