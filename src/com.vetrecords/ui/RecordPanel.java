package com.vetrecords.ui;

import javax.swing.JPanel;
import com.vetrecords.models.Store;
import com.vetrecords.models.Pet;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JTextField;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;

public class RecordPanel extends JPanel {
    private JTextField nameField, typeField, ownerField;
    private Store store;

    public RecordPanel() {
        store = new Store();
        setLayout(new GridLayout(4, 2));

        add(new JLabel("Name:"));
        nameField = new JTextField(20);
        add(nameField);

        add(new JLabel("Type:"));
        typeField = new JTextField(20);
        add(typeField);

        add(new JLabel("Owner:"));
        ownerField = new JTextField(20);
        add(ownerField);

        JButton addButton = new JButton("Add Pet");
        addButton.addActionListener(this::addPetAction);
        add(addButton);
    }

    private void addPetAction(ActionEvent e) {
        // Implementation to add pet to store
    }
}