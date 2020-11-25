package sample;

import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.input.MouseEvent;

public class Controller {

    @FXML
    private PasswordField idTextPassword;
    @FXML
    private Label idMostrarPassword;
    @FXML
    private Button idButtonGuardar;
    //Esto mostraria la contraseña al pasar el ratón
    @FXML
    private void mostrarPassword(MouseEvent event){
        idMostrarPassword.setText(idTextPassword.getText());
    }
    //Esto mostraria nuevamente el texto al quitar del ratón de encima
    @FXML
    private void volverAlTextInicial(MouseEvent event){
        idMostrarPassword.setText("Mostrar Contraseña");
    }
    //Esto mostraria la contraseña al hacer click
   /* @FXML
    public void onidMostrarPasswordClicked(MouseEvent event){
        idMostrarPassword.setText(idTextPassword.getText());
    }*/

    @FXML
    public void onidButtonGuardar(MouseEvent event){
        idButtonGuardar.setText("Botón pulsado");

    }

//onMousedRealised  lo q hace es cuando dejamos de apretar el boton desaparece la accion
// onKeyPressed(KeyEvent key){tx1.setText(key.getCharacter())} esto lo q hace es mostrar el último caracter introducido



}

