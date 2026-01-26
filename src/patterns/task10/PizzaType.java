package patterns.task10;

// PizzaType.java (без изменений, для справки)
public enum PizzaType {
    HAWAIIAN("Гавайская пицца"),
    SPICY("Острая пицца");

    private final String title;

    PizzaType(String title) {
        this.title = title;
    }

    public String getTitle() {
        return title;
    }
}
