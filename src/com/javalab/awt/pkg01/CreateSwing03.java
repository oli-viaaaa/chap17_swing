package com.javalab.awt.pkg01;

import javax.swing.JButton;
import javax.swing.JFrame;

/*
 * JFrame 객체를 상속해서 만들기
 */

public class CreateSwing03 extends JFrame { // JFrame 상속
	// 필드
	JFrame frame;

	// 기본생성자
	public CreateSwing03() {
		JButton b = new JButton("click"); // 버튼 객체 생성
		b.setBounds(130, 100, 100, 40);

		add(b); // JFrame을 상속했기 때문에 JFrame이 갖고 있는 add 메소드 바로 사용
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(400, 500);
		setLayout(null);
		setVisible(true);
	}

	public static void main(String[] args) {
		new CreateSwing03();
	}

}
