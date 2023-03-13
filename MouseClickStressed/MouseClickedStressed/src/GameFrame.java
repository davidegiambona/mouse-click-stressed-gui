import java.awt.Color;
import java.awt.Dimension;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GameFrame extends JFrame implements ActionListener{
	
	static final int SCREEN_WIDTH = 850;
	static final int SCREEN_HEIGHT = 600;
	static int clickMouse = 0;
	JLabel lClick, lTypeClick;
	JButton addBtn, removeBtn, less10Btn, more10Btn, restartBtn;
	
	GameFrame() {
		this.setPreferredSize(new Dimension(SCREEN_WIDTH,SCREEN_HEIGHT));
		this.setBackground(Color.white);
		this.setFocusable(true);
		this.setTitle("Mouse Clicked");
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setResizable(false);
		this.pack();
		this.setVisible(true);
		this.setLocationRelativeTo(null);

		lClick = new JLabel();
		lClick.setBounds(50, 50, 400, 400);
		lClick.setFont(new Font("Verdana", Font.PLAIN, 35));
		lClick.setBorder(BorderFactory.createBevelBorder(1));
		lClick.setOpaque(true);
		lClick.setHorizontalAlignment(JTextField.CENTER);

		lTypeClick = new JLabel();
		lTypeClick.setBounds(50, 100, 200, 50); //(int x, int y, int width, int height);
		lTypeClick.setFont(new Font("Verdana", Font.PLAIN, 35));
		lTypeClick.setBorder(BorderFactory.createBevelBorder(3));
		lTypeClick.setOpaque(true);
		lTypeClick.setHorizontalAlignment(JTextField.CENTER);

		addBtn = new JButton("+");
		addBtn.setBounds(500, 50, 300, 150);
		addBtn.setFont(new Font("Cursive", Font.PLAIN, 20));
		addBtn.setFocusable(false);
		addBtn.addActionListener( this);

		removeBtn = new JButton("-");
		removeBtn.setBounds(500, 200, 300, 150);
		removeBtn.setFont(new Font("Cursive", Font.PLAIN, 20));
		removeBtn.setFocusable(false);
		removeBtn.addActionListener(this);

		less10Btn = new JButton("-10");
		less10Btn.setBounds(500, 400, 150, 50);
		less10Btn.setFont(new Font("Cursive", Font.PLAIN, 20));
		less10Btn.setFocusable(false);
		less10Btn.addActionListener(this);
		
		more10Btn = new JButton("+10");
		more10Btn.setBounds(650, 400, 150, 50);
		more10Btn.setFont(new Font("Cursive", Font.PLAIN, 20));
		more10Btn.setFocusable(false);
		more10Btn.addActionListener(this);
		
		restartBtn = new JButton("Restart");
		restartBtn.setBounds(500, 350, 300, 50);
		restartBtn.setFont(new Font("Cursive", Font.PLAIN, 20));
		restartBtn.setFocusable(false);
		restartBtn.addActionListener(this);
		
		this.add(addBtn);
		this.add(removeBtn);
		this.add(less10Btn);
		this.add(more10Btn);
		this.add(restartBtn);
		this.add(lClick);
		this.add(lTypeClick);
		
	}

	@Override
	public void actionPerformed(ActionEvent e) {
	// TODO Auto-generated method stub
		switch(e.getActionCommand()) {
		case "+":
			lClick.setText(clickMouse + "...Click!");
			clickMouse++;
			break; 
		case "-":
			lClick.setText(clickMouse + "...Click!");
			clickMouse--;
			break;
		case "-10":
			lClick.setText(clickMouse + "...Click!");
			clickMouse -=10;
			break;
		case "+10":
			lClick.setText(clickMouse + "...Click!");
			clickMouse +=10;
		break;
		case "Restart":
			lClick.setText(clickMouse + "...Click!");
			clickMouse = 0;
		break;
		}
	}

}