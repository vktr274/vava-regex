package sk.vava.regex;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.event.Event;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.paint.Color;
import java.util.regex.Pattern;

public class FXMLController implements Initializable {
    @FXML private Label areaLabel;
    @FXML private TextArea textArea;
    @FXML private Label fieldLabel;
    @FXML private TextField textField;
    @FXML private Button button;
    @FXML private Label result;

    @FXML
    public void checkRegEx(Event e) {
        Pattern pattern = Pattern.compile(textField.getText());
        if (pattern.matcher(textArea.getText()).find()) {
            result.setTextFill(Color.GREEN);
            result.setText("Match found!");
        } else {
            result.setTextFill(Color.RED);
            result.setText("Match NOT found!");
        }
    }

    @Override
    public void initialize(URL url, ResourceBundle rb) {
        areaLabel.setText("Input to check");
        areaLabel.setLabelFor(textArea);

        fieldLabel.setText("RegEx to use");
        fieldLabel.setLabelFor(textField);

        button.setText("Check");
        result.setText("Result will appear here");
    }
}