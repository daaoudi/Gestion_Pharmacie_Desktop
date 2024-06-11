package application;

import java.net.URL;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Optional;
import java.util.ResourceBundle;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.chart.BarChart;
import javafx.scene.control.Alert;
import javafx.scene.control.Button;
import javafx.scene.control.ButtonType;
import javafx.scene.control.ComboBox;
import javafx.scene.control.DatePicker;
import javafx.scene.control.Label;
import javafx.scene.control.PasswordField;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextArea;
import javafx.scene.control.TextField;
import javafx.scene.control.Alert.AlertType;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.AnchorPane;

public class AdminDashboardController implements Initializable {
	private Connection conn;
	private PreparedStatement pst;
	private Statement statement;
	private ResultSet rs;
	
	 @FXML
	    private Button add_stock_btn;

	    @FXML
	    private Button close_btn;

	    @FXML
	    private TableColumn<?, ?> dateAchat_med_pat_col;

	    @FXML
	    private DatePicker dateAchat_med_pat_textfield;

	    @FXML
	    private TableColumn<?, ?> date_achat_med_col;

	    @FXML
	    private ComboBox<?> date_achat_med_pat_comboBox;

	    @FXML
	    private DatePicker date_exper_med;

	    @FXML
	    private TableColumn<?, ?> date_exper_med_col;

	    @FXML
	    private DatePicker date_prod_med;

	    @FXML
	    private TableColumn<?, ?> date_prod_med_col;

	    @FXML
	    private ComboBox<?> date_trans_id_comboBox;

	    @FXML
	    private DatePicker date_transaction;

	    @FXML
	    private TableColumn<?, ?> date_transaction_col;

	    @FXML
	    private Button delete_stock_btn;

	    @FXML
	    private TableColumn<?, ?> desc_med_col;

	    @FXML
	    private TextArea desc_med_textarea;

	    @FXML
	    private Button docteur_btn;

	    @FXML
	    private Button docteur_btn_add;

	    @FXML
	    private Button docteur_btn_delete;

	    @FXML
	    private Button docteur_btn_update;

	    @FXML
	    private AnchorPane docteur_form;

	    @FXML
	    private TextField docteur_id;

	    @FXML
	    private TableColumn<?, ?> docteur_id_col;

	    @FXML
	    private Label docteur_nbr;

	    @FXML
	    private TextField docteur_nom;

	    @FXML
	    private TableColumn<?, ?> docteur_nom_col;

	    @FXML
	    private TextField docteur_prenom;

	    @FXML
	    private TableColumn<?, ?> docteur_prenom_col;

	    @FXML
	    private TableColumn<?, ?> docteur_specialite_col;

	    @FXML
	    private ComboBox<?> docteur_specialite_comboBox;

	    @FXML
	    private TableView<?> docteur_table;

	    @FXML
	    private TextField docteur_tel;

	    @FXML
	    private TableColumn<?, ?> docteur_tel_col;

	    @FXML
	    private TextField email_profile;

	    @FXML
	    private TableColumn<?, ?> email_user_col;

	    @FXML
	    private Label email_user_label;

	    @FXML
	    private Button facture_btn;

	    @FXML
	    private Button facture_btn_add;

	    @FXML
	    private Button facture_btn_delete;

	    @FXML
	    private Button facture_btn_update;

	    @FXML
	    private TableColumn<?, ?> facture_date_trans_col;

	    @FXML
	    private AnchorPane facture_form;

	    @FXML
	    private TextField facture_id;

	    @FXML
	    private TableColumn<?, ?> facture_id_col;

	    @FXML
	    private TableColumn<?, ?> facture_med_col;

	    @FXML
	    private TableColumn<?, ?> facture_pat_col;

	    @FXML
	    private TableColumn<?, ?> facture_qte_col;

	    @FXML
	    private TableView<?> facture_table;

	    @FXML
	    private TableColumn<?, ?> facture_total_col;

	    @FXML
	    private Button fournisseur_btn;

	    @FXML
	    private Button fournisseur_btn_add;

	    @FXML
	    private Button fournisseur_btn_delete;

	    @FXML
	    private Button fournisseur_btn_update;

