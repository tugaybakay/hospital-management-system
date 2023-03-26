
package view;

import helper.DbHelper;
import helper.Helper;
import java.awt.Cursor;
import javax.swing.ImageIcon;
import java.sql.*;
import java.util.logging.Level;
import java.util.logging.Logger;
import model.Administrator;
import model.Doctor;
import model.Patient;


public class LoginUI extends javax.swing.JFrame {
    private DbHelper db = new DbHelper();
    Helper helper = new Helper();
    
    public LoginUI() {
        initComponents();
        Cursor cursor = new Cursor(Cursor.HAND_CURSOR);
        bttnAdministratorLogin.setCursor(cursor);
        pnlDoctorLoginButton.setCursor(cursor);
        ImageIcon frmLoginIcon = new ImageIcon("frmLoginIcon.png");
        setIconImage(frmLoginIcon.getImage());
    }

   
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        bttngrpAddPatientGender = new javax.swing.ButtonGroup();
        kGradientPanel1 = new keeptoo.KGradientPanel();
        tbbdpnDoctor = new javax.swing.JTabbedPane();
        pnlPatientLogin = new javax.swing.JPanel();
        txtfldAddPatientName = new javax.swing.JTextField();
        txtfldAddPatientSurname = new javax.swing.JTextField();
        txtfldAddPatientTcNo = new javax.swing.JTextField();
        kGradientPanel2 = new keeptoo.KGradientPanel();
        kGradientPanel3 = new keeptoo.KGradientPanel();
        jLabel1 = new javax.swing.JLabel();
        lblSignUpName = new javax.swing.JLabel();
        lblSignUpSurname = new javax.swing.JLabel();
        lblSignUpTcNo = new javax.swing.JLabel();
        lblPassword = new javax.swing.JLabel();
        psswrdfldAddPatientPassword = new javax.swing.JPasswordField();
        lblSignUp = new javax.swing.JLabel();
        rdbttnAddPatientMale = new javax.swing.JRadioButton();
        rdbttnAddPatientFemale = new javax.swing.JRadioButton();
        pnlLoginPatient = new javax.swing.JPanel();
        txtfldPatientTcNo = new javax.swing.JTextField();
        psswrdfldPatientPassword = new javax.swing.JPasswordField();
        pnlPatientLoginButton = new keeptoo.KGradientPanel();
        lblPatientLogin = new javax.swing.JLabel();
        lblPatientWelcome = new javax.swing.JLabel();
        lblPatientName = new javax.swing.JLabel();
        lblPatientSurname = new javax.swing.JLabel();
        lblPatientPassword = new javax.swing.JLabel();
        txtfldPatientName = new javax.swing.JTextField();
        lblPatientLoginWarning = new javax.swing.JLabel();
        lblPatientLoginIcon = new javax.swing.JLabel();
        pnlDoctorLogin = new javax.swing.JPanel();
        txtfldDoctorTcNo = new javax.swing.JTextField();
        psswrdfldDoctorPassword = new javax.swing.JPasswordField();
        pnlDoctorLoginButton = new keeptoo.KGradientPanel();
        lblDoctorLogin = new javax.swing.JLabel();
        lblDoctorWelcome = new javax.swing.JLabel();
        lblDoctorName = new javax.swing.JLabel();
        lblDoctorTcNo = new javax.swing.JLabel();
        lblDoctorPassword = new javax.swing.JLabel();
        txtfldDoctorName = new javax.swing.JTextField();
        lblDoctorLoginWarning = new javax.swing.JLabel();
        lblDoctorLogibIcon = new javax.swing.JLabel();
        pnlAdministratorLogin = new javax.swing.JPanel();
        txtfldAdministratorUserName = new javax.swing.JTextField();
        psswrdfldAdministratorPassword = new javax.swing.JPasswordField();
        jLabel3 = new javax.swing.JLabel();
        lblAdministratorLoginUserName = new javax.swing.JLabel();
        lblAdministratorLoginPassword = new javax.swing.JLabel();
        bttnAdministratorLogin = new javax.swing.JButton();
        lblLoginPageIcon = new javax.swing.JLabel();
        lblLoginExit = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("Appa Hospital");
        setResizable(false);
        setSize(new java.awt.Dimension(780, 700));

