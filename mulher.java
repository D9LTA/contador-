package codigo2;

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class mulher implements ActionListener {       // nao tem nada haver com mulkehr e so um contador simples fiz de palçhalçada
	
	int count = 0;
private	JLabel label;
private	JFrame frame;
private	JPanel panel;


	public mulher() {          // descuykpoa to com preguiça de mudar o noem esecrevi sem querer
	
		frame = new JFrame();       //gente como usa o windowbuilder escrfever e muito dificil
		
		JButton button = new JButton("contador");
		button.addActionListener(this);
		 label = new JLabel("contados: 0");
		
		panel = new JPanel();
		panel.setBorder(BorderFactory.createEmptyBorder(60,	60,	40,	60)); // 
		panel.setLayout(new GridLayout(0, 1));
		panel.add(button);
		panel.add(label);
		
		frame.add(panel, BorderLayout.CENTER);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setTitle("contados");
		frame.pack();
		frame.setVisible(true);
	
	}
	
	public static void main(String[] args) {
		new	mulher();

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		count++;
		label.setText("contados: " + count);
	}

}