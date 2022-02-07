package home.proj.service.impl;

import home.proj.enums.ExpensesCategory;
import home.proj.service.AddExpenses;


public class AddExpensesImpl implements AddExpenses {

    /*
    Логика работы сервиса как предполагается пока:
    1. Предлагается выбрать категорию
    2. Пользователь вводит сумму
    3. Сумма сохраняется в бд для выбранной категории

    Чтобы данные корректно сохранить, нужно знать:
    1. Пользователя
    2. Дату траты
    3. Категорию
    4. Сумму
    5. Описание (не должно быть обязательным)
     */

    @Override
    //если интеграция с телеграммом, то для каждой кнопки будет айди, который будет принимать сервис -- хз нужно ли так заморачиваться ?
    public ExpensesCategory chooseCategory(Integer idCategory) {
        ExpensesCategory category = ExpensesCategory.DEFAULT;

        switch (idCategory) {
            case 1 -> category.setCategory(ExpensesCategory.FOOD);
            case 2 -> category.setCategory(ExpensesCategory.CLOTHES);
            case 3 -> category.setCategory(ExpensesCategory.TRANSPORT);
            case 4 -> category.setCategory(ExpensesCategory.ENTERTAINMENT);
            case 5 -> category.setCategory(ExpensesCategory.HEALTH);
            case 6 -> category.setCategory(ExpensesCategory.DEFAULT);
        }
        return category;
    }


    @Override
    //должен ли этот сервис что-то возвращать
    public void addExpenses(ExpensesCategory category, String summa) {

        switch (category){
            case FOOD:
                //добавить в категорию еды
                break;
            case CLOTHES:
                //добавить в категорию одежды
                break;
            case TRANSPORT:
                //добавить в категорию транспорта
                break;
            case ENTERTAINMENT:
                //добавить в категорию развлечений
                break;
            case HEALTH:
                //добавить в категорию здоровья
        }
    }

}