package p12_database.ui;

import javax.swing.*;

public abstract class FrmLogin extends FrmBasic{
  private JLabel lbLogin, lbId, lbPass;
  private JTextField tfId;
  private JPasswordField pfPass;
  private JButton btnLogin, btnJoin, btnClose;

  public FrmLogin(String title, int width, int height) {
    super(title, width, height);
  }

  @Override
  public void init() {

  }

  @Override
  public void arrange() {

  }

  @Override
  public void inflate() {
    super.inflate();
  }
}
