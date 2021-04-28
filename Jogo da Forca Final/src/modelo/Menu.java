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
 * Essa classe constrói a tela do menu e define a aparência dela.
 * @author matheushenrick
 * @version 1.3
 */

@SuppressWarnings("serial")
public class Menu extends JPanel{
	private JLabel imagemFundo;
	private JLabel frase;
	private JButton cidades;
	private JButton paises;
	private JButton animais;
	private JButton filmes;
	private JButton voltar;
	
	public Menu() {
		imagemFundo = new JLabel();
		frase = new JLabel("Escolha um tema:");
		cidades = new JButton("Cidades");
		paises = new JButton("PaIses");
		animais = new JButton("Animais");
		filmes = new JButton("Filmes");
		voltar = new JButton("Voltar");
		
		cidades.setBounds(110, 91, 150, 25);
		paises.setBounds(110, 168, 150, 25);
		animais.setBounds(110, 251, 150, 25);
		filmes.setBounds(110, 333, 150, 25);
		voltar.setBounds(261, 573, 128, 25);

		setBackground(new Color(20,20,20));
		setLayout(null);
		setSize(650,610);
		
		frase.setBounds(105, 0, 440, 62);
		frase.setFont(new Font("DriftType", Font.BOLD, 24));
		frase.setForeground(new Color(41,24,13));
		frase.setHorizontalAlignment(SwingConstants.CENTER);
		frase.setHorizontalTextPosition(SwingConstants.CENTER);
		
		imagemFundo.setBounds(12, 0, 626, 598);
		imagemFundo.setIcon(new ImageIcon(Menu.class.getResource("/imagens/476bf8d5e39bb0612a79933c75907a4a.jpg")));
		imagemFundo.setHorizontalAlignment(SwingConstants.CENTER);
		
		cidades.setBackground(new Color(0,0,0,0));
		cidades.setBorderPainted(false);
		cidades.setContentAreaFilled(false);
		cidades.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		cidades.setFocusable(false);
		cidades.setFont(new Font("DriftType", Font.BOLD, 23));
		cidades.setForeground(new Color(41,24,13));
		cidades.setHorizontalTextPosition(SwingConstants.CENTER);
		
		paises.setBackground(new Color(0,0,0,0));
		paises.setBorderPainted(false);
		paises.setContentAreaFilled(false);
		paises.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		paises.setFocusable(false);
		paises.setFont(new Font("DriftType", Font.BOLD, 23));
		paises.setForeground(new Color(41,24,13));
		paises.setHorizontalTextPosition(SwingConstants.CENTER);
		
		animais.setBackground(new Color(0,0,0,0));
		animais.setBorderPainted(false);
		animais.setContentAreaFilled(false);
		animais.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		animais.setFocusable(false);
		animais.setFont(new Font("DriftType", Font.BOLD, 23));
		animais.setForeground(new Color(41,24,13));
		animais.setHorizontalTextPosition(SwingConstants.CENTER);
		
		filmes.setBackground(new Color(0,0,0,0));
		filmes.setBorderPainted(false);
		filmes.setContentAreaFilled(false);
		filmes.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		filmes.setFocusable(false);
		filmes.setFont(new Font("DriftType", Font.BOLD, 23));
		filmes.setForeground(new Color(41,24,13));
		filmes.setHorizontalTextPosition(SwingConstants.CENTER);
		
		voltar.setBackground(new Color(0,0,0,0));
		voltar.setBorderPainted(false);
		voltar.setContentAreaFilled(false);
		voltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		voltar.setFocusable(false);
		voltar.setFont(new Font("DriftType", Font.BOLD, 23));
		voltar.setForeground(new Color(41,24,13));
		voltar.setHorizontalTextPosition(SwingConstants.CENTER);
		
		add(frase);
		add(cidades);
		add(paises);
		add(animais);
		add(filmes);
		add(voltar);
		add(imagemFundo);
	}

	public JButton getCidades() {
		return cidades;
	}

	public JButton getPaises() {
		return paises;
	}

	public JButton getAnimais() {
		return animais;
	}

	public JButton getFilmes() {
		return filmes;
	}

	public JButton getVoltar() {
		return voltar;
	}
}
