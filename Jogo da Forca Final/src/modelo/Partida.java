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

/**
 * Essa classe constrói a tela da partida e define a aparência dela. Além disso
 * é a classe principal do jogo, onde são realizadasas operações de escolha de
 * uma palavra qualquer da lista, a comparação e a troca de caracteres, implementa
 * o boneco da classe Boneco e um painel para o fim da partida.
 * @author matheushenrick
 * @version 3.5
 */

@SuppressWarnings("serial")
public class Partida extends JPanel{
	private ListaDePalavras lista = new ListaDePalavras();
	private JLabel imagemFundo;
	private JLabel temaLabel;
	private JLabel palavraLabel;
	private String palavra;
	private char[] palavraAuxiliar;
	private int posPalavra;
	private char str[];
	private char letra;
	private int qtdLetras;

	private Boneco boneco;
	private JPanel teclado = new JPanel();
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
	private int countErro;
	private int countAcerto;
	
	private JPanel panelPausa;
	private JLabel lblDesejaSair;
	private JButton btnNo;
	private JButton btnSim;
	private JLabel imagemPausa;
	private JPanel panelPausa2;

	private JPanel fim;
	private JPanel painelPreto;
	private JLabel fimLabelMensagem;
	private JLabel fimLabelImagem;
	private JButton botaoFim;
	
	public Partida() {
		imagemFundo = new JLabel();
		temaLabel = new JLabel();
		palavraLabel = new JLabel();
		palavraLabel.setLocation(86, 237);
		boneco = new Boneco();
		voltar = new JButton("Voltar");

		imagemFundo.setBounds(12, 0, 426, 248);
		temaLabel.setBounds(100, 0, 127, 47);
		voltar.setBounds(261, 573, 128, 25);

		setBackground(new Color(20,20,20));
		setLayout(null);
		setSize(650,610);

		temaLabel.setFont(new Font("Chiller", Font.BOLD, 28));
		temaLabel.setForeground(new Color(41,24,13));
		
		palavraLabel.setForeground(new Color(41,24,13));
		palavraLabel.setFocusable(false);
		palavraLabel.setHorizontalTextPosition(SwingConstants.CENTER);
		palavraLabel.setHorizontalAlignment(SwingConstants.CENTER);
		palavraLabel.setFont(new Font("Chiller", Font.BOLD, 23));
		palavraLabel.setSize(471, 56);
		palavraLabel.setText(null);
		
		voltar.setBackground(new Color(0,0,0,0));
		voltar.setBorderPainted(false);
		voltar.setContentAreaFilled(false);
		voltar.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		voltar.setFocusable(false);
		voltar.setFont(new Font("DriftType", Font.BOLD, 23));
		voltar.setForeground(new Color(41,24,13));
		
		imagemFundo.setBounds(12, 0, 626, 598);
		imagemFundo.setIcon(new ImageIcon(Partida.class.getResource("/imagens/476bf8d5e39bb0612a79933c75907a4a.jpg")));
		imagemFundo.setHorizontalAlignment(SwingConstants.CENTER);
	
		add(criaTeclado());
		criaTelaPausa();
		criaTelaFinal();
		
		add(fim);
		add(temaLabel);
		add(palavraLabel);
		add(boneco);
		add(voltar);
		add(imagemFundo);
		
		fim.setVisible(false);
	}

