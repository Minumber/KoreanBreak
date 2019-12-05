import javax.swing.*;
import java.sql.*;
import java.awt.*;
import java.io.*;
import java.util.Vector;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.ResultSetMetaData;
import java.sql.Statement;
import java.util.Vector;
import java.awt.event.*;
import javax.swing.border.EmptyBorder;
import javax.swing.filechooser.*;

// JOptionPane.showMessageDialog(owner, "�α��� ����"); //this : �θ� ������ �߾ӿ� ǥ��,  this�� �ȵǹǷ� ������ owner = this,  null : ȭ�� �߾�

public class Login extends JFrame {
	private JTextField textLogin;
	private JPasswordField textPassword;
	private JButton btnOk;
	private Login owner; // �ؽ�Ʈ ����

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Login frame = new Login();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Login() {
		super("로그인창"); // ����

		owner = this; // ������

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 424, 271);
		getContentPane().setLayout(null);

		JLabel lblNewLabel = new JLabel("\uC544\uC774\uB514");
		lblNewLabel.setBounds(35, 37, 60, 40);
		getContentPane().add(lblNewLabel);

		JLabel lblNewLabel_1 = new JLabel("\uBE44\uBC00\uBC88\uD638");
		lblNewLabel_1.setBounds(35, 98, 60, 40);
		getContentPane().add(lblNewLabel_1);

		textLogin = new JTextField();
		textLogin.setBounds(109, 38, 259, 39);
		textLogin.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {

			}
		});
		getContentPane().add(textLogin);
		textLogin.setColumns(10);
		textPassword = new JPasswordField();
		textPassword.setBounds(109, 98, 260, 40);
		textPassword.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				btnOk.doClick(); // ����
			}
		});
		getContentPane().add(textPassword);

		btnOk = new JButton("\uB85C\uADF8\uC778");
		btnOk.setBounds(35, 150, 333, 40);
		btnOk.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				if(textLogin.getText().toString().trim().equals(""))
					JOptionPane.showMessageDialog(null, "ID를 입력하세요.");
				else if(textPassword.getText().toString().trim().equals(""))
					JOptionPane.showMessageDialog(null, "PASSWORD를 입력하세요.");
				else {
					SQL sql = new SQL();
					sql.setInfo(textLogin.getText().toString().trim(), textPassword.getText().toString().trim());
					sql.doLogin();
					
					if(sql.getInfo().getName() == null)
						JOptionPane.showMessageDialog(null, "로그인 정보가 잘못되었습니다.");
					else {
						new StudentMenu();
						setVisible(false);
					}
				}
			}
		});
		getContentPane().add(btnOk);

		// ��Ȱ�� ��û â

		// ��Ȱ�� ��û â ��


	}
}