	    @FXML
	    private AnchorPane fournisseur_form;

	    @FXML
	    private TextField fournisseur_id;

	    @FXML
	    private TableColumn<?, ?> fournisseur_id_col;

	    @FXML
	    private Label fournisseur_nbr;

	    @FXML
	    private TextField fournisseur_nom;

	    @FXML
	    private TableColumn<?, ?> fournisseur_nom_col;

	    @FXML
	    private TextField fournisseur_prenom;

	    @FXML
	    private TableColumn<?, ?> fournisseur_prenom_col;

	    @FXML
	    private ComboBox<?> fournisseur_stock_id;

	    @FXML
	    private TableColumn<?, ?> fournisseur_stock_qte_col;

	    @FXML
	    private TableView<?> fournisseur_table_view;

	    @FXML
	    private TextField fournisseur_tel;

	    @FXML
	    private TableColumn<?, ?> fournisseur_tel_col;

	    @FXML
	    private Button gestion_med_pat_btn;

	    @FXML
	    private AnchorPane gestion_med_pat_form;

	    @FXML
	    private Button gestion_pat_fact_btn;

	    @FXML
	    private AnchorPane gestion_pat_facture_form;

	    @FXML
	    private AnchorPane home;

	    @FXML
	    private Button home_btn;

	    @FXML
	    private Button logout_btn;

	    @FXML
	    private Button med_add_btn;

	    @FXML
	    private Button med_delete_btn;

	    @FXML
	    private AnchorPane med_form;

	    @FXML
	    private TextField med_id_textfield;

	    @FXML
	    private Button med_pat_add_btn;

	    @FXML
	    private Button med_pat_delete_btn;

	    @FXML
	    private TableColumn<?, ?> med_pat_id_col;

	    @FXML
	    private TableView<?> med_pat_table;

	    @FXML
	    private Button med_pat_update_btn;

	    @FXML
	    private TextField med_patient_id_textfield;

	    @FXML
	    private TableView<?> med_table;

	    @FXML
	    private Button med_update_btn;

	    @FXML
	    private Button medicament_btn;

	    @FXML
	    private Button minimize_btn;

	    @FXML
	    private TableColumn<?, ?> nom_med_col;

	    @FXML
	    private TextField nom_med_textfield;

	    @FXML
	    private TextField nom_profile;

	    @FXML
	    private TableColumn<?, ?> nom_user_col;

	    @FXML
	    private Label nom_user_label;

	    @FXML
	    private PasswordField password_profile;

	    @FXML
	    private TableColumn<?, ?> password_user_col;

	    @FXML
	    private Label password_user_label;

	    @FXML
	    private Button pat_facture_btn_add;

	    @FXML
	    private Button pat_facture_btn_delete;

	    @FXML
	    private Button pat_facture_btn_update;

	    @FXML
	    private TextField pat_facture_id;

	    @FXML
	    private TableColumn<?, ?> pat_facture_id_col;

	    @FXML
	    private TableView<?> pat_facture_table_view;

	    @FXML
	    private TextField patient_adresse;

	    @FXML
	    private TableColumn<?, ?> patient_adresse_col;

	    @FXML
	    private Button patient_btn;

	    @FXML
	    private Button patient_btn_add;

	    @FXML
	    private Button patient_btn_delete;

	    @FXML
	    private Button patient_btn_update;

	    @FXML
	    private BarChart<?, ?> patient_data_chart;

	    @FXML
	    private TableColumn<?, ?> patient_docteur_col;

	    @FXML
	    private ComboBox<?> patient_docteur_comboBox;

	    @FXML
	    private TableColumn<?, ?> patient_fact_date_trans_col;

	    @FXML
	    private ComboBox<?> patient_fact_date_trans_comboBox;

	    @FXML
	    private AnchorPane patient_form;

	    @FXML
	    private TextField patient_id;

	    @FXML
	    private TableColumn<?, ?> patient_med_date_achat_col;

	    @FXML
	    private ComboBox<?> patient_med_date_achat_comboBox;

	    @FXML
	    private Label patient_nbr;

	    @FXML
	    private TextField patient_nom;

	    @FXML
	    private TableColumn<?, ?> patient_nom_col;