        kGradientPanel1.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel1.setkGradientFocus(50);
        kGradientPanel1.setkStartColor(new java.awt.Color(153, 0, 153));

        tbbdpnDoctor.setForeground(new java.awt.Color(51, 51, 51));
        tbbdpnDoctor.setFont(new java.awt.Font("SimSun", 2, 10)); // NOI18N

        pnlPatientLogin.setBackground(new java.awt.Color(255, 255, 255));

        txtfldAddPatientName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));

        txtfldAddPatientSurname.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));

        txtfldAddPatientTcNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));

        javax.swing.GroupLayout kGradientPanel2Layout = new javax.swing.GroupLayout(kGradientPanel2);
        kGradientPanel2.setLayout(kGradientPanel2Layout);
        kGradientPanel2Layout.setHorizontalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );
        kGradientPanel2Layout.setVerticalGroup(
            kGradientPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 0, Short.MAX_VALUE)
        );

        kGradientPanel3.setkEndColor(new java.awt.Color(0, 204, 204));
        kGradientPanel3.setkGradientFocus(150);
        kGradientPanel3.setkStartColor(new java.awt.Color(153, 0, 153));
        kGradientPanel3.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                kGradientPanel3MouseClicked(evt);
            }
        });
        kGradientPanel3.setLayout(null);

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 18)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(255, 255, 255));
        jLabel1.setText("CONTINUE");
        kGradientPanel3.add(jLabel1);
        jLabel1.setBounds(70, 10, 100, 20);

        lblSignUpName.setForeground(new java.awt.Color(19, 91, 160));
        lblSignUpName.setText("Name");

        lblSignUpSurname.setForeground(new java.awt.Color(19, 91, 160));
        lblSignUpSurname.setText("Surname");

        lblSignUpTcNo.setForeground(new java.awt.Color(19, 91, 160));
        lblSignUpTcNo.setText("TC No");

        lblPassword.setForeground(new java.awt.Color(19, 91, 160));
        lblPassword.setText("Password");

        psswrdfldAddPatientPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));

        lblSignUp.setFont(new java.awt.Font("Times New Roman", 0, 23)); // NOI18N
        lblSignUp.setForeground(new java.awt.Color(19, 91, 160));
        lblSignUp.setText("<html>\nSign up\n<br>\nWelcome to Appa Hospital\n</html>");

        bttngrpAddPatientGender.add(rdbttnAddPatientMale);
        rdbttnAddPatientMale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbttnAddPatientMale.setForeground(new java.awt.Color(19, 91, 160));
        rdbttnAddPatientMale.setText("Male");

        bttngrpAddPatientGender.add(rdbttnAddPatientFemale);
        rdbttnAddPatientFemale.setFont(new java.awt.Font("Segoe UI", 0, 14)); // NOI18N
        rdbttnAddPatientFemale.setForeground(new java.awt.Color(19, 91, 160));
        rdbttnAddPatientFemale.setText("Female");

        javax.swing.GroupLayout pnlPatientLoginLayout = new javax.swing.GroupLayout(pnlPatientLogin);
        pnlPatientLogin.setLayout(pnlPatientLoginLayout);
        pnlPatientLoginLayout.setHorizontalGroup(
            pnlPatientLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPatientLoginLayout.createSequentialGroup()
                .addGroup(pnlPatientLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlPatientLoginLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(lblSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPatientLoginLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblSignUpName))
                    .addGroup(pnlPatientLoginLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(txtfldAddPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPatientLoginLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblSignUpSurname))
                    .addGroup(pnlPatientLoginLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(txtfldAddPatientSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPatientLoginLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblSignUpTcNo))
                    .addGroup(pnlPatientLoginLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(txtfldAddPatientTcNo, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPatientLoginLayout.createSequentialGroup()
                        .addGap(60, 60, 60)
                        .addComponent(lblPassword))
                    .addGroup(pnlPatientLoginLayout.createSequentialGroup()
                        .addGap(50, 50, 50)
                        .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(pnlPatientLoginLayout.createSequentialGroup()
                        .addGap(56, 56, 56)
                        .addGroup(pnlPatientLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(pnlPatientLoginLayout.createSequentialGroup()
                                .addComponent(rdbttnAddPatientMale, javax.swing.GroupLayout.PREFERRED_SIZE, 82, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(rdbttnAddPatientFemale, javax.swing.GroupLayout.PREFERRED_SIZE, 98, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(14, 14, 14))
                            .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(psswrdfldAddPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGap(66, 66, 66))
        );
        pnlPatientLoginLayout.setVerticalGroup(
            pnlPatientLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlPatientLoginLayout.createSequentialGroup()
                .addGap(10, 10, 10)
                .addComponent(lblSignUp, javax.swing.GroupLayout.PREFERRED_SIZE, 80, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblSignUpName)
                .addGap(4, 4, 4)
                .addComponent(txtfldAddPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblSignUpSurname)
                .addGap(4, 4, 4)
                .addComponent(txtfldAddPatientSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblSignUpTcNo)
                .addGap(4, 4, 4)
                .addComponent(txtfldAddPatientTcNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(lblPassword)
                .addGap(4, 4, 4)
                .addComponent(psswrdfldAddPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(pnlPatientLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(rdbttnAddPatientMale)
                    .addComponent(rdbttnAddPatientFemale))
                .addGap(26, 26, 26)
                .addComponent(kGradientPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(21, 21, 21)
                .addComponent(kGradientPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(34, Short.MAX_VALUE))
        );

        tbbdpnDoctor.addTab("Sign up", pnlPatientLogin);

        pnlLoginPatient.setBackground(new java.awt.Color(255, 255, 255));
        pnlLoginPatient.setForeground(new java.awt.Color(19, 91, 160));
        pnlLoginPatient.setToolTipText("");

        txtfldPatientTcNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));
        txtfldPatientTcNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldPatientTcNoActionPerformed(evt);
            }
        });

        psswrdfldPatientPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));

        pnlPatientLoginButton.setForeground(new java.awt.Color(186, 11, 197));
        pnlPatientLoginButton.setToolTipText("");
        pnlPatientLoginButton.setkEndColor(new java.awt.Color(0, 204, 204));
        pnlPatientLoginButton.setkGradientFocus(150);
        pnlPatientLoginButton.setkStartColor(new java.awt.Color(153, 0, 153));
        pnlPatientLoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlPatientLoginButtonMouseClicked(evt);
            }
        });

        lblPatientLogin.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblPatientLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblPatientLogin.setText("LOGIN");

        javax.swing.GroupLayout pnlPatientLoginButtonLayout = new javax.swing.GroupLayout(pnlPatientLoginButton);
        pnlPatientLoginButton.setLayout(pnlPatientLoginButtonLayout);
        pnlPatientLoginButtonLayout.setHorizontalGroup(
            pnlPatientLoginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlPatientLoginButtonLayout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(lblPatientLogin)
                .addGap(97, 97, 97))
        );
        pnlPatientLoginButtonLayout.setVerticalGroup(
            pnlPatientLoginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblPatientLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        lblPatientWelcome.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        lblPatientWelcome.setForeground(new java.awt.Color(19, 91, 160));
        lblPatientWelcome.setText("<html> Welcome to our Hospital <br>your health is entrusted to us </html>");

        lblPatientName.setForeground(new java.awt.Color(19, 91, 160));
        lblPatientName.setText("Name");

        lblPatientSurname.setForeground(new java.awt.Color(19, 91, 160));
        lblPatientSurname.setText("TC No");

        lblPatientPassword.setForeground(new java.awt.Color(19, 91, 160));
        lblPatientPassword.setText("Password");

        txtfldPatientName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));

        lblPatientLoginWarning.setFont(new java.awt.Font("Sylfaen", 2, 12)); // NOI18N
        lblPatientLoginWarning.setForeground(new java.awt.Color(19, 91, 160));
        lblPatientLoginWarning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblPatientLoginWarning.setText("if you don't have an account, you can sign up");

        lblPatientLoginIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons8-patient-oxygen-mask-100.png"))); // NOI18N

        javax.swing.GroupLayout pnlLoginPatientLayout = new javax.swing.GroupLayout(pnlLoginPatient);
        pnlLoginPatient.setLayout(pnlLoginPatientLayout);
        pnlLoginPatientLayout.setHorizontalGroup(
            pnlLoginPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginPatientLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnlLoginPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(lblPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPatientSurname, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(psswrdfldPatientPassword, javax.swing.GroupLayout.DEFAULT_SIZE, 266, Short.MAX_VALUE)
                        .addComponent(txtfldPatientTcNo)
                        .addComponent(txtfldPatientName)
                        .addComponent(pnlPatientLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(pnlLoginPatientLayout.createSequentialGroup()
                        .addComponent(lblPatientWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 144, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblPatientLoginIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginPatientLayout.createSequentialGroup()
                .addContainerGap(23, Short.MAX_VALUE)
                .addComponent(lblPatientLoginWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 329, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(14, 14, 14))
        );
        pnlLoginPatientLayout.setVerticalGroup(
            pnlLoginPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlLoginPatientLayout.createSequentialGroup()
                .addGroup(pnlLoginPatientLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(pnlLoginPatientLayout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addComponent(lblPatientWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 132, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 26, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlLoginPatientLayout.createSequentialGroup()
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(lblPatientLoginIcon)
                        .addGap(43, 43, 43)))
                .addComponent(lblPatientName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfldPatientName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblPatientSurname)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfldPatientTcNo, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(20, 20, 20)
                .addComponent(lblPatientPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(psswrdfldPatientPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(39, 39, 39)
                .addComponent(pnlPatientLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblPatientLoginWarning)
                .addGap(44, 44, 44))
        );

        tbbdpnDoctor.addTab("Patient", pnlLoginPatient);

        pnlDoctorLogin.setBackground(new java.awt.Color(255, 255, 255));
        pnlDoctorLogin.setForeground(new java.awt.Color(19, 91, 160));

        txtfldDoctorTcNo.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));
        txtfldDoctorTcNo.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtfldDoctorTcNoActionPerformed(evt);
            }
        });

        psswrdfldDoctorPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));

        pnlDoctorLoginButton.setkEndColor(new java.awt.Color(0, 204, 204));
        pnlDoctorLoginButton.setkGradientFocus(150);
        pnlDoctorLoginButton.setkStartColor(new java.awt.Color(153, 0, 153));
        pnlDoctorLoginButton.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                pnlDoctorLoginButtonMouseClicked(evt);
            }
        });

        lblDoctorLogin.setFont(new java.awt.Font("Segoe UI", 1, 22)); // NOI18N
        lblDoctorLogin.setForeground(new java.awt.Color(255, 255, 255));
        lblDoctorLogin.setText("LOGIN");

        javax.swing.GroupLayout pnlDoctorLoginButtonLayout = new javax.swing.GroupLayout(pnlDoctorLoginButton);
        pnlDoctorLoginButton.setLayout(pnlDoctorLoginButtonLayout);
        pnlDoctorLoginButtonLayout.setHorizontalGroup(
            pnlDoctorLoginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoctorLoginButtonLayout.createSequentialGroup()
                .addGap(104, 104, 104)
                .addComponent(lblDoctorLogin)
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlDoctorLoginButtonLayout.setVerticalGroup(
            pnlDoctorLoginButtonLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(lblDoctorLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 40, Short.MAX_VALUE)
        );

        lblDoctorWelcome.setFont(new java.awt.Font("Segoe UI", 0, 22)); // NOI18N
        lblDoctorWelcome.setForeground(new java.awt.Color(19, 91, 160));
        lblDoctorWelcome.setText("<html> Welcome to our Hospital <br> Doctor </html>");

        lblDoctorName.setForeground(new java.awt.Color(19, 91, 160));
        lblDoctorName.setText("Name");

        lblDoctorTcNo.setForeground(new java.awt.Color(19, 91, 160));
        lblDoctorTcNo.setText("TC No");

        lblDoctorPassword.setForeground(new java.awt.Color(19, 91, 160));
        lblDoctorPassword.setText("Password");

        txtfldDoctorName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));

        lblDoctorLoginWarning.setFont(new java.awt.Font("Sylfaen", 2, 12)); // NOI18N
        lblDoctorLoginWarning.setForeground(new java.awt.Color(19, 91, 160));
        lblDoctorLoginWarning.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblDoctorLoginWarning.setText("if you can't login, you may to consult your administrator");

        lblDoctorLogibIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons8-stethoscope-96.png"))); // NOI18N

        javax.swing.GroupLayout pnlDoctorLoginLayout = new javax.swing.GroupLayout(pnlDoctorLogin);
        pnlDoctorLogin.setLayout(pnlDoctorLoginLayout);
        pnlDoctorLoginLayout.setHorizontalGroup(
            pnlDoctorLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoctorLoginLayout.createSequentialGroup()
                .addGap(50, 50, 50)
                .addGroup(pnlDoctorLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(lblDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 37, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoctorTcNo, javax.swing.GroupLayout.PREFERRED_SIZE, 47, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoctorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 74, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(pnlDoctorLoginLayout.createSequentialGroup()
                        .addComponent(lblDoctorWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 169, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(lblDoctorLogibIcon))
                    .addComponent(txtfldDoctorTcNo)
                    .addComponent(psswrdfldDoctorPassword)
                    .addComponent(pnlDoctorLoginButton, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(txtfldDoctorName))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlDoctorLoginLayout.createSequentialGroup()
                .addContainerGap(18, Short.MAX_VALUE)
                .addComponent(lblDoctorLoginWarning, javax.swing.GroupLayout.PREFERRED_SIZE, 342, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap())
        );
        pnlDoctorLoginLayout.setVerticalGroup(
            pnlDoctorLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlDoctorLoginLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(pnlDoctorLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(lblDoctorWelcome, javax.swing.GroupLayout.PREFERRED_SIZE, 107, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblDoctorLogibIcon))
                .addGap(43, 43, 43)
                .addComponent(lblDoctorName)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfldDoctorName, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblDoctorTcNo)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(txtfldDoctorTcNo, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(lblDoctorPassword)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(psswrdfldDoctorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(46, 46, 46)
                .addComponent(pnlDoctorLoginButton, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(26, 26, 26)
                .addComponent(lblDoctorLoginWarning)
                .addContainerGap(41, Short.MAX_VALUE))
        );

        tbbdpnDoctor.addTab("Doctor", pnlDoctorLogin);

        pnlAdministratorLogin.setBackground(new java.awt.Color(255, 255, 255));

        txtfldAdministratorUserName.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        txtfldAdministratorUserName.setToolTipText("");
        txtfldAdministratorUserName.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));

        psswrdfldAdministratorPassword.setFont(new java.awt.Font("Segoe UI", 0, 18)); // NOI18N
        psswrdfldAdministratorPassword.setBorder(javax.swing.BorderFactory.createMatteBorder(0, 0, 2, 0, new java.awt.Color(19, 91, 160)));

        jLabel3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/icons8-doctors-bag-80.png"))); // NOI18N

        lblAdministratorLoginUserName.setForeground(new java.awt.Color(19, 91, 160));
        lblAdministratorLoginUserName.setText("User Name");

        lblAdministratorLoginPassword.setForeground(new java.awt.Color(19, 91, 160));
        lblAdministratorLoginPassword.setText("Password");

        bttnAdministratorLogin.setBackground(new java.awt.Color(19, 91, 160));
        bttnAdministratorLogin.setFont(new java.awt.Font("Nirmala UI Semilight", 1, 18)); // NOI18N
        bttnAdministratorLogin.setForeground(new java.awt.Color(255, 255, 255));
        bttnAdministratorLogin.setText("LOGIN");
        bttnAdministratorLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                bttnAdministratorLoginActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout pnlAdministratorLoginLayout = new javax.swing.GroupLayout(pnlAdministratorLogin);
        pnlAdministratorLogin.setLayout(pnlAdministratorLoginLayout);
        pnlAdministratorLoginLayout.setHorizontalGroup(
            pnlAdministratorLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, pnlAdministratorLoginLayout.createSequentialGroup()
                .addContainerGap(147, Short.MAX_VALUE)
                .addComponent(jLabel3)
                .addGap(139, 139, 139))
            .addGroup(pnlAdministratorLoginLayout.createSequentialGroup()
                .addGap(53, 53, 53)
                .addGroup(pnlAdministratorLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(txtfldAdministratorUserName)
                    .addComponent(psswrdfldAdministratorPassword)
                    .addComponent(lblAdministratorLoginUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 79, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(lblAdministratorLoginPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 106, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(bttnAdministratorLogin, javax.swing.GroupLayout.DEFAULT_SIZE, 260, Short.MAX_VALUE))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        pnlAdministratorLoginLayout.setVerticalGroup(
            pnlAdministratorLoginLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlAdministratorLoginLayout.createSequentialGroup()
                .addGap(60, 60, 60)
                .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 76, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(53, 53, 53)
                .addComponent(lblAdministratorLoginUserName)
                .addGap(18, 18, 18)
                .addComponent(txtfldAdministratorUserName, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(49, 49, 49)
                .addComponent(lblAdministratorLoginPassword)
                .addGap(18, 18, 18)
                .addComponent(psswrdfldAdministratorPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 45, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(56, 56, 56)
                .addComponent(bttnAdministratorLogin, javax.swing.GroupLayout.PREFERRED_SIZE, 38, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(79, Short.MAX_VALUE))
        );

        tbbdpnDoctor.addTab("Administrator", pnlAdministratorLogin);

        lblLoginPageIcon.setIcon(new javax.swing.ImageIcon(getClass().getResource("/view/pngwing.com (2).png"))); // NOI18N
        lblLoginPageIcon.setText("asdadas a a a a a  ");
        lblLoginPageIcon.setToolTipText("");

        lblLoginExit.setFont(new java.awt.Font("Segoe UI", 1, 24)); // NOI18N
        lblLoginExit.setForeground(new java.awt.Color(255, 255, 255));
        lblLoginExit.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        lblLoginExit.setText("X");
        lblLoginExit.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                lblLoginExitMouseClicked(evt);
            }
        });

        javax.swing.GroupLayout kGradientPanel1Layout = new javax.swing.GroupLayout(kGradientPanel1);
        kGradientPanel1.setLayout(kGradientPanel1Layout);
        kGradientPanel1Layout.setHorizontalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, kGradientPanel1Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(lblLoginPageIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(tbbdpnDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 366, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(lblLoginExit, javax.swing.GroupLayout.PREFERRED_SIZE, 26, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addContainerGap(13, Short.MAX_VALUE))
        );
        kGradientPanel1Layout.setVerticalGroup(
            kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(kGradientPanel1Layout.createSequentialGroup()
                .addGroup(kGradientPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblLoginPageIcon, javax.swing.GroupLayout.PREFERRED_SIZE, 487, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(28, 28, 28)
                        .addComponent(tbbdpnDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 595, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(kGradientPanel1Layout.createSequentialGroup()
                        .addGap(16, 16, 16)
                        .addComponent(lblLoginExit, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(77, Short.MAX_VALUE))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(kGradientPanel1, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void lblLoginExitMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_lblLoginExitMouseClicked
        dispose();        // TODO add your handling code here:
    }//GEN-LAST:event_lblLoginExitMouseClicked

    private void txtfldDoctorTcNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldDoctorTcNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldDoctorTcNoActionPerformed

    private void txtfldPatientTcNoActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtfldPatientTcNoActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtfldPatientTcNoActionPerformed

    private void pnlDoctorLoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlDoctorLoginButtonMouseClicked
        
        if(txtfldDoctorName.getText().length()==0 || txtfldDoctorTcNo.getText().length()==0 || psswrdfldDoctorPassword.getText().length()==0){
            
            helper.error("empty");
        }
        else{
            Connection connection = db.connect();
            Statement statement = null;
            try{
                String doctorName = txtfldDoctorName.getText();
                String doctorTcNo = txtfldDoctorTcNo.getText();
                String doctorPassword = psswrdfldDoctorPassword.getText();
                
                //Sql Injection Protect
                String sqlQuery = "select * from doctors where name_=\""+doctorName.replace('"', 'ğ')+"\" and tc_no_=\""+doctorTcNo.replace('"', 'ğ')+"\" and password_=\""+doctorPassword.replace('"', 'ğ')+"\";";

                statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sqlQuery);
                if(result.next()){
                    int doctorId = result.getInt("id_");
                    String doctorSurname = result.getString("surname_");
                    String doctorGender = result.getString("gender_");
                    int doctorClinicId = result.getInt("clinic_id_");
                    
                    Doctor doctor = new Doctor(doctorId,doctorName,doctorSurname,doctorTcNo,doctorPassword,doctorGender,doctorClinicId);
                    DoctorUI frmDoctor = new DoctorUI(doctor);
                    frmDoctor.setLocation(getLocation());
                    frmDoctor.setVisible(true);
                    dispose();
                }
                else{
                    helper.error("noAccount");
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
            finally{
                try {
                    statement.close();
                    connection.close( );
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                
            }
        }
    }//GEN-LAST:event_pnlDoctorLoginButtonMouseClicked

    private void bttnAdministratorLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_bttnAdministratorLoginActionPerformed
        if(txtfldAdministratorUserName.getText().length()==0 || psswrdfldAdministratorPassword.getText().length()==0){
            helper.error("empty");
        }
        else{
            String administratorUsername = txtfldAdministratorUserName.getText();
            String administratorPassword = psswrdfldAdministratorPassword.getText();
            
            try{
                Connection connection = db.connect();
                Statement statement = connection.createStatement();
                //sql injection protect
                String sqlQuery = "select * from administrators where name_=\""+administratorUsername.replace('"','ü')+"\" and password_=\""+administratorPassword.replace('"','ü')+"\";";
                ResultSet result = statement.executeQuery(sqlQuery);
                if(result.next()){
                    FrmAdministrator frmAdministrator = new FrmAdministrator(helper, new Administrator(result.getInt("id_"),result.getString("name_"),result.getString("surname_"),result.getString("tc_no_"),result.getString("password_"),result.getString("gender_")));
                    frmAdministrator.setLocation(getLocation());
                    frmAdministrator.setVisible(true);
                    dispose();
                }else{
                    helper.error("noAccount");
                }
                
            }catch(SQLException e){
                e.printStackTrace();
            }
            
        }
    }//GEN-LAST:event_bttnAdministratorLoginActionPerformed

    private void kGradientPanel3MouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_kGradientPanel3MouseClicked
        String patientName = txtfldAddPatientName.getText();
        String patientSurname = txtfldAddPatientSurname.getText();
        String patientTcNo = txtfldAddPatientTcNo.getText();
        String patientPassword = psswrdfldAddPatientPassword.getText();
        String patientGender;
        
        if(patientName.length()==0 || patientSurname.length()==0 || patientTcNo.length()==0 || patientPassword.length()==0 || (!rdbttnAddPatientMale.isSelected() && !rdbttnAddPatientFemale.isSelected())){
            helper.error("empty");
        }else{
            if(rdbttnAddPatientMale.isSelected())patientGender = "male";
            else patientGender = "female";
            
            Connection connection = null;
            Statement statement = null;
            PreparedStatement preparedStatement = null;
            try{
                String sqlQuery = "select * from patients where tc_no_=\""+patientTcNo+"\";";
                connection = db.connect();
                statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sqlQuery);
                if(result.next()){
                    helper.error("already");
                }else{
                    sqlQuery = "insert into patients(name_,surname_,tc_no_,password_,gender_) values(?,?,?,?,?);";
                    preparedStatement = connection.prepareStatement(sqlQuery);
                    preparedStatement.setString(1, patientName);
                    preparedStatement.setString(2, patientSurname);
                    preparedStatement.setString(3, patientTcNo);
                    preparedStatement.setString(4, patientPassword);
                    preparedStatement.setString(5, patientGender);
                    preparedStatement.executeUpdate();
                    helper.error("succes");
                }
            }catch(SQLException e){
                helper.error("db");
            }finally{
                try {
                    statement.close();
                    connection.close();
                    if(preparedStatement!=null)preparedStatement.close();
                } catch (SQLException ex) { 
                    helper.error("db");
                }
            }
          }
    }//GEN-LAST:event_kGradientPanel3MouseClicked

    private void pnlPatientLoginButtonMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_pnlPatientLoginButtonMouseClicked
 
        if(txtfldPatientName.getText().length()==0 || txtfldPatientTcNo.getText().length()==0 || psswrdfldPatientPassword.getText().length()==0){
            
            helper.error("empty");
        }
        else{
            Connection connection = db.connect();
            Statement statement = null;
            try{
                String patientName = txtfldPatientName.getText();
                String patientTcNo = txtfldPatientTcNo.getText();
                String patientPassword = psswrdfldPatientPassword.getText();
                
                //Sql Injection Protect
                String sqlQuery = "select * from patients where name_=\""+patientName.replace('"', 'ğ')+"\" and tc_no_=\""+patientTcNo.replace('"', 'ğ')+"\" and password_=\""+patientPassword.replace('"', 'ğ')+"\";";
                
                statement = connection.createStatement();
                ResultSet result = statement.executeQuery(sqlQuery);
                if(result.next()){
                    int patientId = result.getInt("id_");
                    String patientSurname = result.getString("surname_");
                    String patientGender = result.getString("gender_");

                    
                    Patient patient = new Patient(patientId,patientName,patientSurname,patientTcNo,patientPassword,patientGender);
                    FrmPatient frmPatient = new FrmPatient(patient);
                    frmPatient.setLocation(getLocation());
                    frmPatient.setVisible(true);
                    dispose();
                }
                else{
                    helper.error("noAccount");
                }
            }catch(SQLException e){
                e.printStackTrace();
            }
            finally{
                try {
                    statement.close();
                    connection.close( );
                } catch (SQLException ex) {
                    ex.printStackTrace();
                }
                
            }
        }
    }//GEN-LAST:event_pnlPatientLoginButtonMouseClicked

    
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
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(LoginUI.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new LoginUI().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton bttnAdministratorLogin;
    private javax.swing.ButtonGroup bttngrpAddPatientGender;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private keeptoo.KGradientPanel kGradientPanel1;
    private keeptoo.KGradientPanel kGradientPanel2;
    private keeptoo.KGradientPanel kGradientPanel3;
    private javax.swing.JLabel lblAdministratorLoginPassword;
    private javax.swing.JLabel lblAdministratorLoginUserName;
    private javax.swing.JLabel lblDoctorLogibIcon;
    private javax.swing.JLabel lblDoctorLogin;
    private javax.swing.JLabel lblDoctorLoginWarning;
    private javax.swing.JLabel lblDoctorName;
    private javax.swing.JLabel lblDoctorPassword;
    private javax.swing.JLabel lblDoctorTcNo;
    private javax.swing.JLabel lblDoctorWelcome;
    private javax.swing.JLabel lblLoginExit;
    private javax.swing.JLabel lblLoginPageIcon;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblPatientLogin;
    private javax.swing.JLabel lblPatientLoginIcon;
    private javax.swing.JLabel lblPatientLoginWarning;
    private javax.swing.JLabel lblPatientName;
    private javax.swing.JLabel lblPatientPassword;
    private javax.swing.JLabel lblPatientSurname;
    private javax.swing.JLabel lblPatientWelcome;
    private javax.swing.JLabel lblSignUp;
    private javax.swing.JLabel lblSignUpName;
    private javax.swing.JLabel lblSignUpSurname;
    private javax.swing.JLabel lblSignUpTcNo;
    private javax.swing.JPanel pnlAdministratorLogin;
    private javax.swing.JPanel pnlDoctorLogin;
    private keeptoo.KGradientPanel pnlDoctorLoginButton;
    private javax.swing.JPanel pnlLoginPatient;
    private javax.swing.JPanel pnlPatientLogin;
    private keeptoo.KGradientPanel pnlPatientLoginButton;
    private javax.swing.JPasswordField psswrdfldAddPatientPassword;
    private javax.swing.JPasswordField psswrdfldAdministratorPassword;
    private javax.swing.JPasswordField psswrdfldDoctorPassword;
    private javax.swing.JPasswordField psswrdfldPatientPassword;
    private javax.swing.JRadioButton rdbttnAddPatientFemale;
    private javax.swing.JRadioButton rdbttnAddPatientMale;
    private javax.swing.JTabbedPane tbbdpnDoctor;
    private javax.swing.JTextField txtfldAddPatientName;
    private javax.swing.JTextField txtfldAddPatientSurname;
    private javax.swing.JTextField txtfldAddPatientTcNo;
    private javax.swing.JTextField txtfldAdministratorUserName;
    private javax.swing.JTextField txtfldDoctorName;
    private javax.swing.JTextField txtfldDoctorTcNo;
    private javax.swing.JTextField txtfldPatientName;
    private javax.swing.JTextField txtfldPatientTcNo;
    // End of variables declaration//GEN-END:variables
}
