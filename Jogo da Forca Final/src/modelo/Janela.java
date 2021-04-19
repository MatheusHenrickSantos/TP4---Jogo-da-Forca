package modelo;

import java.awt.CardLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Random;
import javax.swing.JFrame;
import javax.swing.JPanel;
import lista.ListaDePalavras;
import java.awt.Toolkit;

public class Janela extends JanelaPartida{
	private JFrame janela;
	private CardLayout card;
	private JPanel painel;
	private JanelaInicio inicio;
	private JanelaMenu menu;
	private JanelaPartida partida;

	public Janela() {
		janela = new JFrame("Jogo da Forca");
		card = new CardLayout();
		painel = new JPanel();
		inicio = new JanelaInicio();
		menu = new JanelaMenu();
		partida = new JanelaPartida();

		janela.getContentPane().setLayout(null);
		janela.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		janela.setLocationRelativeTo(null);
		janela.setIconImage(Toolkit.getDefaultToolkit().getImage("/Ícone/Boneco.png"));
		janela.setResizable(false);
		janela.setSize(650,650);

		painel.setLayout(card);
		painel.setSize(650, 610);
		
		painel.add(inicio.getPainel(),"Conteudo da Tela Inicial");
		painel.add(menu.getPainel(),"Conteudo da Tela de Menu");
		painel.add(partida.getPainel(),"Conteudo da Tela da partida");
		
		janela.getContentPane().add(painel);
		janela.setVisible(true);
		
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
		partida.getX().addActionListener(evento);
		partida.getY().addActionListener(evento);
		partida.getZ().addActionListener(evento);
		partida.getVoltar().addActionListener(evento);
	}

	private class Eventos implements ActionListener{

		public void actionPerformed(ActionEvent arg0) {
			Object src = arg0.getSource();
			ListaDePalavras lista = new ListaDePalavras();
		    Random numAleatorio = new Random();
		      
		    if(src==inicio.getSair()) {
		    	System.exit(0);
		    }
		    if(src==inicio.getIniciar()) {
		    	card.next(painel);
		    }
		      
		    if(src==menu.getCidades()) {
		    	partida.setPosPalavra(numAleatorio.nextInt(lista.getTamVetCidades().length));
			    partida.escolhePalavra("CIDADES");
		    	card.next(painel);
		    }
		    if(src==menu.getPaises()) {
		    	partida.setPosPalavra(numAleatorio.nextInt(lista.getTamVetPaises().length));
			    partida.escolhePalavra("PAISES");
		    	card.next(painel);
		    }
		    if(src==menu.getAnimais()) {
		    	partida.setPosPalavra(numAleatorio.nextInt(lista.getTamVetAnimais().length));
			    partida.escolhePalavra("ANIMAIS");
		    	card.next(painel);
		    }
		    if(src==menu.getFilmes()) {
		    	partida.setPosPalavra(numAleatorio.nextInt(lista.getTamVetFilmes().length));
			    partida.escolhePalavra("FILMES");
		    	card.next(painel);
		    }
		    if(src==menu.getVoltar()) {
		    	card.previous(painel);
		    }
		    
		    if(src==partida.getA()) {
		    	partida.setLetra('A');
			    partida.comparaLetra();
		    	partida.getA().setEnabled(false);
		    }
		    if(src==partida.getB()) {
		    	partida.setLetra('B');
			    partida.comparaLetra();
			    partida.getB().setEnabled(false);
		    }
		    if(src==partida.getC()) {
		    	partida.setLetra('C');
			    partida.comparaLetra();
		    	partida.getC().setEnabled(false);
		    }
		    if(src==partida.getD()) {
		    	partida.setLetra('D');
			    partida.comparaLetra();
		    	partida.getD().setEnabled(false);
		    }
		    if(src==partida.getE()) {
		    	partida.setLetra('E');
			    partida.comparaLetra();
		    	partida.getE().setEnabled(false);
		    }
		    if(src==partida.getF()) {
		    	partida.setLetra('F');
			    partida.comparaLetra();
		    	partida.getF().setEnabled(false);
		    }
		    if(src==partida.getG()) {
		    	partida.setLetra('G');
			    partida.comparaLetra();
		    	partida.getG().setEnabled(false);
		    }
		    if(src==partida.getH()) {
		    	partida.setLetra('H');
			    partida.comparaLetra();
		    	partida.getH().setEnabled(false);
		    }
		    if(src==partida.getI()) {
		    	partida.setLetra('I');
			    partida.comparaLetra();
		    	partida.getI().setEnabled(false);
		    }
		    if(src==partida.getJ()) {
		    	partida.setLetra('J');
			    partida.comparaLetra();
		    	partida.getJ().setEnabled(false);
		    }
		    if(src==partida.getK()) {
		    	partida.setLetra('K');
			    partida.comparaLetra();
		    	partida.getK().setEnabled(false);
		    }
		    if(src==partida.getL()) {
		    	partida.setLetra('L');
			    partida.comparaLetra();
		    	partida.getL().setEnabled(false);
		    }
		    if(src==partida.getM()) {
		    	partida.setLetra('M');
			    partida.comparaLetra();
		    	partida.getM().setEnabled(false);
		    }
		    if(src==partida.getN()) {
		    	partida.setLetra('N');
			    partida.comparaLetra();
		    	partida.getN().setEnabled(false);
		    }
		    if(src==partida.getO()) {
		    	partida.setLetra('O');
			    partida.comparaLetra();
		    	partida.getO().setEnabled(false);
		    }
		    if(src==partida.getP()) {
		    	partida.setLetra('P');
			    partida.comparaLetra();
		    	partida.getP().setEnabled(false);
		    }
		    if(src==partida.getQ()) {
		    	partida.setLetra('Q');
			    partida.comparaLetra();
		    	partida.getQ().setEnabled(false);
		    }
		    if(src==partida.getR()) {
		    	partida.setLetra('R');
			    partida.comparaLetra();
		    	partida.getR().setEnabled(false);
		    }
		    if(src==partida.getS()) {
		    	partida.setLetra('S');
			    partida.comparaLetra();
		    	partida.getS().setEnabled(false);
		    }
		    if(src==partida.getT()) {
		    	partida.setLetra('T');
			    partida.comparaLetra();
		    	partida.getT().setEnabled(false);
		    }
		    if(src==partida.getU()) {
		    	partida.setLetra('U');
			    partida.comparaLetra();
		    	partida.getU().setEnabled(false);
		    }
		    if(src==partida.getV()) {
		    	partida.setLetra('V');
			    partida.comparaLetra();
		    	partida.getV().setEnabled(false);
		    }
		    if(src==partida.getW()) {
		    	partida.setLetra('W');
			    partida.comparaLetra();
		    	partida.getW().setEnabled(false);
		    }
		    if(src==partida.getX()) {
		    	partida.setLetra('X');
			    partida.comparaLetra();
		    	partida.getX().setEnabled(false);
		    }
		    if(src==partida.getY()) {
		    	partida.setLetra('Y');
			    partida.comparaLetra();
		    	partida.getY().setEnabled(false);
		    }
		    if(src==partida.getZ()) {
		    	partida.setLetra('Z');
			    partida.comparaLetra();
		    	partida.getZ().setEnabled(false);
		    }
		    if(src==partida.getVoltar()) {
		    	card.previous(painel);
		    }
		}
	}
}
