/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/GUIForms/JFrame.java to edit this template
 */
package demoasm;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.*;
import java.util.ArrayList;
import java.util.Collections;
import javax.swing.*;
import javax.swing.table.DefaultTableModel;

/**
 *
 * @author ASUS
 */

class run {
    public static void main(String[] args) {
        try {
            new javaswing1().setVisible(true);
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    new javaswing1();
                }
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

public class javaswing1 extends javax.swing.JFrame {


    // Variables declaration - do not modify//GEN-BEGIN:variables
    public javax.swing.JButton btnAdd;
    public javax.swing.ButtonGroup btngGender;
    public javax.swing.JComboBox<String> cbbPosition;
    public javax.swing.JComboBox<String> cbbSubject;
    public javax.swing.JButton jButton1;
    public javax.swing.JButton jButton2;
    public javax.swing.JButton jButton3;
    public javax.swing.JButton jButton4;
    public javax.swing.JLabel jLabel1;
    public javax.swing.JPanel jPanel3;
    public javax.swing.JScrollPane jScrollPane1;
    public javax.swing.JRadioButton rbtnFemale;
    public javax.swing.JRadioButton rbtnMale;
    public javax.swing.JTable tableManagement;
    public javax.swing.JTextField tfAge;
    public javax.swing.JTextField tfID;
    public javax.swing.JTextField tfName;
    public javax.swing.JTextField tfPhone;
    public Data model;
    public int count = 2;
    // End of variables declaration//GEN-END:variables

    ActionListener action = new Event(this);

    /**
     * Creates new form javaswing1
     */
    public javaswing1() {
        this.model = new Data();
        btngGender = new javax.swing.ButtonGroup();
        jPanel3 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel2 = new javax.swing.JLabel();
        tfID = new javax.swing.JTextField();
        javax.swing.JLabel jLabel3 = new javax.swing.JLabel();
        tfName = new javax.swing.JTextField();
        javax.swing.JLabel jLabel4 = new javax.swing.JLabel();
        tfAge = new javax.swing.JTextField();
        javax.swing.JLabel jLabel5 = new javax.swing.JLabel();
        javax.swing.JLabel jLabel6 = new javax.swing.JLabel();
        tfPhone = new javax.swing.JTextField();
        rbtnMale = new javax.swing.JRadioButton();
        rbtnFemale = new javax.swing.JRadioButton();
        javax.swing.JLabel jLabel7 = new javax.swing.JLabel();
        btnAdd = new javax.swing.JButton();
        jButton2 = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        tableManagement = new javax.swing.JTable();
        javax.swing.JLabel jLabel8 = new javax.swing.JLabel();
        cbbPosition = new javax.swing.JComboBox<>();
        cbbSubject = new javax.swing.JComboBox<>();
        jButton1 = new javax.swing.JButton();
        jButton3 = new javax.swing.JButton();
        jButton4 = new javax.swing.JButton();

        // Menu bar
        JMenuBar menuBar = new JMenuBar();
        setJMenuBar(menuBar);

        JMenu menuFile = new JMenu("File");
        menuFile.addActionListener(action);
        menuBar.add(menuFile);

        JMenuItem menuOpen = new JMenuItem("Open");
        menuOpen.addActionListener(action);
        menuOpen.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        menuFile.add(menuOpen);

        JMenuItem menuSave = new JMenuItem("Save");
        menuSave.addActionListener(action);
        menuSave.setFont(new Font("Segoe UI", Font.PLAIN, 12));
        menuFile.add(menuSave);

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);
        setTitle("MANAGEMENT TEACHER");

        jPanel3.setBackground(new java.awt.Color(255, 255, 102));

        jLabel1.setFont(new java.awt.Font("Segoe UI", 1, 50)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(0, 0, 255));
        jLabel1.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demoasm/classroom (1).png"))); // NOI18N
        jLabel1.setText("GREENWICH UNIVERSITY");

        jLabel2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel2.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel2.setText("ID");

        tfID.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfID.setToolTipText("");
        tfID.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
//        tfID.addActionListener();

        jLabel3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel3.setText("Name");

        tfName.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfName.setToolTipText("");
        tfName.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jLabel4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel4.setText("Age");

        tfAge.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfAge.setToolTipText("");
        tfAge.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
//        tfAge.addActionListener();

        jLabel5.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel5.setText("Subject");

        jLabel6.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel6.setText("Phone");

        tfPhone.setHorizontalAlignment(javax.swing.JTextField.CENTER);
        tfPhone.setToolTipText("");
        tfPhone.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
//        tfPhone.addActionListener();

        btngGender.add(rbtnMale);
        rbtnMale.setSelected(true);
        rbtnMale.setText("Male");
        rbtnMale.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
//        rbtnMale.addActionListener();

        btngGender.add(rbtnFemale);
        rbtnFemale.setText("Female");
        rbtnFemale.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);

        jLabel7.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel7.setText("Gender");

        btnAdd.setBackground(new java.awt.Color(153, 153, 153));
        btnAdd.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        btnAdd.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demoasm/add (1).png"))); // NOI18N
        btnAdd.setText("Add");
        btnAdd.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        btnAdd.addActionListener(action);

        jButton2.setBackground(new java.awt.Color(153, 153, 153));
        jButton2.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton2.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demoasm/delete.png"))); // NOI18N
        jButton2.setText("Delete");
        jButton2.addActionListener(action);
        jButton2.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
//        jButton2.addActionListener();

        tableManagement.setModel(new javax.swing.table.DefaultTableModel(
                new Object [][] {
                },
                new String [] {
                        "ID", "Name", "Age", "Gender", "Subject", "Position", "Phone"
                }
        ) {
            Class[] types = new Class [] {
                    java.lang.Integer.class, java.lang.String.class, java.lang.Integer.class, java.lang.String.class, java.lang.Object.class, java.lang.String.class, java.lang.Integer.class
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }
        });
        tableManagement.setDefaultEditor(Object.class, null);
        jScrollPane1.setViewportView(tableManagement);

        jLabel8.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jLabel8.setHorizontalAlignment(javax.swing.SwingConstants.CENTER);
        jLabel8.setText("Position");

        cbbPosition.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Principal", "Assistant principals", "Teacher", "Intern" }));
        cbbPosition.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        cbbSubject.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "English", "Technology Information", "Graphic Design", "Business Administration", "Marketing Management", "Administration Events", "Management Communication", "Sotf Skill" }));
        cbbSubject.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        jButton1.setBackground(new java.awt.Color(153, 153, 153));
        jButton1.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton1.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demoasm/update.png"))); // NOI18N
        jButton1.setText("Update");
        jButton1.addActionListener(action);
        jButton1.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));
        jButton3.setBackground(new java.awt.Color(153, 153, 153));
        jButton3.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton3.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demoasm/save.png"))); // NOI18N
        jButton3.setText("Save teacher");
        jButton3.addActionListener(action);
        jButton3.setBorder(new javax.swing.border.LineBorder(new java.awt.Color(0, 0, 0), 2, true));

        jButton4.setBackground(new java.awt.Color(153, 153, 153));
        jButton4.setFont(new java.awt.Font("Segoe UI", 1, 14)); // NOI18N
        jButton4.setIcon(new javax.swing.ImageIcon(getClass().getResource("/demoasm/sort.png"))); // NOI18N
        jButton4.setText("Sort");
        jButton4.addActionListener(action);
        jButton4.setBorder(javax.swing.BorderFactory.createLineBorder(new java.awt.Color(0, 0, 0), 2));

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addContainerGap())
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(78, 78, 78)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                                        .addComponent(jLabel2)
                                                                        .addComponent(tfID, javax.swing.GroupLayout.DEFAULT_SIZE, 160, Short.MAX_VALUE)
                                                                        .addComponent(jLabel3)
                                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                                .addComponent(jLabel4)
                                                                                .addGap(51, 51, 51)
                                                                                .addComponent(jLabel7))
                                                                        .addComponent(tfName))
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                                .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, 40, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addGap(18, 18, 18)
                                                                .addComponent(rbtnMale, javax.swing.GroupLayout.PREFERRED_SIZE, 75, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                                                .addComponent(rbtnFemale, javax.swing.GroupLayout.DEFAULT_SIZE, 72, Short.MAX_VALUE)
                                                                .addGap(150, 150, 150)))
                                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                                        .addComponent(jLabel5)
                                                        .addComponent(tfPhone)
                                                        .addComponent(jLabel6)
                                                        .addComponent(jLabel8)
                                                        .addComponent(cbbPosition, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                                        .addComponent(cbbSubject, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                                .addGap(80, 80, 80))
                                        .addGroup(jPanel3Layout.createSequentialGroup()
                                                .addComponent(btnAdd, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton2, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton1, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addGap(18, 18, 18)
                                                .addComponent(jButton4, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.Alignment.TRAILING)
        );
        jPanel3Layout.setVerticalGroup(
                jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(jPanel3Layout.createSequentialGroup()
                                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel2)
                                        .addComponent(jLabel5))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbbSubject, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel3)
                                        .addComponent(jLabel8))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(cbbPosition, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(jLabel4)
                                        .addComponent(jLabel6)
                                        .addComponent(jLabel7))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(tfAge, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(tfPhone, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addComponent(rbtnMale)
                                        .addComponent(rbtnFemale))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 31, Short.MAX_VALUE)
                                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                        .addComponent(btnAdd)
                                        .addComponent(jButton2)
                                        .addComponent(jButton1)
                                        .addComponent(jButton3)
                                        .addComponent(jButton4))
                                .addGap(18, 18, 18)
                                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(238, 238, 238))
        );

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
        );
        layout.setVerticalGroup(
                layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                        .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                                .addComponent(jPanel3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
        );

        jPanel3.getAccessibleContext().setAccessibleDescription("");

        pack();
    }

    // C??c h??m th???c hi???n
    public void xoaForm() {
        // L???y t???ng tr?????ng trong form ????? x??a tr??? v??? m???c ?????nh
        this.tfID.setText("");
        this.tfAge.setText("");
        this.tfName.setText("");
        this.tfPhone.setText("");
        this.btngGender.clearSelection();
        this.cbbPosition.setSelectedIndex(0);
        this.cbbSubject.setSelectedIndex(0);
    }

    public void themGiaoVien() throws Exception{
        // l???y ra b???ng
        DefaultTableModel model_table = (DefaultTableModel) tableManagement.getModel();
        //l???y d??? li???u id
        int id = Integer.parseInt(this.tfID.getText());
        //l???y d??? li???u age
        int age = Integer.parseInt(this.tfAge.getText());
        // n???u age <22 ho???c >65 thi n??m ra Exception
        if (age < 22 || age >65) throw new Exception();
        // l???y d??? li???u name
        String name = this.tfName.getText();
        // l???y d??? li???u phone
        String phone = this.tfPhone.getText();
        // N???u s??t ko c?? k?? t??? d??i  = 10 th?? n??m ra Exception
        if(phone.length() != 10) throw new Exception();
        // L???y ra d??? li???u gi???i t??nh
        boolean gender = true;
        if(this.rbtnMale.isSelected()) {
            gender = true;
        } else if(this.rbtnFemale.isSelected()) {
            gender = false;
        } else {
            // N??m ra l???i n???u kh??ng tick v??o ?? n??o
            throw new Exception();
        }

        // l???y d??? li???u position
        String position = cbbPosition.getSelectedItem().toString();
        //l???y d??? li???u subject
        String subject = cbbSubject.getSelectedItem().toString();
        // T???o ?????i t?????ng Teacher m???i c?? d??? li???u nh?? m??nh ???? l???y
        Teacher teacher = new Teacher(id,name,age,gender,subject,position,phone);

        // th??m Teacher v??o danh s??ch
        this.model.insert(teacher);
        // Th??m h??ng m???i v??o b???ng
        model_table.addRow(new Object[] {
                id+ ""
                , name
                , age+""
                , gender ? "Male" : "Female"
                , subject
                , position
                , phone}
        );

    }
    public void hienThiThongTinLenGiaoVienLenform() {
        // L???y ra b???ng
        DefaultTableModel model_table = (DefaultTableModel) tableManagement.getModel();
        int i_row = tableManagement.getSelectedRow();  // index c???a d??ng ng?????i d??ng ch???n
        model_table.getValueAt(i_row,0);
        // l???y th??ng tin c???a h??ng ng?????i d??ng ch???n c?? c???t 0 (c???t id)
        int id = Integer.parseInt(model_table.getValueAt(i_row,0) +"");
        // l???y th??ng tin c???a h??ng ng?????i d??ng ch???n c?? c???t 1 (c???t name)
        String name = model_table.getValueAt(i_row,1) +"";
        // l???y th??ng tin c???a h??ng ng?????i d??ng ch???n c?? c???t 2 (c???t age)
        int age = Integer.parseInt(model_table.getValueAt(i_row,2) +"");
        // l???y th??ng tin c???a h??ng ng?????i d??ng ch???n c?? c???t 3 (c???t gend???
        String textGender = model_table.getValueAt(i_row,3) +"";
        boolean gender = textGender.equals("Male");
        // l???y th??ng tin c???a h??ng ng?????i d??ng ch???n c?? c???t 4 (subject)
        String subject = model_table.getValueAt(i_row,4) +"";
        // l???y th??ng tin c???a h??ng ng?????i d??ng ch???n c?? c???t 5 (position)
        String position = model_table.getValueAt(i_row,5) +"";
        // l???y th??ng tin c???a h??ng ng?????i d??ng ch???n c?? c???t 6 (phone)
        String phone = model_table.getValueAt(i_row,6) +"";
        // T???o ?????i t?????ng Teacher m???i
        Teacher teacher = new Teacher(id,name,age,gender,subject,position,phone);
        // L???y c??c d??? li???u ??? d?????i b???ng ????? hi???n th??? l??n c??c tr?????ng c???a form
        this.tfName.setText(name + "");
        this.tfAge.setText(age + "");
        this.tfID.setText(id +"");
        this.tfPhone.setText(phone + "");
        if(gender) {
            rbtnMale.setSelected(true);
        } else {
            rbtnFemale.setSelected(true);
        }
        this.cbbSubject.setSelectedItem(subject);
        this.cbbPosition.setSelectedItem(position);
    }

    public void capNhatThongTinGiaoVien() {
        // L???y ra b???ng
        DefaultTableModel model_table = (DefaultTableModel) tableManagement.getModel();
        // lay du lieu
        int id = Integer.parseInt(this.tfID.getText());
        int age = Integer.parseInt(this.tfAge.getText());
        String name = this.tfName.getText();
        String phone = this.tfPhone.getText();
        boolean gender = true;
        if(this.rbtnMale.isSelected()) {
            gender = true;
        } else if(this.rbtnFemale.isSelected()) {
            gender = false;
        }
        String position = cbbPosition.getSelectedItem().toString();
        String subject = cbbSubject.getSelectedItem().toString();
        Teacher teacher = new Teacher(id,name,age,gender,subject,position,phone);
        // L???y index c???a gi??o vi??n c???n x??a
        int index =-1;
        for(int i = 0; i<model.getList().size(); i++) {
            if(id== model.getList().get(i).getId()) {
                index = i;
            }
        }
        // n???u t???n t???i gi??o vi??n trong danh s??ch
        if(this.model.checkIfExist(teacher)) {
            // s??? l?????ng d??ng
            int rowCount = model_table.getRowCount();
            // l???p qua t???t c??? c??c d??ng
            for (int i = 0; i < rowCount; i++) {
                // l???y ID c???a d??ng i c???t 0 (c???t id)
                String idItem = model_table.getValueAt(i, 0) + "";
                if (idItem.equals(id + "")) { // n???u id c???a d??ng b???ng id mu???n c???p nh???t
                    // c???p nh???t d??? li???u l??n b???ng
                    model_table.setValueAt(id+ "", i, 0);
                    model_table.setValueAt(name+ "", i, 1);
                    model_table.setValueAt(age+ "", i, 2);
                    model_table.setValueAt(gender ?"Male" :"Female", i, 3);
                    model_table.setValueAt(subject, i, 4);
                    model_table.setValueAt(position, i, 5);
                    model_table.setValueAt(phone, i, 6);
                }
            }
            // c???p nh???t gi??o vi??n v??o danh s??ch
            this.model.update(teacher, index);
        }
    }

    public void xoaThongTinGiaoVien() {
        // L???y b???ng ra
        DefaultTableModel model_table = (DefaultTableModel) tableManagement.getModel();
        // d??ng m?? ng?????i d??ng ch???n
        int i_row = tableManagement.getSelectedRow();
        // n???u ng?????i ta ???n delete s??? hi???n ra c???a s??? th??ng b??o n??y
        int choice = JOptionPane.showConfirmDialog(this,
                "Do you want to delete this selected line","Delete",
                JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        // n???u ch???n c??
        if (choice == JOptionPane.YES_OPTION) {
            // l???y d??? li???u tr??n h??ng ????
            int id = Integer.parseInt(model_table.getValueAt(i_row,0) +"");
            String name = model_table.getValueAt(i_row,1) +"";
            int age = Integer.parseInt(model_table.getValueAt(i_row,2) +"");
            String textGender = model_table.getValueAt(i_row,3) +"";
            boolean gender = textGender.equals("Male");
            String subject = model_table.getValueAt(i_row,4) +"";
            String position = model_table.getValueAt(i_row,5) +"";
            String phone = model_table.getValueAt(i_row,6) +"";
            // t???o ?????i t?????ng gi??o vi??n m???i
            Teacher teacher = new Teacher(id,name,age,gender,subject,position,phone);
            // x??a ?????i t?????ng ???? kh???i danh s??ch
            this.model.delete(teacher);
            // x??a h??ng trong b???ng
            model_table.removeRow(i_row);
        }
    }
    public void sapXepGiaoVienTheoId() {
        // l???y ra b???ng
        DefaultTableModel model_table = (DefaultTableModel) tableManagement.getModel();
        // t???o arraylist m???i ????? ch???a Id c???a t???t cgi??o vi??n trong danh s??ch
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        // l???p qua t???t c??? trong danh s??ch v?? th??m v??o m???ng m???i
        for(Teacher teacher : this.model.getList()) {
            newArr.add(teacher.getId());
        }
        // s???p x???p theo th??? t??? t??ng d???n trong arraylist
        Collections.sort(newArr);
        // Xoa tat ca cac dong
        while (true) {
            DefaultTableModel model_table1 = (DefaultTableModel) tableManagement.getModel();
            int rowCount = model_table.getRowCount();
            if(rowCount==0)
                break;
            else
                // B???t l???i khi x??a h??ng
                try {
                    model_table1.removeRow(0);
                } catch (Exception e) {
                    throw e;
                }
        }
        //t???o aray m???i ch???a c??c ?????i t?????ng gi??o vi??n ???? ??c s???p x???p
        ArrayList<Teacher> arrO = new ArrayList<Teacher>();
        int i = 1;
        // theemgiaos vi??n v??o aray m???i
        for(int id : newArr) {
            Teacher teacher = this.model.getTeacherById(id);
            arrO.add(teacher);
        }
        //theeduwx li???u c???a t???ng gi??o vi??n ???? ??c s???p x???p
        for (Teacher teacher: arrO) {
            model_table.addRow(new Object[] {
                    teacher.getId()+ ""
                    , teacher.getName()
                    , teacher.getAge()+""
                    , teacher.isGender() ? "Male" : "Female"
                    , teacher.getSubject()
                    , teacher.getPosition()
                    , teacher.getPhone()
            });
        }
    }

    public void taiLaiDuLieu() {
        // Xoa tat ca cac dong
        while (true) {
            DefaultTableModel model_table = (DefaultTableModel) tableManagement.getModel();
            int rowCount = model_table.getRowCount();
            if(rowCount==0)
                break;
            else
                // B???t l???i khi x??a h??ng
                try {
                    model_table.removeRow(0);
                } catch (Exception e) {
                    throw e;
                }
        }
        DefaultTableModel model_table = (DefaultTableModel) tableManagement.getModel();
        // T???i d??? li???u c???a gi??o vi??n trong danh s??ch l??n l???i trong b???ng
        for (Teacher teacher: this.model.getList()) {
            model_table.addRow(new Object[] {
                    teacher.getId()+ ""
                    , teacher.getName()
                    , teacher.getAge()+""
                    , teacher.isGender() ? "Male" : "Female"
                    , teacher.getSubject()
                    , teacher.getPosition()
                    , teacher.getPhone()
            });
        }
    }

    public void luuFile(){// hi???n th??? c???a s??? ch???n file
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showSaveDialog(this);
        // n???u ch???n
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            try {
                try {
                    // l??u t??n
                    this.model.setFileName(file.getAbsolutePath());
                    FileOutputStream fos = new FileOutputStream(file.getAbsolutePath());
                    ObjectOutputStream oos = new ObjectOutputStream(fos);

                    // L??u t???ng ?????i t?????ng th?? sinh v??o file
                    for (Teacher teacher : this.model.getList()) {
                        oos.writeObject(teacher);
                    }
                    oos.close();
                } catch (Exception e) {
                    throw e;
                }
            } catch (IOException e) {
                JOptionPane.showMessageDialog(this, "Cannot save",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
        }


    }

    public void moFile() {
        JFileChooser fc = new JFileChooser();
        // M??? c???a s??? ????? c??c t???p tin file (document)
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            // t???o danh s??ch m???i
            ArrayList<Teacher> newList = new ArrayList<Teacher>();
            try {
                // l??u t??n file
                this.model.setFileName(file.getAbsolutePath());
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                // T???o m???ng m???i ????? c???p nh???t t??ng th?? sinh v??o Ds
                Teacher teacher = null;
                while((teacher = (Teacher) ois.readObject())!=null) {
                    newList.add(teacher);}
                ois.close();
            } catch (Exception ignored) {}
            // set danh s??ch gi??o vi??n b???ng danh s??ch m???i
            this.model.setList(newList);
            // d??? li???u ddc t???i l??n l???i tr??n b???ng
            taiLaiDuLieu();
        }


    }
}

