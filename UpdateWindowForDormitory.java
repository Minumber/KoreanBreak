import javax.swing.JFrame;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class UpdateWindowForDormitory extends JFrame {
	private JTextField textField;
	private JTextField textField_2;
	private JTextField textField_3;
	private JTextField textField_4;
	private JTextField textField_5;
	private JTextField textField_7;
	private JTextField textField_8;
	private JTextField textField_9;
	private JTextField textField_10;
	private JTextField textField_11;
	private JTextField textField_12;
	private JTextField textField_1;
	private JTextField textField_6;
	private JTextField textField_13;
	private JTextField textField_14;
	private JTextField textField_15;
	private JTextField textField_16;
	private JTextField textField_17;
	private JTextField textField_18;
	private JTextField textField_19;
	private JTextField textField_20;
	public UpdateWindowForDormitory() {
		getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setText("생활관편집");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("HY견고딕", Font.PLAIN, 16));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(112, 128, 144));
		textField.setBounds(12, 10, 130, 30);
		getContentPane().add(textField);
		
		textField_2 = new JTextField();
		textField_2.setHorizontalAlignment(SwingConstants.CENTER);
		textField_2.setColumns(10);
		textField_2.setBackground(Color.WHITE);
		textField_2.setBounds(308, 210, 130, 29);
		getContentPane().add(textField_2);
		
		textField_3 = new JTextField();
		textField_3.setEditable(false);
		textField_3.setText("급식실");
		textField_3.setHorizontalAlignment(SwingConstants.CENTER);
		textField_3.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		textField_3.setColumns(10);
		textField_3.setBackground(Color.LIGHT_GRAY);
		textField_3.setBounds(223, 210, 86, 29);
		getContentPane().add(textField_3);
		
		textField_4 = new JTextField();
		textField_4.setText("2");
		textField_4.setHorizontalAlignment(SwingConstants.CENTER);
		textField_4.setEditable(false);
		textField_4.setColumns(10);
		textField_4.setBackground(Color.WHITE);
		textField_4.setBounds(97, 90, 86, 29);
		getContentPane().add(textField_4);
		
		textField_5 = new JTextField();
		textField_5.setText("생활관코드");
		textField_5.setHorizontalAlignment(SwingConstants.CENTER);
		textField_5.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		textField_5.setEditable(false);
		textField_5.setColumns(10);
		textField_5.setBackground(Color.LIGHT_GRAY);
		textField_5.setBounds(12, 90, 86, 29);
		getContentPane().add(textField_5);
		
		textField_7 = new JTextField();
		textField_7.setEditable(false);
		textField_7.setText("기숙기간");
		textField_7.setHorizontalAlignment(SwingConstants.CENTER);
		textField_7.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		textField_7.setColumns(10);
		textField_7.setBackground(Color.LIGHT_GRAY);
		textField_7.setBounds(438, 210, 86, 29);
		getContentPane().add(textField_7);
		
		textField_8 = new JTextField();
		textField_8.setHorizontalAlignment(SwingConstants.CENTER);
		textField_8.setColumns(10);
		textField_8.setBackground(Color.WHITE);
		textField_8.setBounds(523, 210, 130, 29);
		getContentPane().add(textField_8);
		
		JButton btnNewButton = new JButton("저장\r\n");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		btnNewButton.setBounds(522, 93, 91, 23);
		getContentPane().add(btnNewButton);
		
		textField_9 = new JTextField();
		textField_9.setText("기타공공요금");
		textField_9.setHorizontalAlignment(SwingConstants.CENTER);
		textField_9.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		textField_9.setEditable(false);
		textField_9.setColumns(10);
		textField_9.setBackground(Color.LIGHT_GRAY);
		textField_9.setBounds(223, 297, 86, 29);
		getContentPane().add(textField_9);
		
		textField_10 = new JTextField();
		textField_10.setHorizontalAlignment(SwingConstants.CENTER);
		textField_10.setColumns(10);
		textField_10.setBackground(Color.WHITE);
		textField_10.setBounds(308, 297, 130, 29);
		getContentPane().add(textField_10);
		
		textField_11 = new JTextField();
		textField_11.setText("식사비용7일");
		textField_11.setHorizontalAlignment(SwingConstants.CENTER);
		textField_11.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		textField_11.setEditable(false);
		textField_11.setColumns(10);
		textField_11.setBackground(Color.LIGHT_GRAY);
		textField_11.setBounds(438, 297, 86, 29);
		getContentPane().add(textField_11);
		
		textField_12 = new JTextField();
		textField_12.setHorizontalAlignment(SwingConstants.CENTER);
		textField_12.setColumns(10);
		textField_12.setBackground(Color.WHITE);
		textField_12.setBounds(523, 297, 130, 29);
		getContentPane().add(textField_12);
		
		textField_1 = new JTextField();
		textField_1.setText("생활관");
		textField_1.setHorizontalAlignment(SwingConstants.CENTER);
		textField_1.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		textField_1.setEditable(false);
		textField_1.setColumns(10);
		textField_1.setBackground(Color.LIGHT_GRAY);
		textField_1.setBounds(12, 210, 86, 29);
		getContentPane().add(textField_1);
		
		textField_6 = new JTextField();
		textField_6.setHorizontalAlignment(SwingConstants.CENTER);
		textField_6.setColumns(10);
		textField_6.setBackground(Color.WHITE);
		textField_6.setBounds(97, 210, 130, 29);
		getContentPane().add(textField_6);
		
		textField_13 = new JTextField();
		textField_13.setHorizontalAlignment(SwingConstants.CENTER);
		textField_13.setColumns(10);
		textField_13.setBackground(Color.WHITE);
		textField_13.setBounds(97, 297, 130, 29);
		getContentPane().add(textField_13);
		
		textField_14 = new JTextField();
		textField_14.setText("생활관사용료");
		textField_14.setHorizontalAlignment(SwingConstants.CENTER);
		textField_14.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		textField_14.setEditable(false);
		textField_14.setColumns(10);
		textField_14.setBackground(Color.LIGHT_GRAY);
		textField_14.setBounds(12, 297, 86, 29);
		getContentPane().add(textField_14);
		
		textField_15 = new JTextField();
		textField_15.setText("식사비용5일");
		textField_15.setHorizontalAlignment(SwingConstants.CENTER);
		textField_15.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		textField_15.setEditable(false);
		textField_15.setColumns(10);
		textField_15.setBackground(Color.LIGHT_GRAY);
		textField_15.setBounds(12, 388, 86, 29);
		getContentPane().add(textField_15);
		
		textField_16 = new JTextField();
		textField_16.setHorizontalAlignment(SwingConstants.CENTER);
		textField_16.setColumns(10);
		textField_16.setBackground(Color.WHITE);
		textField_16.setBounds(97, 388, 130, 29);
		getContentPane().add(textField_16);
		
		textField_17 = new JTextField();
		textField_17.setText("수용인원-남");
		textField_17.setHorizontalAlignment(SwingConstants.CENTER);
		textField_17.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		textField_17.setEditable(false);
		textField_17.setColumns(10);
		textField_17.setBackground(Color.LIGHT_GRAY);
		textField_17.setBounds(223, 388, 86, 29);
		getContentPane().add(textField_17);
		
		textField_18 = new JTextField();
		textField_18.setHorizontalAlignment(SwingConstants.CENTER);
		textField_18.setColumns(10);
		textField_18.setBackground(Color.WHITE);
		textField_18.setBounds(308, 388, 130, 29);
		getContentPane().add(textField_18);
		
		textField_19 = new JTextField();
		textField_19.setText("수용인원-여");
		textField_19.setHorizontalAlignment(SwingConstants.CENTER);
		textField_19.setFont(new Font("HY견고딕", Font.PLAIN, 12));
		textField_19.setEditable(false);
		textField_19.setColumns(10);
		textField_19.setBackground(Color.LIGHT_GRAY);
		textField_19.setBounds(438, 388, 86, 29);
		getContentPane().add(textField_19);
		
		textField_20 = new JTextField();
		textField_20.setHorizontalAlignment(SwingConstants.CENTER);
		textField_20.setColumns(10);
		textField_20.setBackground(Color.WHITE);
		textField_20.setBounds(523, 388, 130, 29);
		getContentPane().add(textField_20);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(695,500);
	}
	public static void main(String[] args) {
		new UpdateWindowForDormitory();

	}
}
