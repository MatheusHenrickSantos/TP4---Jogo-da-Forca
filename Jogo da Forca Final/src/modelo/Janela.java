package modelo;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import lista.ListaDePalavras;
import java.awt.Toolkit;

/**
 * Essa classe constrói a janela que irá receber os paineis das outras classes, cria
 * a classe interna evento e adiciona ouvintes para todos os botões.
 * @author matheushenrick
 * @version 2.1
 */

@SuppressWarnings("serial")
public class Janela extends JFrame{
	private CardLayout card;
	private JPanel painel;
	private Inicio inicio;
	private Menu menu;
	private Partida partida;

	public Janela() {
		card = new CardLayout();
		painel = new JPanel();
		inicio = new Inicio();
		menu = new Menu();
		partida = new Partida();

		setTitle("Jogo da Forca");
		getContentPane().setLayout(null);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setIconImage(Toolkit.getDefaultToolkit().getImage(Janela.class.getResource("/imagens/Icone.png")));
		setResizable(false);
		setSize(650,650);

		painel.setLayout(card);
		painel.setSize(650, 610);
		
		painel.add(inicio,"Conteudo da Tela Inicial");
		painel.add(menu,"Conteudo da Tela de Menu");
		painel.add(partida,"Conteudo da Tela da partida");
		painel.add(partida.getPanelPausa(), "Pausa");
		
		getContentPane().add(painel);
		setLocationRelativeTo(null);
		setVisible(true);
		
		Eventos evento = new Eventos();
		inicio.getIniciar().addActionListener(evento);
		inicio.getSair().addActionListener(evento);
		menu.getCidades().addActionListener(evento);
	    menu.getPaises().addActionListener(evento);
	    menu.getAnimais().addActionListener(evento);
	    menu.getFilmes().addActionListener(evento);
	    menu.getVoltar().addActionListener(evento);
		partida.getA().addActionListener(evento);
		partida.getB().addActionListener(evento);
		partida.getC().addActionListener(evento);
		partida.getD().addActionListener(evento);
		partida.getE().addActionListener(evento);
		partida.getF().addActionListener(evento);
		partida.getG().addActionListener(evento);
		partida.getH().addActionListener(evento);
		partida.getI().addActionListener(evento);
		partida.getJ().addActionListener(evento);
		partida.getK().addActionListener(evento);
		partida.getL().addActionListener(evento);
		partida.getM().addActionListener(evento);
		partida.getN().addActionListener(evento);
		partida.getO().addActionListener(evento);
		partida.getP().addActionListener(evento);
		partida.getQ().addActionListener(evento);
		partida.getR().addActionListener(evento);
		partida.getS().addActionListener(evento);
		partida.getT().addActionListener(evento);
		partida.getU().addActionListener(evento);
		partida.getV().addActionListener(evento);
		partida.getW().addActionListener(evento);
		partida.getBtnX().addActionListener(evento);
		partida.getBtnY().addActionListener(evento);
		partida.getZ().addActionListener(evento);
		partida.getVoltar().addActionListener(evento);
		partida.getBtnNo().addActionListener(evento);
		partida.getBtnSim().addActionListener(evento);
		partida.getBotaoFim().addActionListener(evento);
	}

	/**
	 * Essa é uma classe interna da classe Janela que trata dos eventos de clique
	 * dos botões.
	 * @author matheushenrick
	 * @version 1.15
	 */
	private class Eventos implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			Object click = arg0.getSource();
			ListaDePalavras lista = new ListaDePalavras();
		    Random random = new Random();
		      
		    if(click==inicio.getSair()) {
		    	System.exit(0);
		    }
		    if(click==inicio.getIniciar()) {
		    	card.next(painel);
		    }
		      
		    if(click==menu.getCidades()) {
		    	partida.setFim(false);
		    	partida.getTeclado().setVisible(true);
		    	partida.ativaBotao(true);
		    	partida.setCountAcerto(0);
		    	partida.setCountErro(0);
		    	partida.setPosPalavra(random.nextInt(lista.getTamVetCidades().length));
			    partida.escolhePalavra("CIDADES");
		    	card.next(painel);
		    }
		    if(click==menu.getPaises()) {
		    	partida.setFim(false);
		    	partida.getTeclado().setVisible(true);
		    	partida.ativaBotao(true);
		    	partida.setCountAcerto(0);
		    	partida.setCountErro(0);
		    	partida.setPosPalavra(random.nextInt(lista.getTamVetPaises().length));
			    partida.escolhePalavra("PAISES");
		    	card.next(painel);
		    }
		    if(click==menu.getAnimais()) {
		    	partida.setFim(false);
		    	partida.getTeclado().setVisible(true);
		    	partida.ativaBotao(true);
		    	partida.setCountAcerto(0);
		    	partida.setCountErro(0);
		    	partida.setPosPalavra(random.nextInt(lista.getTamVetAnimais().length));
			    partida.escolhePalavra("ANIMAIS");
		    	card.next(painel);
		    }
		    if(click==menu.getFilmes()) {
		    	partida.setFim(false);
		    	partida.getTeclado().setVisible(true);
		    	partida.ativaBotao(true);
		    	partida.setCountAcerto(0);
		    	partida.setCountErro(0);
		    	partida.setPosPalavra(random.nextInt(lista.getTamVetFilmes().length));
			    partida.escolhePalavra("FILMES");
		    	card.next(painel);
		    }
		    if(click==menu.getVoltar()) {
		    	card.previous(painel);
		    }
		    
