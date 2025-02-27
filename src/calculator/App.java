package calculator;

import java.util.InputMismatchException;
import java.util.Scanner;

public class App {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);



        while(true){
            char op;
            int num1, num2;
            try{System.out.print("연산자를 입력하세요 (+,-,*,-) : ");
                op = sc.next().charAt(0);
                if (!(op == '+' || op == '-' || op == '*' || op == '/')) {
                    System.out.println("잘못된 연산자입니다.");
                    continue;

                }
                System.out.print("첫번째 정수를 입력하세요 : ");
                num1 = sc.nextInt();
                System.out.print("두번째 정수를 입력하세요 : ");
                num2 = sc.nextInt();}

            catch(InputMismatchException e){
                System.out.println("정수를 입력해야합니다.");
                sc.nextLine();
                continue;

            }


            switch (op) {
                case '+':
                    System.out.println("결과 : " + (num1 + num2));
                    break;
                case '-':
                    System.out.println("결과 : " + (num1 - num2));
                    break;
                case '*':
                    System.out.println("결과 : " +(num1 * num2));
                    break;
                case '/':
                    if (num2 == 0) {
                        System.out.println("0으로 나눌 수 없습니다.");
                    } else {
                        System.out.println("결과 : " + (double) num1 / num2);
                    }
                    break;


            }

            System.out.print("연산을 계속 하시겠습니까? ( exit 입력 시, 종료) : ");
            String answer = sc.next();
            if (answer.equals("exit")) {
                break;
            }

        }


    }
}
