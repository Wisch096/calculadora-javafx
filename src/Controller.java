import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;

public class Controller {

        private double valor1;
        private  double valor2;

    @FXML
    Button buttonLimpar, buttonSomar, buttonSubtrair;
    @FXML
    Button buttonMultiplicar, buttonDividir;

    @FXML
    TextField fieldValor1, fieldValor2, fieldResultado;

        @FXML
        private void initialize() {
            fieldResultado.setEditable(false);
            buttonLimpar.setOnAction(event -> {

                fieldValor1.setText("");
                fieldValor2.setText("");
                fieldResultado.setText("");
                fieldValor1.requestFocus();
            });

            buttonSomar.setOnAction(event -> {
                valor1 = Double.parseDouble(fieldValor1.getText());
                valor2 = Double.parseDouble(fieldValor2.getText());
                fieldResultado.setText(String.valueOf(valor1 + valor2));
            });

            buttonSubtrair.setOnAction(event -> {
                valor1 = Double.parseDouble(fieldValor1.getText());
                valor2 = Double.parseDouble(fieldValor2.getText());
                fieldResultado.setText(String.valueOf(valor1 - valor2));
            });

            buttonMultiplicar.setOnAction(event -> {
                valor1 = Double.parseDouble(fieldValor1.getText());
                valor2 = Double.parseDouble(fieldValor2.getText());
                fieldResultado.setText(String.valueOf(valor1 * valor2));
            });

            buttonDividir.setOnAction(event -> {
                valor1 = Double.parseDouble(fieldValor1.getText());
                valor2 = Double.parseDouble(fieldValor2.getText());
                fieldResultado.setText(String.valueOf(valor1 / valor2));
            });


        }
}