class Event implements ActionListener {
    public javaswing1 view;
    public Event(javaswing1 view) {
        this.view = view;
    }
    @Override
    public void actionPerformed(ActionEvent e) {
        // l???y ph???n text trong t???ng n??t khi ng?????i d??ng ???n v??o
        String event = e.getActionCommand();

        // n???u ???n add
        if(event.equals("Add")) {
            // b???t l???i khi ng?????i d??ng nh???p k ????ng y??u c???u
            try {
                view.themGiaoVien();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(view, "Wrong data",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
            view.xoaForm();
            //n???u ng?????i d??ng ???n c???p nh???t
        } else if(event.equals("Update")) {
            try{
                this.view.hienThiThongTinLenGiaoVienLenform();
            }catch(Exception e1){
                JOptionPane.showMessageDialog(view, "Please select a teacher",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }

//            view.hienThiThongTinLenGiaoVienLenform();
        } else if(event.equals("Save teacher")) { //n???u ng?????i d??ng ???n l??u gi??o vi??n
            view.capNhatThongTinGiaoVien();
            view.xoaForm();
            // n???u ng?????i d??ng ???n x??a
        } else if(event.equals("Delete")) {
            try{
                this.view.xoaThongTinGiaoVien();
            }catch(Exception e2){
                JOptionPane.showMessageDialog(view, "Please select a teacher",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }


        } else if(event.equals("Sort")) {
            // n???u ng?????i d??ng ???n sort
            view.sapXepGiaoVienTheoId();
            view.jButton4.setText("Reload"); //Bi???n nuts Sort th??nh Reload

        } else if(event.equals("Reload")) { // n???u ng?????i d??ng ???n Reload
            view.taiLaiDuLieu();
            view.jButton4.setText("Sort"); // Bi???n n??t Reload th??nh Sort
        } else if(event.equals("Save")) {  // N???u ng?????i d??ng ???n Save
            view.luuFile();
        } else if(event.equals("Open")) {  // N???u ng?????i d??ng ???n Open
//            view.moFile();
            try {
                this.view.moFile();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(view, "Your file is empty or cannot open",
                        "Error",JOptionPane.ERROR_MESSAGE);
            }
        }
    }

}