package app;

import javafx.application.Application;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.stage.Stage;

public class MainApp extends Application {
    @Override
    public void start(Stage stage) throws Exception {
        FXMLLoader loader = new FXMLLoader(
            getClass().getResource("/fxml/MainMenuView.fxml")
        );

        Scene scene = new Scene(loader.load());
        stage.setTitle("Typing Tutor");
        stage.setScene(scene);
        stage.show();
        
        throw new UnsupportedOperationException("Unimplemented method 'start'");
    }

    public static void main(String[] args) {
        launch();
    }
}
