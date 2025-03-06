package calculator;

import java.util.function.*;

public enum OperatorType {
    add("+",(a,b)-> a+b),
    subtract("-",(a,b)-> a-b),
    multiply("*",(a,b)-> a*b),
    divide("/",OperatorType::safeDivide);

    private final String operator;
    private final BiFunction<Double,Double,Double> operation;

    OperatorType(String operator,BiFunction<Double,Double,Double> operation){
        this.operator =operator;
        this.operation=operation;
    }


    public double doCalculation(double a , double b){
        return operation.apply(a,b);
    }

    public static OperatorType inputOp(String operator){
        for (OperatorType compareOp : values()){
            if (compareOp.operator.equals(operator)){
                return compareOp;
            }
        }
        throw new IllegalArgumentException("잘못된 연산자입니다.");
    }

    public static double safeDivide(double a, double b){
        if(b==0) throw new ArithmeticException("0으로 나눌 수 없습니다.");
        return a/b;
    }

}