	    @FXML
	    private TextField patient_prenom;

	    @FXML
	    private TableColumn<?, ?> patient_prenom_col;

	    @FXML
	    private TableView<?> patient_table;

	    @FXML
	    private TextField patient_tel;

	    @FXML
	    private TableColumn<?, ?> patient_tel_col;

	    @FXML
	    private TextField prenom_profile;

	    @FXML
	    private TableColumn<?, ?> prenom_user_col;

	    @FXML
	    private Label prenom_user_label;

	    @FXML
	    private TableColumn<?, ?> prix_med_col;

	    @FXML
	    private TextField prix_med_textfield;

	    @FXML
	    private Button profile_btn;

	    @FXML
	    private Button profile_btn_delete;

	    @FXML
	    private Button profile_btn_update;

	    @FXML
	    private AnchorPane profile_form;

	    @FXML
	    private TableColumn<?, ?> qte_med_col;

	    @FXML
	    private TableColumn<?, ?> qte_med_pat_col;

	    @FXML
	    private TextField qte_med_pat_textfield;

	    @FXML
	    private TextField qte_med_textfield;

	    @FXML
	    private TableColumn<StockMed, Integer> qte_stock_col;

	    @FXML
	    private TextField qte_textfield;

	    @FXML
	    private TextField search_med_textfield;

	    @FXML
	    private Button stock_btn;

	    @FXML
	    private TableColumn<StockMed, String> stock_id_col;

	    @FXML
	    private TableColumn<?, ?> stock_id_med_col;

	    @FXML
	    private ComboBox<?> stock_id_med_comboBox;

	    @FXML
	    private TextField stock_id_textfield;

	    @FXML
	    private AnchorPane stock_medicament_form;

	    @FXML
	    private Label stock_qte;

	    @FXML
	    private TableView<StockMed> stock_table;

	    @FXML
	    private TextField tel_profile;

	    @FXML
	    private TableColumn<?, ?> tel_user_col;

	    @FXML
	    private Label tel_user_label;

	    @FXML
	    private TableColumn<?, ?> type_user_col;

	    @FXML
	    private Label type_user_label;

	    @FXML
	    private Button update_stock_btn;

	    @FXML
	    private Button user_btn_delete;

	    @FXML
	    private Label username;

	    @FXML
	    private Button users_btn;

	    @FXML
	    private AnchorPane users_form;

	    @FXML
	    private TableView<?> users_table;
	    
