package p12_database.ui;

import p12_database.dao.MembersDAO;
import p12_database.vo.Members;

import javax.swing.*;
import java.awt.*;

public class FrmJoin extends FrmBasic {
  private JLabel lbLogin, lbId, lbPass, lbMobile, lbName;
  private JTextField tfId, tfMobile, tfName;
  private JPasswordField pfPass;
  private JButton btnLogin, btnJoin, btnClose;
  private JPanel pnlCenter, pnlSouth;


  public FrmJoin(String title, int width, int height) {
    super(title, width, height);
  }

  @Override
  public void init() {
    lbLogin = new JLabel("Join");
    lbLogin.setFont(new Font("맑은 고딕", Font.BOLD | Font.CENTER_BASELINE, 30));
    lbLogin.setHorizontalAlignment(JLabel.CENTER);
    lbLogin.setBorder(BorderFactory.createEmptyBorder(0, 0, 20, 0));
    lbId = new JLabel("ID");
    lbName = new JLabel("Name");
    lbPass = new JLabel("Pass");
    lbMobile = new JLabel("Mobile");
    tfId = new JTextField(20);
    tfName = new JTextField(20);
    pfPass = new JPasswordField(20);
    tfMobile = new JTextField(20);
    btnJoin = new JButton("Join");
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
        joinAccess(tfId.getText(), new String(pfPass.getPassword()),
            tfName.getText(), tfMobile.getText());
      }
    });

    btnJoin.addActionListener(e -> {
      if (!isEmptyId() && !isEmptyPass() && !isEmptyName() && !isEmptyMobile()) {
        joinAccess(tfId.getText(), new String(pfPass.getPassword()),
            tfName.getText(), tfMobile.getText());
      }
    });


    btnJoin.addActionListener(e -> {
      new FrmLogin("Login", 270, 200);
      dispose();
    });

    btnClose.addActionListener(e -> {
      dispose();
    });


    pnlCenter = new JPanel(new GridLayout(2, 2));
    pnlCenter.setBorder(BorderFactory.createEmptyBorder(0, 30, 20, 30));
    pnlSouth = new JPanel();
  }

  private void joinAccess(String id, String pass, String name, String mobile) {
    MembersDAO membersDAO = new MembersDAO();
    Members members = membersDAO.loginChecks(id, pass);

    if (members == null) {
      membersDAO.insertMembers();
      new FrmMain("회원정보관리" + members.getName() + "님 환영합니다.", 600, 600);
      dispose();
    } else {
      JOptionPane.showMessageDialog(this, "중복된 ID입니다.");
    }
  }

  private boolean isEmptyId() { // 비어 있지 않으면 false
    if (tfId.getText().toString().trim().equals("")) return false;
    return true; // 비어 있을 경우
  }

  private boolean isEmptyPass() { // 비어 있지 않으면 false
    if (!new String(pfPass.getPassword()).toString().trim().equals("")) return false;
    return true; // 비어 있을 경우
  }

  private boolean isEmptyName() { // 비어 있지 않으면 false
    if (tfName.getText().toString().trim().equals("")) return false;
    return true; // 비어 있을 경우
  }


  private boolean isEmptyMobile() { // 비어 있지 않으면 false
    if (tfMobile.getText().toString().trim().equals("")) return false;
    return true; // 비어 있을 경우


    @Override
    public void arrange () {
      add(lbLogin, "North");
      pnlCenter.add(lbId);
      pnlCenter.add(tfId);
      pnlCenter.add(lbPass);
      pnlCenter.add(pfPass);
      pnlCenter.add(lbName);
      pnlCenter.add(tfName);
      pnlCenter.add(lbMobile);
      pnlCenter.add(tfMobile);
      add(pnlCenter, "Center");
      pnlSouth.add(btnJoin);
      pnlSouth.add(btnClose);
      add(pnlSouth, "South");
    }


    @Override
    public void inflate () {
      super.inflate();
    }
  }