package modelo;

import javax.swing.JLabel;
import javax.swing.JPanel;
import java.awt.Color;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

public class Boneco {
	private JPanel painel;
	private JLabel boneco;
	
	public Boneco() {
		painel = new JPanel();
		boneco = new JLabel();
		painel.setSize(650,610);

		painel.setLayout(null);
		painel.setLocation(0, 0);
		painel.setBackground(new Color(0,0,0,0));

		boneco.setBounds(430, 0, 132, 246);
		boneco.setHorizontalAlignment(SwingConstants.CENTER);
		boneco.setIcon(new ImageIcon(Boneco.class.getResource("/imagens/Boneco.png")));
		
		painel.add(boneco);
	}

	public JLabel getBoneco() {
		return boneco;
	}

	public JPanel getPainel() {
		return painel;
	}
}
