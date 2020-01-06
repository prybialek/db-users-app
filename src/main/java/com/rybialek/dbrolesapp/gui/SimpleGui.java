package com.rybialek.dbrolesapp.gui;

import com.vaadin.flow.component.button.Button;
import com.vaadin.flow.component.html.Label;
import com.vaadin.flow.component.orderedlayout.VerticalLayout;
import com.vaadin.flow.component.textfield.TextField;
import com.vaadin.flow.router.Route;


@Route("")
public class SimpleGui extends VerticalLayout {

    public SimpleGui() {
        Label label = new Label("Start Page");
        TextField textField = new TextField();
        Button button = new Button("Click me");
        button.addClickListener( click -> {
           label.setText("I've sent you kisses for the button clicking :*");
        });
        add(label);
        add(textField);
        add(button);
    }

}
