package View;

import Controller.*;
import services.Student;

public class View_part extends javax.swing.JFrame {

    Controller_part controller;
    StudentController_Services stucontroller;
    
    public View_part() {
        initComponents();
    }
    
    public void setControllerObj(Controller_part controller, StudentController_Services stucontroller){
        this.controller = controller;
        this.stucontroller = stucontroller;
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        Database_Header = new javax.swing.JLabel();
        InsertDatabase_header = new javax.swing.JLabel();
        UpdateDatabase_header = new javax.swing.JLabel();
        RemoveDatabase_header = new javax.swing.JLabel();
        Insert_name = new javax.swing.JTextField();
        Insert_Gpa = new javax.swing.JTextField();
        Update_Oldname = new javax.swing.JTextField();
        Update_Name = new javax.swing.JTextField();
        Update_Gpa = new javax.swing.JTextField();
        Remove_Name = new javax.swing.JTextField();
        Insert_Button = new javax.swing.JButton();
        Update_Button = new javax.swing.JButton();
        Remove_Button = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        Database_Header.setFont(new java.awt.Font("Tahoma", 1, 24)); // NOI18N
        Database_Header.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        Database_Header.setText("DataBase Controller");

        InsertDatabase_header.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        InsertDatabase_header.setText("Insert to DataBase");

        UpdateDatabase_header.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        UpdateDatabase_header.setText("Update from DataBase");

        RemoveDatabase_header.setFont(new java.awt.Font("Tahoma", 1, 18)); // NOI18N
        RemoveDatabase_header.setText("Remove from DataBase");

        Insert_Button.setText("Insert");
        Insert_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Insert_ButtonActionPerformed(evt);
            }
        });

        Update_Button.setText("Update");
        Update_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Update_ButtonActionPerformed(evt);
            }
        });

        Remove_Button.setText("Remove");
        Remove_Button.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                Remove_ButtonActionPerformed(evt);
            }
        });

        jLabel1.setText("OldName :");

        jLabel2.setText("Gpa :");

        jLabel3.setText("Name :");

        jLabel4.setText("Name :");

        jLabel5.setText("Gpa :");

        jLabel6.setText("Name :");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(Database_Header, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(Remove_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Update_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(Insert_Button, javax.swing.GroupLayout.PREFERRED_SIZE, 73, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel6)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Remove_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Update_Gpa, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Update_Name, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel1)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Update_Oldname, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addComponent(jLabel2)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(Insert_Gpa, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(layout.createSequentialGroup()
                            .addContainerGap()
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(InsertDatabase_header)
                                .addComponent(UpdateDatabase_header)
                                .addComponent(RemoveDatabase_header)))
                        .addGroup(layout.createSequentialGroup()
                            .addGap(25, 25, 25)
                            .addComponent(jLabel3)
                            .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                            .addComponent(Insert_name, javax.swing.GroupLayout.PREFERRED_SIZE, 292, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addContainerGap(14, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addComponent(Database_Header, javax.swing.GroupLayout.PREFERRED_SIZE, 50, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(InsertDatabase_header)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insert_name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel3))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Insert_Gpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Insert_Button)
                .addGap(10, 10, 10)
                .addComponent(UpdateDatabase_header)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update_Oldname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Update_Gpa, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Update_Button)
                .addGap(8, 8, 8)
                .addComponent(RemoveDatabase_header)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(Remove_Name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel6))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(Remove_Button)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void Insert_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Insert_ButtonActionPerformed
        Student stu = new Student();
        stu.setName(getInsert_name());
        stu.setGpa(getInsert_Gpa());
        stucontroller.InsertStudent(stu);
    }//GEN-LAST:event_Insert_ButtonActionPerformed

    private void Update_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Update_ButtonActionPerformed
        Student stu = (Student)((stucontroller.findStudentByName(getUpdate_Oldname())).get(0));
        stu.setName(getUpdate_Name());
        stu.setGpa(getUpdate_Gpa());
        stucontroller.updateStudent(stu);
    }//GEN-LAST:event_Update_ButtonActionPerformed

    private void Remove_ButtonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_Remove_ButtonActionPerformed
        Student stu = (Student)((stucontroller.findStudentByName(getRemove_Name())).get(0));
        stucontroller.removeStudent(stu);
    }//GEN-LAST:event_Remove_ButtonActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JLabel Database_Header;
    private javax.swing.JLabel InsertDatabase_header;
    private javax.swing.JButton Insert_Button;
    private javax.swing.JTextField Insert_Gpa;
    private javax.swing.JTextField Insert_name;
    private javax.swing.JLabel RemoveDatabase_header;
    private javax.swing.JButton Remove_Button;
    private javax.swing.JTextField Remove_Name;
    private javax.swing.JLabel UpdateDatabase_header;
    private javax.swing.JButton Update_Button;
    private javax.swing.JTextField Update_Gpa;
    private javax.swing.JTextField Update_Name;
    private javax.swing.JTextField Update_Oldname;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    // End of variables declaration//GEN-END:variables

    public double getInsert_Gpa() {
        return Double.parseDouble(Insert_Gpa.getText());
    }

    public String getInsert_name() {
        return Insert_name.getText();
    }

    public String getRemove_Name() {
        return Remove_Name.getText();
    }

    public double getUpdate_Gpa() {
        return Double.parseDouble(Update_Gpa.getText());
    }

    public String getUpdate_Name() {
        return Update_Name.getText();
    }

    public String getUpdate_Oldname() {
        return Update_Oldname.getText();
    }
}
