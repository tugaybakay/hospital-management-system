
package view;

import helper.DbHelper;
import helper.Helper;
import java.util.ArrayList;
import javax.swing.table.DefaultTableModel;
import model.Administrator;
import model.Doctor;
import view.LoginUI;
import java.sql.*;
import model.Clinic;

public class FrmAdministrator extends javax.swing.JFrame {
    
    private Helper helper;
    private DbHelper db = new DbHelper();
    private Statement statement = null;
    private PreparedStatement preparedStatement = null;
    private Connection connection = null;
    private Administrator admin;
    private DefaultTableModel tblmdlDoctorTable = new DefaultTableModel(){
        
        @Override
        public boolean isCellEditable(int row, int column) {
        // Tüm hücreleri düzenlenemez hale getir
        return false;
        }
    };
    private DefaultTableModel tblmdlClinicTable = new DefaultTableModel(){
        
        @Override
        public boolean isCellEditable(int row, int column) {
        // Tüm hücreleri düzenlenemez hale getir
        return false;
        }
    };
    private Object[] colNameDoctor;
    private Object[] colNameClinic;
    
    public FrmAdministrator(Helper helper, Administrator admin) {
        initComponents();
        this.admin = admin;
        this.helper = helper;
        
        lblAdministratorPageTcNo.setText("Tc No = "+admin.getTcNo());
        lblAdministratorPageUserName.setText("Name = "+admin.getName());
        lblAdministratorPageTcNo1.setText("Tc No = "+admin.getTcNo());
        lblAdministratorPageUserName1.setText("Name = "+admin.getName());
        
        colNameDoctor = new Object[6];
        colNameDoctor[0] = "Name";
        colNameDoctor[1] = "Surname";
        colNameDoctor[2] = "Tc No";
        colNameDoctor[3] = "Password";
        colNameDoctor[4] = "Gender";
        colNameDoctor[5] = "Clinic id";
        
        tblmdlDoctorTable.setColumnIdentifiers(colNameDoctor);
        doctorTableUpdate();
        tblAdministorDoctors.setModel(tblmdlDoctorTable);
        
        colNameClinic = new Object[2];
        colNameClinic[0] = "Id";
        colNameClinic[1] = "Name";
        
        tblmdlClinicTable.setColumnIdentifiers(colNameClinic);
        clinicTableUpdate();
        tblAdministorClinics.setModel(tblmdlClinicTable);
        
        comboBoxItemsUptade();
        
    }
    
    public void doctorTableUpdate(){
        
        tblmdlDoctorTable.setRowCount(0);
        ArrayList<Doctor> doctorList = new ArrayList<Doctor>();
        doctorList = admin.getDoctorList(db);
        
        Object[] doctorData = new Object[6];
        for(int i=0;i<doctorList.size();i++){
           
            doctorData[0] = doctorList.get(i).getName();
            doctorData[1] = doctorList.get(i).getSurname();
            doctorData[2] = doctorList.get(i).getTcNo();
            doctorData[3] = doctorList.get(i).getPassword();
            doctorData[4] = doctorList.get(i).getGender();
            doctorData[5] = doctorList.get(i).getClinicId();
            
            tblmdlDoctorTable.addRow(doctorData);
        }
    
    }
    
    public void clinicTableUpdate(){
        
        tblmdlClinicTable.setRowCount(0);
        ArrayList<Clinic> clinicList = new ArrayList<Clinic>();
        clinicList = admin.getClinicList(db);
        
        Object[] clinicData = new Object[2];
        for(int i =0;i<clinicList.size();i++){
            
            clinicData[0] = clinicList.get(i).getId();
            clinicData[1] = clinicList.get(i).getName();
            
            tblmdlClinicTable.addRow(clinicData);
        }
        
    }

