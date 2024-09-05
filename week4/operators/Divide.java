package week4.operators;

import week4.operators.AbstractOperation;

public class Divide extends AbstractOperation {
    @Override
    public double operate(int a, int b) {
        return (double) a / b;
    }
}