		    if(click==partida.getA()) {
		    	partida.setLetra('A');
			    partida.comparaLetra();
		    	partida.getA().setEnabled(false);
		    }
		    if(click==partida.getB()) {
		    	partida.setLetra('B');
			    partida.comparaLetra();
			    partida.getB().setEnabled(false);
		    }
		    if(click==partida.getC()) {
		    	partida.setLetra('C');
			    partida.comparaLetra();
		    	partida.getC().setEnabled(false);
		    }
		    if(click==partida.getD()) {
		    	partida.setLetra('D');
			    partida.comparaLetra();
		    	partida.getD().setEnabled(false);
		    }
		    if(click==partida.getE()) {
		    	partida.setLetra('E');
			    partida.comparaLetra();
		    	partida.getE().setEnabled(false);
		    }
		    if(click==partida.getF()) {
		    	partida.setLetra('F');
			    partida.comparaLetra();
		    	partida.getF().setEnabled(false);
		    }
		    if(click==partida.getG()) {
		    	partida.setLetra('G');
			    partida.comparaLetra();
		    	partida.getG().setEnabled(false);
		    }
		    if(click==partida.getH()) {
		    	partida.setLetra('H');
			    partida.comparaLetra();
		    	partida.getH().setEnabled(false);
		    }
		    if(click==partida.getI()) {
		    	partida.setLetra('I');
			    partida.comparaLetra();
		    	partida.getI().setEnabled(false);
		    }
		    if(click==partida.getJ()) {
		    	partida.setLetra('J');
			    partida.comparaLetra();
		    	partida.getJ().setEnabled(false);
		    }
		    if(click==partida.getK()) {
		    	partida.setLetra('K');
			    partida.comparaLetra();
		    	partida.getK().setEnabled(false);
		    }
		    if(click==partida.getL()) {
		    	partida.setLetra('L');
			    partida.comparaLetra();
		    	partida.getL().setEnabled(false);
		    }
		    if(click==partida.getM()) {
		    	partida.setLetra('M');
			    partida.comparaLetra();
		    	partida.getM().setEnabled(false);
		    }
		    if(click==partida.getN()) {
		    	partida.setLetra('N');
			    partida.comparaLetra();
		    	partida.getN().setEnabled(false);
		    }
		    if(click==partida.getO()) {
		    	partida.setLetra('O');
			    partida.comparaLetra();
		    	partida.getO().setEnabled(false);
		    }
		    if(click==partida.getP()) {
		    	partida.setLetra('P');
			    partida.comparaLetra();
		    	partida.getP().setEnabled(false);
		    }
		    if(click==partida.getQ()) {
		    	partida.setLetra('Q');
			    partida.comparaLetra();
		    	partida.getQ().setEnabled(false);
		    }
		    if(click==partida.getR()) {
		    	partida.setLetra('R');
			    partida.comparaLetra();
		    	partida.getR().setEnabled(false);
		    }
		    if(click==partida.getS()) {
		    	partida.setLetra('S');
			    partida.comparaLetra();
		    	partida.getS().setEnabled(false);
		    }
		    if(click==partida.getT()) {
		    	partida.setLetra('T');
			    partida.comparaLetra();
		    	partida.getT().setEnabled(false);
		    }
		    if(click==partida.getU()) {
		    	partida.setLetra('U');
			    partida.comparaLetra();
		    	partida.getU().setEnabled(false);
		    }
		    if(click==partida.getV()) {
		    	partida.setLetra('V');
			    partida.comparaLetra();
		    	partida.getV().setEnabled(false);
		    }
		    if(click==partida.getW()) {
		    	partida.setLetra('W');
			    partida.comparaLetra();
		    	partida.getW().setEnabled(false);
		    }
		    if(click==partida.getBtnX()) {
		    	partida.setLetra('X');
			    partida.comparaLetra();
		    	partida.getBtnX().setEnabled(false);
		    }
		    if(click==partida.getBtnY()) {
		    	partida.setLetra('Y');
			    partida.comparaLetra();
		    	partida.getBtnY().setEnabled(false);
		    }
		    if(click==partida.getZ()) {
		    	partida.setLetra('Z');
			    partida.comparaLetra();
		    	partida.getZ().setEnabled(false);
		    }
		    if(click==partida.getVoltar()) {
		    	card.next(painel);
		    }
		    
		    if(click==partida.getBtnNo()) {
		    	card.previous(painel);
		    }
		    
		    if(click==partida.getBtnSim()) {
		    	card.show(painel, "Conteudo da Tela Inicial");
		    }

		    if(click==partida.getBotaoFim()) {
		    	card.show(painel, "Conteudo da Tela de Menu");
		    }
		    
		}
	}
}
