import javax.swing.JFrame;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;
import java.sql.*;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import java.awt.Color;
import java.awt.Font;
import javax.swing.SwingConstants;
import javax.swing.JButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

public class AdminAwaiterTable extends JFrame {
	private JTextField textField;
	public AdminAwaiterTable() {
		String title[]= {"학번","대기번호","휴대전화번호"};
		DefaultTableModel model = new DefaultTableModel(title, 0); 
		JTable table = new JTable(model);
		table.addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				int row = table.getSelectedRow();
				int column = table.getSelectedColumn();
				Object value = table.getValueAt(row, column);
			}
		});
		table.setBounds(12, 379, 860, 264);
		String arr[]={};
		model.addRow(arr); //테이블에 행 추가
		String str1=null;
		int i1,i2;
		try {
			Connection con = null;
			Statement st = null;
			ResultSet rs = null;
			con = DriverManager.getConnection("jdbc:mysql://localhost/test1?serverTimezone=Asia/Seoul", "root", "lucifer1*");
			st = con.createStatement();
			str1 = "select * from 대기";
			rs = st.executeQuery(str1);
			ResultSetMetaData rsmt = rs.getMetaData();
			while(rs.next()){

				str1=rs.getString(1);
				i1=rs.getInt(2);
				i2=rs.getInt(3);
				//getString(컬럼 번호)
				//여기서 컬럼번호는 1부터 시작
				arr[0]=str1;
				arr[1]=i1+"";
				arr[2]=i2+"";
				model.addRow(arr);

			}
			//리소스 반환
			con.close();
			rs.close();
		} catch (Exception e1) {
			e1.printStackTrace();
		}
		getContentPane().setLayout(null);
		
		JScrollPane scrollPane = new JScrollPane();
		scrollPane.setBounds(12, 242, 860, 387);
		getContentPane().add(scrollPane);
		scrollPane.setViewportView(table);
		
		textField = new JTextField();
		textField.setText("대기자명단");
		textField.setHorizontalAlignment(SwingConstants.CENTER);
		textField.setFont(new Font("HY견고딕", Font.PLAIN, 16));
		textField.setEditable(false);
		textField.setColumns(10);
		textField.setBackground(new Color(112, 128, 144));
		textField.setBounds(12, 10, 130, 30);
		getContentPane().add(textField);
		setVisible(true);
		setDefaultCloseOperation(JFrame.DISPOSE_ON_CLOSE);
		setSize(902,676);
	}

	public static void main(String[] args) {
		new AdminAwaiterTable();

	}
}
