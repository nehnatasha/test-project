package home.proj.service;

import home.proj.enums.ExpensesCategory;

public interface AddExpenses {

    void addExpenses(ExpensesCategory category, String summa);

    ExpensesCategory chooseCategory(Integer idCategory);
}