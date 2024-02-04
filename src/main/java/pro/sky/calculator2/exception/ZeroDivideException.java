package pro.sky.calculator2.exception;

import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus()
public class ZeroDivideException extends IllegalArgumentException {
    public ZeroDivideException() {
        super("Деление на ноль запрещено");
    }
}