	    @FXML
	    public void SwitchForm(ActionEvent event) {
	    	if(event.getSource()==home_btn) {
	    		home.setVisible(true);
	    		stock_medicament_form.setVisible(false);
	    		gestion_med_pat_form.setVisible(false);
	    		med_form.setVisible(false);
	    		fournisseur_form.setVisible(false);
	    		gestion_pat_facture_form.setVisible(false);
	    		facture_form.setVisible(false);
	    		docteur_form.setVisible(false);
	    		patient_form.setVisible(false);
	    		users_form.setVisible(false);
	    		profile_form.setVisible(false);
	    		home_btn.setStyle("-fx-background-color:linear-gradient(to bottom right , #de7e23,#dfe62c);");
users_btn.setStyle(" -fx-background-color:TRANSPARENT");
	    		
	    	
	    		stock_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		profile_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		patient_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		docteur_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		facture_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		gestion_pat_fact_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		fournisseur_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		medicament_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		gestion_med_pat_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		
	    	}else if(event.getSource()==stock_btn) {
	    		stock_medicament_form.setVisible(true);
	    		gestion_med_pat_form.setVisible(false);
	    		med_form.setVisible(false);
	    		fournisseur_form.setVisible(false);
	    		gestion_pat_facture_form.setVisible(false);
	    		facture_form.setVisible(false);
	    		docteur_form.setVisible(false);
	    		patient_form.setVisible(false);
	    		users_form.setVisible(false);
	    		profile_form.setVisible(false);
	    		home.setVisible(false);
	    		stock_btn.setStyle(" -fx-background-color:linear-gradient(to bottom right , #de7e23,#dfe62c);");
users_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		
	    		home_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		
	    		profile_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		patient_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		docteur_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		facture_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		gestion_pat_fact_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		fournisseur_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		medicament_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		gestion_med_pat_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		showListDataStockMed();
	    		
	    	}else if(event.getSource()==gestion_med_pat_btn) {
	    		gestion_med_pat_form.setVisible(true);
	    		med_form.setVisible(false);
	    		fournisseur_form.setVisible(false);
	    		gestion_pat_facture_form.setVisible(false);
	    		facture_form.setVisible(false);
	    		docteur_form.setVisible(false);
	    		patient_form.setVisible(false);
	    		users_form.setVisible(false);
	    		profile_form.setVisible(false);
	    		home.setVisible(false);
	    		stock_medicament_form.setVisible(false);
	    		gestion_med_pat_btn.setStyle(" -fx-background-color:linear-gradient(to bottom right , #de7e23,#dfe62c); ");
users_btn.setStyle(" -fx-background-color:TRANSPARENT");
	    		
	    		home_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		stock_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		profile_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		patient_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		docteur_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		facture_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		gestion_pat_fact_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		fournisseur_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		medicament_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		
	    	}else if(event.getSource()==medicament_btn) {
	    		med_form.setVisible(true);
	    		fournisseur_form.setVisible(false);
	    		gestion_pat_facture_form.setVisible(false);
	    		facture_form.setVisible(false);
	    		docteur_form.setVisible(false);
	    		patient_form.setVisible(false);
	    		users_form.setVisible(false);
	    		profile_form.setVisible(false);
	    		home.setVisible(false);
	    		stock_medicament_form.setVisible(false);
	    		gestion_med_pat_form.setVisible(false);
	    		medicament_btn.setStyle(" -fx-background-color:linear-gradient(to bottom right , #de7e23,#dfe62c); ");
users_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		
	    		home_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		stock_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		profile_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		patient_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		docteur_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		facture_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		gestion_pat_fact_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		fournisseur_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		
	    		gestion_med_pat_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    	}else if(event.getSource()==fournisseur_btn) {
	    		fournisseur_form.setVisible(true);
	    		gestion_pat_facture_form.setVisible(false);
	    		facture_form.setVisible(false);
	    		docteur_form.setVisible(false);
	    		patient_form.setVisible(false);
	    		users_form.setVisible(false);
	    		profile_form.setVisible(false);
	    		home.setVisible(false);
	    		stock_medicament_form.setVisible(false);
	    		gestion_med_pat_form.setVisible(false);
	    		med_form.setVisible(false);
	    		fournisseur_btn.setStyle(" -fx-background-color:linear-gradient(to bottom right , #de7e23,#dfe62c);");
users_btn.setStyle(" -fx-background-color:TRANSPARENT");
	    		
	    		home_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		stock_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		profile_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		patient_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		docteur_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		facture_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		gestion_pat_fact_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		
	    		medicament_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		gestion_med_pat_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    	}else if(event.getSource()==gestion_pat_fact_btn) {
	    		gestion_pat_facture_form.setVisible(true);
	    		facture_form.setVisible(false);
	    		docteur_form.setVisible(false);
	    		patient_form.setVisible(false);
	    		users_form.setVisible(false);
	    		profile_form.setVisible(false);
	    		home.setVisible(false);
	    		stock_medicament_form.setVisible(false);
	    		gestion_med_pat_form.setVisible(false);
	    		med_form.setVisible(false);
	    		fournisseur_form.setVisible(false);
	    		gestion_pat_fact_btn.setStyle(" -fx-background-color:linear-gradient(to bottom right , #de7e23,#dfe62c); ");
users_btn.setStyle(" -fx-background-color:TRANSPARENT");
	    		
	    		home_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		stock_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		profile_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		patient_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		docteur_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		facture_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		
	    		fournisseur_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		medicament_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		gestion_med_pat_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    	}else if(event.getSource()==facture_btn) {
	    		facture_form.setVisible(true);
	    		docteur_form.setVisible(false);
	    		patient_form.setVisible(false);
	    		users_form.setVisible(false);
	    		profile_form.setVisible(false);
	    		home.setVisible(false);
	    		stock_medicament_form.setVisible(false);
	    		gestion_med_pat_form.setVisible(false);
	    		med_form.setVisible(false);
	    		fournisseur_form.setVisible(false);
	    		gestion_pat_facture_form.setVisible(false);
	    		facture_btn.setStyle(" -fx-background-color:linear-gradient(to bottom right , #de7e23,#dfe62c);");
users_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		
	    		home_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		stock_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		profile_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		patient_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		docteur_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    	
	    		gestion_pat_fact_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		fournisseur_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		medicament_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		gestion_med_pat_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    	}else if(event.getSource()==docteur_btn) {
	    		docteur_form.setVisible(true);
	    		patient_form.setVisible(false);
	    		users_form.setVisible(false);
	    		profile_form.setVisible(false);
	    		home.setVisible(false);
	    		stock_medicament_form.setVisible(false);
	    		gestion_med_pat_form.setVisible(false);
	    		med_form.setVisible(false);
	    		fournisseur_form.setVisible(false);
	    		gestion_pat_facture_form.setVisible(false);
	    		facture_form.setVisible(false);
	    		docteur_btn.setStyle(" -fx-background-color:linear-gradient(to bottom right , #de7e23,#dfe62c); ");
users_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		
	    		home_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		stock_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		profile_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		patient_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		
	    		facture_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		gestion_pat_fact_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		fournisseur_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		medicament_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		gestion_med_pat_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    	}else if(event.getSource()==patient_btn) {
	    		patient_form.setVisible(true);
	    		users_form.setVisible(false);
	    		profile_form.setVisible(false);
	    		home.setVisible(false);
	    		stock_medicament_form.setVisible(false);
	    		gestion_med_pat_form.setVisible(false);
	    		med_form.setVisible(false);
	    		fournisseur_form.setVisible(false);
	    		gestion_pat_facture_form.setVisible(false);
	    		facture_form.setVisible(false);
	    		docteur_form.setVisible(false);
	    		patient_btn.setStyle(" -fx-background-color:linear-gradient(to bottom right , #de7e23,#dfe62c); ");
	    		users_btn.setStyle(" -fx-background-color:TRANSPARENT");
	    		
	    		home_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		stock_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		profile_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		
	    		docteur_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		facture_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		gestion_pat_fact_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		fournisseur_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		medicament_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		gestion_med_pat_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    	}else if (event.getSource()==users_btn) {
	    		users_form.setVisible(true);
	    		profile_form.setVisible(false);
	    		home.setVisible(false);
	    		stock_medicament_form.setVisible(false);
	    		gestion_med_pat_form.setVisible(false);
	    		med_form.setVisible(false);
	    		fournisseur_form.setVisible(false);
	    		gestion_pat_facture_form.setVisible(false);
	    		facture_form.setVisible(false);
	    		docteur_form.setVisible(false);
	    		patient_form.setVisible(false);
	    		users_btn.setStyle(" -fx-background-color:linear-gradient(to bottom right , #de7e23,#dfe62c); ");
	    		
	    		home_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		stock_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		profile_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		patient_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		docteur_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		facture_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		gestion_pat_fact_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		fournisseur_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		medicament_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		gestion_med_pat_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    	}else if(event.getSource()==profile_btn) {
	    		profile_form.setVisible(true);
	    		home.setVisible(false);
	    		stock_medicament_form.setVisible(false);
	    		gestion_med_pat_form.setVisible(false);
	    		med_form.setVisible(false);
	    		fournisseur_form.setVisible(false);
	    		gestion_pat_facture_form.setVisible(false);
	    		facture_form.setVisible(false);
	    		docteur_form.setVisible(false);
	    		patient_form.setVisible(false);
	    		users_form.setVisible(true);
	    		profile_btn.setStyle(" -fx-background-color:linear-gradient(to bottom right , #de7e23,#dfe62c); ");
	    		home_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		stock_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		users_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		patient_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		docteur_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		facture_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		gestion_pat_fact_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		fournisseur_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		medicament_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    		gestion_med_pat_btn.setStyle(" -fx-background-color:TRANSPARENT ");
	    	}
	    }
	
