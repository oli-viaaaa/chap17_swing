package com.javalab.awt.pkg03;

import javax.swing.JFrame;
import javax.swing.JLabel;

/*
 * 레이블(JLabel) 컴포넌트 클래스
 * 	- (참고)http://www.javatpoint.com/java-jlabel
 * 	- 한 줄의 읽기 전용 텍스트를 표시하는데 사용됩니다.
 * 	- JLabel 클래스의 개체는 프레임(컨테이너)에 텍스트를 배치하기 위한 구성요서입니다.
 * 	- 텍스트는 응용 프로그램에서 변경할 수 있지만 사용자가 직접 편집할 수는 없다.
 * 	- JComponent 클래스를 상속합니다.
 */

public class Labe101 {
	public static void main(String[] args) {
		JFrame f = new JFrame("프레임 타이틀"); // 프레임 생성
		f.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JLabel label, label2; // 레이블 변수 선언

		label = new JLabel("First Label"); // 레이블 객체 생성
		label.setBounds(50, 50, 100, 30); // 레이블 설정
		label.setFont(label.getFont().deriveFont(20.0f));

		label2 = new JLabel("Second Label");
		label2.setBounds(50, 100, 100, 30);
		label2.setFont(label2.getFont().deriveFont(20.0f));

		f.add(label);
		f.add(label2);

		f.setSize(400, 400);
		f.setLayout(null);
		f.setVisible(true);
	}

}
