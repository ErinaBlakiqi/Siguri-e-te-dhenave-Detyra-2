package Trifid;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

public class TrifidCipherGUI extends Application {

    private TextArea resultArea;
    private TextArea polybiusArea;

    public static void main(String[] args) {
        launch(args);
    }

    @Override
    public void start(Stage primaryStage) {
        primaryStage.setTitle("Trifid Cipher");

        TextField keywordField = new TextField();
        keywordField.setPromptText("Enter the secret keyword");
        TextArea inputText = new TextArea();
        inputText.setPromptText("Enter text to encrypt/decrypt");
        Button encryptButton = new Button("Encrypt");
        Button decryptButton = new Button("Decrypt");
        resultArea = new TextArea();
        resultArea.setEditable(false);
        polybiusArea = new TextArea();
        polybiusArea.setEditable(false);
        polybiusArea.setVisible(false); // Fillimisht e fshihim

        encryptButton.setOnAction(e -> {
            String keyword = keywordField.getText().toUpperCase().replaceAll("[^A-Z]", "");
            String text = inputText.getText().toUpperCase().replaceAll("[^A-Z]", "");
            char[] encryptedText = TrifidCipher.encrypt(keyword, text);
            String polybiusText = TrifidCipher.getPolybiusCube(keyword);
            resultArea.setText(new String(encryptedText));
            polybiusArea.setText(polybiusText);
            polybiusArea.setVisible(true); // Shfaqet kur enkriptohet
        });

        decryptButton.setOnAction(e -> {
            String keyword = keywordField.getText().toUpperCase().replaceAll("[^A-Z]", "");
            String text = inputText.getText().toUpperCase().replaceAll("[^A-Z]", "");
            String decryptedText = TrifidCipher.decrypt(keyword, text);
            resultArea.setText(decryptedText);
            String polybiusText =TrifidCipher.getPolybiusCube(keyword);
            polybiusArea.setText(polybiusText);
            polybiusArea.setVisible(true); // Shfaqet kur dekriptohet
        });

        VBox inputLayout = new VBox(10);
        inputLayout.getChildren().addAll(new Label("Keyword:"), keywordField, new Label("Input Text:"), inputText);

        HBox buttonLayout = new HBox(10);
        buttonLayout.getChildren().addAll(encryptButton, decryptButton);

        VBox resultLayout = new VBox(10);
        resultLayout.getChildren().addAll(new Label("Result:"), resultArea);

        VBox polybiusLayout = new VBox(10);
        polybiusLayout.getChildren().addAll(new Label("Polybius Cube:"), polybiusArea);

        GridPane layout = new GridPane();
        layout.setAlignment(Pos.CENTER);
        layout.setHgap(10);
        layout.setVgap(10);
        layout.setPadding(new Insets(10));
        layout.add(inputLayout, 0, 0);
        layout.add(buttonLayout, 0, 1);
        layout.add(resultLayout, 0, 2);
        layout.add(polybiusLayout, 1, 0, 1, 3);

        Scene scene = new Scene(layout, 600, 400);
        primaryStage.setScene(scene);
        primaryStage.show();
    }
}