	    public void insertStockMed() {
	    	String sql=" INSERT INTO stock_med ( stock_id,qte_stock ) VALUES(?,?) ";
	    	try {
	    		Alert alert;
	    		if (stock_id_textfield.getText().isEmpty()|| qte_textfield.getText().isEmpty()) {
	    			alert=new Alert(AlertType.ERROR);
	    			alert.setTitle("Message d'erreur !!");
	    			alert.setHeaderText(null);
	    			alert.setContentText("s'il vous plait remplir tous les champs !");
	    			alert.showAndWait();
	    		}else {
	    			conn=DatabaseConnection.getConnection();
	    			String check=" SELECT * FROM stock_med WHERE stock_id=' "+stock_id_textfield.getText() + " ' ";
	    			statement=conn.createStatement();
	    			rs=statement.executeQuery(check);
	    			if(rs.next()) {
	    				alert=new Alert(AlertType.ERROR);
	    				alert.setTitle("Message d'erreur !!");
	        			alert.setHeaderText(null);
	        			alert.setContentText(" Stock ID : "+stock_id_textfield.getText() + "déja exist dans la base de données !!");
	        			alert.showAndWait();
	    			}else {
	    				pst=conn.prepareStatement(sql);
	    				pst.setString(1, stock_id_textfield.getText());
	    				pst.setInt(2, Integer.parseInt(qte_textfield.getText()));
	    				pst.executeUpdate();
	    				
	    				alert=new Alert(AlertType.INFORMATION);
	    				alert.setTitle("Message d'information !");
	    				alert.setHeaderText(null);
	    				alert.setContentText("Stock Médicament Ajouté avec succés !✔  ");
	    				alert.showAndWait();
	    				showListDataStockMed();
	    				resetStockMed();
	    			}
	    		}
	    		
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    }
	    
	    public void updateStockMed() {
	    	String sql = "UPDATE stock_med SET qte_stock = ? WHERE stock_id = ?";

	        try {
	            Alert alert;
	            conn = DatabaseConnection.getConnection();

	            String stockId = stock_id_textfield.getText();
	            String qteStock = qte_textfield.getText();

	            if (stockId.isEmpty() || qteStock.isEmpty()) {
	                alert = new Alert(Alert.AlertType.ERROR);
	                alert.setTitle("Message d'erreur !!");
	                alert.setHeaderText(null);
	                alert.setContentText("S'il vous plaît, cliquez sur l'élément que vous voulez modifier !");
	                alert.showAndWait();
	            } else {
	                alert = new Alert(Alert.AlertType.CONFIRMATION);
	                alert.setTitle("Message de Confirmation !");
	                alert.setHeaderText(null);
	                alert.setContentText("Vous êtes sûr de vouloir modifier cet élément avec cet ID ? : " + stockId + " ?");
	                Optional<ButtonType> option = alert.showAndWait();

	                if (option.isPresent() && option.get() == ButtonType.OK) {
	                    try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
	                        preparedStatement.setInt(1, Integer.parseInt(qteStock));
	                        preparedStatement.setString(2, stockId);

	                        int rowsUpdated = preparedStatement.executeUpdate();
	                        if (rowsUpdated > 0) {
	                            alert = new Alert(Alert.AlertType.INFORMATION);
	                            alert.setTitle("Message d'information");
	                            alert.setHeaderText(null);
	                            alert.setContentText("Mise à jour réussie ✔ !");
	                            alert.showAndWait();
	                            showListDataStockMed();
	                            resetStockMed();
	                        } else {
	                            alert = new Alert(Alert.AlertType.WARNING);
	                            alert.setTitle("Avertissement");
	                            alert.setHeaderText(null);
	                            alert.setContentText("Aucun élément trouvé avec cet ID.");
	                            alert.showAndWait();
	                        }
	                    }
	                }
	            }
	        } catch (SQLException | ClassNotFoundException e) {
	            e.printStackTrace();
	            Alert alert = new Alert(Alert.AlertType.ERROR);
	            alert.setTitle("Erreur SQL");
	            alert.setHeaderText(null);
	            alert.setContentText("Erreur lors de la mise à jour de l'élément : " + e.getMessage());
	            alert.showAndWait();
	        }
	    }
	    
