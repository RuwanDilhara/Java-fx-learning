package controller;

import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.event.ActionEvent;
import javafx.fxml.Initializable;
import javafx.scene.control.Alert;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.TextField;
import javafx.scene.control.cell.PropertyValueFactory;
import model.Customer;

import java.net.URL;
import java.sql.PreparedStatement;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class AddCustomerController implements Initializable {
    public TextField txtId;
    public TextField txtname;
    public TextField txtAddress;
    public TextField txtAge;
    public TextField txtSalary;
    public TextField txtContact;
    public TableColumn colID;
    public TableColumn colName;
    public TableColumn colAddress;
    public TableColumn colAge;
    public TableColumn colSalary;
    public TableColumn colContact;
    public TableView tblAddCustomer;



    ArrayList<Customer> customerArrayList = new ArrayList<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colID.setCellValueFactory(new PropertyValueFactory<>("id"));
        colName.setCellValueFactory(new PropertyValueFactory<>("name"));
        colAddress.setCellValueFactory(new PropertyValueFactory<>("address"));
        colAge.setCellValueFactory(new PropertyValueFactory<>("age"));
        colSalary.setCellValueFactory(new PropertyValueFactory<>("salary"));
        colContact.setCellValueFactory(new PropertyValueFactory<>("contact"));
    }
    public void tableLoader(){
        ObservableList<Customer> customerObservableList = FXCollections.observableArrayList();
        customerObservableList.addAll(customerArrayList);
        tblAddCustomer.setItems(customerObservableList);
    }

    public void btnAddCustomerOnAction(ActionEvent actionEvent) {
        String id = txtId.getText();
        String name = txtname.getText();
        String address = txtAddress.getText();
        int age = Integer.parseInt(txtAge.getText());
        double salary = Double.parseDouble(txtSalary.getText());
        String contact = txtContact.getText();

        Customer customer = new Customer(id,name,address,age,salary,contact);
        customerArrayList.add(customer);

        new Alert(Alert.AlertType.INFORMATION,"Customer Added !...").show();
        tableLoader();
    }

    public void btnUpdateCustomerOnAction(ActionEvent actionEvent) {
    }

    public void btnDeleteOnAction(ActionEvent actionEvent) {
    }

    public void btnClearOnaction(ActionEvent actionEvent) {
    }


}
