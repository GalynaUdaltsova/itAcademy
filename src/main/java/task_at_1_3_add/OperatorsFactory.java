package task_at_1_3_add;

import task_at_1_3.OperationSign;
import task_at_1_3_add.operators.IOperator;
import task_at_1_3_add.operators.impl.*;

import java.util.HashMap;
import java.util.Map;

public class OperatorsFactory {
    private Map<OperationSign, IOperator> operatorsMap;

    public OperatorsFactory() {
        this.operatorsMap = new HashMap<>();
        IOperator plusOperator = new PlusOperator();
        IOperator minusOperator = new MinusOperator();
        IOperator multiplyOperator = new MultiplyOperator();
        IOperator divideOperator = new DivideOperator();
        IOperator moduloOperator = new ModuloOperator();
        operatorsMap.put(plusOperator.getSupportedOperation(), plusOperator);
        operatorsMap.put(minusOperator.getSupportedOperation(), minusOperator);
        operatorsMap.put(multiplyOperator.getSupportedOperation(), multiplyOperator);
        operatorsMap.put(divideOperator.getSupportedOperation(), divideOperator);
        operatorsMap.put(moduloOperator.getSupportedOperation(), moduloOperator);
    }

    public IOperator getNullableOperator(OperationSign operationSign) {
        IOperator operator = operatorsMap.get(operationSign);
        if (operator == null) {
            System.out.println("You entered unsupported operation, please try again");
        }
        return operator;
    }
}
