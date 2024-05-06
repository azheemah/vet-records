package com.vetrecords.ui;

import javax.swing.JFrame;
import javax.swing.JPanel;
import java.awt.BorderLayout;

public class MainFrame extends JFrame {
    public MainFrame() {
        super("Veterinary Records");
        setSize(400, 300);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLayout(new BorderLayout());

        add(new RecordPanel(), BorderLayout.CENTER);
    }
}