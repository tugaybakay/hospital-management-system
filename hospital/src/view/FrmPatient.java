/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package view;

import helper.DbHelper;
import helper.Helper;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.crypto.AEADBadTagException;
import javax.swing.ComboBoxModel;
import javax.swing.DefaultComboBoxModel;
import javax.swing.*;
import model.Clinic;
import model.Patient;
/**
 *
 * @author x
 */
public class FrmPatient extends javax.swing.JFrame {

    private Patient patient;
    private DbHelper db = new DbHelper();
    private Helper helper = new Helper();
    private DefaultTableModel tblmdlAvaliableAppointmens = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            // Tüm hücreleri düzenlenemez yapmak için false döndürün
            return false;
            }
    };
    private DefaultTableModel tblmdlPatientAppointmens = new DefaultTableModel(){
        @Override
        public boolean isCellEditable(int row, int column) {
            // Tüm hücreleri düzenlenemez yapmak için false döndürün
            return false;
            }
    };
    private Object[] colPatientAppointmentName = new Object[4];
    private Object[] colAvaliableAppointmentName = new Object[4];
    private DefaultComboBoxModel<Clinic> defaultComboBoxModel = new DefaultComboBoxModel<Clinic>();

    
    public FrmPatient(Patient patient) {
        initComponents();
        lblPatientName.setText(lblPatientName.getText() + patient.getName());
        lblPatientTcNo.setText(lblPatientTcNo.getText() + patient.getTcNo());
        this.patient = patient;
        updateComboBoxClinics();
        cmbbxGetAppointmentClinics.setModel((ComboBoxModel)defaultComboBoxModel);
        colAvaliableAppointmentName[0] = "id";
        colAvaliableAppointmentName[1] = "Doctor";
        colAvaliableAppointmentName[2] = "Hour";
        colAvaliableAppointmentName[3] = "Date";
        tblmdlAvaliableAppointmens.setColumnIdentifiers(colAvaliableAppointmentName);
        tblAvaliableHours.setModel(tblmdlAvaliableAppointmens);
        
        colPatientAppointmentName[0] = "id";
        colPatientAppointmentName[1] = "Doctor id";
        colPatientAppointmentName[2] = "Date id";
        colPatientAppointmentName[3] = "Explanation";
        tblmdlPatientAppointmens.setColumnIdentifiers(colPatientAppointmentName);
        tblPatientAppointments.setModel(tblmdlPatientAppointmens);
        availableAppointmentTableUpdate();
        updateAppointments();
        
        
    }
    
    public void updateAppointments(){
        Connection connection = null;
        Statement statement = null;
        String sqlQuery = "select * from appointment where patient_id_="+patient.getId()+";";
        try{
            connection = db.connect();
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sqlQuery);
            Object[] row = new Object[4];
            while(result.next()){
                row[0] = result.getInt("id");
                row[1] = result.getInt("doctor_id_");
                row[2] = result.getInt("date_time_id_");
                row[3] = result.getString("explanation");
                tblmdlPatientAppointmens.addRow(row);
                System.out.println(sqlQuery);
            }
        }catch(SQLException e){
            helper.error("db");
        }finally{
            try{
                statement.close();
                connection.close();
            }catch(SQLException e){
                helper.error("db");
            }
        }
    }
    
    public void updateComboBoxClinics(){
        Connection connection = null;
        Statement statement = null;
        String sqlQuery = "select * from clinics;";
        try{
            connection = db.connect();
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sqlQuery);
            while(result.next()){
                defaultComboBoxModel.addElement(new Clinic(result.getInt("id_"),result.getString("name_")));
            }
        }catch(SQLException e){
            helper.error("db");
        }finally{
            try{
                statement.close();
                connection.close();
            }catch(SQLException e){
                helper.error("db");
            }
        }
    }
    
    public void availableAppointmentTableUpdate(){
        tblmdlAvaliableAppointmens.setRowCount(0);
        Clinic clinicId  = (Clinic) cmbbxGetAppointmentClinics.getSelectedItem();
        
        Connection connection = null;
        Statement statement = null;
        String sqlQuery = "select * from hours where flag_=0 and doctor_id_ in(select doctor_id_ from doctors where clinic_id_="+clinicId.getId()+");";
        try{
            connection = db.connect();
            statement = connection.createStatement();
            ResultSet result = statement.executeQuery(sqlQuery);
            Object[] row = new Object[4];
            while(result.next()){
                row[0] = result.getInt("id_");
                row[1] = result.getString("doctor_id_");
                row[2] = result.getString("hour_");
                row[3] = result.getString("date_");
                tblmdlAvaliableAppointmens.addRow(row);
            }
        }catch(SQLException e){
            e.printStackTrace();
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        kGradientPanel1 = new keeptoo.KGradientPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblPatientAppointments = new javax.swing.JTable();
        jScrollPane2 = new javax.swing.JScrollPane();
        tblAvaliableHours = new javax.swing.JTable();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        cmbbxGetAppointmentClinics = new javax.swing.JComboBox<>();
        lblPatientGetAppointment = new javax.swing.JLabel();
        bttnGetAppointment = new javax.swing.JButton();
        txtfldGetAppointmentId = new javax.swing.JTextField();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtrGetAppointmentExplanation = new javax.swing.JTextArea();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        lblPatientDeleteAppointment = new javax.swing.JLabel();
        txtfldDeleteAppointmentId = new javax.swing.JTextField();
        bttnDeleteAppointment = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        lblPatientTcNo = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setkGradientFocus(200);
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 0, 153));

        tblPatientAppointments.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblPatientAppointments.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblPatientAppointmentsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblPatientAppointments);

        tblAvaliableHours.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null},
                {null, null, null, null}
            },
            new String [] {
                "Title 1", "Title 2", "Title 3", "Title 4"
            }
        ));
        tblAvaliableHours.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAvaliableHoursMouseClicked(evt);
            }
        });
        jScrollPane2.setViewportView(tblAvaliableHours);

        jPanel1.setBackground(new java.awt.Color(255, 255, 255));

        cmbbxGetAppointmentClinics.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "19", "20", "21", "22" }));
        cmbbxGetAppointmentClinics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cmbbxGetAppointmentClinicsActionPerformed(evt);
            }
        });

        lblPatientGetAppointment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPatientGetAppointment.setForeground(new java.awt.Color(19, 91, 160));
        lblPatientGetAppointment.setText("GET APPOINTMENT");

        bttnGetAppointment.setBackground(new java.awt.Color(19, 91, 160));
        bttnGetAppointment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttnGetAppointment.setForeground(new java.awt.Color(255, 255, 255));
        bttnGetAppointment.setText("BOOK");
        bttnGetAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnGetAppointmentActionPerformed(evt);
            }
        });

        txtfldGetAppointmentId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));
        txtfldGetAppointmentId.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldGetAppointmentIdActionPerformed(evt);
            }
        });

        txtrGetAppointmentExplanation.setColumns(20);
        txtrGetAppointmentExplanation.setLineWrap(true);
        txtrGetAppointmentExplanation.setRows(5);
        txtrGetAppointmentExplanation.setBorder(null);
        jScrollPane3.setViewportView(txtrGetAppointmentExplanation);

        jLabel2.setForeground(new java.awt.Color(19, 91, 160));
        jLabel2.setText("Clinic");

        jLabel3.setForeground(new java.awt.Color(19, 91, 160));
        jLabel3.setText("Id");

        jLabel4.setForeground(new java.awt.Color(19, 91, 160));
        jLabel4.setText("Explanation");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblPatientGetAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(cmbbxGetAppointmentClinics, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(txtfldGetAppointmentId)
                        .addComponent(bttnGetAppointment, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE))
                    .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(41, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(20, 20, 20)
                .addComponent(lblPatientGetAppointment)
                .addGap(9, 9, 9)
                .addComponent(jLabel2)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(cmbbxGetAppointmentClinics, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel3)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(txtfldGetAppointmentId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jLabel4)
                .addGap(4, 4, 4)
                .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 116, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttnGetAppointment)
                .addGap(20, 20, 20))
        );

        jTabbedPane1.addTab("Add", jPanel1);

        jPanel2.setBackground(new java.awt.Color(255, 255, 255));

        lblPatientDeleteAppointment.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        lblPatientDeleteAppointment.setForeground(new java.awt.Color(19, 91, 160));
        lblPatientDeleteAppointment.setText("DELETE APPOINTMENT");

        txtfldDeleteAppointmentId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));

        bttnDeleteAppointment.setBackground(new java.awt.Color(19, 91, 160));
        bttnDeleteAppointment.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttnDeleteAppointment.setForeground(new java.awt.Color(255, 255, 255));
        bttnDeleteAppointment.setText("DELETE");
        bttnDeleteAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnDeleteAppointmentActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(22, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(bttnDeleteAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtfldDeleteAppointmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 198, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblPatientDeleteAppointment))
                .addGap(17, 17, 17))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addContainerGap(70, Short.MAX_VALUE)
                .addComponent(lblPatientDeleteAppointment)
                .addGap(55, 55, 55)
                .addComponent(txtfldDeleteAppointmentId, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(57, 57, 57)
                .addComponent(bttnDeleteAppointment, javax.swing.GroupLayout.PREFERRED_SIZE, 39, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(67, 67, 67))
        );

        jTabbedPane1.addTab("Delete", jPanel2);

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setForeground(new java.awt.Color(255, 255, 255));
        jLabel5.setText("Available Appointments");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setForeground(new java.awt.Color(255, 255, 255));
        jLabel6.setText(" Appointments");

        lblPatientName.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblPatientName.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientName.setText("Name = ");

        lblPatientTcNo.setFont(new java.awt.Font("Segoe UI", 3, 14)); // NOI18N
        lblPatientTcNo.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientTcNo.setText("Tc No = ");

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(27, 27, 27)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblPatientName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jTabbedPane1)
                    .addComponent(lblPatientTcNo, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(29, 29, 29)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 333, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 381, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addContainerGap(14, Short.MAX_VALUE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(101, 101, 101)
                        .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 174, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jLabel6)
                        .addGap(161, 161, 161))))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6)
                    .addComponent(lblPatientName))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addComponent(lblPatientTcNo)
                        .addGap(18, 18, 18)
                        .addComponent(jTabbedPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jScrollPane1)
                    .addComponent(jScrollPane2))
                .addContainerGap(21, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnGetAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnGetAppointmentActionPerformed
        Clinic selectedClinic = (Clinic) cmbbxGetAppointmentClinics.getSelectedItem();
        int clinicId = selectedClinic.getId();
        String explanation = txtrGetAppointmentExplanation.getText();
        String hourId = txtfldGetAppointmentId.getText();
        int doctorId = 0;
        if(explanation.length()==0 ||hourId.length()==0){
            helper.error("empty");
        }else{
            Connection connection = null;
            Statement statement = null;
            Statement statement2 = null;
            PreparedStatement preparedStatement = null;
            String sqlQuery = "select * from hours where flag_=0 and doctor_id_ in(select doctor_id_ from doctors where clinic_id_="+clinicId+");";
            try{
                connection = db.connect();
                statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sqlQuery);
                if(!result.next()){
                    helper.error("nope");     
                }else{
                    sqlQuery = "select doctor_id_ from hours where id_="+hourId+";";
                    statement2 = connection.createStatement();
                    ResultSet result2 = statement2.executeQuery(sqlQuery);
                    
                    if(result2.next()){
                        doctorId = result.getInt("doctor_id_");
                    }
                    sqlQuery = "update hours set flag_=1 where id_="+hourId+";";
                    System.out.println(sqlQuery);
                    preparedStatement = connection.prepareStatement(sqlQuery);
                    preparedStatement.executeUpdate();
                    sqlQuery = "insert into appointment(doctor_id_,patient_id_,date_time_id_,explanation) values(?,?,?,?);";
                    System.out.println(sqlQuery);
                    preparedStatement = connection.prepareStatement(sqlQuery);
                    preparedStatement.setInt(1,doctorId);
                    preparedStatement.setInt(2, patient.getId());
                    preparedStatement.setString(3,hourId);
                    preparedStatement.setString(4,explanation);
                    preparedStatement.executeUpdate();
                    helper.equals("succes");
                }
            }catch(SQLException e){
                helper.error("db");
            }finally{
                try {
                    connection.close();
                    statement.close();
                    preparedStatement.close();
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
            }
        }
        availableAppointmentTableUpdate();
    }//GEN-LAST:event_bttnGetAppointmentActionPerformed

    private void cmbbxGetAppointmentClinicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cmbbxGetAppointmentClinicsActionPerformed
        availableAppointmentTableUpdate();
    }//GEN-LAST:event_cmbbxGetAppointmentClinicsActionPerformed

    private void txtfldGetAppointmentIdActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldGetAppointmentIdActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldGetAppointmentIdActionPerformed

    private void tblAvaliableHoursMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAvaliableHoursMouseClicked
        int selectedRow = tblAvaliableHours.getSelectedRow();
        txtfldGetAppointmentId.setText(tblmdlAvaliableAppointmens.getValueAt(selectedRow, 0).toString());
    }//GEN-LAST:event_tblAvaliableHoursMouseClicked

    private void bttnDeleteAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnDeleteAppointmentActionPerformed
        String id = txtfldDeleteAppointmentId.getText();
        if(id.length()==0){
            helper.error("empty");
        }else{
            Connection connection = null;
            Statement statement = null;
            PreparedStatement preparedStatement = null;
            String sqlQuery = "select * from appointment where id="+id+";";
            try{
                connection = db.connect();
                statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sqlQuery);
                if(!result.next()){
                    helper.error("nope");
                }
                else{
                    sqlQuery = "delete from appointment where id="+id.replace('"','ü')+";";
                    preparedStatement = connection.prepareStatement(sqlQuery);
                    preparedStatement.executeUpdate();
                    updateAppointments();
                }
            }catch(SQLException e){
                e.printStackTrace();
            }finally{
                try{
                    connection.close();
                    statement.close();
                    if(preparedStatement!=null)preparedStatement.close();
                }catch(SQLException e){
                    helper.error("db");
                }
            }
        }  
    }//GEN-LAST:event_bttnDeleteAppointmentActionPerformed

    private void tblPatientAppointmentsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblPatientAppointmentsMouseClicked
       int selectedRow = tblPatientAppointments.getSelectedRow();
       txtfldDeleteAppointmentId.setText(tblmdlPatientAppointmens.getValueAt(selectedRow, 0).toString());

    }//GEN-LAST:event_tblPatientAppointmentsMouseClicked

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
            java.util.logging.Logger.getLogger(FrmPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmPatient.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
               
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnDeleteAppointment;
    private javax.swing.JButton bttnGetAppointment;
    private javax.swing.JComboBox<String> cmbbxGetAppointmentClinics;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private keeptoo.KGradientPanel kGradientPanel1;
    private javax.swing.JLabel lblPatientDeleteAppointment;
    private javax.swing.JLabel lblPatientGetAppointment;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPatientTcNo;
    private javax.swing.JTable tblAvaliableHours;
    private javax.swing.JTable tblPatientAppointments;
    private javax.swing.JTextField txtfldDeleteAppointmentId;
    private javax.swing.JTextField txtfldGetAppointmentId;
    private javax.swing.JTextArea txtrGetAppointmentExplanation;
    // End of variables declaration//GEN-END:variables
}
