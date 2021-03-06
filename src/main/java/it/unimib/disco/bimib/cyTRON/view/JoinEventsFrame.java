package it.unimib.disco.bimib.cyTRON.view;

import it.unimib.disco.bimib.cyTRON.R.RConnectionManager;
import it.unimib.disco.bimib.cyTRON.controller.DatasetController;
import java.awt.Color;
import javax.swing.DefaultComboBoxModel;
import javax.swing.JOptionPane;

public class JoinEventsFrame extends javax.swing.JFrame {

	private static final long serialVersionUID = 9148736608417611356L;

	private final MainFrame mainFrame;
    private final DatasetController datasetController;
    private final int eventIndex1;
    private final int datasetIndex;
    
    private final DefaultComboBoxModel<String> defaultComboBoxModel;
    
    public JoinEventsFrame(MainFrame mainFrame,DatasetController datasetController, int eventIndex1, int datasetIndex) {
        // get the variables
        this.mainFrame = mainFrame;
        this.datasetController = datasetController;
        this.eventIndex1 = eventIndex1;
        this.datasetIndex = datasetIndex;
        
        // create the default combo box model from the list of types
        defaultComboBoxModel = new DefaultComboBoxModel<>();
        for (Object type : datasetController.getEventsListModel().toArray()) {
            defaultComboBoxModel.addElement(type.toString());
        }
        defaultComboBoxModel.removeElementAt(this.eventIndex1);
        
        // draw the interface
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        joinLabel = new javax.swing.JLabel();
        eventLabel1 = new javax.swing.JLabel();
        geneLabel = new javax.swing.JLabel();
        nameTextField = new javax.swing.JTextField();
        eventTextField = new javax.swing.JTextField();
        joinButton = new javax.swing.JButton();
        eventLabel2 = new javax.swing.JLabel();
        eventComboBox = new javax.swing.JComboBox<>();
        typeLabel = new javax.swing.JLabel();
        colorLabel = new javax.swing.JLabel();
        typeTextField = new javax.swing.JTextField();
        colorTextField = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Join Events");
        setMinimumSize(new java.awt.Dimension(640, 360));
        setSize(new java.awt.Dimension(640, 360));

        joinLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        joinLabel.setText("Join Events");

        eventLabel1.setText("Event:");

        geneLabel.setText("Gene:");

        eventTextField.setEditable(false);
        eventTextField.setText(((it.unimib.disco.bimib.cyTRON.model.Event) datasetController.getEventsListModel().get(eventIndex1)).toString());

        joinButton.setText("Join");
        joinButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                joinButtonActionPerformed(evt);
            }
        });

        eventLabel2.setText("Event:");

        eventComboBox.setModel(defaultComboBoxModel);

        typeLabel.setText("Type:");

        colorLabel.setText("Color:");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(joinButton))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(joinLabel)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(eventLabel1)
                        .addGap(24, 24, 24)
                        .addComponent(eventTextField, javax.swing.GroupLayout.DEFAULT_SIZE, 566, Short.MAX_VALUE))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(eventLabel2)
                            .addComponent(geneLabel)
                            .addComponent(typeLabel)
                            .addComponent(colorLabel))
                        .addGap(24, 24, 24)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(typeTextField)
                            .addComponent(eventComboBox, javax.swing.GroupLayout.Alignment.TRAILING, 0, 566, Short.MAX_VALUE)
                            .addComponent(nameTextField, javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(colorTextField))))
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap(59, Short.MAX_VALUE)
                .addComponent(joinLabel)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(eventLabel1))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(eventLabel2)
                    .addComponent(eventComboBox, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(geneLabel)
                    .addComponent(nameTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(typeLabel)
                    .addComponent(typeTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(colorLabel)
                    .addComponent(colorTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(33, 33, 33)
                .addComponent(joinButton)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void joinButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_joinButtonActionPerformed
        // get name, type, color and index of the second event
        String name = nameTextField.getText();
        String type = typeTextField.getText();
        String color = colorTextField.getText();
        int eventIndex2 = eventComboBox.getSelectedIndex();
        if (eventIndex2 >= eventIndex1) {
            eventIndex2++;
        }
        
        // check the parameters
        if (name.length() == 0) {
            nameTextField.setBackground(Color.RED);
        } else {
        	nameTextField.setBackground(Color.WHITE);
        }
        if (type.length() == 0) {
            typeTextField.setBackground(Color.RED);
        } else {
        	typeTextField.setBackground(Color.WHITE);
        }
        if (color.length() == 0) {
            colorTextField.setBackground(Color.RED);
        } else {
        	colorTextField.setBackground(Color.WHITE);
        }

        if (name.length() > 0 && type.length() > 0 && color.length() > 0) {
            // join the events
            datasetController.joinEvents(eventIndex1, eventIndex2, datasetIndex, name, type, color);
        
        	// if the last console message is regular
            if (RConnectionManager.getTextConsole().isLastMessageRegular()) {
                // update the main frame
                mainFrame.updateNumberLabels();

                // close the frame
                dispose();
            } else {
            	JOptionPane.showConfirmDialog(this, RConnectionManager.getTextConsole().getLastConsoleMessage(), RConnectionManager.ERROR, JOptionPane.PLAIN_MESSAGE);
            }
        }
    }//GEN-LAST:event_joinButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel colorLabel;
    private javax.swing.JTextField colorTextField;
    private javax.swing.JComboBox<String> eventComboBox;
    private javax.swing.JLabel eventLabel1;
    private javax.swing.JLabel eventLabel2;
    private javax.swing.JTextField eventTextField;
    private javax.swing.JLabel geneLabel;
    private javax.swing.JButton joinButton;
    private javax.swing.JLabel joinLabel;
    private javax.swing.JTextField nameTextField;
    private javax.swing.JLabel typeLabel;
    private javax.swing.JTextField typeTextField;
    // End of variables declaration//GEN-END:variables
}
