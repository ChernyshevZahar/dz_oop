package dz5;

public class prodject {
    public static void main(String[] args) {
        CalculatorModelD model = new CalculatorModelD();
        CalculatorView view = new CalculatorView();
        CalculatorPresenter presenter = new CalculatorPresenter(model, view);

        // Обработка действия пользователя (например, нажатие кнопки "Сложить")
        presenter.onAddButtonClicked();
    }
}
