package modelo;

import java.awt.Color;
import java.awt.Cursor;
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.Font;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import lista.ListaDePalavras;

public class JanelaPartida {
	private ListaDePalavras lista = new ListaDePalavras();
	private int posPalavra;
	private char letra;
	private JPanel painel;
	private JLabel imagemFundo;
	private JLabel temaLabel;
	private JLabel palavraLabel;
	private String palavra;
	private char[] palavraAuxiliar;
	private char str[];
	private Boneco boneco;
	private JButton a;
	private JButton b;
	private JButton c;
	private JButton d;
	private JButton e;
	private JButton f;
	private JButton g;
	private JButton h;
	private JButton i;
	private JButton j;
	private JButton k;
	private JButton l;
	private JButton m;
	private JButton n;
	private JButton o;
	private JButton p;
	private JButton q;
	private JButton r;
	private JButton s;
	private JButton t;
	private JButton u;
	private JButton v;
	private JButton w;
	private JButton x;
	private JButton y;
	private JButton z;
	private JButton voltar;
	private int contadorErros=0;
	
	private JPanel aviso;
	private JPanel painelPreto;
	private JLabel avisoLabel;
	private JLabel avisoLabelFundo;
	private JButton botaoAviso;

	public JanelaPartida() {
		painel = new JPanel();
		imagemFundo = new JLabel();
		temaLabel = new JLabel();
		palavraLabel = new JLabel();
		palavraLabel.setLocation(100, 237);
		boneco = new Boneco();
		voltar = new JButton("Voltar");

		imagemFundo.setBounds(12, 0, 426, 248);
		temaLabel.setBounds(100, 0, 127, 47);
		voltar.setBounds(261, 573, 128, 25);

		painel.setBackground(new Color(20,20,20));
		painel.setLayout(null);
		painel.setSize(650,610);

		temaLabel.setFont(new Font("Chiller", Font.BOLD, 28));
		temaLabel.setForeground(new Color(17,17,17));
		
		palavraLabel.setForeground(new Color(67,46,28));
		palavraLabel.setFocusable(false);
		palavraLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		palavraLabel.setHorizontalAlignment(SwingConstants.CENTER);
		palavraLabel.setFont(new Font("Chiller", Font.BOLD, 23));
		palavraLabel.setSize(370, 56);
		palavraLabel.setText(null);
		
		voltar.setBackground(new Color(0,0,0,0));
		voltar.setBorderPainted(false);
		voltar.setContentAreaFilled(false);
		voltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		voltar.setFocusable(false);
		voltar.setFont(new Font("DriftType", Font.BOLD, 23));
		voltar.setForeground(new Color(67,46,28));
		voltar.setHorizontalTextPosition(SwingConstants.CENTER);
		
		imagemFundo.setBounds(12, 0, 626, 598);
		imagemFundo.setIcon(new ImageIcon(JanelaPartida.class.getResource("/imagens/476bf8d5e39bb0612a79933c75907a4a.jpg")));
		imagemFundo.setHorizontalAlignment(SwingConstants.CENTER);
		
		aviso = new JPanel();
		painelPreto = new JPanel();
		botaoAviso = new JButton("Voltar");
		
		aviso.setBounds(12, 0, 626, 598);
		aviso.setBackground(new Color(20,20,20,220));
		aviso.setLayout(null);
		painelPreto.setBounds(0, 0, 626, 598);
		painelPreto.setBackground(new Color(20,20,20,220));
		painelPreto.setLayout(null);
		avisoLabelFundo = new JLabel();
		
		avisoLabelFundo.setBounds(0, 0, 626, 598);
		avisoLabelFundo.setIcon(new ImageIcon(JanelaPartida.class.getResource("/imagens/476bf8d5e39bb0612a79933c7w5907a4a.jpg")));
		avisoLabelFundo.setHorizontalAlignment(SwingConstants.CENTER);
		
		aviso.add(botaoAviso);
		
		avisoLabel = new JLabel("Fim de Jogo");
		
		avisoLabel.setLocation(0, 0);
		avisoLabel.setBackground(new Color(20,20,20,220));
		avisoLabel.setForeground(Color.WHITE);
		avisoLabel.setFocusable(false);
		avisoLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		avisoLabel.setHorizontalAlignment(SwingConstants.CENTER);
		avisoLabel.setFont(new Font("Chiller", Font.BOLD, 45));
		avisoLabel.setSize(626, 598);
		aviso.add(avisoLabel);
		aviso.add(painelPreto);
		aviso.add(avisoLabelFundo);
						
		painel.add(aviso);

		painel.add(criaTeclado());
		
		painel.add(temaLabel);
		painel.add(palavraLabel);
		painel.add(boneco.getPainel());
		painel.add(voltar);
		painel.add(imagemFundo);
		
		aviso.setVisible(false);
	}

