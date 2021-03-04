package view;

import java.awt.BorderLayout;
import java.awt.FlowLayout;
import java.awt.GridLayout;

import javax.swing.BorderFactory;
import javax.swing.BoxLayout;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * Classe responsavel por demonstrar a utilização de paineis 
 * @author Elisson Barbieri Machado
 * @since 3 de mar. de 2021
 */

public class Exemplo09 {

	//declarando os atributos
	private JFrame janela;
	//label auxiliar para demonstrar componentes dentro de paineis
	private JLabel lbAux1;
	private JLabel lbAux2;
	private JLabel lbAux3;
	private JLabel lbAux4;
	//paineis para organização
	private JPanel painel1;
	private JPanel painel2;
	private JPanel painel3;
	private JPanel painel4;
	private JPanel painelPrincipal;

	
	/* 
	 * metodo para criar a tela
	 */
	
	public void iniciaGui() {
		/*
		 * configurações do JFrame - tela
		 */
		janela = new JFrame();
		// configurando o titulo da tela
		janela.setTitle("Exemplo de JPanel");
		// configurando o tamanho da tela - largura/ altura
		janela.setSize(422, 246);
		// configurando a posição incial da tela - centralizada
		janela.setLocationRelativeTo(null);
		
		/*
		 * configuração da primeira label
		 */
		lbAux1 = new JLabel();
		//configurando o texto
		lbAux1.setText("painel 1");
		
		/*
		 * configuração da segunda label
		 */
		lbAux2 = new JLabel();
		//configurando o texto
		lbAux2.setText("painel 2");
		
		/*
		 * configuração da terceira label
		 */
		lbAux3 = new JLabel();
		//configurando o texto
		lbAux3.setText("painel 3");
		
		/*
		 * configuração da quarta label
		 */
		lbAux4 = new JLabel();
		//configurando o texto
		lbAux4.setText("painel 4");

		/*
		 * configurações do primeiro painel
		 */
		painel1 = new JPanel();
		//Configurando a posição do tamanho e oposição
		painel1.setBounds(4, 6, 200, 100);
		//configurando o layout do painel
		painel1.setLayout(new FlowLayout(FlowLayout.CENTER, 5, 5));
		//configurar a borda do painel
		painel1.setBorder(BorderFactory.createEtchedBorder());		
		painel1.add(lbAux1);
		
		/*
		 * configurações do segundo painel
		 */
		painel2 = new JPanel();
		//Configurando a posição do tamanho e oposição
		painel2.setBounds(208, 6, 200, 100);
		//configurando o layout do painel
		painel2.setLayout(new BorderLayout(0,0));
		//configurar a borda do painel
		painel2.setBorder(BorderFactory.createLoweredBevelBorder());		
		painel2.add(lbAux2);
		
		/*
		 * configurações do terceiro painel
		 */
		painel3 = new JPanel();
		//Configurando a posição do tamanho e oposição
		painel3.setBounds(3, 109, 200, 100);
		//configurando o layout do painel
		painel3.setLayout(new BoxLayout(painel3, BoxLayout.X_AXIS));
		//configurar a borda do painel
		painel3.setBorder(BorderFactory.createLoweredBevelBorder());		
		painel3.add(lbAux3);
		
		/*
		 * configurações do quarto painel
		 */
		painel4 = new JPanel();
		//Configurando a posição do tamanho e oposição
		painel4.setBounds(208, 110, 200, 100);
		//configurando o layout do painel
		painel4.setLayout(new GridLayout(1, 1, 0, 0));
		//configurar a borda do painel
		painel4.setBorder(new TitledBorder("Titulo"));		
		painel4.add(lbAux4);
		
		
		
		
		
		
		
		/*
		 * configurando o painel
		 */
		painelPrincipal = (JPanel) janela.getContentPane();
		painelPrincipal.setLayout(null);
		painelPrincipal.add(painel1);
		painelPrincipal.add(painel2);
		painelPrincipal.add(painel3);
		painelPrincipal.add(painel4);

		
		//configurando a visibilidade 
		janela.setVisible(true);

		//as formas 
		
		
	}
	
	
	
	public static void main(String[] args) {
		new Exemplo09().iniciaGui();
	}
	
	
	

	
	
}

