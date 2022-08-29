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

    // Các hàm thực hiện
    public void xoaForm() {
        // Lấy từng trường trong form để xóa trở về mặc định
        this.tfID.setText("");
        this.tfAge.setText("");
        this.tfName.setText("");
        this.tfPhone.setText("");
        this.btngGender.clearSelection();
        this.cbbPosition.setSelectedIndex(0);
        this.cbbSubject.setSelectedIndex(0);
    }

    public void themGiaoVien() throws Exception{
        // lấy ra bảng
        DefaultTableModel model_table = (DefaultTableModel) tableManagement.getModel();
        //lấy dữ liệu id
        int id = Integer.parseInt(this.tfID.getText());
        //lấy dữ liệu age
        int age = Integer.parseInt(this.tfAge.getText());
        // nếu age <22 hoặc >65 thi ném ra Exception
        if (age < 22 || age >65) throw new Exception();
        // lấy dữ liệu name
        String name = this.tfName.getText();
        // lấy dữ liệu phone
        String phone = this.tfPhone.getText();
        // Nếu sđt ko có ký tự dài  = 10 thì ném ra Exception
        if(phone.length() != 10) throw new Exception();
        // Lấy ra dữ liệu giới tính
        boolean gender = true;
        if(this.rbtnMale.isSelected()) {
            gender = true;
        } else if(this.rbtnFemale.isSelected()) {
            gender = false;
        } else {
            // Ném ra lỗi nếu không tick vào ô nào
            throw new Exception();
        }

        // lấy dữ liệu position
        String position = cbbPosition.getSelectedItem().toString();
        //lấy dữ liệu subject
        String subject = cbbSubject.getSelectedItem().toString();
        // Tạo đối tượng Teacher mới có dữ liệu như mình đã lấy
        Teacher teacher = new Teacher(id,name,age,gender,subject,position,phone);

        // thêm Teacher vào danh sách
        this.model.insert(teacher);
        // Thêm hàng mới vào bảng
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
        // Lấy ra bảng
        DefaultTableModel model_table = (DefaultTableModel) tableManagement.getModel();
        int i_row = tableManagement.getSelectedRow();  // index của dòng người dùng chọn
        model_table.getValueAt(i_row,0);
        // lấy thông tin của hàng người dùng chọn có cột 0 (cột id)
        int id = Integer.parseInt(model_table.getValueAt(i_row,0) +"");
        // lấy thông tin của hàng người dùng chọn có cột 1 (cột name)
        String name = model_table.getValueAt(i_row,1) +"";
        // lấy thông tin của hàng người dùng chọn có cột 2 (cột age)
        int age = Integer.parseInt(model_table.getValueAt(i_row,2) +"");
        // lấy thông tin của hàng người dùng chọn có cột 3 (cột gendẻ
        String textGender = model_table.getValueAt(i_row,3) +"";
        boolean gender = textGender.equals("Male");
        // lấy thông tin của hàng người dùng chọn có cột 4 (subject)
        String subject = model_table.getValueAt(i_row,4) +"";
        // lấy thông tin của hàng người dùng chọn có cột 5 (position)
        String position = model_table.getValueAt(i_row,5) +"";
        // lấy thông tin của hàng người dùng chọn có cột 6 (phone)
        String phone = model_table.getValueAt(i_row,6) +"";
        // Tạo đối tượng Teacher mới
        Teacher teacher = new Teacher(id,name,age,gender,subject,position,phone);
        // Lấy các dữ liệu ở dưới bảng để hiển thị lên các trường của form
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
        // Lấy ra bảng
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
        // Lấy index của giáo viên cần xóa
        int index =-1;
        for(int i = 0; i<model.getList().size(); i++) {
            if(id== model.getList().get(i).getId()) {
                index = i;
            }
        }
        // nếu tồn tại giáo viên trong danh sách
        if(this.model.checkIfExist(teacher)) {
            // số lượng dòng
            int rowCount = model_table.getRowCount();
            // lặp qua tất cả các dòng
            for (int i = 0; i < rowCount; i++) {
                // lấy ID của dòng i cột 0 (cột id)
                String idItem = model_table.getValueAt(i, 0) + "";
                if (idItem.equals(id + "")) { // nếu id của dòng bằng id muốn cập nhật
                    // cập nhật dữ liệu lên bảng
                    model_table.setValueAt(id+ "", i, 0);
                    model_table.setValueAt(name+ "", i, 1);
                    model_table.setValueAt(age+ "", i, 2);
                    model_table.setValueAt(gender ?"Male" :"Female", i, 3);
                    model_table.setValueAt(subject, i, 4);
                    model_table.setValueAt(position, i, 5);
                    model_table.setValueAt(phone, i, 6);
                }
            }
            // cập nhật giáo viên vào danh sách
            this.model.update(teacher, index);
        }
    }

    public void xoaThongTinGiaoVien() {
        // Lấy bảng ra
        DefaultTableModel model_table = (DefaultTableModel) tableManagement.getModel();
        // dòng mà người dùng chọn
        int i_row = tableManagement.getSelectedRow();
        // nếu người ta ấn delete sẽ hiển ra cửa sổ thông báo này
        int choice = JOptionPane.showConfirmDialog(this,
                "Do you want to delete this selected line","Delete",
                JOptionPane.YES_NO_OPTION,JOptionPane.WARNING_MESSAGE);
        // nếu chọn có
        if (choice == JOptionPane.YES_OPTION) {
            // lấy dữ liệu trên hàng đó
            int id = Integer.parseInt(model_table.getValueAt(i_row,0) +"");
            String name = model_table.getValueAt(i_row,1) +"";
            int age = Integer.parseInt(model_table.getValueAt(i_row,2) +"");
            String textGender = model_table.getValueAt(i_row,3) +"";
            boolean gender = textGender.equals("Male");
            String subject = model_table.getValueAt(i_row,4) +"";
            String position = model_table.getValueAt(i_row,5) +"";
            String phone = model_table.getValueAt(i_row,6) +"";
            // tạo đối tượng giáo viên mới
            Teacher teacher = new Teacher(id,name,age,gender,subject,position,phone);
            // xóa đối tượng đó khỏi danh sách
            this.model.delete(teacher);
            // xóa hàng trong bảng
            model_table.removeRow(i_row);
        }
    }
    public void sapXepGiaoVienTheoId() {
        // lấy ra bảng
        DefaultTableModel model_table = (DefaultTableModel) tableManagement.getModel();
        // tạo arraylist mới để chứa Id của tất cgiáo viên trong danh sách
        ArrayList<Integer> newArr = new ArrayList<Integer>();
        // lặp qua tất cả trong danh sách và thêm vào mảng mới
        for(Teacher teacher : this.model.getList()) {
            newArr.add(teacher.getId());
        }
        // sắp xếp theo thứ tự tăng dần trong arraylist
        Collections.sort(newArr);
        // Xoa tat ca cac dong
        while (true) {
            DefaultTableModel model_table1 = (DefaultTableModel) tableManagement.getModel();
            int rowCount = model_table.getRowCount();
            if(rowCount==0)
                break;
            else
                // Bắt lỗi khi xóa hàng
                try {
                    model_table1.removeRow(0);
                } catch (Exception e) {
                    throw e;
                }
        }
        //tạo aray mới chứa các đối tượng giáo viên đã đc sắp xếp
        ArrayList<Teacher> arrO = new ArrayList<Teacher>();
        int i = 1;
        // theemgiaos viên vào aray mới
        for(int id : newArr) {
            Teacher teacher = this.model.getTeacherById(id);
            arrO.add(teacher);
        }
        //theeduwx liệu của từng giáo viên đã đc sắp xếp
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
                // Bắt lỗi khi xóa hàng
                try {
                    model_table.removeRow(0);
                } catch (Exception e) {
                    throw e;
                }
        }
        DefaultTableModel model_table = (DefaultTableModel) tableManagement.getModel();
        // Tải dữ liệu của giáo viên trong danh sách lên lại trong bảng
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

    public void luuFile(){// hiển thị của sổ chọn file
        JFileChooser fc = new JFileChooser();
        int returnVal = fc.showSaveDialog(this);
        // nếu chọn
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            try {
                try {
                    // lưu tên
                    this.model.setFileName(file.getAbsolutePath());
                    FileOutputStream fos = new FileOutputStream(file.getAbsolutePath());
                    ObjectOutputStream oos = new ObjectOutputStream(fos);

                    // Lưu từng đối tượng thí sinh vào file
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
        // Mở cửa sổ để các tập tin file (document)
        int returnVal = fc.showOpenDialog(this);
        if (returnVal == JFileChooser.APPROVE_OPTION) {
            File file = fc.getSelectedFile();
            // tạo danh sách mới
            ArrayList<Teacher> newList = new ArrayList<Teacher>();
            try {
                // lưu tên file
                this.model.setFileName(file.getAbsolutePath());
                FileInputStream fis = new FileInputStream(file);
                ObjectInputStream ois = new ObjectInputStream(fis);
                // Tạo mảng mới để cập nhật tùng thí sinh vào Ds
                Teacher teacher = null;
                while((teacher = (Teacher) ois.readObject())!=null) {
                    newList.add(teacher);}
                ois.close();
            } catch (Exception ignored) {}
            // set danh sách giáo viên bằng danh sách mới
            this.model.setList(newList);
            // dữ liệu ddc tải lên lại trên bảng
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
        // lấy phần text trong từng nút khi người dùng ấn vào
        String event = e.getActionCommand();

        // nếu ấn add
        if(event.equals("Add")) {
            // bắt lỗi khi người dùng nhập k đúng yêu cầu
            try {
                view.themGiaoVien();
            } catch (Exception ex) {
                JOptionPane.showMessageDialog(view, "Wrong data",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }
            view.xoaForm();
            //nếu người dùng ấn cập nhật
        } else if(event.equals("Update")) {
            try{
                this.view.hienThiThongTinLenGiaoVienLenform();
            }catch(Exception e1){
                JOptionPane.showMessageDialog(view, "Please select a teacher",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }

//            view.hienThiThongTinLenGiaoVienLenform();
        } else if(event.equals("Save teacher")) { //nếu người dùng ấn lưu giáo viên
            view.capNhatThongTinGiaoVien();
            view.xoaForm();
            // nếu người dùng ấn xóa
        } else if(event.equals("Delete")) {
            try{
                this.view.xoaThongTinGiaoVien();
            }catch(Exception e2){
                JOptionPane.showMessageDialog(view, "Please select a teacher",
                        "Error", JOptionPane.ERROR_MESSAGE);
            }


        } else if(event.equals("Sort")) {
            // nếu người dùng ấn sort
            view.sapXepGiaoVienTheoId();
            view.jButton4.setText("Reload"); //Biến nuts Sort thành Reload

        } else if(event.equals("Reload")) { // nếu người dùng ấn Reload
            view.taiLaiDuLieu();
            view.jButton4.setText("Sort"); // Biến nút Reload thành Sort
        } else if(event.equals("Save")) {  // Nếu người dùng ấn Save
            view.luuFile();
        } else if(event.equals("Open")) {  // Nếu người dùng ấn Open
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