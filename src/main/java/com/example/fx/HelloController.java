package com.example.fx;

import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.fxml.FXML;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.TextField;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.AnchorPane;

public class HelloController {
 @FXML
    Label l1 ;
 @FXML
    Label l2 ;
 @FXML
    Label youfit ;
 @FXML
    Button  ready,addbtn ;
 @FXML
    Label act ;
 @FXML
    ImageView a  ;
 @FXML
    TextField name,wtr ;
 @FXML
    TextField height ;
 @FXML
 TextField weight ;
 @FXML
 TextField last;
@FXML
    RadioButton easy,hard,medium ;
@FXML
    AnchorPane outils,foodmenu,waterpan;
@FXML
ImageView food,info,water,sport,add_water;

public void readyaction()
{
    l1.setVisible(false);
    l2.setVisible(false);
    youfit.setVisible(false);
    ready.setVisible(false);
    act.setVisible(false);
    a.setVisible(false);
name.setVisible(false);
last.setVisible(false);
height.setVisible(false);
weight.setVisible(false);
easy.setVisible(false);
medium.setVisible(false);
hard.setVisible(false);
outils.setVisible(true);
food.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
    @Override
    public void handle(MouseEvent mouseEvent) {
        foodmenu.setVisible(true);
        waterpan.setVisible(false);
    }
});
water.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
    @Override
    public void handle(MouseEvent mouseEvent) {
        foodmenu.setVisible(false);

waterpan.setVisible(true);
    }

});
add_water.addEventHandler(MouseEvent.MOUSE_CLICKED, new EventHandler<MouseEvent>() {
    @Override
    public void handle(MouseEvent mouseEvent) {
        wtr.setVisible(true);
        addbtn.setVisible(true);
    }
});
}

    }
