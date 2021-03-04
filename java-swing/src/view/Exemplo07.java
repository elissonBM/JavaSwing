package view;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JPasswordField;

/**
 * Classe para demontrar a utilização de campo de senha 
 * @author Elisson Barbieri Machado
 * @since 2 de mar. de 2021
 */
public class Exemplo07 {
	private JFrame janela;
	private JPanel painel;
	//campo para rotulo de senha na tela
	private JLabel lbSenha;
	//campo para digitar a senha e nao exibir
	private JPasswordField pfSenha;
	
	/*
	 * metodo para criar a tela
	 */
	public void iniciaGui() {
		/*
		 * configurações do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o titulo da tela
		janela.setTitle("Exemplo de JpasswordField");
		// configurando o tamanho da tela - largura/ altura
		janela.setSize(300, 300);
		// configurando a posição incial da tela - centralizada
		janela.setLocationRelativeTo(null);
		
		/*
		 * configurando a jlabel
		 */
		lbSenha = new JLabel();
		//configurando o texto 
		lbSenha.setText("Senha:");
		//configurando a posição e tamanho
		lbSenha.setBounds(10, 40, 40, 20);
		
		/*
		 * configurações do jpasswordField
		 */
		pfSenha = new JPasswordField();
		//configurando o tamanho e posição
		pfSenha.setBounds(60, 40, 100, 20);
		
		/*
		 * configurando o painel da janela
		 */
		painel = (JPanel) janela.getContentPane();
		painel.setLayout(null);
		painel.add(lbSenha);
		painel.add(pfSenha);
			
		janela.setVisible(true);
	}
	
	
	/*
	 * metodo principal
	 */
	public static void main(String[] args) {
		new Exemplo07().iniciaGui();
	}
	
}