	/**
	 * Este método cria os botões de um teclado contendo somente as letras
	 * e define a aparência do teclado. 
	 * @return
	 */
	public JPanel criaTeclado() {
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

	/**
	 * Este método adiciona os botões criados no método criaTeclado()
	 * no painel teclado, além de definir a aparência dos botões.
	 * @param teclado
	 * @param botao
	 * @param letra
	 */
	public void adicionaBotao(JPanel teclado, JButton botao, String letra) {
		botao.setText(letra);
		botao.setPreferredSize(new Dimension(50,35));
		botao.setBackground(new Color(0,0,0,0));
		botao.setBorderPainted(false);
		botao.setContentAreaFilled(false);
		botao.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		botao.setFocusable(false);
		botao.setFont(new Font("Chiller", Font.BOLD, 23));
		botao.setForeground(new Color(41,24,13));
		botao.setHorizontalTextPosition(SwingConstants.CENTER);

		teclado.add(botao);
	}
	
	/**
	 * Este método reativa todos os botões para o caso de uma nova partida.
	 * @param ativa
	 */
	public void ativaBotao(Boolean ativa) {
		a.setEnabled(ativa);
		b.setEnabled(ativa);
		c.setEnabled(ativa);
		d.setEnabled(ativa);
		e.setEnabled(ativa);
		f.setEnabled(ativa);
		g.setEnabled(ativa);
		h.setEnabled(ativa);
		i.setEnabled(ativa);
		j.setEnabled(ativa);
		k.setEnabled(ativa);
		l.setEnabled(ativa);
		m.setEnabled(ativa);
		n.setEnabled(ativa);
		o.setEnabled(ativa);
		p.setEnabled(ativa);
		q.setEnabled(ativa);
		r.setEnabled(ativa);
		s.setEnabled(ativa);
		t.setEnabled(ativa);
		u.setEnabled(ativa);
		v.setEnabled(ativa);
		w.setEnabled(ativa);
		x.setEnabled(ativa);
		y.setEnabled(ativa);
		z.setEnabled(ativa);
	}
	
	/**
	 * Este método constrói a tela que será mostrada sempre que o usuário
	 * decidir sair da partida. O usuário deverá confirmar se deseja ou não
	 * deixar a partida.
	 */
	void criaTelaPausa() {
		panelPausa = new JPanel();
		lblDesejaSair = new JLabel("Deseja sair?");
		btnNo = new JButton("Não");
		btnSim = new JButton("Sim");
		imagemPausa = new JLabel("");
		
		panelPausa.setBounds(12, 0, 626, 598);
		panelPausa.setBackground(new Color(20,20,20));
		panelPausa.setLayout(null);
		
		lblDesejaSair.setForeground(Color.WHITE);
		lblDesejaSair.setBounds(240, 250, 170, 53);
		lblDesejaSair.setFont(new Font("Chiller", Font.BOLD, 45));
		lblDesejaSair.setFocusable(false);
		lblDesejaSair.setHorizontalTextPosition(SwingConstants.CENTER);
		panelPausa.add(lblDesejaSair);
		
		btnNo.setBounds(244, 321, 69, 46);
		btnNo.setBackground(new Color(0,0,0,0));
		btnNo.setBorderPainted(false);
		btnNo.setContentAreaFilled(false);
		btnNo.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnNo.setFocusable(false);
		btnNo.setFont(new Font("Chiller", Font.BOLD, 30));
		btnNo.setForeground(Color.WHITE);
		btnNo.setHorizontalTextPosition(SwingConstants.CENTER);
		panelPausa.add(btnNo);
		
		btnSim.setBounds(340, 321, 66, 46);
		btnSim.setBackground(new Color(0,0,0,0));
		btnSim.setBorderPainted(false);
		btnSim.setContentAreaFilled(false);
		btnSim.setCursor(Cursor.getPredefinedCursor(Cursor.HAND_CURSOR));
		btnSim.setFocusable(false);
		btnSim.setFont(new Font("Chiller", Font.BOLD, 30));
		btnSim.setForeground(Color.WHITE);
		btnSim.setHorizontalTextPosition(SwingConstants.CENTER);
		panelPausa.add(btnSim);
		
		panelPausa2 = new JPanel();
		panelPausa2.setBackground(new Color(20,20,20,220));
		panelPausa2.setBounds(12, 0, 626, 598);
		panelPausa.add(panelPausa2);
		
		imagemPausa.setBounds(12, 0, 626, 598);
		imagemPausa.setIcon(new ImageIcon(Partida.class.getResource("/imagens/476bf8d5e39bb0612a79933c7w5907a4a.jpg")));
		panelPausa.add(imagemPausa);
	}

	/**
	 * Este método constrói a tela que será mostrada ao final da partida tanto em caso de
	 * vitória como em caso de derrota.
	 */
	void criaTelaFinal() {
		fim = new JPanel();
		fimLabelImagem = new JLabel();
		painelPreto = new JPanel();
		botaoFim = new JButton("Fim De Jogo");
		
		fim.setBounds(12, 0, 626, 598);
		fim.setBackground(new Color(20,20,20));
		fim.setLayout(null);
		fim.setBorder(null);

		fimLabelImagem.setBounds(0, 0, 626, 598);
		fimLabelImagem.setIcon(new ImageIcon(Partida.class.getResource("/imagens/476bf8d5e39bb0612a79933c7w5907a4a.jpg")));
		fimLabelImagem.setHorizontalAlignment(SwingConstants.CENTER);

		painelPreto.setBounds(0, 0, 626, 598);
		painelPreto.setBackground(new Color(20,20,20,220));
		painelPreto.setLayout(null);
		
		fimLabelMensagem = new JLabel("Clique na tela para continuar");
		fimLabelMensagem.setHorizontalTextPosition(SwingConstants.CENTER);
		fimLabelMensagem.setForeground(Color.WHITE);
		fimLabelMensagem.setFont(new Font("Chiller", Font.BOLD, 23));
		fimLabelMensagem.setHorizontalAlignment(SwingConstants.CENTER);
		fimLabelMensagem.setBounds(213, 488, 200, 56);
		
		botaoFim.setBounds(0, 0, 626, 598);
		botaoFim.setFont(new Font("Chiller", Font.BOLD, 45));
		botaoFim.setBorderPainted(false);
		botaoFim.setFocusable(false);
		botaoFim.setContentAreaFilled(false);
		botaoFim.setHorizontalTextPosition(SwingConstants.CENTER);
		botaoFim.setForeground(Color.WHITE);
		
		painelPreto.add(fimLabelMensagem);
		fim.add(botaoFim);
		fim.add(painelPreto);
		fim.add(fimLabelImagem);		
	}
	
	public JPanel getPanelPausa() {
		return panelPausa;
	}

	public JPanel getFim() {
		return fim;
	}

	/**
	 * Este método define se o painel fim será visível ou não.
	 * @param b
	 */
	public void setFim(Boolean b) {
		fim.setVisible(b);
	}

	public JButton getBtnNo() {
		return btnNo;
	}

	public JButton getBtnSim() {
		return btnSim;
	}

	public JButton getBotaoFim() {
		return botaoFim;
	}

	public void setPosPalavra(int posPalavra) {
		this.posPalavra = posPalavra;
	}

	/**
	 * Este método escolhe uma palavra da lista a partir de um tema passado por evento
	 * de clique de botão. Além disso ele separa os caracteres da palavra com espaços
	 * (para que usuário consiga contar a quantidade de letras na tela com mais facilidade)
	 * com o auxílio do vetor de char palavraAuxiliar e conta a quantidade de letras 
	 * da palavra. Ao final ele adiciona o tema ao rótulo que será mostrado na tela e
	 * faz o mesmo com a palavra escolhida.
	 * 
	 * @param tema
	 */
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
		
		qtdLetras = 0;
		palavraAuxiliar = new char[palavra.length()*2];
		for(int i = 0, j = 0; j < palavra.length(); i+=2, j++) {
			palavraAuxiliar[i] = palavra.charAt(j);
			palavraAuxiliar[i+1] = ' ';
			
			if(palavra.charAt(j) != ' ' && palavra.charAt(j) != '-') {
				qtdLetras++;
			}
		}
		palavra = new String(palavraAuxiliar);
		palavra.trim();
		
		criaOcultamento();
		
		temaLabel.setText(tema);
		palavraLabel.setText(palavra);
	}
	
