package modelo;

import java.awt.Color;
import java.awt.Font;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Cursor;

/**
 * Essa classe constrói a tela inicial e define a aparência dela
 * @author matheushenrick
 * @version 1.1
 */

@SuppressWarnings("serial")
public class Inicio extends JPanel{
	private JButton iniciar;
	private JButton sair;
	private JLabel imagemFundo;
	
	public Inicio() {
		iniciar = new JButton("Iniciar");
		sair = new JButton("X");
		imagemFundo = new JLabel();
		
		iniciar.setBounds(257, 243, 135, 34);
		sair.setBounds(296, 312, 58, 58);
		
		setBackground(new Color(20,20,20));
		setLayout(null);

		imagemFundo.setBounds(12, 0, 626, 598);
		imagemFundo.setIcon(new ImageIcon(Inicio.class.getResource("/imagens/476bf8d5e39bb0612a79933c75907a4a.jpg")));
		imagemFundo.setHorizontalAlignment(SwingConstants.CENTER);
		
		iniciar.setBackground(new Color(0,0,0,0));
		iniciar.setBorderPainted(false);
		iniciar.setContentAreaFilled(false);
		iniciar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		iniciar.setFocusable(false);
		iniciar.setFont(new Font("DriftType", Font.BOLD, 24));
		iniciar.setForeground(new Color(41,24,13));
		iniciar.setHorizontalTextPosition(SwingConstants.CENTER);

		sair.setBackground(new Color(0,0,0,0));
		sair.setBorderPainted(false);
		sair.setContentAreaFilled(false);
		sair.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		sair.setFocusable(false);
		sair.setFont(new Font("DriftType", Font.BOLD, 30));
		sair.setForeground(new Color(41,24,13));
		sair.setHorizontalTextPosition(SwingConstants.CENTER);
		
		add(iniciar);
		add(sair);
		add(imagemFundo);   
	}
	
	public JButton getIniciar() {
		return iniciar;
	}

	public JButton getSair() {
		return sair;
	}
}
