package com.jebs.clicker;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;

public class MainClass {
    public static void main(String[] args) {

        final int[] clicks = {0};

        JFrame frame = new JFrame("Button Clicker");
        JPanel panel = new JPanel();
        JLabel toptext = new JLabel("click the button!");
        JButton button = new JButton("Click Me!");
        JLabel clickCounter = new JLabel("Clicks: [0]");

        toptext.setFont(new Font("Verdana", Font.PLAIN, 40));

        clickCounter.setFont(new Font("Verdana", Font.PLAIN, 25));

        button.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                clicks[0] = clicks[0] + 1;
                clickCounter.setText("Clicks: " + Arrays.toString(clicks));
            }
        });

        panel.add(toptext);
        panel.add(button);
        panel.add(clickCounter);
        frame.setSize(1000,500);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.add(panel);
    }
}
