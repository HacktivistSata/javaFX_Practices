package sample;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.GridPane;

public class Controller {
    float data = 0f,second_data;
    int operation = 0;

    @FXML
    private GridPane opar_grid_layout;

    @FXML
    private Button add;

    @FXML
    private Button nine;

    @FXML
    private Button six;

    @FXML
    private Button one;

    @FXML
    private Button subtract;

    @FXML
    private Button dot;

    @FXML
    private Button clr;

    @FXML
    private TextField textfield;

    @FXML
    private Button seven;

    @FXML
    private Button two;

    @FXML
    private Button three;

    @FXML
    private GridPane num_grid_layout;

    @FXML
    private Button eight;

    @FXML
    private Button zero;

    @FXML
    private Button equal;

    @FXML
    private Button four;

    @FXML
    private Button divison;

    @FXML
    private AnchorPane anchor;

    @FXML
    private Button multiply;

    @FXML
    private Button five;


    @FXML
    public void action_num(ActionEvent actionEvent) {
        if (actionEvent.getSource() == one) {
            textfield.setText(textfield.getText() + "1");
        } else if (actionEvent.getSource() == two) {
            textfield.setText(textfield.getText() + "2");
        } else if (actionEvent.getSource() == three) {
            textfield.setText(textfield.getText() + "3");
        } else if (actionEvent.getSource() == four) {
            textfield.setText(textfield.getText() + "4");
        } else if (actionEvent.getSource() == five) {
            textfield.setText(textfield.getText() + "5");
        } else if (actionEvent.getSource() == six) {
            textfield.setText(textfield.getText() + "6");
        } else if (actionEvent.getSource() == seven) {
            textfield.setText(textfield.getText() + "7");
        } else if (actionEvent.getSource() == eight) {
            textfield.setText(textfield.getText() + "8");
        } else if (actionEvent.getSource() == nine) {
            textfield.setText(textfield.getText() + "9");
        } else if (actionEvent.getSource() == zero) {
            textfield.setText(textfield.getText() + "0");
        }
    }

    public void action_operator(ActionEvent actionEvent) throws Exception {
        if (actionEvent.getSource() == clr) {
            textfield.setText("");
        } else if (actionEvent.getSource() == dot) {
            try {
                textfield.setText(textfield.getText() + ".");
            }catch(Exception e){
                System.out.println("ERROR");
            }
        } else if (actionEvent.getSource() == add) {
            try {
                data = Float.parseFloat(textfield.getText());
            }catch(Exception e){
                System.out.println("ERROR");
            }
            operation = 1;
            textfield.setText("");
        } else if (actionEvent.getSource() == divison) {
            try {
                data = Float.parseFloat(textfield.getText());
            }catch(Exception e){
                System.out.println("ERROR");
            }
            operation = 2;
            textfield.setText("");
        } else if (actionEvent.getSource() == multiply) {
            try {
                data = Float.parseFloat(textfield.getText());
            }catch(Exception e){
                System.out.println("ERROR");
            }
            operation = 3;
            textfield.setText("");
        } else if (actionEvent.getSource() == subtract) {
            try {
                data = Float.parseFloat(textfield.getText());
            }catch(Exception e){
                System.out.println("ERROR");
            }
            operation = 4;
            textfield.setText("");
        } else if (actionEvent.getSource() == equal) {
            try {
                 second_data = Float.parseFloat(textfield.getText());
            }catch(Exception e){
                System.out.println("ERROR");
            }
            float ans;
            switch (operation) {
                case 1:
                    ans = data + second_data;
                    textfield.setText(String.valueOf(ans));
                    break;
                case 2:
                    ans = 0f;
                    try {
                        ans = data / second_data;
                    } catch (Exception e) {
                        textfield.setText("ERROR");
                    }
                    textfield.setText(String.valueOf(ans));
                    break;
                case 3:
                    ans = data * second_data;
                    textfield.setText(String.valueOf(ans));
                    break;
                case 4:
                    ans = data - second_data;
                    textfield.setText(String.valueOf(ans));
                    break;

            }
        }

    }
}
