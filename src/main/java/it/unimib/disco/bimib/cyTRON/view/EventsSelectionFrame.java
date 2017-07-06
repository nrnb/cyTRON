/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package it.unimib.disco.bimib.cyTRON.view;

import it.unimib.disco.bimib.cyTRON.controller.DatasetController;

public class EventsSelectionFrame extends javax.swing.JFrame {

    private final MainFrame mainFrame;
    private final DatasetController datasetController;
    private final int datasetIndex;

    public EventsSelectionFrame(MainFrame mainFrame, DatasetController datasetController, int datasetIndex) {
        // get the controller
        this.mainFrame = mainFrame;
        this.datasetController = datasetController;
        this.datasetIndex = datasetIndex;
        
        // draw the interface
        initComponents();
    }

    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        typeButtonGroup = new javax.swing.ButtonGroup();
        panel = new javax.swing.JPanel();
        selectButton = new javax.swing.JButton();
        selectedEventsScrollPane = new javax.swing.JScrollPane();
        selectedEventsList = new javax.swing.JList<>();
        selectionLabel = new javax.swing.JLabel();
        frequenceLabel = new javax.swing.JLabel();
        ctrlLabel1 = new javax.swing.JLabel();
        selectedEventsLabel = new javax.swing.JLabel();
        frequenceTextField = new javax.swing.JTextField();
        ctrlLabel2 = new javax.swing.JLabel();
        filteredEventsScrollPane = new javax.swing.JScrollPane();
        filteredEventsList = new javax.swing.JList<>();
        jLabel1 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setTitle("Events Selection");
        setMinimumSize(new java.awt.Dimension(670, 400));
        setSize(new java.awt.Dimension(670, 400));

        selectButton.setText("Select");
        selectButton.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                selectButtonActionPerformed(evt);
            }
        });

        selectedEventsList.setModel(datasetController.getEventsListModel());
        selectedEventsList.setLayoutOrientation(javax.swing.JList.VERTICAL_WRAP);
        selectedEventsScrollPane.setViewportView(selectedEventsList);

        selectionLabel.setFont(new java.awt.Font("Lucida Grande", 1, 13)); // NOI18N
        selectionLabel.setText("Events Selection");

        frequenceLabel.setText("Minimum frequence:");

        ctrlLabel1.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        ctrlLabel1.setText("ctrl/cmd-click to select multiple events");

        selectedEventsLabel.setText("Selected events:");

        ctrlLabel2.setFont(new java.awt.Font("Lucida Grande", 0, 11)); // NOI18N
        ctrlLabel2.setText("ctrl/cmd-click to select multiple events");

        filteredEventsList.setModel(datasetController.getEventsListModel());
        filteredEventsList.setLayoutOrientation(javax.swing.JList.VERTICAL_WRAP);
        filteredEventsScrollPane.setViewportView(filteredEventsList);

        jLabel1.setText("Filtered events:");

        javax.swing.GroupLayout panelLayout = new javax.swing.GroupLayout(panel);
        panel.setLayout(panelLayout);
        panelLayout.setHorizontalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(selectButton))
                    .addGroup(panelLayout.createSequentialGroup()
                        .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(selectedEventsLabel)
                                    .addComponent(jLabel1))
                                .addGap(18, 18, 18)
                                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(filteredEventsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(selectedEventsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 527, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ctrlLabel1)
                                    .addComponent(ctrlLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 209, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(selectionLabel)
                            .addGroup(panelLayout.createSequentialGroup()
                                .addComponent(frequenceLabel)
                                .addGap(18, 18, 18)
                                .addComponent(frequenceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE)))
                .addContainerGap())
        );
        panelLayout.setVerticalGroup(
            panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelLayout.createSequentialGroup()
                .addContainerGap(19, Short.MAX_VALUE)
                .addComponent(selectionLabel)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(frequenceLabel)
                    .addComponent(frequenceTextField, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(selectedEventsLabel)
                    .addComponent(selectedEventsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctrlLabel2)
                .addGap(18, 18, 18)
                .addGroup(panelLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(filteredEventsScrollPane, javax.swing.GroupLayout.PREFERRED_SIZE, 90, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(ctrlLabel1)
                .addGap(18, 18, 18)
                .addComponent(selectButton)
                .addGap(18, 18, 18))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(panel, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void selectButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_selectButtonActionPerformed
        // get the values
        String frequence = frequenceTextField.getText();
        int[] selectedEventsIndex = selectedEventsList.getSelectedIndices();
        int[] filteredEventsIndex = filteredEventsList.getSelectedIndices();
        
        // select the samples
        datasetController.selectEvents(frequence, selectedEventsIndex, filteredEventsIndex, datasetIndex);
        
        // update the main frame
        mainFrame.updateNumberLabels();
        
        // close the frame
        dispose();
    }//GEN-LAST:event_selectButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel ctrlLabel1;
    private javax.swing.JLabel ctrlLabel2;
    private javax.swing.JList<String> filteredEventsList;
    private javax.swing.JScrollPane filteredEventsScrollPane;
    private javax.swing.JLabel frequenceLabel;
    private javax.swing.JTextField frequenceTextField;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JPanel panel;
    private javax.swing.JButton selectButton;
    private javax.swing.JLabel selectedEventsLabel;
    private javax.swing.JList<String> selectedEventsList;
    private javax.swing.JScrollPane selectedEventsScrollPane;
    private javax.swing.JLabel selectionLabel;
    private javax.swing.ButtonGroup typeButtonGroup;
    // End of variables declaration//GEN-END:variables
}
