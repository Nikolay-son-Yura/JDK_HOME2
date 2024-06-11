package org.example.lesson3;

public class Calculator {
    public static <T extends Number> Number sum(T a, T b) {

        if (a instanceof Integer) {
            return Integer.valueOf(a.intValue() + b.intValue());
        } else if (a instanceof Double) {
            return  Double.valueOf(a.doubleValue() + b.doubleValue());
        } else if (a instanceof Long) {
            return  Long.valueOf(a.longValue() + b.longValue());
        } else if (a instanceof Float) {
            return  Float.valueOf(a.floatValue() + b.floatValue());
        } else {
            throw new NumberFormatException();
        }
    }

    public static <T extends Number> Number multiply(T a, T b) {

        if (a instanceof Integer) {
            return  Integer.valueOf(a.intValue() * b.intValue());
        } else if (a instanceof Double) {
            return  Double.valueOf(a.doubleValue() * b.doubleValue());
        } else if (a instanceof Long) {
            return  Long.valueOf(a.longValue() * b.longValue());
        } else if (a instanceof Float) {
            return  Float.valueOf(a.floatValue() * b.floatValue());
        } else {
            throw new NumberFormatException();
        }
    }

    public static <T extends Number> Number divide(T a, T b) {
        if (b.intValue() != 0) {
            if (a instanceof Integer) {
                return  Integer.valueOf(a.intValue() / b.intValue());
            } else if (a instanceof Double) {
                return  Double.valueOf(a.doubleValue() / b.doubleValue());
            } else if (a instanceof Long) {
                return  Long.valueOf(a.longValue() / b.longValue());
            } else if (a instanceof Float) {
                return  Float.valueOf(a.floatValue() / b.floatValue());
            } else {
                throw new NumberFormatException();
            }
        } else throw new ArithmeticException("делить на 0 нельзя");
    }

    public static <T extends Number> Number subtract(T a, T b) {

        if (a instanceof Integer) {
            return  Integer.valueOf(a.intValue() - b.intValue());
        } else if (a instanceof Double) {
            return  Double.valueOf(a.doubleValue() - b.doubleValue());
        } else if (a instanceof Long) {
            return  Long.valueOf(a.longValue() - b.longValue());
        } else if (a instanceof Float) {
            return  Float.valueOf(a.floatValue() - b.floatValue());
        } else {
            throw new NumberFormatException();
        }
    }
}
