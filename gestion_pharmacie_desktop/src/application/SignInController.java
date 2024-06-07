package application;

import java.io.IOException;
import java.net.URL;
import java.sql.Connection;

import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.fxml.Initializable;
import javafx.scene.Parent;
import javafx.scene.Node;
import javafx.scene.Scene;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TextField;
import javafx.scene.layout.AnchorPane;
import javafx.stage.Stage;


public class SignInController implements Initializable {
	private Connection conn;
	private PreparedStatement pst;
	@FXML
	private AnchorPane main_form;
	@FXML
    private ComboBox<String> user_type;
	@FXML
	private TextField nom;
	@FXML
	private TextField prenom;
	@FXML
	private TextField email;
	@FXML
	private PasswordField password;
	@FXML 
	private TextField telephone;
	@FXML
	private Button signIn_btn;
	@FXML
	private Button login_btn;
	
	@FXML
	private Button close;
	@FXML
    private Button minimize;
	
	@FXML
	private AnchorPane main_formm;
	
	
   public void minimizeWindow(ActionEvent event) {
        Stage stage = (Stage) minimize.getScene().getWindow();
        stage.setIconified(true); // Minimize the window
    }
	

	 private boolean isValidUser(String nom, String prenom, String email, String password, String telephone,String userType) {
	     
		 return !nom.isEmpty() && !prenom.isEmpty() && !email.isEmpty() && !password.isEmpty() && !telephone.isEmpty() && userType != null;
		 }

	 private void redirectToDashboard(String userType, ActionEvent event) {
		    // You can redirect to different dashboards based on userType
		    if ("admin".equals(userType)) {
		        FXMLLoader loader = new FXMLLoader(getClass().getResource("AdminDashboard.fxml"));
		        try {
		            Parent root = loader.load();
		            Stage stage = (Stage) ((Node) event.getSource()).getScene().getWindow();
		            stage.setScene(new Scene(root));
		            stage.show();
		        } catch (IOException e) {
		            e.printStackTrace();
		        }
		    } else {
		        System.out.println("Redirecting to " + userType + " dashboard");
		    }
		}
	
	    private void insertUserIntoDatabase(String nom , String prenom , String email , String password , String telephone , String userType) {
	    	String query = "INSERT INTO users (nom, prenom, email, password, telephone,user_type) VALUES (?, ?, ?, ?, ?,?)";
	    	try {
	    		conn=DatabaseConnection.getConnection();
	    		pst=conn.prepareStatement(query);
	    		pst.setString(1, nom);
	    		pst.setString(2, prenom);
	    		pst.setString(3, email);
	    		pst.setString(4, password);
	    		pst.setString(5, telephone);
	    		pst.setString(6, userType);
	    		pst.executeUpdate();
	    		
	    		  Alert alert = new Alert(Alert.AlertType.INFORMATION);
	              alert.setTitle("Success");
	              alert.setHeaderText(null);
	              alert.setContentText("User inserted into the database successfully!");
	              alert.showAndWait();
	    	}catch(SQLException | ClassNotFoundException e) {
	    		  Alert alert = new Alert(Alert.AlertType.ERROR);
	              alert.setTitle("Database Error");
	              alert.setHeaderText(null);
	              alert.setContentText("An error occurred while inserting the user into the database!");
	              alert.showAndWait();
	              e.printStackTrace();
	    	}
	    }
	    
	    @FXML
	    void signInButtonAction(ActionEvent event) {
	        String nomField = nom.getText();
	        String prenomField = prenom.getText();
	        String emailField = email.getText();
	        String passwordField = password.getText();
	        String telephoneField = telephone.getText();
	        String userType = user_type.getValue();

	        if (isValidUser(nomField, prenomField, emailField, passwordField, telephoneField, userType)) {
	            insertUserIntoDatabase(nomField, prenomField, emailField, passwordField, telephoneField, userType);
	            redirectToDashboard(userType,event);
	        } else {
	            // Show error message if validation fails
	            Alert alert = new Alert(Alert.AlertType.ERROR);
	            alert.setTitle("Error");
	            alert.setHeaderText(null);
	            alert.setContentText("Invalid credentials or missing fields!");
	            alert.showAndWait();
	        }
	    }
	    
	    @Override
		public void initialize(URL url,ResourceBundle rb) {
			//
	    	 ObservableList<String> list = FXCollections.observableArrayList("pharmacie", "manager");
	    	    user_type.setItems(list);
	    	
		}
	   @FXML
	   void select (ActionEvent event) {
		  user_type.getSelectionModel().getSelectedItem().toString();
	   }
		public void close() {
			System.exit(0);
		}
		
		public void loginButtonAction(ActionEvent event) {
		    try {
		        FXMLLoader loader = new FXMLLoader(getClass().getResource("login.fxml"));
		        Parent loginPage = loader.load();
		        main_formm.getChildren().clear();
		        main_formm.getChildren().add(loginPage);
		    } catch (IOException e) {
		        e.printStackTrace();
		    }
		}
		
		
}
