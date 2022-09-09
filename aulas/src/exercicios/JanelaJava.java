package exercicios;

 
import javax.swing.JFrame;
 


public class JanelaJava extends JFrame {
	public JanelaJava() {
		getContentPane().setLayout(new BorderLayout());
//		getContentPane().add(new Painel() ); 
	}
	public static void main(String[] args) {
		new JanelaJava().setVisible(true);
	}
}