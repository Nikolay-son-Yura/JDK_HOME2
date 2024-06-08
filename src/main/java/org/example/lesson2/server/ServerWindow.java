package org.example.lesson2.server;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class ServerWindow extends JFrame implements ServerView {
    public static final int WIDTH = 400;
    public static final int HEIGHT = 300;


    JButton btnStart, btnStop;
    JTextArea log;

    private ServerController server;

    public ServerWindow() {
        setting();
        createPanel();

        setVisible(true);
    }

    public void setServerController(ServerController server) {
        this.server = server;
    }

    private void setting() {
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(WIDTH, HEIGHT);
        setResizable(false);
        setTitle("Chat server");
        setLocationRelativeTo(null);
        setAlwaysOnTop(true);
        server = new ServerController();
    }

    private void createPanel() {
        log = new JTextArea();
        add(log);
        add(createButtons(), BorderLayout.SOUTH);
    }

    private Component createButtons() {
        JPanel panel = new JPanel(new GridLayout(1, 2));
        btnStart = new JButton("Start");
        btnStop = new JButton("Stop");

        btnStart.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                server.startServer();
            }
        });

        btnStop.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                server.stopServer();
            }
        });

        panel.add(btnStart);
        panel.add(btnStop);
        return panel;
    }

    @Override
    public void showMessage(String message) {
        log.append(message);
    }
}
