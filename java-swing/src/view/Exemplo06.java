package view;

import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * Classe para demonstrar a utiliza��o de Jcombobox
 * @author Elisson Barbieri Machado
 * @since 2 de mar. de 2021
 */
public class Exemplo06 {
	
	//declarando os atributos da tela
	private JFrame janela;
	private JComboBox cbxEstados;
	private JPanel painel;
	
	//vetor auxiliar 
	private String estados[] = {"Paran�", "santa catarina", "Rio grande do sul"};
	/*
	 * metodo para criar a tela
	 */
	 
	public void iniciaGui() {
		/*
		 * configura��es do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o titulo da tela
		janela.setTitle("Exemplo de ComboBox");
		// configurando o tamanho da tela - largura/ altura
		janela.setSize(390, 300);
		// configurando a posi��o incial da tela - centralizada
		janela.setLocationRelativeTo(null);
		
		/*
		 * configura�oes do jcombobox
		 */
		cbxEstados = new JComboBox(estados);
		cbxEstados.setBounds(10, 10, 300, 20);
		
		/*
		 * configurnao o painel
		 */
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(cbxEstados);
		
		janela.setVisible(true);
	}

	public static void main(String[] args) {
		
		new Exemplo06().iniciaGui();
	}
}
