import task_at_1_1.ArrayOperator;
import task_at_1_2.TextOperator;
import task_at_1_3.NumberOperator;
import task_at_1_3_add.OperationExecutor;

public class TasksTest {
    public static void main(String[] args) {
        ArrayOperator.fillArrayWithData();
        TextOperator.calculateTheAverageLengthOfLines();
        NumberOperator.executeMathematicalOperations();
        OperationExecutor.executeOperation();
    }
}