	public JPanel criaTeclado() {
		JPanel teclado = new JPanel();
		a = new JButton();
		b = new JButton();
		c = new JButton();
		d = new JButton();
		e = new JButton();
		f = new JButton();
		g = new JButton();
		h = new JButton();
		i = new JButton();
		j = new JButton();
		k = new JButton();
		l = new JButton();
		m = new JButton();
		n = new JButton();
		o = new JButton();
		p = new JButton();
		q = new JButton();
		r = new JButton();
		s = new JButton();
		t = new JButton();
		u = new JButton();
		v = new JButton();
		w = new JButton();
		x = new JButton();
		y = new JButton();
		z = new JButton();
			
		teclado.setBounds(100, 383, 450, 163);
		teclado.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		teclado.setBackground(new Color(0,0,0,0));
		
		adicionaBotao(teclado, a, "A");
		adicionaBotao(teclado, b, "B");
		adicionaBotao(teclado, c, "C");
		adicionaBotao(teclado, d, "D");
		adicionaBotao(teclado, e, "E");
		adicionaBotao(teclado, f, "F");
		adicionaBotao(teclado, g, "G");
		adicionaBotao(teclado, h, "H");
		adicionaBotao(teclado, i, "I");
		adicionaBotao(teclado, j, "J");
		adicionaBotao(teclado, k, "K");
		adicionaBotao(teclado, l, "L");
		adicionaBotao(teclado, m, "M");
		adicionaBotao(teclado, n, "N");
		adicionaBotao(teclado, o, "O");
		adicionaBotao(teclado, p, "P");
		adicionaBotao(teclado, q, "Q");
		adicionaBotao(teclado, r, "R");
		adicionaBotao(teclado, s, "S");
		adicionaBotao(teclado, t, "T");
		adicionaBotao(teclado, u, "U");
		adicionaBotao(teclado, v, "V");
		adicionaBotao(teclado, w, "W");
		adicionaBotao(teclado, x, "X");
		adicionaBotao(teclado, y, "Y");
		adicionaBotao(teclado, z, "Z");
		
		return teclado;
	}

	public void adicionaBotao(JPanel teclado, JButton botao, String letra) {
		botao.setText(letra);
		botao.setPreferredSize(new Dimension(50,35));
		botao.setBackground(new Color(0,0,0,0));
		botao.setBorderPainted(false);
		botao.setContentAreaFilled(false);
		botao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botao.setFocusable(false);
		botao.setFont(new Font("Chiller", Font.BOLD, 23));
		botao.setForeground(new Color(67,46,28));
		botao.setHorizontalTextPosition(SwingConstants.CENTER);

		teclado.add(botao);
	}
	
	public void setPosPalavra(int posPalavra) {
		this.posPalavra = posPalavra;
	}

	public void escolhePalavra(String tema) {
		switch(tema) {
		case "CIDADES":
			palavra=lista.getCidade(posPalavra);
			break;
		case "PAISES":
			palavra=lista.getPaises(posPalavra);
			break;
		case "ANIMAIS":
			palavra=lista.getAnimal(posPalavra);
			break;
		case "FILMES":
			palavra=lista.getFilme(posPalavra);
			break;
		default:
			break;
		}
		
		palavraAuxiliar = new char[palavra.length()*2];
		for(int i = 0, j = 0; j < palavra.length(); i+=2, j++) {
			palavraAuxiliar[i] = palavra.charAt(j);
			palavraAuxiliar[i+1] = ' ';
		}
		palavra = new String(palavraAuxiliar);
		palavra.trim();
		
		criaOcultamento();
		
		temaLabel.setText(tema);
		palavraLabel.setText(palavra);
	}
	
	public void criaOcultamento() {
		str = new char[palavra.length()];
		
		for(int i = 0; i < palavra.length(); i++) {
			System.out.print(palavraAuxiliar[i]);
			if(palavra.charAt(i) == ' ' || palavra.charAt(i) == '-') {
				str[i]=palavra.charAt(i);
			}
			else {
				str[i]='_';
			}
		}
		
		palavra = new String(str);
	}
	
