package dz5;

public class prodject {
    public static void main(String[] args) {
        CalculatorModel model = new CalculatorModel();
        CalculatorView view = new CalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenter(model, view);

        // Обработка действия пользователя (например, нажатие кнопки "Сложить")
        presenter.onAddButtonClicked();
    }
}
