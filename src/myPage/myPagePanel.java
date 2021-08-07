
package myPage;

import java.awt.Color;
import java.awt.Font;
import java.awt.Image;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class myPagePanel extends JPanel {
	
	public myPagePanel(JFrame frame) {
	      super();
	      panelInit(frame);
	   }
	
	private void panelInit(JFrame frame) {
	      // myPage 화면 패널
	      this.setBackground(new Color(255, 255, 255));
	      this.setBounds(0, 0, 1280, 960);
	      this.setLayout(null);

	      //로그인 글자
	      JLabel IDtitle = new JLabel("마이페이지");
	      IDtitle.setBounds(130, 50, 800, 35);
	      IDtitle.setFont(new Font("고딕", Font.BOLD, 30)); // Font
	      IDtitle.setForeground(Color.white); // Color
	      IDtitle.setBackground(new Color(24, 23, 23));
	      IDtitle.setOpaque(true);
	      IDtitle.setHorizontalAlignment(JLabel.CENTER);
	      this.add(IDtitle);

	  		JLabel nicInput = new JLabel("닉네임");
	  		nicInput.setBounds(330, 120, 200, 40);
	  		nicInput.setFont(new Font("고딕", Font.BOLD, 20)); // Font
	  		nicInput.setForeground(Color.black); // Color
	  		nicInput.setBackground(new Color(166, 166, 166));
	  		nicInput.setOpaque(true);
	  		nicInput.setHorizontalAlignment(JLabel.CENTER);
		    this.add(nicInput);
	  		
	  	   // 이름 입력
		    //DB 회원 - 닉네임 불러오기
			JTextField NicInput = new JTextField("닉네임");
			NicInput.setBounds(535, 120, 400, 40);
			NicInput.setFont(new Font("고딕", Font.BOLD, 20)); // Font
			NicInput.setForeground(Color.black); // Color
			NicInput.setOpaque(true);
			NicInput.setHorizontalAlignment(JLabel.CENTER);
		    this.add(NicInput);
		    

		      
		      //int cnt = 0;

		      
				//칸을 mainFrame으로 옮겨보기!!!!
				
				//자동스크롤
				//JScrollPane scrollPane = new JScrollPane(introInput);
				//scrollPane.setVerticalScrollBarPolicy(scrollPane.VERTICAL_SCROLLBAR_ALWAYS);
				
		        //scrollPane.setBounds(12, 10, 471, 389);
		        //frame.getContentPane().add(scrollPane);
				
				//this.add(scrollPane); //화면에 추가

		    //사진 등록
			ImageIcon icon = new ImageIcon("./img/header.png");
			
			Image regImg = icon.getImage();
			Image changeImg = regImg.getScaledInstance(200, 250, Image.SCALE_SMOOTH);
			ImageIcon changeIcon = new ImageIcon(changeImg);
			
			JLabel regLabel = new JLabel(changeIcon);
			
			regLabel.setBounds(130, 120, 190, 250);
			add(regLabel);;

			
	}
	
	
}
