package com.javalab.awt.pkg05;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/*
 * Swing으로 사칙연산 계산기 프로그램 만들기
 */

public class CalculatorExam01 extends JFrame implements ActionListener {
	private JTextField tf1, tf2, tf3;
	private JButton addBtn, subtractBtn, multiplyBtn, divideBtn;
	
	public CalculatorExam01() {
		super("Calculator");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		tf1 = new JTextField(10); // 텍스트 필드 입력칸 객체 생성
		tf2 = new JTextField(10);
		tf3 = new JTextField(10);
		tf3.setEditable(false); // 편집 불가(결과창)
		
		addBtn = new JButton("+"); // 더하기 버튼
		subtractBtn = new JButton("-"); // 빼기 버튼
		multiplyBtn = new JButton("*"); // 곱하기 버튼
		divideBtn = new JButton("/"); // 나누기 버튼
		
		addBtn.addActionListener(this);		// 버튼에 액션 리스너 부착
		subtractBtn.addActionListener(this);
		multiplyBtn.addActionListener(this);
		divideBtn.addActionListener(this);
		
		
		// 4행 3열의 그리드 레이아웃이 적용된 패널 생성
		// 칸을 나누고 순차적으로 하나의 컴포넌트를 추가해나간다.
		// 남는 칸은 빈칸으로 남아있음
		JPanel p = new JPanel(new GridLayout(5,2));
		p.add(new JLabel("첫번째 숫자 : "));
		p.add(tf1);
		p.add(new JLabel("두번째 숫자 : "));
		p.add(tf2);
		p.add(new JLabel("연산결과 : "));
		p.add(tf3);
		p.add(addBtn);
		p.add(multiplyBtn);
		p.add(subtractBtn);
		p.add(divideBtn);
		
		// 컨텐트 패널은 JFrame의 기본 컨테이너이며 프레임 내의 콘텐츠 및 구성 요소 관리를 담당
		// 프레임> 메인 컨턴트 패널> 패널 > 컴포넌트(버튼, 레이블, 텍스트필드)
		setContentPane(p); // 패널을 메인 (Root)컨텐트 패널에 추가하는 메소드
		pack(); // pack() 패널에 맞게 크기가 적절하게 조정되도록 프레임에서 호출해줌
		setVisible(true);
	}
	// 액션 리스너(이벤트가 발생했을때 처리하는 메소드)
	public void actionPerformed(ActionEvent e) {
		double num1 = Double.parseDouble(tf1.getText());
		double num2 = Double.parseDouble(tf2.getText());
		double result = 0;
		String operator = e.getActionCommand();
		
		switch (operator) {
		case "+":
			result = num1+num2;
			break;
		case "-":
			result = num1-num2;
			break;
		case "*":
			result = num1*num2;
			break;
		case "/":
			result = num1/num2;
			break;
		}
		// setText : 텍스트 필드에는 문자열을 지정해야함(String type)
		tf3.setText(String.valueOf(result));
		
	}
	public static void main(String[] args) {
		new CalculatorExam01();

	}
}
