package p12_database.ui;

import p12_database.dao.MembersDAO;
import p12_database.vo.Members;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;

public class FrmUpdate extends FrmBasic {

  private JLabel lbTitle, lbId, lbPass, lbName, lbMobile;
  private JTextField tfId, tfName, tfMobile;
  private JPasswordField pfPass;
  private JButton btnUpdate, btnClose;
  private JPanel pnlCenter, pnlSouth;


  public FrmUpdate(String title, int width, int height) {
    super(title, width, height);
  }

  @Override
  public void init() {
    lbTitle = new JLabel("Update Member");
    lbTitle.setFont(new Font("맑은 고딕", Font.BOLD | Font.CENTER_BASELINE, 30));
    lbTitle.setHorizontalAlignment(JLabel.CENTER);
    lbTitle.setBorder(BorderFactory.createEmptyBorder(20, 0, 20, 0));

    lbId = new JLabel("ID");
    lbPass = new JLabel("Password");
    lbName = new JLabel("Name");
    lbMobile = new JLabel("Mobile");

    tfId = new JTextField(20);
    pfPass = new JPasswordField(20);
    tfName = new JTextField(20);
    tfMobile = new JTextField(20);

    btnUpdate = new JButton("Update");
    btnClose = new JButton("Close");

    tfId.addActionListener(e -> {
      if (!isEmptyId()) pfPass.requestFocus();

    });

    pfPass.addActionListener(e -> {
      if (!isEmptyPass()) tfName.requestFocus();

    });

    tfName.addActionListener(e -> {
      if (!isEmptyName()) tfMobile.requestFocus();

    });


    tfMobile.addActionListener(e -> {
      if (!isEmptyId() && !isEmptyPass() && !isEmptyName() && !isEmptyMobile()) {
        UpdateAccess(tfId.getText(), new String(pfPass.getPassword()),
            tfName.getText(), tfMobile.getText());
      }
    });

    btnUpdate.addActionListener(e -> {
      if (!isEmptyId() && !isEmptyPass() && !isEmptyName() && !isEmptyMobile()) {
        UpdateAccess(tfId.getText(), new String(pfPass.getPassword()),
            tfName.getText(), tfMobile.getText());
      }
    });


    btnUpdate.addActionListener(e -> {
      String id = tfId.getText().trim();
      String pass = new String(pfPass.getPassword()).trim();
      String mobile = tfMobile.getText().trim();
      String name = tfName.getText().trim();

      if (id.isEmpty()) {
        JOptionPane.showMessageDialog(this, "ID를 채워주세요.", "입력 오류", JOptionPane.ERROR_MESSAGE);
      } else if (pass.isEmpty()) {
        JOptionPane.showMessageDialog(this, "PASS를 채워주세요.", "입력 오류", JOptionPane.ERROR_MESSAGE);
      } else if (name.isEmpty()) {
        JOptionPane.showMessageDialog(this, "NAME을 채워주세요.", "입력 오류", JOptionPane.ERROR_MESSAGE);
      } else if (mobile.isEmpty()) {
        JOptionPane.showMessageDialog(this, "MOBILE을 채워주세요.", "입력 오류", JOptionPane.ERROR_MESSAGE);
      } else {
        new FrmMain("변경완료", 500, 500);
        dispose();
      }
    });

    btnClose.addActionListener(e -> {
      dispose();
    });

    pnlCenter = new JPanel(new GridLayout(4, 2));
    pnlCenter.setBorder(BorderFactory.createEmptyBorder(0, 10, 10, 10));
    pnlSouth = new JPanel();
  }

  private void UpdateAccess(String id, String pass, String name, String mobile) {

    MembersDAO membersDAO = new MembersDAO();

    boolean success = membersDAO.updateMember(id, pass, name, mobile);
    if (success)
      JOptionPane.showMessageDialog(this, "변경 완료.");
  }


  private boolean isEmptyId() { // 비어 있지 않으면 false
    if (!tfId.getText().toString().trim().equals("")) return false;
    return true; // 비어 있을 경우
  }

  private boolean isEmptyPass() { // 비어 있지 않으면 false
    if (!new String(pfPass.getPassword()).toString().trim().equals("")) return false;
    return true; // 비어 있을 경우
  }

  private boolean isEmptyName() { // 비어 있지 않으면 false
    if (!tfName.getText().toString().trim().equals("")) return false;
    return true; // 비어 있을 경우
  }


  private boolean isEmptyMobile() { // 비어 있지 않으면 false
    if (!tfMobile.getText().toString().trim().equals("")) return false;
    return true; // 비어 있을 경우
  }

  @Override
  public void arrange() {
    add(lbTitle, "North");
    pnlCenter.add(lbId);
    pnlCenter.add(tfId);
    pnlCenter.add(lbPass);
    pnlCenter.add(pfPass);
    pnlCenter.add(lbName);
    pnlCenter.add(tfName);
    pnlCenter.add(lbMobile);
    pnlCenter.add(tfMobile);

    add(pnlCenter, "Center");

    pnlSouth.add(btnUpdate);
    pnlSouth.add(btnClose);

    add(pnlSouth, "South");
  }

  @Override
  public void inflate() {
    super.inflate();
  }
}

