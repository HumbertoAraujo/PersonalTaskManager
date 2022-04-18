/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JDialog.java to edit this template
 */
package view;

import controller.TaskController;
import java.text.SimpleDateFormat;
import java.util.Date;
import javax.swing.JOptionPane;
import model.Project;
import model.Task;

/**
 *
 * @author humberto
 */
public class TaskDialogScreen extends javax.swing.JDialog {

    TaskController controller;
    Project project;

    public TaskDialogScreen(java.awt.Frame parent, boolean modal) {
        super(parent, modal);
        initComponents();

        controller = new TaskController();

    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jPanelToolBar = new javax.swing.JPanel();
        jLabelToolBarTitle = new javax.swing.JLabel();
        jLabelToolBarSave = new javax.swing.JLabel();
        jPanelTask = new javax.swing.JPanel();
        jLabelName = new javax.swing.JLabel();
        jTextFieldName = new javax.swing.JTextField();
        jLabelDescription = new javax.swing.JLabel();
        jScrollPaneDescription = new javax.swing.JScrollPane();
        jTextAreaDescription = new javax.swing.JTextArea();
        jLabelDeadline = new javax.swing.JLabel();
        jLabelNotes = new javax.swing.JLabel();
        jScrollPaneNotes = new javax.swing.JScrollPane();
        jTextAreaNotes = new javax.swing.JTextArea();
        jFormattedTextFieldDeadline = new javax.swing.JFormattedTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setBackground(new java.awt.Color(191, 219, 247));

        jPanelToolBar.setBackground(new java.awt.Color(17, 83, 99));
        jPanelToolBar.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelToolBarTitle.setFont(new java.awt.Font("Chandas", 1, 18)); // NOI18N
        jLabelToolBarTitle.setForeground(new java.awt.Color(225, 229, 242));
        jLabelToolBarTitle.setText(" Tarefa");

        jLabelToolBarSave.setFont(new java.awt.Font("Chandas", 0, 14)); // NOI18N
        jLabelToolBarSave.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabelToolBarSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/IconCheck.png"))); // NOI18N
        jLabelToolBarSave.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        jLabelToolBarSave.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                jLabelToolBarSaveMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout jPanelToolBarLayout = new javax.swing.GroupLayout(jPanelToolBar);
        jPanelToolBar.setLayout(jPanelToolBarLayout);
        jPanelToolBarLayout.setHorizontalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jLabelToolBarTitle, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelToolBarSave)
                .addContainerGap())
        );
        jPanelToolBarLayout.setVerticalGroup(
            jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelToolBarLayout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanelToolBarLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabelToolBarSave, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(jPanelToolBarLayout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(jLabelToolBarTitle)))
                .addContainerGap())
        );

        jPanelTask.setBackground(new java.awt.Color(191, 219, 247));
        jPanelTask.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));

        jLabelName.setBackground(new java.awt.Color(191, 219, 247));
        jLabelName.setFont(new java.awt.Font("Chandas", 0, 14)); // NOI18N
        jLabelName.setForeground(new java.awt.Color(17, 83, 99));
        jLabelName.setText("Nome");
        jLabelName.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jTextFieldName.setBackground(new java.awt.Color(191, 219, 247));
        jTextFieldName.setFont(new java.awt.Font("Chandas", 0, 14)); // NOI18N
        jTextFieldName.setForeground(new java.awt.Color(17, 83, 99));
        jTextFieldName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 83, 99), 3));

        jLabelDescription.setBackground(new java.awt.Color(191, 219, 247));
        jLabelDescription.setFont(new java.awt.Font("Chandas", 0, 14)); // NOI18N
        jLabelDescription.setForeground(new java.awt.Color(17, 83, 99));
        jLabelDescription.setText("Detalhamento");
        jLabelDescription.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jScrollPaneDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 83, 99)));
        jScrollPaneDescription.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 83, 99)));

        jTextAreaDescription.setBackground(new java.awt.Color(191, 219, 247));
        jTextAreaDescription.setColumns(20);
        jTextAreaDescription.setFont(new java.awt.Font("Chandas", 0, 14)); // NOI18N
        jTextAreaDescription.setForeground(new java.awt.Color(17, 83, 99));
        jTextAreaDescription.setRows(5);
        jTextAreaDescription.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 83, 99)));
        jScrollPaneDescription.setViewportView(jTextAreaDescription);

        jLabelDeadline.setBackground(new java.awt.Color(191, 219, 247));
        jLabelDeadline.setFont(new java.awt.Font("Chandas", 0, 14)); // NOI18N
        jLabelDeadline.setForeground(new java.awt.Color(17, 83, 99));
        jLabelDeadline.setText("Prazo dd/MM/aaaa");
        jLabelDeadline.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);

        jLabelNotes.setBackground(new java.awt.Color(191, 219, 247));
        jLabelNotes.setFont(new java.awt.Font("Chandas", 0, 14)); // NOI18N
        jLabelNotes.setForeground(new java.awt.Color(17, 83, 99));
        jLabelNotes.setText("Notas");
        jLabelNotes.setVerticalAlignment(javax.swing.SwingConstants.BOTTOM);
        jLabelNotes.setVerticalTextPosition(javax.swing.SwingConstants.BOTTOM);

        jScrollPaneNotes.setBackground(new java.awt.Color(191, 219, 247));
        jScrollPaneNotes.setForeground(new java.awt.Color(17, 83, 99));
        jScrollPaneNotes.setViewportBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 83, 99)));

        jTextAreaNotes.setBackground(new java.awt.Color(191, 219, 247));
        jTextAreaNotes.setColumns(20);
        jTextAreaNotes.setFont(new java.awt.Font("Chandas", 0, 14)); // NOI18N
        jTextAreaNotes.setForeground(new java.awt.Color(17, 83, 99));
        jTextAreaNotes.setRows(5);
        jTextAreaNotes.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 83, 99)));
        jScrollPaneNotes.setViewportView(jTextAreaNotes);

        jFormattedTextFieldDeadline.setBackground(new java.awt.Color(191, 219, 247));
        jFormattedTextFieldDeadline.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(17, 83, 99), 3));
        jFormattedTextFieldDeadline.setForeground(new java.awt.Color(17, 83, 99));
        jFormattedTextFieldDeadline.setFormatterFactory(new javax.swing.text.DefaultFormatterFactory(new javax.swing.text.DateFormatter(new java.text.SimpleDateFormat("dd/MM/yy"))));
        jFormattedTextFieldDeadline.setSelectedTextColor(new java.awt.Color(225, 229, 242));
        jFormattedTextFieldDeadline.setSelectionColor(new java.awt.Color(17, 83, 99));
        jFormattedTextFieldDeadline.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jFormattedTextFieldDeadlineActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanelTaskLayout = new javax.swing.GroupLayout(jPanelTask);
        jPanelTask.setLayout(jPanelTaskLayout);
        jPanelTaskLayout.setHorizontalGroup(
            jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jLabelName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelDescription, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(jLabelNotes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanelTaskLayout.createSequentialGroup()
                .addGroup(jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jFormattedTextFieldDeadline, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPaneDescription, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 403, Short.MAX_VALUE)
                    .addComponent(jLabelDeadline, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jScrollPaneNotes, javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jTextFieldName, javax.swing.GroupLayout.Alignment.LEADING))
                .addContainerGap())
        );
        jPanelTaskLayout.setVerticalGroup(
            jPanelTaskLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanelTaskLayout.createSequentialGroup()
                .addComponent(jLabelName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jTextFieldName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelDescription)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneDescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jLabelDeadline)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jFormattedTextFieldDeadline, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabelNotes)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPaneNotes, javax.swing.GroupLayout.DEFAULT_SIZE, 100, Short.MAX_VALUE)
                .addGap(8, 8, 8))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jPanelToolBar, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(jPanelTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(jPanelToolBar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanelTask, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addContainerGap())
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void jFormattedTextFieldDeadlineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jFormattedTextFieldDeadlineActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_jFormattedTextFieldDeadlineActionPerformed

    private void jLabelToolBarSaveMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_jLabelToolBarSaveMouseClicked

        if (jTextFieldName.getText().isEmpty() || jFormattedTextFieldDeadline.getText().isEmpty()) {
            JOptionPane.showMessageDialog(rootPane, "Tarefa não salva, pois possui campos vazios!");

        } else {

            try {
                Task task = new Task();
                task.setIdProject(project.getId());
                task.setName(jTextFieldName.getText());
                task.setDescription(jTextAreaDescription.getText());
                task.setNotes(jTextAreaNotes.getText());
                task.setIsCompletd(false);

                SimpleDateFormat dateFormat = new SimpleDateFormat("dd/MM/yyyy");
                Date deadline = null;

                deadline = dateFormat.parse(jFormattedTextFieldDeadline.getText());

                task.setDeadline(deadline);
                controller.save(task);
                JOptionPane.showMessageDialog(rootPane, "Tarefa Salva com Sucesso!");
                this.dispose();

            } catch (Exception e) {
                JOptionPane.showMessageDialog(rootPane, e.getMessage());
            }

        }
    }//GEN-LAST:event_jLabelToolBarSaveMouseClicked

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(TaskDialogScreen.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the dialog */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                TaskDialogScreen dialog = new TaskDialogScreen(new javax.swing.JFrame(), true);
                dialog.addWindowListener(new java.awt.event.WindowAdapter() {
                    @Override
                    public void windowClosing(java.awt.event.WindowEvent e) {
                        System.exit(0);
                    }
                });
                dialog.setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JFormattedTextField jFormattedTextFieldDeadline;
    private javax.swing.JLabel jLabelDeadline;
    private javax.swing.JLabel jLabelDescription;
    private javax.swing.JLabel jLabelName;
    private javax.swing.JLabel jLabelNotes;
    private javax.swing.JLabel jLabelToolBarSave;
    private javax.swing.JLabel jLabelToolBarTitle;
    private javax.swing.JPanel jPanelTask;
    private javax.swing.JPanel jPanelToolBar;
    private javax.swing.JScrollPane jScrollPaneDescription;
    private javax.swing.JScrollPane jScrollPaneNotes;
    private javax.swing.JTextArea jTextAreaDescription;
    private javax.swing.JTextArea jTextAreaNotes;
    private javax.swing.JTextField jTextFieldName;
    // End of variables declaration//GEN-END:variables

    public void setProject(Project project) {
        this.project = project;
    }

}
