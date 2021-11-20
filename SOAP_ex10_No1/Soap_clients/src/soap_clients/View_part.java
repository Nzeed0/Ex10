/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soap_clients;

import java.awt.Color;
import javax.swing.JOptionPane;

/**
 *
 * @author Nzeed
 */
public class View_part extends javax.swing.JFrame {
    Controller_part Controller;

    public View_part() {
        initComponents();
    }
    
    public void SetCtrObject(Controller_part Controller){
        this.Controller = Controller;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Header_Bar = new javax.swing.JLabel();
        CircleAreaBar = new javax.swing.JLabel();
        Circumference_Text_Bar = new javax.swing.JTextField();
        Circle_Area_Text_Bar = new javax.swing.JTextField();
        CircumferenceBar = new javax.swing.JLabel();
        CalArea = new javax.swing.JButton();
        Calference = new javax.swing.JButton();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Header_Bar.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Header_Bar.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Header_Bar.setText("Circle Calculation Menu");

        CircleAreaBar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CircleAreaBar.setText("Calculating Circle Area");

        Circumference_Text_Bar.setForeground(new java.awt.Color(153, 153, 153));
        Circumference_Text_Bar.setText("Please Input radius");
        Circumference_Text_Bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Circumference_Text_BarMouseClicked(evt);
            }
        });

        Circle_Area_Text_Bar.setForeground(new java.awt.Color(153, 153, 153));
        Circle_Area_Text_Bar.setText("Please Input radius");
        Circle_Area_Text_Bar.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                Circle_Area_Text_BarMouseClicked(evt);
            }
        });

        CircumferenceBar.setFont(new java.awt.Font("Tahoma", 0, 18)); // NOI18N
        CircumferenceBar.setText("Calculating Circumference");

        CalArea.setText("Calculate");
        CalArea.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalAreaActionPerformed(evt);
            }
        });

        Calference.setText("Calculate");
        Calference.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                CalferenceActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(CalArea)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(Circle_Area_Text_Bar, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(CircleAreaBar)
                        .addComponent(CircumferenceBar)
                        .addComponent(Circumference_Text_Bar, javax.swing.GroupLayout.PREFERRED_SIZE, 335, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(Calference))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addComponent(Header_Bar, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(Header_Bar)
                .addGap(34, 34, 34)
                .addComponent(CircleAreaBar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Circle_Area_Text_Bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(CalArea)
                .addGap(21, 21, 21)
                .addComponent(CircumferenceBar)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Circumference_Text_Bar, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Calference)
                .addContainerGap(66, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void CalAreaActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalAreaActionPerformed
       String Answer = Controller.Calculating_Circumference(getCircle_Area_Text_Bar());
       pop_up_menu(Answer);
       
    }//GEN-LAST:event_CalAreaActionPerformed

    private void CalferenceActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_CalferenceActionPerformed
       String Answer = Controller.Calculating_Circle_Area(getCircumference_Text_Bar());
       pop_up_menu(Answer);
    }//GEN-LAST:event_CalferenceActionPerformed

    private void Circle_Area_Text_BarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Circle_Area_Text_BarMouseClicked
        Circle_Area_Text_Bar.setText("");
        Circle_Area_Text_Bar.setForeground(Color.black);
    }//GEN-LAST:event_Circle_Area_Text_BarMouseClicked

    private void Circumference_Text_BarMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_Circumference_Text_BarMouseClicked
        Circumference_Text_Bar.setText("");
        Circumference_Text_Bar.setForeground(Color.black);
    }//GEN-LAST:event_Circumference_Text_BarMouseClicked

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton CalArea;
    private javax.swing.JButton Calference;
    private javax.swing.JLabel CircleAreaBar;
    private javax.swing.JTextField Circle_Area_Text_Bar;
    private javax.swing.JLabel CircumferenceBar;
    private javax.swing.JTextField Circumference_Text_Bar;
    private javax.swing.JLabel Header_Bar;
    // End of variables declaration//GEN-END:variables

    private double getCircle_Area_Text_Bar() {
        return Double.parseDouble(Circle_Area_Text_Bar.getText());
    }

    private double getCircumference_Text_Bar() {
        return Double.parseDouble(Circumference_Text_Bar.getText());
    }
    
    private static void pop_up_menu(String Answer_Message){
        JOptionPane.showMessageDialog(null, Answer_Message+" unit", "Answer : ", JOptionPane.INFORMATION_MESSAGE);
    }
}
