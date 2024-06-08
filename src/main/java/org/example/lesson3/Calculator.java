package org.example.lesson3;

public class Calculator {
    public static <T extends Number> T sum(T a, T b) {

        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() + b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() + b.doubleValue());
        } else if (a instanceof Long) {
            return (T) Long.valueOf(a.longValue() + b.longValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() + b.floatValue());
        } else {
            throw new NumberFormatException();
        }
    }

    public static <T extends Number> T multiply(T a, T b) {

        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() * b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() * b.doubleValue());
        } else if (a instanceof Long) {
            return (T) Long.valueOf(a.longValue() * b.longValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() * b.floatValue());
        } else {
            throw new NumberFormatException();
        }
    }

    public static <T extends Number> T divide(T a, T b) {
        if (b.intValue() != 0) {
            if (a instanceof Integer) {
                return (T) Integer.valueOf(a.intValue() / b.intValue());
            } else if (a instanceof Double) {
                return (T) Double.valueOf(a.doubleValue() / b.doubleValue());
            } else if (a instanceof Long) {
                return (T) Long.valueOf(a.longValue() / b.longValue());
            } else if (a instanceof Float) {
                return (T) Float.valueOf(a.floatValue() / b.floatValue());
            } else {
                throw new NumberFormatException();
            }
        } else throw new ArithmeticException("делить на 0 нельзя");
    }

    public static <T extends Number> T subtract(T a, T b) {

        if (a instanceof Integer) {
            return (T) Integer.valueOf(a.intValue() - b.intValue());
        } else if (a instanceof Double) {
            return (T) Double.valueOf(a.doubleValue() - b.doubleValue());
        } else if (a instanceof Long) {
            return (T) Long.valueOf(a.longValue() - b.longValue());
        } else if (a instanceof Float) {
            return (T) Float.valueOf(a.floatValue() - b.floatValue());
        } else {
            throw new NumberFormatException();
        }
    }
}
