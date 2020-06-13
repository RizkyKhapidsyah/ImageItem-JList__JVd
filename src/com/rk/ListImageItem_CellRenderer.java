package com.rk;

import javax.swing.*;
import java.awt.*;

public class ListImageItem_CellRenderer implements ListCellRenderer {

    JLabel label = new JLabel();
    Icon icon = new ImageIcon("images/comments.png");
    Icon iconSelected = new ImageIcon("images/heart.png");
    Font font = new Font("Cambria", Font.PLAIN, 12);
    Font fontSelected = new Font("Cambria", Font.BOLD, 16);

    @Override
    public Component getListCellRendererComponent(JList list, Object value, int index, boolean isSelected, boolean cellHasFocus) {
        String teks = value.toString();
        label.setText(teks);

        if (isSelected == false) {
            label.setForeground(Color.GRAY);
            label.setIcon(icon);
            label.setFont(font);
        } else {
            label.setForeground(Color.BLACK);
            label.setIcon(iconSelected);
            label.setFont(fontSelected);
        }

        return label;
    }
}
