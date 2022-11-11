import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class Main extends Application {

    @Override
    public void start(Stage primaryStage) throws Exception {
        Parent tela = FXMLLoader.load(getClass().getResource("/formCalc.fxml"));
        Scene scene = new Scene(tela);
        primaryStage.setScene(scene);
        primaryStage.setTitle("Calculadora Teste");
        primaryStage.show();
    }

    public static void main(String[] args) {
        launch(args);
    }

}