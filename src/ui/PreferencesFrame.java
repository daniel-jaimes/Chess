package ui;

import util.Core;

import javax.swing.*;
import java.awt.*;

public class PreferencesFrame extends JFrame {
    private JPanel gameModePanel;

    private JPanel gameSettingsPanel;
    private JRadioButton countdownRadioButton;
    private JRadioButton stopwatchRadioButton;
    private JPanel timeLimitPanel;
    private JFormattedTextField timeLimitFormattedTextField;
    private JLabel timeLimitUnitLabel;

    public PreferencesFrame() {
        super("Preferences");
        loadInterface();
    }

    private void loadInterface() {
        initializeBannerPanel();
        initializeGameSettingsPanel();
        Core.startGame();
        dispose();
    }

    private void initializeBannerPanel() {
        gameModePanel = new JPanel();
        gameModePanel.setBackground(Color.LIGHT_GRAY);

        GridBagConstraints gridBagConstraints = new GridBagConstraints();
        gridBagConstraints.weightx = gridBagConstraints.weighty = 1;
        gridBagConstraints.anchor = GridBagConstraints.SOUTHWEST;
    }

    private void initializeGameSettingsPanel() {
        ButtonGroup timerModeButtonGroup = new ButtonGroup();
        timerModeButtonGroup.add(countdownRadioButton);
        timerModeButtonGroup.add(stopwatchRadioButton);
        timeLimitFormattedTextField = new JFormattedTextField(5);
        timeLimitFormattedTextField.setValue(new Integer(20));
        timeLimitUnitLabel = new JLabel("min");
        timeLimitPanel = new JPanel(new BorderLayout());
        timeLimitPanel.add(timeLimitFormattedTextField, BorderLayout.WEST);
        timeLimitPanel.add(timeLimitUnitLabel);
        timeLimitPanel.setVisible(false);
        gameSettingsPanel = new JPanel();
        gameSettingsPanel.setBorder(BorderFactory.createTitledBorder("Game Settings"));

    }

}