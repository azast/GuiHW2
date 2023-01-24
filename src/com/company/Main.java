package com.company;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;


public class Main extends JFrame {

    public Main() {
        setTitle("GUI Homework 2");
        setSize(500, 500);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new FlowLayout());

        JMenuBar menuBar;
        int counter = 0;


        menuBar = new JMenuBar ();
        JMenu fileMenu = new JMenu ("File");
        JMenuItem quitItem = new JMenuItem ("Quit");

        quitItem.addActionListener ((ActionEvent e) ->
                System.exit (0));

        fileMenu.add (quitItem);
        menuBar.add (fileMenu);
        setJMenuBar (menuBar);

        JPanel panel = new JPanel();
        JLabel label = new JLabel("count: " + counter);
        panel.add(label);
        add(panel);

        Timer timer = new Timer(100, new ActionListener() {
            int counter = this.counter;
            @Override
            public void actionPerformed(ActionEvent e) {
                counter = counter + 1;
                label.setText("count: " + counter);
            }
        });
        timer.start();

    }
    public static void main(String[] args) {
        Main gui = new Main();
        gui.setVisible(true);
    }
}