    public void comboBoxItemsUptade(){
        cmbbxAddDoctorClinicId.removeAllItems();
        int rowCount = tblmdlClinicTable.getRowCount();
        if(rowCount !=0){
            
            for(int i=0;i<rowCount;i++){
                String clinicId = tblmdlClinicTable.getValueAt(i,0).toString();
                cmbbxAddDoctorClinicId.addItem(clinicId);
            }
        }
        
    }
    
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttngrpAddDoctorGender = new javax.swing.ButtonGroup();
        jTabbedPane4 = new javax.swing.JTabbedPane();
        jPanel10 = new javax.swing.JPanel();
        pnlAdministratorDoctorAddUpdateDelete4 = new keeptoo.KGradientPanel();
        tbbdpnAddDeleteUpdateDoctor = new javax.swing.JTabbedPane();
        pnlAddDoctor = new javax.swing.JPanel();
        txtfldAddDoctorName = new javax.swing.JTextField();
        txtfldAddDoctorSurname = new javax.swing.JTextField();
        txtfldAddDoctorTcNo = new javax.swing.JTextField();
        psswrdfldAddDoctorPassword = new javax.swing.JPasswordField();
        bttnAddDoctor = new javax.swing.JButton();
        lblAddDoctorPassword = new javax.swing.JLabel();
        lblAddDoctorTcNo = new javax.swing.JLabel();
        lblAddDoctorSurname = new javax.swing.JLabel();
        lblAddDoctorName = new javax.swing.JLabel();
        lblAddDoctor = new javax.swing.JLabel();
        rdbttnAddDoctorMale = new javax.swing.JRadioButton();
        rdbttnAddDoctorFemale = new javax.swing.JRadioButton();
        cmbbxAddDoctorClinicId = new javax.swing.JComboBox<>();
        lblAddDoctorTcNo1 = new javax.swing.JLabel();
        pnlDeleteDoctor = new javax.swing.JPanel();
        txtfldDeleteDoctorName = new javax.swing.JTextField();
        txtfldDeleteDoctorSurname = new javax.swing.JTextField();
        txtfldDeleteDoctorTcNo = new javax.swing.JTextField();
        psswrdfldDeleteDoctorPassword = new javax.swing.JPasswordField();
        bttnDeleteDoctor = new javax.swing.JButton();
        lblDeleteDoctorPassword = new javax.swing.JLabel();
        lblDeleteDoctorTcNo = new javax.swing.JLabel();
        lblDeleteSurname = new javax.swing.JLabel();
        lblDeleteDoctorName = new javax.swing.JLabel();
        lblDeleteDoctor = new javax.swing.JLabel();
        rdbttnDeleteDoctorMale = new javax.swing.JRadioButton();
        rdbttnDeleteDoctorFemale = new javax.swing.JRadioButton();
        lblAdministratorPageUserName = new javax.swing.JLabel();
        lblAdministratorPageTcNo = new javax.swing.JLabel();
        jButton1 = new javax.swing.JButton();
        pnlAdministrator = new javax.swing.JPanel();
        scrllpnAdministrator = new javax.swing.JScrollPane();
        tblAdministorDoctors = new javax.swing.JTable();
        jPanel2 = new javax.swing.JPanel();
        pnlAdministratorClinicAddDelete = new keeptoo.KGradientPanel();
        tbbdpnClinicAddDelete = new javax.swing.JTabbedPane();
        pnlAddClinic = new javax.swing.JPanel();
        txtfldAddClinicName = new javax.swing.JTextField();
        bttnAddClinic = new javax.swing.JButton();
        lblAddClinicName = new javax.swing.JLabel();
        lblAddClinic = new javax.swing.JLabel();
        pnlDeleteClinic = new javax.swing.JPanel();
        txtfldDeleteClinicName = new javax.swing.JTextField();
        bttnDeleteClinic = new javax.swing.JButton();
        lblDeleteClinicName = new javax.swing.JLabel();
        lblDeleteClinic = new javax.swing.JLabel();
        txtfldDeleteClinicId = new javax.swing.JTextField();
        lblDeleteClinicId = new javax.swing.JLabel();
        lblAdministratorPageUserName1 = new javax.swing.JLabel();
        lblAdministratorPageTcNo1 = new javax.swing.JLabel();
        bttnLogOutClinics = new javax.swing.JButton();
        pnlAdministratorClinic = new javax.swing.JPanel();
        scrllpnAdministratorClinic = new javax.swing.JScrollPane();
        tblAdministorClinics = new javax.swing.JTable();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setBackground(new java.awt.Color(255, 255, 255));
        setResizable(false);

        pnlAdministratorDoctorAddUpdateDelete4.setkEndColor(new java.awt.Color(0, 204, 204));
        pnlAdministratorDoctorAddUpdateDelete4.setkGradientFocus(200);
        pnlAdministratorDoctorAddUpdateDelete4.setkStartColor(new java.awt.Color(153, 0, 153));

        pnlAddDoctor.setBackground(new java.awt.Color(255, 255, 255));

