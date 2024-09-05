package week4.operators;

import week4.operators.AbstractOperation;

public class Subtract extends AbstractOperation {
    @Override
    public double operate(int a, int b) {
        return a - b;
    }
}