	    public void deleteStockMed() {
	    	String sql=" DELETE FROM stock_med WHERE stock_id=? ";
	    	try {
	    		Alert alert;
	    		conn=DatabaseConnection.getConnection();
	    		String stockId=stock_id_textfield.getText();
	    		String qteStock = qte_textfield.getText();
	    		if (stockId.isEmpty() || qteStock.isEmpty()) {
	                alert = new Alert(Alert.AlertType.ERROR);
	                alert.setTitle("Message d'erreur !!");
	                alert.setHeaderText(null);
	                alert.setContentText("S'il vous plaît, cliquez sur l'élément que vous voulez supprimer !");
	                alert.showAndWait();
	            }else {
	                alert = new Alert(Alert.AlertType.CONFIRMATION);
	                alert.setTitle("Message de Confirmation !");
	                alert.setHeaderText(null);
	                alert.setContentText("Vous êtes sûr de vouloir supprimer cet élément avec cet ID ? : " + stockId + " ?");
	                Optional<ButtonType> option = alert.showAndWait();

	                if (option.isPresent() && option.get() == ButtonType.OK) {
	                    try (PreparedStatement preparedStatement = conn.prepareStatement(sql)) {
	                        
	                        preparedStatement.setString(1, stockId);

	                        int rowsUpdated = preparedStatement.executeUpdate();
	                        if (rowsUpdated > 0) {
	                            alert = new Alert(Alert.AlertType.INFORMATION);
	                            alert.setTitle("Message d'information");
	                            alert.setHeaderText(null);
	                            alert.setContentText("Supprimer avec succés ✔ !");
	                            alert.showAndWait();
	                            showListDataStockMed();
	                            resetStockMed();
	                        } else {
	                            alert = new Alert(Alert.AlertType.WARNING);
	                            alert.setTitle("Avertissement");
	                            alert.setHeaderText(null);
	                            alert.setContentText("Aucun élément trouvé avec cet ID.");
	                            alert.showAndWait();
	                        }
	                    }
	                }
	            }
	    	}catch(SQLException | ClassNotFoundException e) {
	    		e.printStackTrace();
	            Alert alert = new Alert(Alert.AlertType.ERROR);
	            alert.setTitle("Erreur SQL");
	            alert.setHeaderText(null);
	            alert.setContentText("Erreur lors de la supprimer cette l'élément : " + e.getMessage());
	            alert.showAndWait();
	    	}
	    }
	    
