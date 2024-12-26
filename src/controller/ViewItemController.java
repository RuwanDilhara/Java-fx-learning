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
import model.Item;

import java.net.URL;
import java.util.ArrayList;
import java.util.ResourceBundle;

public class ViewItemController implements Initializable {
    public TextField txtItemCode;
    public TextField txtDescription;
    public TextField txtUnitPrice;
    public TextField txtQty;
    public TableView tblItemTable;
    public TableColumn colItemCode;
    public TableColumn colDescription;
    public TableColumn colUnitPrice;
    public TableColumn colQty;

    ArrayList<Item> itemArrayList = new ArrayList<>();

    @Override
    public void initialize(URL location, ResourceBundle resources) {
        colItemCode.setCellValueFactory(new PropertyValueFactory<>("itemCode"));
        colDescription.setCellValueFactory(new PropertyValueFactory<>("description"));
        colUnitPrice.setCellValueFactory(new PropertyValueFactory<>("unitPrice"));
        colQty.setCellValueFactory(new PropertyValueFactory<>("qty"));
    }

    public void tableLoader(){
        ObservableList<Item> itemObservableList = FXCollections.observableArrayList();
        itemObservableList.addAll(itemArrayList);
        tblItemTable.setItems(itemObservableList);
    }
    public void btnAddItemOnAction(ActionEvent actionEvent) {
        String itemCode = txtItemCode.getText();
        String description = colDescription.getText();
        double unitPrice = Double.parseDouble(txtUnitPrice.getText());
        int qty = Integer.parseInt(txtQty.getText());

        Item item = new Item(itemCode,description,unitPrice,qty);
        itemArrayList.add(item);

        new Alert(Alert.AlertType.INFORMATION,"Item added !...").show();

        tableLoader();
    }

    public void btnUpdateItemOnAction(ActionEvent actionEvent) {
    }

    public void btnDeleteItemOnAction(ActionEvent actionEvent) {
    }

    public void btnClearOnAction(ActionEvent actionEvent) {
    }


}