	public void setLetra(char letra) {
		this.letra = letra;
	}
	
	public void comparaLetra() {
		Boolean aux=false;
		for(int i = 0; i < palavra.length(); i++) {
			if(letra=='A') {
				if('A'==palavraAuxiliar[i]) {
					str[i]=letra;
					aux=true;
				}
				if('Á'==palavraAuxiliar[i]) {
					str[i]=letra;
					aux=true;
				}
				if('Â'==palavraAuxiliar[i]) {
					str[i]=letra;
					aux=true;
				}
				if('Ã'==palavraAuxiliar[i]) {
					str[i]=letra;
					aux=true;
				}
				if('À'==palavraAuxiliar[i]) {
					str[i]=letra;
					aux=true;
				}
			}
			else {
				if(letra=='E') {
					if('E'==palavraAuxiliar[i]) {
						str[i]=letra;
						aux=true;
					}
					if('É'==palavraAuxiliar[i]) {
						str[i]=letra;
						aux=true;
					}
					if('Ê'==palavraAuxiliar[i]) {
						str[i]=letra;
						aux=true;
					}
				}
				else {
					if(letra=='I') {
						if('I'==palavraAuxiliar[i]) {
							str[i]=letra;
							aux=true;
						}
						if('Í'==palavraAuxiliar[i]) {
							str[i]=letra;
							aux=true;
						}
					}
					else {
						if(letra=='O') {
							if('O'==palavraAuxiliar[i]) {
								str[i]=letra;
								aux=true;
							}
							if('Ó'==palavraAuxiliar[i]) {
								str[i]=letra;
								aux=true;
							}
							if('Õ'==palavraAuxiliar[i]) {
								str[i]=letra;
								aux=true;
							}
						}
						else {
							if(letra=='U') {
								if('U'==palavraAuxiliar[i]) {
									str[i]=letra;
									aux=true;
								}
								if('Ú'==palavraAuxiliar[i]) {
									str[i]=letra;
									aux=true;
								}
							}
							else {
								if(letra > 'A' && letra <= 'Z') {
									if(letra==palavraAuxiliar[i]) {
										str[i]=letra;
										aux=true;
									}
									else {
										switch(contadorErros) {
										case 1:
											boneco.getBoneco().setIcon(new ImageIcon(Boneco.class.getResource("/imagens/Pernas.png")));
											break;
										case 2:
											boneco.getBoneco().setIcon(new ImageIcon(Boneco.class.getResource("/imagens/Braços.png")));
											break;
										case 3:
											boneco.getBoneco().setIcon(new ImageIcon(Boneco.class.getResource("/imagens/Tronco.png")));
											break;
										case 4:
											boneco.getBoneco().setIcon(new ImageIcon(Boneco.class.getResource("/imagens/Corpo.png")));
											aviso.setVisible(true);
											break;
										}
									}
								}
							}
						}
					}
				}
			}
		}
		
		if(!aux) {
			contadorErros++;
		}
		
		palavra = new String(str);
		palavraLabel.setText(palavra);
	}
	
	public JButton getA() {
		return a;
	}

	public JButton getB() {
		return b;
	}

	public JButton getC() {
		return c;
	}

	public JButton getD() {
		return d;
	}

	public JButton getE() {
		return e;
	}

	public JButton getF() {
		return f;
	}

	public JButton getG() {
		return g;
	}

	public JButton getH() {
		return h;
	}

	public JButton getI() {
		return i;
	}

	public JButton getJ() {
		return j;
	}

	public JButton getK() {
		return k;
	}

	public JButton getL() {
		return l;
	}

	public JButton getM() {
		return m;
	}

	public JButton getN() {
		return n;
	}

	public JButton getO() {
		return o;
	}

	public JButton getP() {
		return p;
	}

	public JButton getQ() {
		return q;
	}

	public JButton getR() {
		return r;
	}

	public JButton getS() {
		return s;
	}

	public JButton getT() {
		return t;
	}

	public JButton getU() {
		return u;
	}

	public JButton getV() {
		return v;
	}

	public JButton getW() {
		return w;
	}

	public JButton getX() {
		return x;
	}

	public JButton getY() {
		return y;
	}

	public JButton getZ() {
		return z;
	}
	
	public JButton getVoltar() {
		return voltar;
	}
	
	public JPanel getPainel() {
		return painel;
	}
}