        txtfldAddDoctorName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));

        txtfldAddDoctorSurname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));

        txtfldAddDoctorTcNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));

        psswrdfldAddDoctorPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));

        bttnAddDoctor.setBackground(new java.awt.Color(19, 91, 160));
        bttnAddDoctor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttnAddDoctor.setForeground(new java.awt.Color(255, 255, 255));
        bttnAddDoctor.setText("ADD");
        bttnAddDoctor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnAddDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAddDoctorActionPerformed(evt);
            }
        });

        lblAddDoctorPassword.setForeground(new java.awt.Color(19, 91, 160));
        lblAddDoctorPassword.setText("Password");

        lblAddDoctorTcNo.setForeground(new java.awt.Color(19, 91, 160));
        lblAddDoctorTcNo.setText("Clinic ID");

        lblAddDoctorSurname.setForeground(new java.awt.Color(19, 91, 160));
        lblAddDoctorSurname.setText("Surname");

        lblAddDoctorName.setForeground(new java.awt.Color(19, 91, 160));
        lblAddDoctorName.setText("Name");

        lblAddDoctor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblAddDoctor.setForeground(new java.awt.Color(19, 91, 160));
        lblAddDoctor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddDoctor.setText("Add Doctor");

        bttngrpAddDoctorGender.add(rdbttnAddDoctorMale);
        rdbttnAddDoctorMale.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        rdbttnAddDoctorMale.setForeground(new java.awt.Color(19, 91, 160));
        rdbttnAddDoctorMale.setText("Male");

        bttngrpAddDoctorGender.add(rdbttnAddDoctorFemale);
        rdbttnAddDoctorFemale.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        rdbttnAddDoctorFemale.setForeground(new java.awt.Color(19, 91, 160));
        rdbttnAddDoctorFemale.setText("Female");

        cmbbxAddDoctorClinicId.setForeground(new java.awt.Color(19, 91, 160));
        cmbbxAddDoctorClinicId.setSelectedIndex(-1);
        cmbbxAddDoctorClinicId.setPreferredSize(new java.awt.Dimension(72, 24));

        lblAddDoctorTcNo1.setForeground(new java.awt.Color(19, 91, 160));
        lblAddDoctorTcNo1.setText("Tc No");

        javax.swing.GroupLayout pnlAddDoctorLayout = new javax.swing.GroupLayout(pnlAddDoctor);
        pnlAddDoctor.setLayout(pnlAddDoctorLayout);
        pnlAddDoctorLayout.setHorizontalGroup(
            pnlAddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddDoctorLayout.createSequentialGroup()
                .addGroup(pnlAddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddDoctorLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(pnlAddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlAddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlAddDoctorLayout.createSequentialGroup()
                                    .addGap(9, 9, 9)
                                    .addComponent(rdbttnAddDoctorMale, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rdbttnAddDoctorFemale)
                                    .addGap(19, 19, 19))
                                .addComponent(bttnAddDoctor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addComponent(psswrdfldAddDoctorPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtfldAddDoctorTcNo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtfldAddDoctorSurname, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtfldAddDoctorName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblAddDoctorSurname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblAddDoctorTcNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblAddDoctorPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(cmbbxAddDoctorClinicId, javax.swing.GroupLayout.PREFERRED_SIZE, 188, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(lblAddDoctorTcNo1, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(pnlAddDoctorLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lblAddDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlAddDoctorLayout.setVerticalGroup(
            pnlAddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddDoctorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblAddDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddDoctorName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfldAddDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAddDoctorSurname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfldAddDoctorSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblAddDoctorTcNo1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfldAddDoctorTcNo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblAddDoctorTcNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(cmbbxAddDoctorClinicId, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblAddDoctorPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(psswrdfldAddDoctorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(pnlAddDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbttnAddDoctorMale)
                    .addComponent(rdbttnAddDoctorFemale))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(bttnAddDoctor)
                .addGap(15, 15, 15))
        );

        tbbdpnAddDeleteUpdateDoctor.addTab("Add", pnlAddDoctor);

        pnlDeleteDoctor.setBackground(new java.awt.Color(255, 255, 255));

        txtfldDeleteDoctorName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));
        txtfldDeleteDoctorName.setEnabled(false);

        txtfldDeleteDoctorSurname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));
        txtfldDeleteDoctorSurname.setEnabled(false);
        txtfldDeleteDoctorSurname.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldDeleteDoctorSurnameActionPerformed(evt);
            }
        });

        txtfldDeleteDoctorTcNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));

        psswrdfldDeleteDoctorPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));
        psswrdfldDeleteDoctorPassword.setEnabled(false);

        bttnDeleteDoctor.setBackground(new java.awt.Color(19, 91, 160));
        bttnDeleteDoctor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        bttnDeleteDoctor.setForeground(new java.awt.Color(255, 255, 255));
        bttnDeleteDoctor.setText("DELETE");
        bttnDeleteDoctor.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnDeleteDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnDeleteDoctorActionPerformed(evt);
            }
        });

        lblDeleteDoctorPassword.setForeground(new java.awt.Color(19, 91, 160));
        lblDeleteDoctorPassword.setText("Password");

        lblDeleteDoctorTcNo.setForeground(new java.awt.Color(19, 91, 160));
        lblDeleteDoctorTcNo.setText("Tc No");

        lblDeleteSurname.setForeground(new java.awt.Color(19, 91, 160));
        lblDeleteSurname.setText("Surname");

        lblDeleteDoctorName.setForeground(new java.awt.Color(19, 91, 160));
        lblDeleteDoctorName.setText("Name");

        lblDeleteDoctor.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        lblDeleteDoctor.setForeground(new java.awt.Color(19, 91, 160));
        lblDeleteDoctor.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDeleteDoctor.setText("Delete Doctor");

        bttngrpAddDoctorGender.add(rdbttnDeleteDoctorMale);
        rdbttnDeleteDoctorMale.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        rdbttnDeleteDoctorMale.setForeground(new java.awt.Color(19, 91, 160));
        rdbttnDeleteDoctorMale.setText("Male");
        rdbttnDeleteDoctorMale.setEnabled(false);

        bttngrpAddDoctorGender.add(rdbttnDeleteDoctorFemale);
        rdbttnDeleteDoctorFemale.setFont(new java.awt.Font("Segoe UI", 2, 12)); // NOI18N
        rdbttnDeleteDoctorFemale.setForeground(new java.awt.Color(19, 91, 160));
        rdbttnDeleteDoctorFemale.setText("Female");
        rdbttnDeleteDoctorFemale.setEnabled(false);

        javax.swing.GroupLayout pnlDeleteDoctorLayout = new javax.swing.GroupLayout(pnlDeleteDoctor);
        pnlDeleteDoctor.setLayout(pnlDeleteDoctorLayout);
        pnlDeleteDoctorLayout.setHorizontalGroup(
            pnlDeleteDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDeleteDoctorLayout.createSequentialGroup()
                .addGroup(pnlDeleteDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDeleteDoctorLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(pnlDeleteDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDeleteDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(pnlDeleteDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addGroup(javax.swing.GroupLayout.Alignment.LEADING, pnlDeleteDoctorLayout.createSequentialGroup()
                                    .addGap(11, 11, 11)
                                    .addComponent(rdbttnDeleteDoctorMale, javax.swing.GroupLayout.PREFERRED_SIZE, 58, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                    .addComponent(rdbttnDeleteDoctorFemale)
                                    .addGap(27, 27, 27))
                                .addComponent(bttnDeleteDoctor, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addComponent(psswrdfldDeleteDoctorPassword, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtfldDeleteDoctorTcNo, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtfldDeleteDoctorSurname, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtfldDeleteDoctorName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDeleteSurname, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDeleteDoctorTcNo, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 67, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addComponent(lblDeleteDoctorPassword, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(pnlDeleteDoctorLayout.createSequentialGroup()
                        .addGap(67, 67, 67)
                        .addComponent(lblDeleteDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 110, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlDeleteDoctorLayout.setVerticalGroup(
            pnlDeleteDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDeleteDoctorLayout.createSequentialGroup()
                .addGap(23, 23, 23)
                .addComponent(lblDeleteDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDeleteDoctorName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfldDeleteDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(lblDeleteSurname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtfldDeleteDoctorSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDeleteDoctorTcNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfldDeleteDoctorTcNo, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDeleteDoctorPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(psswrdfldDeleteDoctorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 17, Short.MAX_VALUE)
                .addGroup(pnlDeleteDoctorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbttnDeleteDoctorMale)
                    .addComponent(rdbttnDeleteDoctorFemale))
                .addGap(18, 18, 18)
                .addComponent(bttnDeleteDoctor)
                .addGap(36, 36, 36))
        );

        tbbdpnAddDeleteUpdateDoctor.addTab("Delete", pnlDeleteDoctor);

        lblAdministratorPageUserName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAdministratorPageUserName.setForeground(new java.awt.Color(255, 255, 255));
        lblAdministratorPageUserName.setText("User Name = ");

        lblAdministratorPageTcNo.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAdministratorPageTcNo.setForeground(new java.awt.Color(255, 255, 255));
        lblAdministratorPageTcNo.setText("TC NO = ");

        jButton1.setBackground(new java.awt.Color(153, 0, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        jButton1.setForeground(new java.awt.Color(255, 255, 255));
        jButton1.setText("LOG OUT");
        jButton1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton1ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAdministratorDoctorAddUpdateDelete4Layout = new javax.swing.GroupLayout(pnlAdministratorDoctorAddUpdateDelete4);
        pnlAdministratorDoctorAddUpdateDelete4.setLayout(pnlAdministratorDoctorAddUpdateDelete4Layout);
        pnlAdministratorDoctorAddUpdateDelete4Layout.setHorizontalGroup(
            pnlAdministratorDoctorAddUpdateDelete4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdministratorDoctorAddUpdateDelete4Layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlAdministratorDoctorAddUpdateDelete4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbbdpnAddDeleteUpdateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlAdministratorDoctorAddUpdateDelete4Layout.createSequentialGroup()
                        .addGroup(pnlAdministratorDoctorAddUpdateDelete4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAdministratorPageTcNo, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(lblAdministratorPageUserName, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(jButton1)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlAdministratorDoctorAddUpdateDelete4Layout.setVerticalGroup(
            pnlAdministratorDoctorAddUpdateDelete4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdministratorDoctorAddUpdateDelete4Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlAdministratorDoctorAddUpdateDelete4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(pnlAdministratorDoctorAddUpdateDelete4Layout.createSequentialGroup()
                        .addComponent(lblAdministratorPageTcNo)
                        .addGap(18, 18, 18)
                        .addComponent(lblAdministratorPageUserName))
                    .addComponent(jButton1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbbdpnAddDeleteUpdateDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 454, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );

        pnlAdministrator.setBackground(new java.awt.Color(255, 255, 255));

        scrllpnAdministrator.setBackground(new java.awt.Color(255, 255, 255));

        tblAdministorDoctors.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblAdministorDoctors.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAdministorDoctorsMouseClicked(evt);
            }
        });
        scrllpnAdministrator.setViewportView(tblAdministorDoctors);

        javax.swing.GroupLayout pnlAdministratorLayout = new javax.swing.GroupLayout(pnlAdministrator);
        pnlAdministrator.setLayout(pnlAdministratorLayout);
        pnlAdministratorLayout.setHorizontalGroup(
            pnlAdministratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdministratorLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrllpnAdministrator, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAdministratorLayout.setVerticalGroup(
            pnlAdministratorLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdministratorLayout.createSequentialGroup()
                .addContainerGap(27, Short.MAX_VALUE)
                .addComponent(scrllpnAdministrator, javax.swing.GroupLayout.PREFERRED_SIZE, 550, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel10Layout = new javax.swing.GroupLayout(jPanel10);
        jPanel10.setLayout(jPanel10Layout);
        jPanel10Layout.setHorizontalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel10Layout.createSequentialGroup()
                .addComponent(pnlAdministratorDoctorAddUpdateDelete4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(pnlAdministrator, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE))
        );
        jPanel10Layout.setVerticalGroup(
            jPanel10Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAdministratorDoctorAddUpdateDelete4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlAdministrator, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Doctor", jPanel10);

        pnlAdministratorClinicAddDelete.setkEndColor(new java.awt.Color(0, 204, 204));
        pnlAdministratorClinicAddDelete.setkGradientFocus(200);
        pnlAdministratorClinicAddDelete.setkStartColor(new java.awt.Color(153, 0, 153));

        pnlAddClinic.setBackground(new java.awt.Color(255, 255, 255));

        txtfldAddClinicName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtfldAddClinicName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));

        bttnAddClinic.setBackground(new java.awt.Color(19, 91, 160));
        bttnAddClinic.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnAddClinic.setForeground(new java.awt.Color(255, 255, 255));
        bttnAddClinic.setText("ADD");
        bttnAddClinic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnAddClinic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAddClinicActionPerformed(evt);
            }
        });

        lblAddClinicName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblAddClinicName.setForeground(new java.awt.Color(19, 91, 160));
        lblAddClinicName.setText("Clinic Name");

        lblAddClinic.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblAddClinic.setForeground(new java.awt.Color(19, 91, 160));
        lblAddClinic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblAddClinic.setText("Add Clinic");

        javax.swing.GroupLayout pnlAddClinicLayout = new javax.swing.GroupLayout(pnlAddClinic);
        pnlAddClinic.setLayout(pnlAddClinicLayout);
        pnlAddClinicLayout.setHorizontalGroup(
            pnlAddClinicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddClinicLayout.createSequentialGroup()
                .addGroup(pnlAddClinicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlAddClinicLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(pnlAddClinicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(bttnAddClinic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                            .addComponent(txtfldAddClinicName, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblAddClinicName, javax.swing.GroupLayout.Alignment.LEADING)))
                    .addGroup(pnlAddClinicLayout.createSequentialGroup()
                        .addGap(58, 58, 58)
                        .addComponent(lblAddClinic, javax.swing.GroupLayout.PREFERRED_SIZE, 131, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlAddClinicLayout.setVerticalGroup(
            pnlAddClinicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAddClinicLayout.createSequentialGroup()
                .addGap(54, 54, 54)
                .addComponent(lblAddClinic, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(45, 45, 45)
                .addComponent(lblAddClinicName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(txtfldAddClinicName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(61, 61, 61)
                .addComponent(bttnAddClinic, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(110, Short.MAX_VALUE))
        );

        tbbdpnClinicAddDelete.addTab("Add", pnlAddClinic);

        pnlDeleteClinic.setBackground(new java.awt.Color(255, 255, 255));

        txtfldDeleteClinicName.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtfldDeleteClinicName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));

        bttnDeleteClinic.setBackground(new java.awt.Color(19, 91, 160));
        bttnDeleteClinic.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        bttnDeleteClinic.setForeground(new java.awt.Color(255, 255, 255));
        bttnDeleteClinic.setText("DELETE");
        bttnDeleteClinic.setCursor(new java.awt.Cursor(java.awt.Cursor.HAND_CURSOR));
        bttnDeleteClinic.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnDeleteClinicActionPerformed(evt);
            }
        });

        lblDeleteClinicName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDeleteClinicName.setForeground(new java.awt.Color(19, 91, 160));
        lblDeleteClinicName.setText("Clinic Name");

        lblDeleteClinic.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblDeleteClinic.setForeground(new java.awt.Color(19, 91, 160));
        lblDeleteClinic.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDeleteClinic.setText("Delete Clinic");

        txtfldDeleteClinicId.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        txtfldDeleteClinicId.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));

        lblDeleteClinicId.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblDeleteClinicId.setForeground(new java.awt.Color(19, 91, 160));
        lblDeleteClinicId.setText("Clinic Id");

        javax.swing.GroupLayout pnlDeleteClinicLayout = new javax.swing.GroupLayout(pnlDeleteClinic);
        pnlDeleteClinic.setLayout(pnlDeleteClinicLayout);
        pnlDeleteClinicLayout.setHorizontalGroup(
            pnlDeleteClinicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDeleteClinicLayout.createSequentialGroup()
                .addGroup(pnlDeleteClinicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlDeleteClinicLayout.createSequentialGroup()
                        .addGap(52, 52, 52)
                        .addComponent(lblDeleteClinic))
                    .addGroup(pnlDeleteClinicLayout.createSequentialGroup()
                        .addGap(34, 34, 34)
                        .addGroup(pnlDeleteClinicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblDeleteClinicId)
                            .addGroup(pnlDeleteClinicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                                .addComponent(bttnDeleteClinic, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 188, Short.MAX_VALUE)
                                .addComponent(txtfldDeleteClinicName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(lblDeleteClinicName, javax.swing.GroupLayout.Alignment.LEADING)
                                .addComponent(txtfldDeleteClinicId)))))
                .addContainerGap(30, Short.MAX_VALUE))
        );
        pnlDeleteClinicLayout.setVerticalGroup(
            pnlDeleteClinicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDeleteClinicLayout.createSequentialGroup()
                .addGap(44, 44, 44)
                .addComponent(lblDeleteClinic, javax.swing.GroupLayout.PREFERRED_SIZE, 49, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(31, 31, 31)
                .addComponent(lblDeleteClinicName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfldDeleteClinicName, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 48, Short.MAX_VALUE)
                .addComponent(lblDeleteClinicId)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfldDeleteClinicId, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(47, 47, 47)
                .addComponent(bttnDeleteClinic, javax.swing.GroupLayout.PREFERRED_SIZE, 35, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(40, 40, 40))
        );

        tbbdpnClinicAddDelete.addTab("Delete", pnlDeleteClinic);

        lblAdministratorPageUserName1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAdministratorPageUserName1.setForeground(new java.awt.Color(255, 255, 255));
        lblAdministratorPageUserName1.setText("User Name = ");

        lblAdministratorPageTcNo1.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        lblAdministratorPageTcNo1.setForeground(new java.awt.Color(255, 255, 255));
        lblAdministratorPageTcNo1.setText("TC NO = ");

        bttnLogOutClinics.setBackground(new java.awt.Color(153, 0, 153));
        bttnLogOutClinics.setFont(new java.awt.Font("Segoe UI", 1, 12)); // NOI18N
        bttnLogOutClinics.setForeground(new java.awt.Color(255, 255, 255));
        bttnLogOutClinics.setText("LOG OUT");
        bttnLogOutClinics.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnLogOutClinicsActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAdministratorClinicAddDeleteLayout = new javax.swing.GroupLayout(pnlAdministratorClinicAddDelete);
        pnlAdministratorClinicAddDelete.setLayout(pnlAdministratorClinicAddDeleteLayout);
        pnlAdministratorClinicAddDeleteLayout.setHorizontalGroup(
            pnlAdministratorClinicAddDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdministratorClinicAddDeleteLayout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(pnlAdministratorClinicAddDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(tbbdpnClinicAddDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 252, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlAdministratorClinicAddDeleteLayout.createSequentialGroup()
                        .addGroup(pnlAdministratorClinicAddDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                            .addComponent(lblAdministratorPageTcNo1, javax.swing.GroupLayout.DEFAULT_SIZE, 142, Short.MAX_VALUE)
                            .addComponent(lblAdministratorPageUserName1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(bttnLogOutClinics)))
                .addContainerGap(24, Short.MAX_VALUE))
        );
        pnlAdministratorClinicAddDeleteLayout.setVerticalGroup(
            pnlAdministratorClinicAddDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdministratorClinicAddDeleteLayout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addGroup(pnlAdministratorClinicAddDeleteLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(bttnLogOutClinics, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlAdministratorClinicAddDeleteLayout.createSequentialGroup()
                        .addComponent(lblAdministratorPageTcNo1)
                        .addGap(18, 18, 18)
                        .addComponent(lblAdministratorPageUserName1)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(tbbdpnClinicAddDelete, javax.swing.GroupLayout.PREFERRED_SIZE, 457, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        pnlAdministratorClinic.setBackground(new java.awt.Color(255, 255, 255));

        scrllpnAdministratorClinic.setBackground(new java.awt.Color(255, 255, 255));

        tblAdministorClinics.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {

            }
        ));
        tblAdministorClinics.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblAdministorClinicsMouseClicked(evt);
            }
        });
        scrllpnAdministratorClinic.setViewportView(tblAdministorClinics);

        javax.swing.GroupLayout pnlAdministratorClinicLayout = new javax.swing.GroupLayout(pnlAdministratorClinic);
        pnlAdministratorClinic.setLayout(pnlAdministratorClinicLayout);
        pnlAdministratorClinicLayout.setHorizontalGroup(
            pnlAdministratorClinicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdministratorClinicLayout.createSequentialGroup()
                .addContainerGap()
                .addComponent(scrllpnAdministratorClinic, javax.swing.GroupLayout.DEFAULT_SIZE, 612, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlAdministratorClinicLayout.setVerticalGroup(
            pnlAdministratorClinicLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdministratorClinicLayout.createSequentialGroup()
                .addContainerGap(26, Short.MAX_VALUE)
                .addComponent(scrllpnAdministratorClinic, javax.swing.GroupLayout.PREFERRED_SIZE, 551, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10))
        );

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addComponent(pnlAdministratorClinicAddDelete, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, Short.MAX_VALUE)
                .addComponent(pnlAdministratorClinic, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(pnlAdministratorClinicAddDelete, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
            .addComponent(pnlAdministratorClinic, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        jTabbedPane4.addTab("Clinic", jPanel2);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane4)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void bttnLogOutClinicsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnLogOutClinicsActionPerformed
        LoginUI frmLogin = new LoginUI();
        frmLogin.setLocation(getLocation());
        frmLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_bttnLogOutClinicsActionPerformed
    
    private void jButton1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton1ActionPerformed
        LoginUI frmLogin = new LoginUI();
        frmLogin.setLocation(getLocation());
        frmLogin.setVisible(true);
        dispose();
    }//GEN-LAST:event_jButton1ActionPerformed

    private void txtfldDeleteDoctorSurnameActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldDeleteDoctorSurnameActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldDeleteDoctorSurnameActionPerformed

    private void bttnAddClinicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAddClinicActionPerformed
        
        String clinicName = txtfldAddClinicName.getText();
        if(clinicName.length()==0){
            helper.error("empty");
        }
        else{
            String sqlQuery = "select * from clinics where name_=\""+clinicName+"\";";
            try{
                connection = db.connect();
                statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sqlQuery);
                if(result.next()){
                    helper.error("already");
                }else{
                    sqlQuery = "insert into clinics(name_) values(?);";
                    preparedStatement = connection.prepareStatement(sqlQuery);
                    preparedStatement.setString(1, clinicName);
                    preparedStatement.executeUpdate();
                    helper.error("succes");
                    clinicTableUpdate();
                    txtfldAddClinicName.setText(null);
                }
            }catch(SQLException e){
                e.printStackTrace();
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
        comboBoxItemsUptade();
    }//GEN-LAST:event_bttnAddClinicActionPerformed

    private void tblAdministorClinicsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdministorClinicsMouseClicked
        
        if(tbbdpnClinicAddDelete.getSelectedIndex()==1){ 
            int selectedRow = tblAdministorClinics.getSelectedRow();
            txtfldDeleteClinicName.setText(tblmdlClinicTable.getValueAt(selectedRow, 1).toString());
            txtfldDeleteClinicId.setText(tblmdlClinicTable.getValueAt(selectedRow, 0).toString());
        }
        
    }//GEN-LAST:event_tblAdministorClinicsMouseClicked

    private void bttnDeleteClinicActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnDeleteClinicActionPerformed
        
        String deleteClinicId = txtfldDeleteClinicId.getText();
        
        if(deleteClinicId.length()==0){
            helper.error("empty");
        }else{
            if(Clinic.deleteClinic(db, helper, deleteClinicId)){
                clinicTableUpdate();
                txtfldDeleteClinicName.setText(null);
                txtfldDeleteClinicId.setText(null);
            }
        }
        comboBoxItemsUptade();
    }//GEN-LAST:event_bttnDeleteClinicActionPerformed

    private void bttnAddDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAddDoctorActionPerformed
        
        String addDoctorName = txtfldAddDoctorName.getText();
        String addDoctorSurname = txtfldAddDoctorSurname.getText();
        String addDoctorTcNo = txtfldAddDoctorTcNo.getText();
        String addDoctorPassword = psswrdfldAddDoctorPassword.getText();
        int addDoctorClinicId = Integer.parseInt(cmbbxAddDoctorClinicId.getSelectedItem().toString());
        String addDoctorGender;
        if(rdbttnAddDoctorMale.isSelected())addDoctorGender="male";
        else addDoctorGender="female";
        
        if(cmbbxAddDoctorClinicId.getSelectedItem()==null || addDoctorName.length()==0 || addDoctorSurname.length()==0 || addDoctorTcNo.length()==0 || addDoctorPassword.length()==0 || (!rdbttnAddDoctorMale.isSelected() && !rdbttnAddDoctorFemale.isSelected())){
            helper.error("empty");
        }
        else{
            
            if(Doctor.addDoctor(db, addDoctorName, addDoctorName, addDoctorTcNo, addDoctorPassword, addDoctorGender,addDoctorClinicId)){
                helper.error("succes");
                doctorTableUpdate();
                txtfldAddDoctorName.setText(null);
                txtfldAddDoctorSurname.setText(null);
                txtfldAddDoctorTcNo.setText(null);
                psswrdfldAddDoctorPassword.setText(null);
                rdbttnAddDoctorMale.setSelected(false);
                rdbttnAddDoctorFemale.setSelected(false);
                cmbbxAddDoctorClinicId.setSelectedIndex(-1);
            }else{
                helper.error("db");
            }
        
        }
    }//GEN-LAST:event_bttnAddDoctorActionPerformed

    private void bttnDeleteDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnDeleteDoctorActionPerformed
        
        String deleteDoctorTcNo = txtfldDeleteDoctorTcNo.getText();
        
        if(deleteDoctorTcNo.length()==0){
            helper.error("empty");
        }else{
            if(Doctor.deleteDoctor(db, deleteDoctorTcNo)){
                helper.error("deleteSucces");
                doctorTableUpdate();
                txtfldDeleteDoctorName.setText(null);
                txtfldDeleteDoctorSurname.setText(null);
                txtfldDeleteDoctorTcNo.setText(null);
                psswrdfldDeleteDoctorPassword.setText(null);
                rdbttnDeleteDoctorMale.setSelected(false);
                rdbttnDeleteDoctorFemale.setSelected(false);
            }
            else{
                helper.error("already");
            }
        }
    }//GEN-LAST:event_bttnDeleteDoctorActionPerformed

    private void tblAdministorDoctorsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblAdministorDoctorsMouseClicked
        
        int selectedTab = tbbdpnAddDeleteUpdateDoctor.getSelectedIndex();
        int selectedRow = tblAdministorDoctors.getSelectedRow();
        
        switch(selectedTab){
            case 1:
                txtfldDeleteDoctorName.setText(tblmdlDoctorTable.getValueAt(selectedRow,0).toString());
                txtfldDeleteDoctorSurname.setText(tblAdministorDoctors.getValueAt(selectedRow, 1).toString());
                txtfldDeleteDoctorTcNo.setText(tblAdministorDoctors.getValueAt(selectedRow, 2).toString());
                psswrdfldDeleteDoctorPassword.setText(tblmdlDoctorTable.getValueAt(selectedRow, 3).toString());
                if("male".equals(tblmdlDoctorTable.getValueAt(selectedRow,4).toString()))rdbttnDeleteDoctorMale.setSelected(true);
                else rdbttnDeleteDoctorFemale.setSelected(true);
                break;
        
            
                
        
        }
    }//GEN-LAST:event_tblAdministorDoctorsMouseClicked

    public static void main(String args[]) {
      
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
            java.util.logging.Logger.getLogger(FrmAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(FrmAdministrator.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnAddClinic;
    private javax.swing.JButton bttnAddDoctor;
    private javax.swing.JButton bttnDeleteClinic;
    private javax.swing.JButton bttnDeleteDoctor;
    private javax.swing.JButton bttnLogOutClinics;
    private javax.swing.ButtonGroup bttngrpAddDoctorGender;
    private javax.swing.JComboBox<String> cmbbxAddDoctorClinicId;
    private javax.swing.JButton jButton1;
    private javax.swing.JPanel jPanel10;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JTabbedPane jTabbedPane4;
    private javax.swing.JLabel lblAddClinic;
    private javax.swing.JLabel lblAddClinicName;
    private javax.swing.JLabel lblAddDoctor;
    private javax.swing.JLabel lblAddDoctorName;
    private javax.swing.JLabel lblAddDoctorPassword;
    private javax.swing.JLabel lblAddDoctorSurname;
    private javax.swing.JLabel lblAddDoctorTcNo;
    private javax.swing.JLabel lblAddDoctorTcNo1;
    private javax.swing.JLabel lblAdministratorPageTcNo;
    private javax.swing.JLabel lblAdministratorPageTcNo1;
    private javax.swing.JLabel lblAdministratorPageUserName;
    private javax.swing.JLabel lblAdministratorPageUserName1;
    private javax.swing.JLabel lblDeleteClinic;
    private javax.swing.JLabel lblDeleteClinicId;
    private javax.swing.JLabel lblDeleteClinicName;
    private javax.swing.JLabel lblDeleteDoctor;
    private javax.swing.JLabel lblDeleteDoctorName;
    private javax.swing.JLabel lblDeleteDoctorPassword;
    private javax.swing.JLabel lblDeleteDoctorTcNo;
    private javax.swing.JLabel lblDeleteSurname;
    private javax.swing.JPanel pnlAddClinic;
    private javax.swing.JPanel pnlAddDoctor;
    private javax.swing.JPanel pnlAdministrator;
    private javax.swing.JPanel pnlAdministratorClinic;
    private keeptoo.KGradientPanel pnlAdministratorClinicAddDelete;
    private keeptoo.KGradientPanel pnlAdministratorDoctorAddUpdateDelete4;
    private javax.swing.JPanel pnlDeleteClinic;
    private javax.swing.JPanel pnlDeleteDoctor;
    private javax.swing.JPasswordField psswrdfldAddDoctorPassword;
    private javax.swing.JPasswordField psswrdfldDeleteDoctorPassword;
    private javax.swing.JRadioButton rdbttnAddDoctorFemale;
    private javax.swing.JRadioButton rdbttnAddDoctorMale;
    private javax.swing.JRadioButton rdbttnDeleteDoctorFemale;
    private javax.swing.JRadioButton rdbttnDeleteDoctorMale;
    private javax.swing.JScrollPane scrllpnAdministrator;
    private javax.swing.JScrollPane scrllpnAdministratorClinic;
    private javax.swing.JTabbedPane tbbdpnAddDeleteUpdateDoctor;
    private javax.swing.JTabbedPane tbbdpnClinicAddDelete;
    private javax.swing.JTable tblAdministorClinics;
    private javax.swing.JTable tblAdministorDoctors;
    private javax.swing.JTextField txtfldAddClinicName;
    private javax.swing.JTextField txtfldAddDoctorName;
    private javax.swing.JTextField txtfldAddDoctorSurname;
    private javax.swing.JTextField txtfldAddDoctorTcNo;
    private javax.swing.JTextField txtfldDeleteClinicId;
    private javax.swing.JTextField txtfldDeleteClinicName;
    private javax.swing.JTextField txtfldDeleteDoctorName;
    private javax.swing.JTextField txtfldDeleteDoctorSurname;
    private javax.swing.JTextField txtfldDeleteDoctorTcNo;
    // End of variables declaration//GEN-END:variables
}
