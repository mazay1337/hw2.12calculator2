package pro.sky.calculator2.service;

import pro.sky.calculator2.exception.ZeroDivideException;

public class CalculatorServiceImpl implements CalculatorService {
    public String welcome() {
        return "Добро пожаловать в калькулятор";
    }

    @Override
    public Integer sum(Integer num1, Integer num2) {
        return num1 + num2;
    }

    @Override
    public Integer subtract(Integer num1, Integer num2) {
        return num1 - num2;
    }

    @Override
    public Integer multiply(Integer num1, Integer num2) {
        return num1 * num2;
    }

    @Override
    public Integer divide(Integer num1, Integer num2) {
        if (num2 == 0) {
            throw new ZeroDivideException();
        }
        return num1 / num2;
    }
}