	    public ObservableList<StockMed> listDataStockMed(){
	    	ObservableList<StockMed> listData= FXCollections.observableArrayList();
	    	String sql=" SELECT * FROM stock_med " ;
	    	try {
	    		conn = DatabaseConnection.getConnection();
	    		pst=conn.prepareStatement(sql);
	    		rs=pst.executeQuery();
	    		
	    		StockMed stockMed;
	    		while(rs.next()) {
	    			stockMed=new StockMed();
	    			stockMed.setStockId(rs.getString("stock_id"));
	    			stockMed.setQteStock(rs.getInt("qte_stock"));
	    			listData.add(stockMed);
	    		}
	    		
	    		
	    	}catch(Exception e) {
	    		e.printStackTrace();
	    	}
	    	return listData;
	    }
	    private ObservableList<StockMed> StockMedList;
	    
	    public void showListDataStockMed() {
	    	StockMedList=listDataStockMed();
	    	stock_id_col.setCellValueFactory(new PropertyValueFactory<>("stockId"));
	    	qte_stock_col.setCellValueFactory(new PropertyValueFactory<>("qteStock"));
	    	stock_table.setItems(StockMedList);
	    }
	    
	    public void selectStockMed() {
	    	StockMed stockMed=stock_table.getSelectionModel().getSelectedItem();
	    	int num=stock_table.getSelectionModel().getSelectedIndex();
	    	if(num-1<-1) {
	    		return;
	    	}
	    	stock_id_textfield.setText(stockMed.getStockId());
	    	qte_textfield.setText(String.valueOf(stockMed.getQteStock()));
	    }
	    public void resetStockMed() {
	    	stock_id_textfield.setText("");
	    	qte_textfield.setText("");
	    }
	
	 @Override
		public void initialize(URL url,ResourceBundle rb) {
			//
		 showListDataStockMed();
	    	
		}

}
