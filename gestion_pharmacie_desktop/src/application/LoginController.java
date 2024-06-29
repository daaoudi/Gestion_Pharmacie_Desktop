package application;

import java.io.IOException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.geometry.Rectangle2D;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Screen;
import javafx.stage.Stage;
import javafx.scene.Node;


public class LoginController  {

	private DatabaseConnection databaseConnection;
	
	@FXML
	private Button close;
	@FXML
    private Button minimize;
    @FXML
    private TextField nom;

    @FXML
    private PasswordField password;

    @FXML
    private ComboBox<String> user_type;

    @FXML
    private Button signIn_btn;
    @FXML
    private AnchorPane main_form;
    @FXML
    private AnchorPane main_formm;
    
    private void showAlert(String title, String content) {
        Alert alert = new Alert(Alert.AlertType.ERROR);
        alert.setTitle(title);
        alert.setHeaderText(null);
        alert.setContentText(content);
        alert.showAndWait();
    }
    
    private void redirectToDashboard(String userType,ActionEvent event) {
        try {
            String fxmlFile;
            if ("admin".equals(userType)) {
                fxmlFile = "AdminDashboard.fxml";
            } else if ("pharmacie".equals(userType)) {
                fxmlFile = "pharmacie.fxml";
            }else if ("manager".equals(userType)) {
                fxmlFile = "manager.fxml";
            }else if ("super_admin".equals(userType)) {
                fxmlFile = "super_admin.fxml";
            }
            else {
               
                fxmlFile = "login.fxml"; 
            }
            FXMLLoader loader = new FXMLLoader(getClass().getResource(fxmlFile));
            Parent dashboard = loader.load();

       
            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
            stage.setScene(new Scene(dashboard));
     
            Rectangle2D screenBounds = Screen.getPrimary().getVisualBounds();
            
           
            stage.setX((screenBounds.getWidth() - stage.getWidth()) / 2);
            stage.setY((screenBounds.getHeight() - stage.getHeight()) / 2);
            stage.show();
        } catch (IOException e) {
            e.printStackTrace();
            showAlert("Redirection Error", "Error loading the dashboard.");
        }
    }
  
    @FXML
    private void signInButtonAction(ActionEvent event) throws ClassNotFoundException {
        String username = nom.getText();
        String userPassword = password.getText();

     
        String query = "SELECT * FROM users WHERE email = ? AND password = ?";

        try (Connection connection = DatabaseConnection.getConnection();
             PreparedStatement preparedStatement = connection.prepareStatement(query)) {
            preparedStatement.setString(1, username);
            preparedStatement.setString(2, userPassword);
            ResultSet resultSet = preparedStatement.executeQuery();
            Alert alert= new Alert(Alert.AlertType.INFORMATION);
            alert.setHeaderText(null);
            alert.setContentText(" Connexion réussie ! ✔ ");
            alert.showAndWait();
            if (resultSet.next()) {
              
                String userType = resultSet.getString("user_type");
               // System.out.println("Login successful. User Type: " + userType);

                
                redirectToDashboard(userType,event);
            } else {
                
                System.out.println("Login failed. Invalid username or password.");
                showAlert("Login Failed", "Invalid username or password.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
            System.out.println("Error connecting to the database.");
            showAlert("Database Error", "Error connecting to the database.");
        }
    }
    public void minimizeWindow(ActionEvent event) {
        Stage stage = (Stage) minimize.getScene().getWindow();
        stage.setIconified(true); 
    }
   
    @FXML
	   void select (ActionEvent event) {
		  user_type.getSelectionModel().getSelectedItem().toString();
	   }
		public void close() {
			System.exit(0);
		}
		public LoginController() {
	        databaseConnection = new DatabaseConnection();
	    }

		public void SigninButtonAction(ActionEvent event) {
			
	        Stage currentStage = (Stage) ((Node) event.getSource()).getScene().getWindow();
	        currentStage.close();

	       
	        Main main = new Main();
	        main.start(new Stage());
		}


  
}
