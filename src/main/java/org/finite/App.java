package org.finite;

import org.Finite.*;

public class MyAppMain extends MicrOSApp {

    private JPanel mainPanel;

    @Override
    public JComponent createUI() {
        mainPanel = new JPanel();
        mainPanel.add(new JLabel("Hello from MyApp!"));
        JButton button = new JButton("Click Me");
        button.addActionListener(e -> {});
        mainPanel.add(button);
        return mainPanel;
    }

    @Override
    public void onStart() {
        // Initialize app
    }

    @Override
    public void onStop() {
        // Cleanup
    }
}
