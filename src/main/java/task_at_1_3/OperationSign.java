package task_at_1_3;

public enum OperationSign {
    PLUS("+"),
    MINUS("-"),
    DIVIDE("/"),
    MULTIPLY("*"),
    MODULO("%");

    private String title;

    OperationSign(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }

    public static OperationSign fromTitle(String title) {

        for (OperationSign value : values()) {
            if (value.getTitle().equalsIgnoreCase(title)) {
                return value;
            }
        }
        throw new IllegalArgumentException(String.format("Operator sign not found for %s", title));
    }
}
