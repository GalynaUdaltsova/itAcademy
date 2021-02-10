package task_at_1_3_add.operators;

import task_at_1_3.OperationSign;

public interface IOperator {

    void executeOperation(double valueOne, double valueTwo);

    OperationSign getSupportedOperation();
}
