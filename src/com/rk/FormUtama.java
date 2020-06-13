package com.rk;

import javax.swing.*;
import java.awt.*;

public class FormUtama extends JFrame {

    JList list;
    String user[] = {"RizkyKhapidsyah", "Muhammad Ardi", "Syaiful Anwar", "Alfian", "Mirna", "Hinata"};

    public FormUtama() {
        super("JList Dengan Image Item");
        Inisialisasi_Komponen();
    }

    private void Inisialisasi_Komponen() {
        list = new JList();
        list.setListData(user);
        list.setCellRenderer(new ListImageItem_CellRenderer());
        list.setPreferredSize(new Dimension(400, 250));
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        getContentPane().add(list, BorderLayout.CENTER);
        pack();
        setVisible(true);
    }
}