	/**
	 * Este método troca as letras da palavra por traços para que
	 * o usuário não saiba qual é a palavra que está escondida.
	 * Por conta disso a palavra que será usada na comparação das
	 * letra sera o vetor de char palavraAuxiliar, criado no método
	 * escolhePalavra.
	 */
	public void criaOcultamento() {
		str = new char[palavra.length()];
		
		for(int i = 0; i < palavra.length(); i++) {
			//System.out.print(palavraAuxiliar[i]);
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
	
	/**
	 * Este método compara as letras do vetor de caracteres com a letra que foi escolhida
	 * através do evento de pressionamento de botões e que foi salva no atributo letra, do tipo
	 * char. A comparação é feita com o auxílio de um boleano inicializado com falso. Se
	 * o valor do boleano for verdadeiro significa que foi encontrada a letra no vetor e o vetor
	 * recebeu aquela letra naquela posição e o número de acertos foi incrementado em um.
	 * Caso contrário a quantidade de erros é incrementada e o método atualizaBoneco()
	 * é chamado. Ao final a palavra impressa na tela é atualizada e se a quantidade de erros
	 * for igual a 4 ou a quantidade de acertos for igual a quantidade de letras o painel
	 * de fim de jogo será exibido.
	 */
	public void comparaLetra() {
		Boolean aux=false;
		
		for(int i = 0; i < palavra.length(); i++) {
			if(letra=='A') {
				if('A'==palavraAuxiliar[i]) {
					str[i]=letra;
					countAcerto++;
					aux=true;
				}
				if('Á'==palavraAuxiliar[i]) {
					str[i]='Á';
					countAcerto++;
					aux=true;
				}
				if('Â'==palavraAuxiliar[i]) {
					str[i]='Â';
					countAcerto++;
					aux=true;
				}
				if('Ã'==palavraAuxiliar[i]) {
					str[i]='Ã';
					countAcerto++;
					aux=true;
				}
				if('À'==palavraAuxiliar[i]) {
					str[i]='À';
					countAcerto++;
					aux=true;
				}
			}
			else {
				if(letra=='E') {
					if('E'==palavraAuxiliar[i]) {
						str[i]=letra;
						countAcerto++;
						aux=true;
					}
					if('É'==palavraAuxiliar[i]) {
						str[i]='É';
						countAcerto++;
						aux=true;
					}
					if('Ê'==palavraAuxiliar[i]) {
						str[i]='Ê';
						countAcerto++;
						aux=true;
					}
				}
				else {
					if(letra=='I') {
						if('I'==palavraAuxiliar[i]) {
							str[i]=letra;
							countAcerto++;
							aux=true;
						}
						if('Í'==palavraAuxiliar[i]) {
							str[i]='Í';
							countAcerto++;
							aux=true;
						}
					}
					else {
						if(letra=='O') {
							if('O'==palavraAuxiliar[i]) {
								str[i]=letra;
								countAcerto++;
								aux=true;
							}
							if('Ó'==palavraAuxiliar[i]) {
								str[i]='Ó';
								countAcerto++;
								aux=true;
							}
							if('Õ'==palavraAuxiliar[i]) {
								str[i]='Õ';
								countAcerto++;
								aux=true;
							}
						}
						else {
							if(letra=='U') {
								if('U'==palavraAuxiliar[i]) {
									str[i]=letra;
									countAcerto++;
									aux=true;
								}
								if('Ú'==palavraAuxiliar[i]) {
									str[i]='Ú';
									countAcerto++;
									aux=true;
								}
							}
							else {
								if(letra=='C') {
									if('Ç'==palavraAuxiliar[i]) {
										str[i]='Ç';
										countAcerto++;
										aux=true;
									}
									else {
										if('C'==palavraAuxiliar[i]) {
											str[i]=letra;
											countAcerto++;
											aux=true;
										}
									}
								}
								else {
									if(letra > 'A' && letra <= 'Z') {
										if(letra==palavraAuxiliar[i]) {
											str[i]=letra;
											countAcerto++;
											aux=true;
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
			countErro++;
			boneco.atualizaBoneco(countErro);
		}
		
		palavra = new String(str);
		palavraLabel.setText(palavra);

		if(countErro==4 || countAcerto==qtdLetras) {
			teclado.setVisible(false);
			fim.setVisible(true);
			boneco.atualizaBoneco(4);
		}
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

	public JButton getBtnX() {
		return x;
	}

	public JButton getBtnY() {
		return y;
	}

	public JButton getZ() {
		return z;
	}

	public JPanel getTeclado() {
		return teclado;
	}
	
	public JButton getVoltar() {
		return voltar;
	}

	public void setCountErro(int countErro) {
		this.countErro = countErro;
	}

	public void setCountAcerto(int countAcerto) {
		this.countAcerto = countAcerto;
	}
}
