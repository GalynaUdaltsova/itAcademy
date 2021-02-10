package task_at_1_3_add.operators.impl;

import task_at_1_3.OperationSign;
import task_at_1_3_add.operators.IOperator;

public class DivideOperator implements IOperator {
    @Override
    public void executeOperation(double valueOne, double valueTwo) {
        System.out.println(valueOne / valueTwo);
    }

    @Override
    public OperationSign getSupportedOperation() {
        return OperationSign.DIVIDE;
    }
}
