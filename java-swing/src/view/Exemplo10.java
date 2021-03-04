package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTabbedPane;

/**
 * Classe para representar a utilizacao do componente jpanel com abas
 * @author Elisson Barbieri Machado
 * @since 3 de mar. de 2021
 */
public class Exemplo10 {

	//declarando os componentes da tela 
	private JFrame janela;
	//declarando labels auxiliares
	private JLabel lbAux1;
	private JLabel lbAux2;
	private JLabel lbAux3;
	//declarando os paineis
	private JPanel aba1;
	private JPanel aba2;
	private JPanel aba3;
	//declranado o componente para controle de abas
	private JTabbedPane painelAbas;
	//declarando o painel para organizar os componentes
	private JPanel painelPrincipal;
	

	/* 
	 * metodo para criar a tela
	 */
	
	public void iniciaGui() {
		/*
		 * configura��es do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o titulo da tela
		janela.setTitle("Exemplo de abas");
		// configurando o tamanho da tela - largura/ altura
		janela.setSize(390, 300);
		// configurando a posi��o incial da tela - centralizada
		janela.setLocationRelativeTo(null);
		
		/*
		 * configura��o da primeira label
		 */
		lbAux1 = new JLabel();
		//configurando o texto
		lbAux1.setText("Primeira aba");
		/*
		 * configura��o da segunda label
		 */
		lbAux2 = new JLabel();
		//configurando o texto
		lbAux2.setText("segunda aba");
		/*
		 * configura��o da terceira label
		 */
		lbAux3 = new JLabel();
		//configurando o texto
		lbAux3.setText("terceira aba");

		/*
		 * configura��o da primeira aba
		 */
		aba1 = new JPanel();
		aba1.add(lbAux1);
		/*
		 * configura��o da segunda aba
		 */
		aba2 = new JPanel();
		aba2.add(lbAux2);
		/*
		 * configura��o da terceira aba
		 */
		aba3 = new JPanel();
		aba3.add(lbAux3);
		
		/*
		 * configura��o do controlador de abas - componente jtabbedpane
		 */
		painelAbas = new JTabbedPane();
		//adicionar as abas (paineis) com o titulo
		painelAbas.add("Aba 1", aba1);
		painelAbas.add("Aba 2", aba2);
		painelAbas.add("Aba 3", aba3);
		painelAbas.setBounds(14, 21, 342, 200);
		
		
		/*
		 * configurando o painel principal
		 */
		painelPrincipal = (JPanel) janela.getContentPane();
		painelPrincipal.setLayout(null);
		painelPrincipal.add(painelAbas);

		
		//configura��o de visibilidade
		janela.setVisible(true);
		
		
		
	}
	
	
	public static void main(String[] args) {
		new Exemplo10().iniciaGui();
	}
	
	
	
	
	
	
	

}
