package simpleCalculator;

import java.awt.Color;
import java.awt.EventQueue;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.SwingConstants;
import javax.swing.JLabel;

public class guiCalculator {

	private JFrame frame;
	private JTextField textField;
	private JButton btn8;
	private JButton btnC;
	
	int flag = 0;
	
	String inputString = "";
	private JTextField loadText;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					guiCalculator window = new guiCalculator();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public guiCalculator() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 345, 609);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.getContentPane().setLayout(null);
		
		textField = new JTextField();
		textField.setHorizontalAlignment(SwingConstants.RIGHT);
		textField.setBounds(10, 10, 230, 52);
		frame.getContentPane().add(textField);
		textField.setColumns(10);
		
		Calculator calculate = new calculater();
		
		
		JLabel label = new JLabel("ans");
		label.setHorizontalAlignment(SwingConstants.RIGHT);
		label.setFont(new Font("Tahoma", Font.BOLD, 13));
		label.setBounds(250, 10, 70, 52);
		frame.getContentPane().add(label);
		
		
		
		
		//------------Row 1 --------------------------
		
		JButton btnErase = new JButton("<-");
		btnErase.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				String backSpace = null;
						
				if(textField.getText().length() > 0) {
							
					StringBuilder str = new StringBuilder(textField.getText());
					str.deleteCharAt(textField.getText().length()-1);
					backSpace = str.toString();
					textField.setText(backSpace);
				}
						
			}
		});
		btnErase.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnErase.setBounds(10, 72, 70, 70);
		frame.getContentPane().add(btnErase);
				
		JButton btnC = new JButton("C");
		btnC.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				textField.setText(null);
			}
		});
		btnC.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnC.setBounds(90, 72, 70, 70);
		frame.getContentPane().add(btnC);
				
		JButton btnMod = new JButton("%");
		btnMod.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			
				textField.setText(textField.getText()+"%");
				
			}
		});
		btnMod.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnMod.setBounds(170, 72, 70, 70);
		frame.getContentPane().add(btnMod);
				
		JButton btnPlus = new JButton("+");
		btnPlus.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "+");
				
			}
		});
		btnPlus.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnPlus.setBounds(250, 72, 70, 70);
		frame.getContentPane().add(btnPlus);
				
				
		//------------Row 2 --------------------------
				
				
		JButton btn7 = new JButton("7");
		btn7.setForeground(Color.RED);
		btn7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				String enterNumber = textField.getText() + btn7.getText();
				textField.setText(enterNumber);
				label.setText(null);
					
			}
		});
		btn7.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn7.setBounds(10, 150, 70, 70);
		frame.getContentPane().add(btn7);
				
		JButton btn8 = new JButton("8");
		btn8.setForeground(Color.CYAN);
		btn8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				String enterNumber = textField.getText() + btn8.getText();
				textField.setText(enterNumber);
				label.setText(null);

			}
		});
		btn8.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn8.setBounds(90, 150, 70, 70);
		frame.getContentPane().add(btn8);
				
		JButton btn9 = new JButton("9");
		btn9.setForeground(Color.BLUE);
		btn9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				String enterNumber = textField.getText() + btn9.getText();
				textField.setText(enterNumber);
				label.setText(null);
						
			}
		});
		btn9.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn9.setBounds(170, 150, 70, 70);
		frame.getContentPane().add(btn9);
				
		JButton btnSub = new JButton("-");
		btnSub.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText() + "-");
				
			}
		});
		btnSub.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnSub.setBounds(250, 150, 70, 70);
		frame.getContentPane().add(btnSub);
				
				
		//---------------- Row 3 ---------------------------
				
				
		JButton btn4 = new JButton("4");
		btn4.setForeground(Color.ORANGE);
		btn4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				String enterNumber = textField.getText() + btn4.getText();
				textField.setText(enterNumber);
				label.setText(null);
						
			}
		});
		btn4.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn4.setBounds(10, 227, 70, 70);
		frame.getContentPane().add(btn4);
				
		JButton btn5 = new JButton("5");
		btn5.setForeground(Color.MAGENTA);
		btn5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				String enterNumber = textField.getText() + btn5.getText();
				textField.setText(enterNumber);
				label.setText(null);
			}
		});
		btn5.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn5.setBounds(90, 227, 70, 70);
		frame.getContentPane().add(btn5);

		JButton btn6 = new JButton("6");
		btn6.setForeground(Color.GRAY);
		btn6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				String enterNumber = textField.getText() + btn6.getText();
				textField.setText(enterNumber);
				label.setText(null);

			}
		});
		btn6.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn6.setBounds(170, 227, 70, 70);
		frame.getContentPane().add(btn6);
				
		JButton btnMult = new JButton("*");
		btnMult.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText()+"*");
				
			}
		});
		btnMult.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnMult.setBounds(250, 227, 70, 70);
		frame.getContentPane().add(btnMult);
				
				
		//------------------ Row 4 ------------------------
				
				
		JButton btn1 = new JButton("1");
		btn1.setForeground(Color.LIGHT_GRAY);
		btn1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				String enterNumber = textField.getText() + btn1.getText();
				textField.setText(enterNumber);
				label.setText(null);
				
			}
		});
		btn1.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn1.setBounds(10, 307, 70, 70);
		frame.getContentPane().add(btn1);
				
		JButton btn2 = new JButton("2");
		btn2.setForeground(Color.YELLOW);
		btn2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				String enterNumber = textField.getText() + btn2.getText();
				textField.setText(enterNumber);
				label.setText(null);

			}
		});
		btn2.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn2.setBounds(90, 307, 70, 70);
		frame.getContentPane().add(btn2);
				
		JButton btn3 = new JButton("3");
		btn3.setForeground(Color.PINK);
		btn3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				String enterNumber = textField.getText() + btn3.getText();
				textField.setText(enterNumber);
				label.setText(null);

			}
		});
		btn3.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn3.setBounds(170, 307, 70, 70);
		frame.getContentPane().add(btn3);

		JButton btnDiv = new JButton("/");
		btnDiv.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				
				textField.setText(textField.getText()+"/");
				
			}
		});
		btnDiv.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnDiv.setBounds(250, 307, 70, 70);
		frame.getContentPane().add(btnDiv);
				
				
		//------------------ Row 5 ------------------------
				
				
		JButton btn0 = new JButton("0");
		btn0.setForeground(Color.GREEN);
		btn0.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
						
				String enterNumber = textField.getText() + btn0.getText();
				textField.setText(enterNumber);
				label.setText(null);
				
			}
		});
		btn0.setFont(new Font("Tahoma", Font.BOLD, 22));
		btn0.setBounds(10, 387, 70, 70);
		frame.getContentPane().add(btn0);
			
		JButton btnDot = new JButton(".");
		btnDot.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				String text = textField.getText();
				int count = 0;
				for(int i=0;i<text.length();i++) {
					if(text.charAt(i) == '.') {
						count++;
					}
				}
				if(! text.contains(".")) {
					textField.setText(textField.getText()+btnDot.getText());
				}else if(count <=1 && (text.contains("+") || text.contains("-") || text.contains("*") || text.contains("/") || text.contains("%"))) {
					textField.setText(textField.getText()+btnDot.getText());
				}
				
					
		  }
			
		});
		btnDot.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnDot.setBounds(90, 387, 70, 70);
		frame.getContentPane().add(btnDot);
				
		JButton btnLoad = new JButton("Load");
		btnLoad.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate.load();
			}
		});
		btnLoad.setFont(new Font("Tahoma", Font.BOLD, 14));
		btnLoad.setBounds(170, 387, 70, 70);
		frame.getContentPane().add(btnLoad);
				
		JButton btnEqual = new JButton("=");
		btnEqual.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				inputString = textField.getText();
				textField.setText("");
				calculate.input(inputString);
				String answer = calculate.getResult();
				label.setText(answer);
				
			}
		});
		btnEqual.setFont(new Font("Tahoma", Font.BOLD, 22));
		btnEqual.setBounds(250, 387, 70, 70);
		frame.getContentPane().add(btnEqual);
				
				
		//---------------------- Row 6 -------------------------------
				
				
		JButton btnCurrent = new JButton("Curr");
		btnCurrent.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(null);
				String current = calculate.current();
				textField.setText(current);
			}
		});
		btnCurrent.setFont(new Font("Tahoma", Font.BOLD, 16));
		btnCurrent.setBounds(10, 467, 70, 70);
		frame.getContentPane().add(btnCurrent);
				
		JButton btnPrev = new JButton("Prev");
		btnPrev.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(null);
				String prev = calculate.prev();
				textField.setText(prev);
				
			}
		});
		btnPrev.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnPrev.setBounds(90, 467, 70, 70);
		frame.getContentPane().add(btnPrev);
				
		JButton btnNext = new JButton("Next");
		btnNext.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				label.setText(null);
				String next = calculate.next();
				textField.setText(next);
				
			}
		});
		btnNext.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnNext.setBounds(170, 467, 70, 70);
		frame.getContentPane().add(btnNext);
				

		JButton btnSave = new JButton("Save");
		btnSave.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				calculate.save();
			}
		});
		btnSave.setFont(new Font("Tahoma", Font.BOLD, 15));
		btnSave.setBounds(250, 467, 70, 70);
		frame.getContentPane().add(btnSave);
		
		
		
		

		
	}
}