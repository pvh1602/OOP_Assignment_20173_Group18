package oopAssignment;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextArea;
import java.awt.Font;
import java.awt.Color;

public class About extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	public About() {
		setDefaultCloseOperation(JFrame.HIDE_ON_CLOSE);
		setBounds(100, 100, 600, 588);
		contentPane = new JPanel();
		contentPane.setBackground(Color.WHITE);
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JTextArea textArea = new JTextArea();
		textArea.setEditable(false);
		textArea.setWrapStyleWord(true);
		textArea.setLineWrap(true);
		textArea.setBounds(20, 11, 550, 513);
		textArea.setFont(new Font("Verdana", Font.PLAIN, 15));
		contentPane.add(textArea);
		textArea.setText("        Hướng dẫn sử dụng:\n" + 
				"    1. Muốn tạo công việc mới, trước hết phải tạo nhóm công việc mới, bằng cách click vào Tab mới.\n" +
				"Lý do là vì 3 tab đầu chỉ để hiển thị mà không thể thêm, xóa, sửa công việc.\n" +
				"    2. Công dụng 3 tab đầu:\n" +
				"    Tab việc trong ngày sẽ hiển thị các công việc mà nó được đặt ra và hoàn thành trong cùng 1 ngày, ngày hiển thị ở đây là ngày được chọn tại khung Calendar.\n"+
				"    Tab việc trong tuần cũng tương tự, nó hiển thị công việc trong cùng 1 tuần, với tuần là tuần của ngày được chọn ở khung Calendar.\n" +
				"    Tương tự cho tab việc trong tháng.\n"+
				"Sau khi chọn ngày, muốn hiển thị công việc ở 3 tab đầu, hãy nhấn vào nút Cập nhật.\n" +
				"    3. Bất cứ khi nào bạn thêm, xóa, sửa công việc hoặc 1 tab, hãy nhấn Cập nhật để chương trình lưu lại sự thay đổi của bạn.\n" +
				"    4. Muốn công việc được thông báo, hãy tích vào checkbox Thông báo, nếu không nó sẽ không được thông báo.\n"+
				"    5. Muốn tắt ứng dụng, hãy Click chuột phải vào icon dưới thanh taskbar chọn Exit\n" +
				"\n_______________________\n" 
				
				);
	}

}
