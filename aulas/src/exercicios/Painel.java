package exercicios;

import javax.swing.BorderFactory;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

 
 
public class Painel extends JPanel {
	public Painel() {
		TitledBorder title = BorderFactory.createTitledBorder("teste");
		this.setBorder(title);
	}
}