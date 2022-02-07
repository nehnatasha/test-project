package home.proj.enums;

public enum ExpensesCategory {

    FOOD,
    TRANSPORT,
    ENTERTAINMENT,
    CLOTHES,
    HEALTH,
    DEFAULT;

    private ExpensesCategory value;

    ExpensesCategory(ExpensesCategory value) {
        this.value = value;
    }

    ExpensesCategory() {
    }

    public ExpensesCategory getCategory() {
        return this.value;
    }

    public void setCategory(ExpensesCategory category) {
        this.value = category;
    }
}





