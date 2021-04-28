package modelo;

import javax.swing.JLabel;
import javax.swing.ImageIcon;
import javax.swing.SwingConstants;

/**
 * Essa classe constrói um boneco a partir das imagens que criei no gimp.
 * @author matheushenrick
 * @version 2.0
 */

@SuppressWarnings("serial")
public class Boneco extends JLabel{
	
	public Boneco() {
		setBounds(430, 0, 132, 246);
		setHorizontalAlignment(SwingConstants.CENTER);
		setIcon(new ImageIcon(Boneco.class.getResource("/imagens/Boneco.png")));
	}
	
	/**
	 * Este método realiza a troca das imagens que compõem o boneco. Quando o erro
	 * for igual a 4 o boneco retorna ao estado inicial.
	 * @param countErro
	 */
	public void atualizaBoneco(int countErro) {
		switch(countErro) {
		case 1:
			setIcon(new ImageIcon(Boneco.class.getResource("/imagens/Pernas.png")));
			break;
		case 2:
			setIcon(new ImageIcon(Boneco.class.getResource("/imagens/Braços.png")));
			break;
		case 3:
			setIcon(new ImageIcon(Boneco.class.getResource("/imagens/Tronco.png")));
			break;
		case 4:
			setIcon(new ImageIcon(Boneco.class.getResource("/imagens/Boneco.png")));
			break;
		}
	}
}
